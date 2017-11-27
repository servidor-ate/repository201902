package pe.royalsystems.springerp.model.domain;
// Generated Aug 28, 2015 10:59:20 AM by Hibernate Tools 4.3.1

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * SsCheVistaSeguridadId generated by hbm2java
 */
@Entity
@Table(name = "SS_CHE_VistaSeguridad")
public class SsCheVistaSeguridad extends Entidad implements java.io.Serializable {

	private String sistema;
	private String nombre;
	private String modulo;
	private Integer orden;
	private String nombreModulo;
	private int idOpcion;
	private Integer idOpcionPadre;
	private String codigoOpcion;
	private String cadenaRecursividad;
	private Integer nivelOpcion;
	private String nombreOpcion;
	private String descripcion;
	private String subModulo;
	private Integer ordenOpcion;
	private String tipoOpcion;
	private Integer tipoIcono;
	private Integer indicadorPrioridad;
	private Integer indicadorObjeto;
	private Integer idObjetoAsociado;
	private String tipoDato;
	private String valorTexto;
	private BigDecimal valorNumerico;
	private Date valorFecha;
	private String urlOpcion;
	private String usuarioCreacion;
	private Date fechaCreacion;
	private String usuarioModificacion;
	private Date fechaModificacion;
	private String compania;
	private Integer indicadorCompania;
	private Integer idTipoAtencion;
	private String tipoTrabajador;
	private Integer indicadorFormato;
	private Integer indicadorAsignacion;
	private Integer tipoProceso;
	private String accion;
	private String version;
	private Integer estado;
	private Integer idAgente;
	private Integer idGrupo;
	private Integer idOrganizacion;
	private Integer tipoAgente;
	private String codigoAgente;
	private Integer idEmpleado;
	private Integer indicadorMultiple;
	private String clave;
	private Date fechaInicio;
	private Date fechaFin;
	private Date fechaExpiracion;
	private String nombreAgente;
	private Integer expiraClave;
	private String descripcionAgente;
	private Integer estadoAgente;
	private Integer idGrupoTransaccion;
	private Integer tipoTransaccion;
	private Integer idOpcionDefecto;
	private String plataforma;
	private Date valorFechaAgOpcion;
	private BigDecimal valorNumericoAgOpcion;
	private String valorTextAgOpcion;
	private Integer indicadorAcceso;
	private Integer indicadorHabilitado;
	private Integer indicadorObligatorio;
	private Integer indicadorVisible;
	private Integer indicarPrioridadAgOpcion;
	private Integer indicadorNuevo;
	private Integer indicadorModificar;
	private Integer indicadorEliminar;
	private Integer indicadorIngreso;
	private Integer estadoAgenteOpcion;
	private Integer idFormato;
	private Integer idFormatoPadre;
	private String codigoFormato;
	private String codigoFormatoPadre;
	private String cadenaRecursividadFormato;
	private Integer nivel;
	private String descripcionFormato;
	private String descripcionExtranjera;
	private Integer tipoFormato;
	private String versionFormatoFijo;
	private Integer idFormatoDinamico;
	private Integer estadoFormato;


	public SsCheVistaSeguridad() {
	}

	public SsCheVistaSeguridad(String sistema, String modulo, int idOpcion, int idAgente) {
		this.sistema = sistema;
		this.modulo = modulo;
		this.idOpcion = idOpcion;
		this.idAgente = idAgente;
	}

