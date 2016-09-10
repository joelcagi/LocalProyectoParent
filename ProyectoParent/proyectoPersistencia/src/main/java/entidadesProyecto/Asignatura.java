package entidadesProyecto;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Asignatura
 *
 */
@Entity

public class Asignatura implements Serializable {

	   
	@Id
	@Column
	private String id;
	
	@Column
	private String nombre;
	
	@Column
	private String horario;
	
	@ElementCollection
	@OneToMany(mappedBy="asignatura")
	private List<Grupo> listaGrupo;
	
	@ManyToOne
	private Director director;
	
	@OneToOne(mappedBy="asignatura")
	private Asesoria asesoria;
	
	@ManyToOne
	private Docente docente;
	
	private static final long serialVersionUID = 1L;

	public Asignatura() {
		super();
	}   
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}   
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}   
	public String getHorario() {
		return this.horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
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
	public Asesoria getAsesoria() {
		return asesoria;
	}
	public void setAsesoria(Asesoria asesoria) {
		this.asesoria = asesoria;
	}
	public Docente getDocente() {
		return docente;
	}
	public void setDocente(Docente docente) {
		this.docente = docente;
	}
   
	
}
