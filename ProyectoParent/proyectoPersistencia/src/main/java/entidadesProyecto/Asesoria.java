package entidadesProyecto;

import entidadesProyecto.Asignatura;
import entidadesProyecto.EnumDias;
import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Asesoria
 *
 */
@Entity

public class Asesoria implements Serializable {

	@OneToOne
	private Asignatura asignatura;
	@Enumerated (EnumType.STRING)
	@ManyToOne
	private Docente docente;
	private EnumDias dia;   
	@Id
	@Column
	private String horaInicio;
	@Column
	private String horaFin;
	@Column
	private String ubicacion;
	private static final long serialVersionUID = 1L;

	public Asesoria() {
		super();
	}   
	public Asignatura getAsignatura() {
		return this.asignatura;
	}

	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}   
	public EnumDias getDia() {
		return this.dia;
	}

	public void setDia(EnumDias dia) {
		this.dia = dia;
	}   
	public String getHoraInicio() {
		return this.horaInicio;
	}

	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}   
	public String getHoraFin() {
		return this.horaFin;
	}

	public void setHoraFin(String horaFin) {
		this.horaFin = horaFin;
	}   
	public String getUbicacion() {
		return this.ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	
   
}