	public SsCheVistaSeguridad(String sistema, String nombre, String modulo, Integer orden, String nombreModulo,
			int idOpcion, Integer idOpcionPadre, String codigoOpcion, String cadenaRecursividad, Integer nivelOpcion,
			String nombreOpcion, String descripcion, String subModulo, Integer ordenOpcion, String tipoOpcion,
			Integer tipoIcono, Integer indicadorPrioridad, Integer indicadorObjeto, Integer idObjetoAsociado,
			String tipoDato, String valorTexto, BigDecimal valorNumerico, Date valorFecha, String urlOpcion,
			String usuarioCreacion, Date fechaCreacion, String usuarioModificacion, Date fechaModificacion,
			String compania, Integer indicadorCompania, Integer idTipoAtencion, String tipoTrabajador,
			Integer indicadorFormato, Integer indicadorAsignacion, Integer tipoProceso, String accion, String version,
			Integer estado, int idAgente, Integer idGrupo, Integer idOrganizacion, Integer tipoAgente,
			String codigoAgente, Integer idEmpleado, Integer indicadorMultiple, String clave, Date fechaInicio,
			Date fechaFin, Date fechaExpiracion, String nombreAgente, Integer expiraClave, String descripcionAgente,
			Integer estadoAgente, Integer idGrupoTransaccion, Integer tipoTransaccion, Integer idOpcionDefecto,
			String plataforma, Date valorFechaAgOpcion, BigDecimal valorNumericoAgOpcion, String valorTextAgOpcion,
			Integer indicadorAcceso, Integer indicadorHabilitado, Integer indicadorObligatorio,
			Integer indicadorVisible, Integer indicarPrioridadAgOpcion, Integer indicadorNuevo,
			Integer indicadorModificar, Integer indicadorEliminar, Integer indicadorIngreso, Integer estadoAgenteOpcion,
			Integer idFormato, Integer idFormatoPadre, String codigoFormato, String codigoFormatoPadre,
			String cadenaRecursividadFormato, Integer nivel, String descripcionFormato, String descripcionExtranjera,
			Integer tipoFormato, String versionFormatoFijo, Integer idFormatoDinamico, Integer estadoFormato) {
		this.sistema = sistema;
		this.nombre = nombre;
		this.modulo = modulo;
		this.orden = orden;
		this.nombreModulo = nombreModulo;
		this.idOpcion = idOpcion;
		this.idOpcionPadre = idOpcionPadre;
		this.codigoOpcion = codigoOpcion;
		this.cadenaRecursividad = cadenaRecursividad;
		this.nivelOpcion = nivelOpcion;
		this.nombreOpcion = nombreOpcion;
		this.descripcion = descripcion;
		this.subModulo = subModulo;
		this.ordenOpcion = ordenOpcion;
		this.tipoOpcion = tipoOpcion;
		this.tipoIcono = tipoIcono;
		this.indicadorPrioridad = indicadorPrioridad;
		this.indicadorObjeto = indicadorObjeto;
		this.idObjetoAsociado = idObjetoAsociado;
		this.tipoDato = tipoDato;
		this.valorTexto = valorTexto;
		this.valorNumerico = valorNumerico;
		this.valorFecha = valorFecha;
		this.urlOpcion = urlOpcion;
		this.usuarioCreacion = usuarioCreacion;
		this.fechaCreacion = fechaCreacion;
		this.usuarioModificacion = usuarioModificacion;
		this.fechaModificacion = fechaModificacion;
		this.compania = compania;
		this.indicadorCompania = indicadorCompania;
		this.idTipoAtencion = idTipoAtencion;
		this.tipoTrabajador = tipoTrabajador;
		this.indicadorFormato = indicadorFormato;
		this.indicadorAsignacion = indicadorAsignacion;
		this.tipoProceso = tipoProceso;
		this.accion = accion;
		this.version = version;
		this.estado = estado;
		this.idAgente = idAgente;
		this.idGrupo = idGrupo;
		this.idOrganizacion = idOrganizacion;
		this.tipoAgente = tipoAgente;
		this.codigoAgente = codigoAgente;
		this.idEmpleado = idEmpleado;
		this.indicadorMultiple = indicadorMultiple;
		this.clave = clave;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.fechaExpiracion = fechaExpiracion;
		this.nombreAgente = nombreAgente;
		this.expiraClave = expiraClave;
		this.descripcionAgente = descripcionAgente;
		this.estadoAgente = estadoAgente;
		this.idGrupoTransaccion = idGrupoTransaccion;
		this.tipoTransaccion = tipoTransaccion;
		this.idOpcionDefecto = idOpcionDefecto;
		this.plataforma = plataforma;
		this.valorFechaAgOpcion = valorFechaAgOpcion;
		this.valorNumericoAgOpcion = valorNumericoAgOpcion;
		this.valorTextAgOpcion = valorTextAgOpcion;
		this.indicadorAcceso = indicadorAcceso;
		this.indicadorHabilitado = indicadorHabilitado;
		this.indicadorObligatorio = indicadorObligatorio;
		this.indicadorVisible = indicadorVisible;
		this.indicarPrioridadAgOpcion = indicarPrioridadAgOpcion;
		this.indicadorNuevo = indicadorNuevo;
		this.indicadorModificar = indicadorModificar;
		this.indicadorEliminar = indicadorEliminar;
		this.indicadorIngreso = indicadorIngreso;
		this.estadoAgenteOpcion = estadoAgenteOpcion;
		this.idFormato = idFormato;
		this.idFormatoPadre = idFormatoPadre;
		this.codigoFormato = codigoFormato;
		this.codigoFormatoPadre = codigoFormatoPadre;
		this.cadenaRecursividadFormato = cadenaRecursividadFormato;
		this.nivel = nivel;
		this.descripcionFormato = descripcionFormato;
		this.descripcionExtranjera = descripcionExtranjera;
		this.tipoFormato = tipoFormato;
		this.versionFormatoFijo = versionFormatoFijo;
		this.idFormatoDinamico = idFormatoDinamico;
		this.estadoFormato = estadoFormato;
	}

