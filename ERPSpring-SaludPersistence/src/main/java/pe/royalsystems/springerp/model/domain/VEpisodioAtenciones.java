package pe.royalsystems.springerp.model.domain;
// default package
// Generated Sep 28, 2015 2:18:16 PM by Hibernate Tools 4.3.1

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * VEpisodioAtenciones generated by hbm2java
 */
@Entity
@Table(name = "V_EpisodioAtenciones")
public class VEpisodioAtenciones extends Entidad implements java.io.Serializable {

	private VEpisodioAtencionesId id;
	private int persona;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String nombres;
	private String nombreCompleto;
	private Date fechaCierre;
	private int episodioAtencion;
	private Date fechaRegEpisoAtencon;
	private Date fechaAtencion;
	private Integer tipoAtencion;
	private Integer idOrdenAtencion;
	private Integer tipoOrdenAtencion;
	private Integer estadoEpisodioAten;
	private String usuarioCreacion;
	private Date fechaCreacion;
	private String usuarioModificacion;
	private Date fechaModificacion;
	private String motivoConsulta;
	private Date fechaRegistro;
	private String accion;
	private String unidadReplicacionEc;
	private Integer idEstablecimientoSalud;
	private Integer idUnidadServicio;
	private Integer idPersonalSalud;
	private String personalSaludNombre;
	private Integer idEspecialidad;
	private String especialidadNombre;
	
	public VEpisodioAtenciones() {
	}

