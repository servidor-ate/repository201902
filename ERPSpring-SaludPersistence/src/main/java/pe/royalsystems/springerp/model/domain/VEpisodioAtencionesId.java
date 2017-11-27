package pe.royalsystems.springerp.model.domain;
// default package
// Generated Sep 28, 2015 2:18:16 PM by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * VEpisodioAtencionesId generated by hbm2java
 */
@Embeddable
public class VEpisodioAtencionesId implements java.io.Serializable {

	
	private String unidadReplicacion;
	private int idPaciente;
	private int episodioClinico;
	private long idEpisodioAtencion;
	private Integer lineaOrdenAtencion;
	

	public VEpisodioAtencionesId() {
	}

	public VEpisodioAtencionesId(String unidadReplicacion, int idPaciente,
			int episodioClinico, long idEpisodioAtencion, Integer lineaOrdenAtencion) {
		this.unidadReplicacion = unidadReplicacion;
		this.idPaciente = idPaciente;
		this.episodioClinico = episodioClinico;
		this.idEpisodioAtencion = idEpisodioAtencion;
		this.lineaOrdenAtencion = lineaOrdenAtencion;
		
	}

	
		@Column(name = "UnidadReplicacion", nullable = false, length = 4)
	public String getUnidadReplicacion() {
		return this.unidadReplicacion;
	}

	public void setUnidadReplicacion(String unidadReplicacion) {
		this.unidadReplicacion = unidadReplicacion;
	}

	@Column(name = "IdPaciente", nullable = false)
	public int getIdPaciente() {
		return this.idPaciente;
	}

	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}

	

	@Column(name = "LineaOrdenAtencion")
	public Integer getLineaOrdenAtencion() {
		return this.lineaOrdenAtencion;
	}

	public void setLineaOrdenAtencion(Integer lineaOrdenAtencion) {
		this.lineaOrdenAtencion = lineaOrdenAtencion;
	}

	@Column(name = "EpisodioClinico", nullable = false)
	public int getEpisodioClinico() {
		return this.episodioClinico;
	}

	public void setEpisodioClinico(int episodioClinico) {
		this.episodioClinico = episodioClinico;
	}

	@Column(name = "IdEpisodioAtencion", nullable = false)
	public long getIdEpisodioAtencion() {
		return this.idEpisodioAtencion;
	}

	public void setIdEpisodioAtencion(long idEpisodioAtencion) {
		this.idEpisodioAtencion = idEpisodioAtencion;
	}

	
	public int hashCode() {
		int result = 17;
		result = 37 * result + (getUnidadReplicacion() == null ? 0 : this.getUnidadReplicacion().hashCode());
		result = 37 * result + this.getIdPaciente();
		result = 37 * result + (getLineaOrdenAtencion() == null ? 0 : this.getLineaOrdenAtencion().hashCode());
		result = 37 * result + this.getEpisodioClinico();
		result = 37 * result + (int) this.getIdEpisodioAtencion();
		
		return result;
	}

}
