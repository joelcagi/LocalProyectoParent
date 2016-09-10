package entidadesProyecto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Docente
 *
 */
@Entity

public class Docente extends Persona implements Serializable {

	@ElementCollection
	@OneToMany(mappedBy="docente")
	private List<Asignatura> listaAsignaturas;
	
	@ElementCollection
	@OneToMany(mappedBy="docente")
	private List<Asesoria> listaAsesorias;
	
	@ManyToOne
	private Director director;
	
	private static final long serialVersionUID = 1L;

	public Docente() {
		super();
	}

	public List<Asignatura> getListaAsignaturas() {
		return listaAsignaturas;
	}

	public void setListaAsignaturas(ArrayList<Asignatura> listaAsignaturas) {
		this.listaAsignaturas = listaAsignaturas;
	}

	public List<Asesoria> getListaAsesorias() {
		return listaAsesorias;
	}

	public void setListaAsesorias(ArrayList<Asesoria> listaAsesorias) {
		this.listaAsesorias = listaAsesorias;
	}

	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}
		
}
