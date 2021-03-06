package pe.royalsystems.springerp.model.domain;
// Generated Aug 26, 2015 3:12:43 PM by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

/**
 * SsGeDiagnostico generated by hbm2java
 */
@Entity
@Table(name = "SS_GE_Diagnostico")
public class SsGeDiagnostico extends Entidad implements java.io.Serializable {
   
	private Integer idDiagnostico;
	private String version;
	private String codigoDiagnostico;
	private String codigoPadre;
	private String nombre;
	private String descripcion;
	private Integer estado;
	private String usuarioCreacion;
	private Date fechaCreacion;
	private String usuarioModificacion;
	private Date fechaModificacion;
	private Integer idDiagnosticoPadre;
	private Integer orden;
	private String cadenaRecursividad;
	private Integer nivel;
	private String diagnosticoSiteds;
	private Integer indicadorPermitido;
	private Integer tipoFolder;
	private String nombreTabla;
	private String accion;

	public SsGeDiagnostico() {
	}

	public SsGeDiagnostico(Integer idDiagnostico) {
		this.idDiagnostico = idDiagnostico;
	}

	public SsGeDiagnostico(Integer idDiagnostico, String codigoDiagnostico, String codigoPadre, String nombre,
			String descripcion, Integer estado, String usuarioCreacion, Date fechaCreacion, String usuarioModificacion,
			Date fechaModificacion, Integer idDiagnosticoPadre, Integer orden, String cadenaRecursividad, Integer nivel,
			String diagnosticoSiteds, Integer indicadorPermitido, Integer tipoFolder, String nombreTabla,
			String accion) {
		this.idDiagnostico = idDiagnostico;
		this.codigoDiagnostico = codigoDiagnostico;
		this.codigoPadre = codigoPadre;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.estado = estado;
		this.usuarioCreacion = usuarioCreacion;
		this.fechaCreacion = fechaCreacion;
		this.usuarioModificacion = usuarioModificacion;
		this.fechaModificacion = fechaModificacion;
		this.idDiagnosticoPadre = idDiagnosticoPadre;
		this.orden = orden;
		this.cadenaRecursividad = cadenaRecursividad;
		this.nivel = nivel;
		this.diagnosticoSiteds = diagnosticoSiteds;
		this.indicadorPermitido = indicadorPermitido;
		this.tipoFolder = tipoFolder;
		this.nombreTabla = nombreTabla;
		this.accion = accion;
	}

	@Id

	@Column(name = "IdDiagnostico", unique = true, nullable = false)
	public Integer getIdDiagnostico() {
		return this.idDiagnostico;
	}

	public void setIdDiagnostico(Integer idDiagnostico) {
		this.idDiagnostico = idDiagnostico;
	}


	@Column(name = "Version", length = 25)
	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Column(name = "CodigoDiagnostico", length = 15)
	public String getCodigoDiagnostico() {
		return this.codigoDiagnostico;
	}

	public void setCodigoDiagnostico(String codigoDiagnostico) {
		this.codigoDiagnostico = codigoDiagnostico;
	}

	@Column(name = "CodigoPadre", length = 15)
	public String getCodigoPadre() {
		return this.codigoPadre;
	}

	public void setCodigoPadre(String codigoPadre) {
		this.codigoPadre = codigoPadre;
	}

	@Column(name = "Nombre", length = 350)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "Descripcion", length = 350)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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

	@Column(name = "IdDiagnosticoPadre")
	public Integer getIdDiagnosticoPadre() {
		return this.idDiagnosticoPadre;
	}

	public void setIdDiagnosticoPadre(Integer idDiagnosticoPadre) {
		this.idDiagnosticoPadre = idDiagnosticoPadre;
	}

	@Column(name = "Orden")
	public Integer getOrden() {
		return this.orden;
	}

	public void setOrden(Integer orden) {
		this.orden = orden;
	}

	@Column(name = "CadenaRecursividad", length = 150)
	public String getCadenaRecursividad() {
		return this.cadenaRecursividad;
	}

	public void setCadenaRecursividad(String cadenaRecursividad) {
		this.cadenaRecursividad = cadenaRecursividad;
	}

	@Column(name = "Nivel")
	public Integer getNivel() {
		return this.nivel;
	}

	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}

	@Column(name = "DiagnosticoSiteds", length = 15)
	public String getDiagnosticoSiteds() {
		return this.diagnosticoSiteds;
	}

	public void setDiagnosticoSiteds(String diagnosticoSiteds) {
		this.diagnosticoSiteds = diagnosticoSiteds;
	}

	@Column(name = "IndicadorPermitido")
	public Integer getIndicadorPermitido() {
		return this.indicadorPermitido;
	}

	public void setIndicadorPermitido(Integer indicadorPermitido) {
		this.indicadorPermitido = indicadorPermitido;
	}

	@Column(name = "tipoFolder")
	public Integer getTipoFolder() {
		return this.tipoFolder;
	}

	public void setTipoFolder(Integer tipoFolder) {
		this.tipoFolder = tipoFolder;
	}

	@Column(name = "NombreTabla", length = 15)
	public String getNombreTabla() {
		return this.nombreTabla;
	}

	public void setNombreTabla(String nombreTabla) {
		this.nombreTabla = nombreTabla;
	}

	@Column(name = "Accion", length = 25)
	public String getAccion() {
		return this.accion;
	}

	public void setAccion(String accion) {
		this.accion = accion;
	}

}
