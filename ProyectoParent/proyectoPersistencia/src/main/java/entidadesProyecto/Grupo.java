package entidadesProyecto;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Grupo
 *
 */
@Entity

public class Grupo implements Serializable {

	@Id
	@Column
	private String id;
	
	@Column
	private int cantidadMaxEst;
	
	@Column
	private String aula;
	
	@ElementCollection
	@ManyToMany(mappedBy="listaGrupos")
	private List<Estudiante> listaEstudiantes;
	
	@ManyToOne
	private Programa programa;
	
	@ManyToOne
	private Asignatura asignatura;
	
	private static final long serialVersionUID = 1L;

	public Grupo() {
		super();
	}   
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}   
	public int getCantidadMaxEst() {
		return this.cantidadMaxEst;
	}

	public void setCantidadMaxEst(int cantidadMaxEst) {
		this.cantidadMaxEst = cantidadMaxEst;
	}   
	public String getAula() {
		return this.aula;
	}

	public void setAula(String aula) {
		this.aula = aula;
	}
	public List<Estudiante> getListaEstudiantes() {
		return listaEstudiantes;
	}
	public void setListaEstudiantes(List<Estudiante> listaEstudiantes) {
		this.listaEstudiantes = listaEstudiantes;
	}
	public Programa getPrograma() {
		return programa;
	}
	public void setPrograma(Programa programa) {
		this.programa = programa;
	}
	public Asignatura getAsignatura() {
		return asignatura;
	}
	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}
   
	
}
