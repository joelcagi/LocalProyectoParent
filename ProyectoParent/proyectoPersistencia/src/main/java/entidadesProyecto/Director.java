package entidadesProyecto;

import entidadesProyecto.Persona;
import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: DirectorPrograma
 *
 */
@Entity

public class Director extends Persona implements Serializable {

	
	@ElementCollection
	@OneToMany (mappedBy="director")
	private List<Asignatura> listaAsignaturas;
	
	@ElementCollection
	@OneToMany(mappedBy="director")
	private List<Docente> listaDocentes;
	
	@ElementCollection
	@OneToMany(mappedBy="director")
	private List<Estudiante> listaEstudiantes;
	
	@OneToOne
	private Programa programa;
	
	private static final long serialVersionUID = 1L;

	public Director() {
		super();
	}   
	public List<Asignatura> getListaAsignaturas() {
		return this.listaAsignaturas;
	}

	public void setListaAsignaturas(List<Asignatura> listaAsignaturas) {
		this.listaAsignaturas = listaAsignaturas;
	}
	public List<Docente> getListaDocentes() {
		return listaDocentes;
	}
	public void setListaDocentes(List<Docente> listaDocentes) {
		this.listaDocentes = listaDocentes;
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
	
	
   
}
