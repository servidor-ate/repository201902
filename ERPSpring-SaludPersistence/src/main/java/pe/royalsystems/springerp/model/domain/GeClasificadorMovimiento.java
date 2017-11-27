package pe.royalsystems.springerp.model.domain;
// default package
// Generated 23-sep-2015 16:00:17 by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * GeClasificadorMovimiento generated by hbm2java
 */
@Entity
@Table(name = "GE_ClasificadorMovimiento")
public class GeClasificadorMovimiento extends Entidad implements java.io.Serializable {

	private String clasificadorMovimiento;
	private String version;
	private String clasificadorMovimientoGrupo;
	private String nombre;
	private String descripcion;
	private Integer estado;
	private String usuarioCreacion;
	private Date fechaCreacion;
	private String usuarioModificacion;
	private Date fechaModificacion;
	private String flujodeCaja;
	private String centroCosto;
	private String accion;

	public GeClasificadorMovimiento() {
	}

	public GeClasificadorMovimiento(String clasificadorMovimiento) {
		this.clasificadorMovimiento = clasificadorMovimiento;
	}

	public GeClasificadorMovimiento(String clasificadorMovimiento, String clasificadorMovimientoGrupo, String nombre,
			String descripcion, Integer estado, String usuarioCreacion, Date fechaCreacion, String usuarioModificacion,
			Date fechaModificacion, String flujodeCaja, String centroCosto, String accion) {
		this.clasificadorMovimiento = clasificadorMovimiento;
		this.clasificadorMovimientoGrupo = clasificadorMovimientoGrupo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.estado = estado;
		this.usuarioCreacion = usuarioCreacion;
		this.fechaCreacion = fechaCreacion;
		this.usuarioModificacion = usuarioModificacion;
		this.fechaModificacion = fechaModificacion;
		this.flujodeCaja = flujodeCaja;
		this.centroCosto = centroCosto;
		this.accion = accion;
	}

	@Id

	@Column(name = "ClasificadorMovimiento", unique = true, nullable = false, length = 15)
	public String getClasificadorMovimiento() {
		return this.clasificadorMovimiento;
	}

	public void setClasificadorMovimiento(String clasificadorMovimiento) {
		this.clasificadorMovimiento = clasificadorMovimiento;
	}
	
	@Column(name = "VERSION", length = 25)
	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Column(name = "ClasificadorMovimientoGrupo", length = 15)
	public String getClasificadorMovimientoGrupo() {
		return this.clasificadorMovimientoGrupo;
	}

	public void setClasificadorMovimientoGrupo(String clasificadorMovimientoGrupo) {
		this.clasificadorMovimientoGrupo = clasificadorMovimientoGrupo;
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

	@Column(name = "FlujodeCaja", length = 15)
	public String getFlujodeCaja() {
		return this.flujodeCaja;
	}

	public void setFlujodeCaja(String flujodeCaja) {
		this.flujodeCaja = flujodeCaja;
	}

	@Column(name = "CentroCosto", length = 15)
	public String getCentroCosto() {
		return this.centroCosto;
	}

	public void setCentroCosto(String centroCosto) {
		this.centroCosto = centroCosto;
	}

	@Column(name = "ACCION", length = 25)
	public String getAccion() {
		return this.accion;
	}

	public void setAccion(String accion) {
		this.accion = accion;
	}

}