	@Column(name = "Sistema", nullable = false, length = 4)
	public String getSistema() {
		return this.sistema;
	}

	public void setSistema(String sistema) {
		this.sistema = sistema;
	}

	@Column(name = "Nombre", length = 30)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "Modulo", nullable = false, length = 2)
	public String getModulo() {
		return this.modulo;
	}

	public void setModulo(String modulo) {
		this.modulo = modulo;
	}

	@Column(name = "Orden")
	public Integer getOrden() {
		return this.orden;
	}

	public void setOrden(Integer orden) {
		this.orden = orden;
	}

	@Column(name = "NombreModulo", length = 30)
	public String getNombreModulo() {
		return this.nombreModulo;
	}

	public void setNombreModulo(String nombreModulo) {
		this.nombreModulo = nombreModulo;
	}

	@Id
	@Column(name = "IdOpcion", nullable = false)
	public int getIdOpcion() {
		return this.idOpcion;
	}

	public void setIdOpcion(int idOpcion) {
		this.idOpcion = idOpcion;
	}

	@Column(name = "IdOpcionPadre")
	public Integer getIdOpcionPadre() {
		return this.idOpcionPadre;
	}

	public void setIdOpcionPadre(Integer idOpcionPadre) {
		this.idOpcionPadre = idOpcionPadre;
	}

	@Column(name = "CodigoOpcion", length = 15)
	public String getCodigoOpcion() {
		return this.codigoOpcion;
	}

	public void setCodigoOpcion(String codigoOpcion) {
		this.codigoOpcion = codigoOpcion;
	}

	@Column(name = "CadenaRecursividad", length = 150)
	public String getCadenaRecursividad() {
		return this.cadenaRecursividad;
	}

	public void setCadenaRecursividad(String cadenaRecursividad) {
		this.cadenaRecursividad = cadenaRecursividad;
	}

	@Column(name = "NivelOpcion")
	public Integer getNivelOpcion() {
		return this.nivelOpcion;
	}

	public void setNivelOpcion(Integer nivelOpcion) {
		this.nivelOpcion = nivelOpcion;
	}

	@Column(name = "NombreOpcion", length = 80)
	public String getNombreOpcion() {
		return this.nombreOpcion;
	}

	public void setNombreOpcion(String nombreOpcion) {
		this.nombreOpcion = nombreOpcion;
	}

	@Column(name = "Descripcion", length = 80)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "SubModulo", length = 2)
	public String getSubModulo() {
		return this.subModulo;
	}

	public void setSubModulo(String subModulo) {
		this.subModulo = subModulo;
	}

	@Column(name = "OrdenOpcion")
	public Integer getOrdenOpcion() {
		return this.ordenOpcion;
	}

	public void setOrdenOpcion(Integer ordenOpcion) {
		this.ordenOpcion = ordenOpcion;
	}

	@Column(name = "TipoOpcion", length = 1)
	public String getTipoOpcion() {
		return this.tipoOpcion;
	}

	public void setTipoOpcion(String tipoOpcion) {
		this.tipoOpcion = tipoOpcion;
	}

	@Column(name = "TipoIcono")
	public Integer getTipoIcono() {
		return this.tipoIcono;
	}

	public void setTipoIcono(Integer tipoIcono) {
		this.tipoIcono = tipoIcono;
	}

	@Column(name = "IndicadorPrioridad")
	public Integer getIndicadorPrioridad() {
		return this.indicadorPrioridad;
	}

	public void setIndicadorPrioridad(Integer indicadorPrioridad) {
		this.indicadorPrioridad = indicadorPrioridad;
	}

	@Column(name = "IndicadorObjeto")
	public Integer getIndicadorObjeto() {
		return this.indicadorObjeto;
	}

	public void setIndicadorObjeto(Integer indicadorObjeto) {
		this.indicadorObjeto = indicadorObjeto;
	}

	@Column(name = "IdObjetoAsociado")
	public Integer getIdObjetoAsociado() {
		return this.idObjetoAsociado;
	}

	public void setIdObjetoAsociado(Integer idObjetoAsociado) {
		this.idObjetoAsociado = idObjetoAsociado;
	}

	@Column(name = "TipoDato", length = 1)
	public String getTipoDato() {
		return this.tipoDato;
	}

	public void setTipoDato(String tipoDato) {
		this.tipoDato = tipoDato;
	}

	@Column(name = "ValorTexto", length = 150)
	public String getValorTexto() {
		return this.valorTexto;
	}

	public void setValorTexto(String valorTexto) {
		this.valorTexto = valorTexto;
	}

	@Column(name = "ValorNumerico", precision = 20, scale = 10)
	public BigDecimal getValorNumerico() {
		return this.valorNumerico;
	}

	public void setValorNumerico(BigDecimal valorNumerico) {
		this.valorNumerico = valorNumerico;
	}

	@Column(name = "ValorFecha", length = 23)
	public Date getValorFecha() {
		return this.valorFecha;
	}

	public void setValorFecha(Date valorFecha) {
		this.valorFecha = valorFecha;
	}

	@Column(name = "UrlOpcion", length = 150)
	public String getUrlOpcion() {
		return this.urlOpcion;
	}

	public void setUrlOpcion(String urlOpcion) {
		this.urlOpcion = urlOpcion;
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

	@Column(name = "Compania", length = 15)
	public String getCompania() {
		return this.compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}

	@Column(name = "IndicadorCompania")
	public Integer getIndicadorCompania() {
		return this.indicadorCompania;
	}

	public void setIndicadorCompania(Integer indicadorCompania) {
		this.indicadorCompania = indicadorCompania;
	}

	@Column(name = "idTipoAtencion")
	public Integer getIdTipoAtencion() {
		return this.idTipoAtencion;
	}

	public void setIdTipoAtencion(Integer idTipoAtencion) {
		this.idTipoAtencion = idTipoAtencion;
	}

	@Column(name = "TipoTrabajador", length = 2)
	public String getTipoTrabajador() {
		return this.tipoTrabajador;
	}

	public void setTipoTrabajador(String tipoTrabajador) {
		this.tipoTrabajador = tipoTrabajador;
	}

	@Column(name = "IndicadorFormato")
	public Integer getIndicadorFormato() {
		return this.indicadorFormato;
	}

	public void setIndicadorFormato(Integer indicadorFormato) {
		this.indicadorFormato = indicadorFormato;
	}

	@Column(name = "IndicadorAsignacion")
	public Integer getIndicadorAsignacion() {
		return this.indicadorAsignacion;
	}

	public void setIndicadorAsignacion(Integer indicadorAsignacion) {
		this.indicadorAsignacion = indicadorAsignacion;
	}

	@Column(name = "TipoProceso")
	public Integer getTipoProceso() {
		return this.tipoProceso;
	}

	public void setTipoProceso(Integer tipoProceso) {
		this.tipoProceso = tipoProceso;
	}

	@Column(name = "Accion", length = 50)
	public String getAccion() {
		return this.accion;
	}

	public void setAccion(String accion) {
		this.accion = accion;
	}

	@Column(name = "Version", length = 50)
	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Column(name = "Estado")
	public Integer getEstado() {
		return this.estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	@Column(name = "IdAgente", nullable = false)
	public Integer getIdAgente() {
		return this.idAgente;
	}

	public void setIdAgente(Integer idAgente) {
		this.idAgente = idAgente;
	}

	@Column(name = "IdGrupo")
	public Integer getIdGrupo() {
		return this.idGrupo;
	}

	public void setIdGrupo(Integer idGrupo) {
		this.idGrupo = idGrupo;
	}

	@Column(name = "IdOrganizacion")
	public Integer getIdOrganizacion() {
		return this.idOrganizacion;
	}

	public void setIdOrganizacion(Integer idOrganizacion) {
		this.idOrganizacion = idOrganizacion;
	}

	@Column(name = "TipoAgente")
	public Integer getTipoAgente() {
		return this.tipoAgente;
	}

	public void setTipoAgente(Integer tipoAgente) {
		this.tipoAgente = tipoAgente;
	}

	@Column(name = "CodigoAgente", length = 15)
	public String getCodigoAgente() {
		return this.codigoAgente;
	}

	public void setCodigoAgente(String codigoAgente) {
		this.codigoAgente = codigoAgente;
	}

	@Column(name = "IdEmpleado")
	public Integer getIdEmpleado() {
		return this.idEmpleado;
	}

	public void setIdEmpleado(Integer idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	@Column(name = "IndicadorMultiple")
	public Integer getIndicadorMultiple() {
		return this.indicadorMultiple;
	}

	public void setIndicadorMultiple(Integer indicadorMultiple) {
		this.indicadorMultiple = indicadorMultiple;
	}

	@Column(name = "Clave", length = 15)
	public String getClave() {
		return this.clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	@Column(name = "FechaInicio", length = 23)
	public Date getFechaInicio() {
		return this.fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	@Column(name = "FechaFin", length = 23)
	public Date getFechaFin() {
		return this.fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	@Column(name = "FechaExpiracion", length = 23)
	public Date getFechaExpiracion() {
		return this.fechaExpiracion;
	}

	public void setFechaExpiracion(Date fechaExpiracion) {
		this.fechaExpiracion = fechaExpiracion;
	}

	@Column(name = "NombreAgente", length = 60)
	public String getNombreAgente() {
		return this.nombreAgente;
	}

	public void setNombreAgente(String nombreAgente) {
		this.nombreAgente = nombreAgente;
	}

	@Column(name = "ExpiraClave")
	public Integer getExpiraClave() {
		return this.expiraClave;
	}

	public void setExpiraClave(Integer expiraClave) {
		this.expiraClave = expiraClave;
	}

	@Column(name = "DescripcionAgente", length = 80)
	public String getDescripcionAgente() {
		return this.descripcionAgente;
	}

	public void setDescripcionAgente(String descripcionAgente) {
		this.descripcionAgente = descripcionAgente;
	}

	@Column(name = "EstadoAgente")
	public Integer getEstadoAgente() {
		return this.estadoAgente;
	}

	public void setEstadoAgente(Integer estadoAgente) {
		this.estadoAgente = estadoAgente;
	}

	@Column(name = "IdGrupoTransaccion")
	public Integer getIdGrupoTransaccion() {
		return this.idGrupoTransaccion;
	}

	public void setIdGrupoTransaccion(Integer idGrupoTransaccion) {
		this.idGrupoTransaccion = idGrupoTransaccion;
	}

	@Column(name = "TipoTransaccion")
	public Integer getTipoTransaccion() {
		return this.tipoTransaccion;
	}

	public void setTipoTransaccion(Integer tipoTransaccion) {
		this.tipoTransaccion = tipoTransaccion;
	}


	@Column(name = "IdOpcionDefecto")
	public Integer getIdOpcionDefecto() {
		return this.idOpcionDefecto;
	}

	public void setIdOpcionDefecto(Integer idOpcionDefecto) {
		this.idOpcionDefecto = idOpcionDefecto;
	}

	@Column(name = "Plataforma", length = 25)
	public String getPlataforma() {
		return this.plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	@Column(name = "ValorFechaAgOpcion", length = 23)
	public Date getValorFechaAgOpcion() {
		return this.valorFechaAgOpcion;
	}

	public void setValorFechaAgOpcion(Date valorFechaAgOpcion) {
		this.valorFechaAgOpcion = valorFechaAgOpcion;
	}

	@Column(name = "ValorNumericoAgOpcion", precision = 20, scale = 10)
	public BigDecimal getValorNumericoAgOpcion() {
		return this.valorNumericoAgOpcion;
	}

	public void setValorNumericoAgOpcion(BigDecimal valorNumericoAgOpcion) {
		this.valorNumericoAgOpcion = valorNumericoAgOpcion;
	}

	@Column(name = "ValorTextAgOpcion", length = 80)
	public String getValorTextAgOpcion() {
		return this.valorTextAgOpcion;
	}

	public void setValorTextAgOpcion(String valorTextAgOpcion) {
		this.valorTextAgOpcion = valorTextAgOpcion;
	}

	@Column(name = "IndicadorAcceso")
	public Integer getIndicadorAcceso() {
		return this.indicadorAcceso;
	}

	public void setIndicadorAcceso(Integer indicadorAcceso) {
		this.indicadorAcceso = indicadorAcceso;
	}

	@Column(name = "IndicadorHabilitado")
	public Integer getIndicadorHabilitado() {
		return this.indicadorHabilitado;
	}

	public void setIndicadorHabilitado(Integer indicadorHabilitado) {
		this.indicadorHabilitado = indicadorHabilitado;
	}

	@Column(name = "IndicadorObligatorio")
	public Integer getIndicadorObligatorio() {
		return this.indicadorObligatorio;
	}

	public void setIndicadorObligatorio(Integer indicadorObligatorio) {
		this.indicadorObligatorio = indicadorObligatorio;
	}

	@Column(name = "IndicadorVisible")
	public Integer getIndicadorVisible() {
		return this.indicadorVisible;
	}

	public void setIndicadorVisible(Integer indicadorVisible) {
		this.indicadorVisible = indicadorVisible;
	}

	@Column(name = "IndicarPrioridadAgOpcion")
	public Integer getIndicarPrioridadAgOpcion() {
		return this.indicarPrioridadAgOpcion;
	}

	public void setIndicarPrioridadAgOpcion(Integer indicarPrioridadAgOpcion) {
		this.indicarPrioridadAgOpcion = indicarPrioridadAgOpcion;
	}

	@Column(name = "IndicadorNuevo")
	public Integer getIndicadorNuevo() {
		return this.indicadorNuevo;
	}

	public void setIndicadorNuevo(Integer indicadorNuevo) {
		this.indicadorNuevo = indicadorNuevo;
	}

	@Column(name = "IndicadorModificar")
	public Integer getIndicadorModificar() {
		return this.indicadorModificar;
	}

	public void setIndicadorModificar(Integer indicadorModificar) {
		this.indicadorModificar = indicadorModificar;
	}

	@Column(name = "IndicadorEliminar")
	public Integer getIndicadorEliminar() {
		return this.indicadorEliminar;
	}

	public void setIndicadorEliminar(Integer indicadorEliminar) {
		this.indicadorEliminar = indicadorEliminar;
	}

	@Column(name = "IndicadorIngreso")
	public Integer getIndicadorIngreso() {
		return this.indicadorIngreso;
	}

	public void setIndicadorIngreso(Integer indicadorIngreso) {
		this.indicadorIngreso = indicadorIngreso;
	}

	@Column(name = "EstadoAgenteOpcion")
	public Integer getEstadoAgenteOpcion() {
		return this.estadoAgenteOpcion;
	}

	public void setEstadoAgenteOpcion(Integer estadoAgenteOpcion) {
		this.estadoAgenteOpcion = estadoAgenteOpcion;
	}

	@Column(name = "IdFormato")
	public Integer getIdFormato() {
		return this.idFormato;
	}

	public void setIdFormato(Integer idFormato) {
		this.idFormato = idFormato;
	}

	@Column(name = "IdFormatoPadre")
	public Integer getIdFormatoPadre() {
		return this.idFormatoPadre;
	}

	public void setIdFormatoPadre(Integer idFormatoPadre) {
		this.idFormatoPadre = idFormatoPadre;
	}

	@Column(name = "CodigoFormato", length = 20)
	public String getCodigoFormato() {
		return this.codigoFormato;
	}

	public void setCodigoFormato(String codigoFormato) {
		this.codigoFormato = codigoFormato;
	}

	@Column(name = "CodigoFormatoPadre", length = 20)
	public String getCodigoFormatoPadre() {
		return this.codigoFormatoPadre;
	}

	public void setCodigoFormatoPadre(String codigoFormatoPadre) {
		this.codigoFormatoPadre = codigoFormatoPadre;
	}

	@Column(name = "CadenaRecursividadFormato", length = 150)
	public String getCadenaRecursividadFormato() {
		return this.cadenaRecursividadFormato;
	}

	public void setCadenaRecursividadFormato(String cadenaRecursividadFormato) {
		this.cadenaRecursividadFormato = cadenaRecursividadFormato;
	}

	@Column(name = "Nivel")
	public Integer getNivel() {
		return this.nivel;
	}

	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}

	@Column(name = "DescripcionFormato", length = 100)
	public String getDescripcionFormato() {
		return this.descripcionFormato;
	}

	public void setDescripcionFormato(String descripcionFormato) {
		this.descripcionFormato = descripcionFormato;
	}

	@Column(name = "DescripcionExtranjera", length = 100)
	public String getDescripcionExtranjera() {
		return this.descripcionExtranjera;
	}

	public void setDescripcionExtranjera(String descripcionExtranjera) {
		this.descripcionExtranjera = descripcionExtranjera;
	}

	@Column(name = "TipoFormato")
	public Integer getTipoFormato() {
		return this.tipoFormato;
	}

	public void setTipoFormato(Integer tipoFormato) {
		this.tipoFormato = tipoFormato;
	}

	@Column(name = "VersionFormatoFijo", length = 50)
	public String getVersionFormatoFijo() {
		return this.versionFormatoFijo;
	}

	public void setVersionFormatoFijo(String versionFormatoFijo) {
		this.versionFormatoFijo = versionFormatoFijo;
	}

	@Column(name = "IdFormatoDinamico")
	public Integer getIdFormatoDinamico() {
		return this.idFormatoDinamico;
	}

	public void setIdFormatoDinamico(Integer idFormatoDinamico) {
		this.idFormatoDinamico = idFormatoDinamico;
	}

	@Column(name = "EstadoFormato")
	public Integer getEstadoFormato() {
		return this.estadoFormato;
	}

	public void setEstadoFormato(Integer estadoFormato) {
		this.estadoFormato = estadoFormato;
	}

	

	
}
