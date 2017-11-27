package pe.royalsystems.springerp.model.domain;
// Generated Aug 6, 2015 12:12:22 PM by Hibernate Tools 4.3.1

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * SsGeEspecialidad generated by hbm2java
 */
@Entity
@Table(name = "SS_GE_Especialidad")
public class SsGeEspecialidad extends Entidad implements java.io.Serializable {

	private Integer idEspecialidad;
	private String codigo;
	private String nombre;
	private String descripcion;
	private BigDecimal tiempoPromedioAtencion;
	private Integer formularioInicial;
	private Integer formularioFinal;
	private Integer formularioInforme;
	private Integer estado;
	private String usuarioCreacion;
	private Date fechaCreacion;
	private String usuarioModificacion;
	private Date fechaModificacion;
	private Integer cantidadCitasAdicional;
	private Integer atencionPeriodoCronico;
	private Integer indicadorValidarFlujo;
	private Integer reporteCita;
	private String foto;
	private String descripcionDet;
	private Integer indicadorWeb;
	private String accion;

	public SsGeEspecialidad() {
	}

	public SsGeEspecialidad(Integer idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
	}

	public SsGeEspecialidad(Integer idEspecialidad, String codigo, String nombre, String descripcion,
			BigDecimal tiempoPromedioAtencion, Integer formularioInicial, Integer formularioFinal,
			Integer formularioInforme, Integer estado, String usuarioCreacion, Date fechaCreacion,
			String usuarioModificacion, Date fechaModificacion, Integer cantidadCitasAdicional,
			Integer atencionPeriodoCronico, Integer indicadorValidarFlujo, Integer reporteCita, String foto,
			String descripcionDet, Integer indicadorWeb, String accion) {
		this.idEspecialidad = idEspecialidad;
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.tiempoPromedioAtencion = tiempoPromedioAtencion;
		this.formularioInicial = formularioInicial;
		this.formularioFinal = formularioFinal;
		this.formularioInforme = formularioInforme;
		this.estado = estado;
		this.usuarioCreacion = usuarioCreacion;
		this.fechaCreacion = fechaCreacion;
		this.usuarioModificacion = usuarioModificacion;
		this.fechaModificacion = fechaModificacion;
		this.cantidadCitasAdicional = cantidadCitasAdicional;
		this.atencionPeriodoCronico = atencionPeriodoCronico;
		this.indicadorValidarFlujo = indicadorValidarFlujo;
		this.reporteCita = reporteCita;
		this.foto = foto;
		this.descripcionDet = descripcionDet;
		this.indicadorWeb = indicadorWeb;
		this.accion = accion;
	}

	@Id

	@Column(name = "IdEspecialidad", unique = true, nullable = false)
	public Integer getIdEspecialidad() {
		return this.idEspecialidad;
	}

	public void setIdEspecialidad(Integer idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
	}

	@Column(name = "Codigo", length = 15)
	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Column(name = "Nombre", length = 80)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "Descripcion", length = 150)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "TiempoPromedioAtencion", precision = 9)
	public BigDecimal getTiempoPromedioAtencion() {
		return this.tiempoPromedioAtencion;
	}

	public void setTiempoPromedioAtencion(BigDecimal tiempoPromedioAtencion) {
		this.tiempoPromedioAtencion = tiempoPromedioAtencion;
	}

	@Column(name = "FormularioInicial")
	public Integer getFormularioInicial() {
		return this.formularioInicial;
	}

	public void setFormularioInicial(Integer formularioInicial) {
		this.formularioInicial = formularioInicial;
	}

	@Column(name = "FormularioFinal")
	public Integer getFormularioFinal() {
		return this.formularioFinal;
	}

	public void setFormularioFinal(Integer formularioFinal) {
		this.formularioFinal = formularioFinal;
	}

	@Column(name = "FormularioInforme")
	public Integer getFormularioInforme() {
		return this.formularioInforme;
	}

	public void setFormularioInforme(Integer formularioInforme) {
		this.formularioInforme = formularioInforme;
	}

	@Column(name = "Estado")
	public Integer getEstado() {
		return this.estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	@Column(name = "UsuarioCreacion", length = 25)
	public String getUsuarioCreacion() {
		return this.usuarioCreacion;
	}

	public void setUsuarioCreacion(String usuarioCreacion) {
		this.usuarioCreacion = usuarioCreacion;
	}

	@Temporal(TemporalType.TIMESTAMP)
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

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "FechaModificacion", length = 23)
	public Date getFechaModificacion() {
		return this.fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	@Column(name = "CantidadCitasAdicional")
	public Integer getCantidadCitasAdicional() {
		return this.cantidadCitasAdicional;
	}

	public void setCantidadCitasAdicional(Integer cantidadCitasAdicional) {
		this.cantidadCitasAdicional = cantidadCitasAdicional;
	}

	@Column(name = "AtencionPeriodoCronico")
	public Integer getAtencionPeriodoCronico() {
		return this.atencionPeriodoCronico;
	}

	public void setAtencionPeriodoCronico(Integer atencionPeriodoCronico) {
		this.atencionPeriodoCronico = atencionPeriodoCronico;
	}

	@Column(name = "IndicadorValidarFlujo")
	public Integer getIndicadorValidarFlujo() {
		return this.indicadorValidarFlujo;
	}

	public void setIndicadorValidarFlujo(Integer indicadorValidarFlujo) {
		this.indicadorValidarFlujo = indicadorValidarFlujo;
	}

	@Column(name = "ReporteCita")
	public Integer getReporteCita() {
		return this.reporteCita;
	}

	public void setReporteCita(Integer reporteCita) {
		this.reporteCita = reporteCita;
	}

	@Column(name = "foto", length = 150)
	public String getFoto() {
		return this.foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	@Column(name = "descripcion_det", length = 1000)
	public String getDescripcionDet() {
		return this.descripcionDet;
	}

	public void setDescripcionDet(String descripcionDet) {
		this.descripcionDet = descripcionDet;
	}

	@Column(name = "IndicadorWeb")
	public Integer getIndicadorWeb() {
		return this.indicadorWeb;
	}

	public void setIndicadorWeb(Integer indicadorWeb) {
		this.indicadorWeb = indicadorWeb;
	}

	@Column(name = "Accion", length = 25)
	public String getAccion() {
		return this.accion;
	}

	public void setAccion(String accion) {
		this.accion = accion;
	}

}