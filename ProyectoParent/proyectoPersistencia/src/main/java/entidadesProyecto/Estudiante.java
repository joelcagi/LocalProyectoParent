package entidadesProyecto;

import entidadesProyecto.Persona;
import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Estudiante
 *
 */
@Entity

public class Estudiante extends Persona implements Serializable {

	@ElementCollection
	@OneToMany
	private List<Asignatura> listaAsignaturas;
	
	@ElementCollection
	@ManyToMany
	private List<Grupo> listaGrupos;
	
	@ManyToOne
	private Director director;
	
	
	private static final long serialVersionUID = 1L;

	public Estudiante() {
		super();
	}

	public List<Asignatura> getListaAsignaturas() {
		return listaAsignaturas;
	}

	public void setListaAsignaturas(List<Asignatura> listaAsignaturas) {
		this.listaAsignaturas = listaAsignaturas;
	}

	public List<Grupo> getListaGrupos() {
		return listaGrupos;
	}

	public void setListaGrupos(List<Grupo> listaGrupos) {
		this.listaGrupos = listaGrupos;
	}

	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}
	
	
	   
}
