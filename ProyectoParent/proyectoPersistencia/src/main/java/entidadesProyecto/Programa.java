package entidadesProyecto;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Programa
 *
 */
@Entity

public class Programa implements Serializable {

	@Column
	private String nombre;   
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Id", nullable=false)
	private String id;
	
	@ElementCollection
	@OneToMany(mappedBy="programa")
	private List<Asignatura> listaAsignatura;
	
	@ElementCollection
	@OneToMany(mappedBy="programa")
	private List<Grupo> listaGrupo;
	
	@OneToOne(mappedBy="programa")
	private Director director;
	
	private static final long serialVersionUID = 1L;

	public Programa() {
		super();
	}   
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}   
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}
	public List<Asignatura> getListaAsignatura() {
		return listaAsignatura;
	}
	public void setListaAsignatura(List<Asignatura> listaAsignatura) {
		this.listaAsignatura = listaAsignatura;
	}
	public List<Grupo> getListaGrupo() {
		return listaGrupo;
	}
	public void setListaGrupo(List<Grupo> listaGrupo) {
		this.listaGrupo = listaGrupo;
	}
	public Director getDirector() {
		return director;
	}
	public void setDirector(Director director) {
		this.director = director;
	}
   
}
