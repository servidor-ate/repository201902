package pe.royalsystems.springerp.model.domain;
// default package
// Generated Oct 13, 2015 1:11:12 PM by Hibernate Tools 4.3.1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * RmProyectoUsuario generated by hbm2java
 */
@Entity
@Table(name = "RM_ProyectoUsuario", schema = "dbo", catalog = "WebCoreManager")
public class RmProyectoUsuario extends Entidad implements java.io.Serializable {

	private RmProyectoUsuarioId id;

	public RmProyectoUsuario() {
	}

	public RmProyectoUsuario(RmProyectoUsuarioId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "proyecto", column = @Column(name = "Proyecto", nullable = false, length = 15) ),
			@AttributeOverride(name = "centroCosto", column = @Column(name = "CentroCosto", nullable = false, length = 10) ),
			@AttributeOverride(name = "usuarioSupervisor", column = @Column(name = "UsuarioSupervisor", nullable = false, length = 20) ),
			@AttributeOverride(name = "usuario", column = @Column(name = "Usuario", nullable = false, length = 20) ),
			@AttributeOverride(name = "ultimoUsuario", column = @Column(name = "UltimoUsuario", nullable = false, length = 20) ),
			@AttributeOverride(name = "ultimaFechaModif", column = @Column(name = "UltimaFechaModif", nullable = false, length = 23) ) })
	public RmProyectoUsuarioId getId() {
		return this.id;
	}

	public void setId(RmProyectoUsuarioId id) {
		this.id = id;
	}

}
