package pruebasUnitarias;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.arquillian.transaction.api.annotation.TransactionMode;
import org.jboss.arquillian.transaction.api.annotation.Transactional;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import entidadesProyecto.Docente;
import entidadesProyecto.Persona;

@RunWith(Arquillian.class)
public class PruebaDocente {

	@PersistenceContext
	private EntityManager entityManager;
	private Docente docente;

	@Deployment
	public static Archive<?> createTestArchive() {
		return ShrinkWrap.create(WebArchive.class, "test.war").addPackage(Persona.class.getPackage())
				.addAsResource("META-INF/persistence.xml", "META-INF/persistence.xml")
				.addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml");
	}

	@Test
	@Transactional(value = TransactionMode.ROLLBACK)
	public void insert() {
		docente = new Docente();
		docente.setId("1094904304");
		docente.setNombre("John Elkin");
		docente.setApellido("Calderon Gil");
		docente.setEdad("27");
		entityManager.persist(docente);
		
		Docente almacenado = entityManager.find(Docente.class, docente.getId());
		
		Assert.assertNotNull( almacenado );
		Assert.assertEquals( docente , almacenado);
		
	}
	
	/**
	 * metodo para probar la actualización de datos 
	 */
	@Test
	@Transactional(value=TransactionMode.ROLLBACK)
	public void update() {
		insert();
		
		Docente actual = new Docente();
		actual.setId( docente.getId());
		actual.setNombre( "Juan");
		actual.setApellido(docente.getApellido());
		actual.setEdad(docente.getEdad());
		
		entityManager.merge( actual );
		
		Docente almacenado = entityManager.find(Docente.class, docente.getId());
		
		Assert.assertNotNull( almacenado );
		Assert.assertEquals( actual.getNombre() , almacenado.getNombre());
		
	}
	
	@Test
	@Transactional(value=TransactionMode.COMMIT)
	public void delete() {
		insert();
		
		Docente almacenado = entityManager.find(Docente.class, docente.getId());
		
		entityManager.remove( almacenado );
		
		almacenado = entityManager.find(Docente.class, docente.getId());
		
		Assert.assertNull( almacenado );
		
	}	

}
