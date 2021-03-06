package pe.royalsystems.springerp.model.domain;

//default package
//Generated Sep 10, 2015 3:45:23 PM by Hibernate Tools 4.3.1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
* VwSsGeEmpresaseguro generated by hbm2java
*/
@Entity
@Table(name = "VW_SS_GE_EMPRESASEGURO")
public class VwSsGeEmpresaseguro extends Entidad implements java.io.Serializable {

	private VwSsGeEmpresaseguroId id;

	public VwSsGeEmpresaseguro() {
	}

	public VwSsGeEmpresaseguro(VwSsGeEmpresaseguroId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "idempresa", column = @Column(name = "IDEMPRESA", nullable = false) ),
			@AttributeOverride(name = "codigo", column = @Column(name = "CODIGO", length = 15) ),
			@AttributeOverride(name = "descripcion", column = @Column(name = "DESCRIPCION", length = 150) ),
			@AttributeOverride(name = "tipoempresa", column = @Column(name = "TIPOEMPRESA", length = 1) ),
			@AttributeOverride(name = "tiposeguro", column = @Column(name = "TIPOSEGURO") ),
			@AttributeOverride(name = "estado", column = @Column(name = "ESTADO") ),
			@AttributeOverride(name = "usuariocreacion", column = @Column(name = "USUARIOCREACION", length = 25) ),
			@AttributeOverride(name = "fechacreacion", column = @Column(name = "FECHACREACION", length = 23) ),
			@AttributeOverride(name = "usuariomodificacion", column = @Column(name = "USUARIOMODIFICACION", length = 25) ),
			@AttributeOverride(name = "fechamodificacion", column = @Column(name = "FECHAMODIFICACION", length = 23) ),
			@AttributeOverride(name = "accion", column = @Column(name = "ACCION", length = 25) ),
			@AttributeOverride(name = "persona", column = @Column(name = "PERSONA", nullable = false) ),
			@AttributeOverride(name = "nombrecompleto", column = @Column(name = "NOMBRECOMPLETO", length = 100) ),
			@AttributeOverride(name = "documentofiscal", column = @Column(name = "DOCUMENTOFISCAL", length = 20) ),
			@AttributeOverride(name = "direccion", column = @Column(name = "DIRECCION", length = 190) ),
			@AttributeOverride(name = "telefono", column = @Column(name = "TELEFONO", length = 15) ),
			@AttributeOverride(name = "tipoempresanombre", column = @Column(name = "TIPOEMPRESANOMBRE", length = 80) ),
			@AttributeOverride(name = "tiposeguronombre", column = @Column(name = "TIPOSEGURONOMBRE", length = 80) ) })
	public VwSsGeEmpresaseguroId getId() {
		return this.id;
	}

	public void setId(VwSsGeEmpresaseguroId id) {
		this.id = id;
	}

}