	public VEpisodioAtenciones(VEpisodioAtencionesId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ 
			@AttributeOverride(name = "unidadReplicacion", column = @Column(name = "UnidadReplicacion", nullable = false, length = 4) ),
			@AttributeOverride(name = "idPaciente", column = @Column(name = "IdPaciente", nullable = false) ),
			@AttributeOverride(name = "lineaOrdenAtencion", column = @Column(name = "LineaOrdenAtencion") ),
			@AttributeOverride(name = "episodioClinico", column = @Column(name = "EpisodioClinico", nullable = false) ),
			@AttributeOverride(name = "idEpisodioAtencion", column = @Column(name = "IdEpisodioAtencion", nullable = false) )
			 })
	public VEpisodioAtencionesId getId() {
		return this.id;
	}

	public void setId(VEpisodioAtencionesId id) {
		this.id = id;
	}
	
	@Column(name = "Persona", nullable = false)
	public int getPersona() {
		return this.persona;
	}

	public void setPersona(int persona) {
		this.persona = persona;
	}

	@Column(name = "ApellidoPaterno", length = 40)
	public String getApellidoPaterno() {
		return this.apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	@Column(name = "ApellidoMaterno", length = 40)
	public String getApellidoMaterno() {
		return this.apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	@Column(name = "Nombres", length = 40)
	public String getNombres() {
		return this.nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	@Column(name = "NombreCompleto", length = 100)
	public String getNombreCompleto() {
		return this.nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	@Column(name = "FechaCierre", length = 23)
	public Date getFechaCierre() {
		return this.fechaCierre;
	}

	public void setFechaCierre(Date fechaCierre) {
		this.fechaCierre = fechaCierre;
	}

	@Column(name = "Episodio_Atencion", nullable = false)
	public int getEpisodioAtencion() {
		return this.episodioAtencion;
	}

	public void setEpisodioAtencion(int episodioAtencion) {
		this.episodioAtencion = episodioAtencion;
	}

	@Column(name = "FechaReg_EpisoAtencon", length = 23)
	public Date getFechaRegEpisoAtencon() {
		return this.fechaRegEpisoAtencon;
	}

	public void setFechaRegEpisoAtencon(Date fechaRegEpisoAtencon) {
		this.fechaRegEpisoAtencon = fechaRegEpisoAtencon;
	}

	@Column(name = "FechaAtencion", length = 23)
	public Date getFechaAtencion() {
		return this.fechaAtencion;
	}

	public void setFechaAtencion(Date fechaAtencion) {
		this.fechaAtencion = fechaAtencion;
	}

	@Column(name = "TipoAtencion")
	public Integer getTipoAtencion() {
		return this.tipoAtencion;
	}

	public void setTipoAtencion(Integer tipoAtencion) {
		this.tipoAtencion = tipoAtencion;
	}

	@Column(name = "IdOrdenAtencion")
	public Integer getIdOrdenAtencion() {
		return this.idOrdenAtencion;
	}

	public void setIdOrdenAtencion(Integer idOrdenAtencion) {
		this.idOrdenAtencion = idOrdenAtencion;
	}
	
	@Column(name = "TipoOrdenAtencion")
	public Integer getTipoOrdenAtencion() {
		return this.tipoOrdenAtencion;
	}

	public void setTipoOrdenAtencion(Integer tipoOrdenAtencion) {
		this.tipoOrdenAtencion = tipoOrdenAtencion;
	}

	@Column(name = "Estado_EpisodioAten")
	public Integer getEstadoEpisodioAten() {
		return this.estadoEpisodioAten;
	}

	public void setEstadoEpisodioAten(Integer estadoEpisodioAten) {
		this.estadoEpisodioAten = estadoEpisodioAten;
	}

	@Column(name = "UsuarioCreacion", length = 25)
	public String getUsuarioCreacion() {
		return this.usuarioCreacion;
	}

	public void setUsuarioCreacion(String usuarioCreacion) {
		this.usuarioCreacion = usuarioCreacion;
	}

	@Column(name = "FechaCreacion", length = 23)
	public Date getFechaCreacion() {
		return this.fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	@Column(name = "UsuarioModificacion", length = 25)
	public String getUsuarioModificacion() {
		return this.usuarioModificacion;
	}

	public void setUsuarioModificacion(String usuarioModificacion) {
		this.usuarioModificacion = usuarioModificacion;
	}

	@Column(name = "FechaModificacion", length = 23)
	public Date getFechaModificacion() {
		return this.fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	@Column(name = "MotivoConsulta", length = 350)
	public String getMotivoConsulta() {
		return this.motivoConsulta;
	}

	public void setMotivoConsulta(String motivoConsulta) {
		this.motivoConsulta = motivoConsulta;
	}

	@Column(name = "FechaRegistro", length = 23)
	public Date getFechaRegistro() {
		return this.fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	@Column(name = "Accion", length = 50)
	public String getAccion() {
		return this.accion;
	}

	public void setAccion(String accion) {
		this.accion = accion;
	}
	
	@Column(name = "UnidadReplicacionEC", nullable = false, length = 4)
	public String getUnidadReplicacionEc() {
		return this.unidadReplicacionEc;
	}

	public void setUnidadReplicacionEc(String unidadReplicacionEc) {
		this.unidadReplicacionEc = unidadReplicacionEc;
	}

	@Column(name = "IdEstablecimientoSalud")
	public Integer getIdEstablecimientoSalud() {
		return this.idEstablecimientoSalud;
	}

	public void setIdEstablecimientoSalud(Integer idEstablecimientoSalud) {
		this.idEstablecimientoSalud = idEstablecimientoSalud;
	}

	@Column(name = "IdUnidadServicio")
	public Integer getIdUnidadServicio() {
		return this.idUnidadServicio;
	}

	public void setIdUnidadServicio(Integer idUnidadServicio) {
		this.idUnidadServicio = idUnidadServicio;
	}

	@Column(name = "IdPersonalSalud")
	public Integer getIdPersonalSalud() {
		return this.idPersonalSalud;
	}

	public void setIdPersonalSalud(Integer idPersonalSalud) {
		this.idPersonalSalud = idPersonalSalud;
	}

	@Column(name = "PersonalSaludNombre", length = 100)
	public String getPersonalSaludNombre() {
		return this.personalSaludNombre;
	}

	public void setPersonalSaludNombre(String personalSaludNombre) {
		this.personalSaludNombre = personalSaludNombre;
	}

	@Column(name = "IdEspecialidad")
	public Integer getIdEspecialidad() {
		return this.idEspecialidad;
	}

	public void setIdEspecialidad(Integer idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
	}

	@Column(name = "especialidadNombre", length = 80)
	public String getEspecialidadNombre() {
		return this.especialidadNombre;
	}

	public void setEspecialidadNombre(String especialidadNombre) {
		this.especialidadNombre = especialidadNombre;
	}

}
