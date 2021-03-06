package pe.royalsystems.springerp.model.domain;

//default package
//Generated Sep 10, 2015 3:30:07 PM by Hibernate Tools 4.3.1

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
* VwServicioPrestacionId generated by hbm2java
*/
@Embeddable
public class VwServicioPrestacionId implements java.io.Serializable {

	private String componente;
	private BigDecimal valorMedida;
	private BigDecimal cantidadAsistentes;
	private Integer instrumentistas;
	private BigDecimal diasHospitalizacion;
	private String codigoSegus;
	private String codigoNuevo;
	private Integer estado;
	private String nombre;
	private String descripcion;
	private String compania;
	private String centroCosto;
	private String clasificadorMovimiento;
	private String conceptoGasto;
	private Integer indicadorImpuesto;
	private int idClasificacion;
	private String codClasificacion;
	private String nomClasificacion;
	private Integer orden;
	private Integer tipoPrestacion;
	private int indicadorCita;
	private int indicadorHc;
	private String cadenaRecursividad;
	private Integer indicadorPrestacionPrincipal;
	private Integer indicadorRequierePersonal;
	private Integer idServicio;
	private Integer idGrupoAtencion;
	private String codigo;
	private Integer tipoOrdenAtencion;
	private String accion;

	public VwServicioPrestacionId() {
	}

	public VwServicioPrestacionId(String componente, int idClasificacion, int indicadorCita, int indicadorHc,
			String accion) {
		this.componente = componente;
		this.idClasificacion = idClasificacion;
		this.indicadorCita = indicadorCita;
		this.indicadorHc = indicadorHc;
		this.accion = accion;
	}

	public VwServicioPrestacionId(String componente, BigDecimal valorMedida, BigDecimal cantidadAsistentes,
			Integer instrumentistas, BigDecimal diasHospitalizacion, String codigoSegus, String codigoNuevo,
			Integer estado, String nombre, String descripcion, String compania, String centroCosto,
			String clasificadorMovimiento, String conceptoGasto, Integer indicadorImpuesto, int idClasificacion,
			String codClasificacion, String nomClasificacion, Integer orden, Integer tipoPrestacion, int indicadorCita,
			int indicadorHc, String cadenaRecursividad, Integer indicadorPrestacionPrincipal,
			Integer indicadorRequierePersonal, Integer idServicio, Integer idGrupoAtencion, String codigo,
			Integer tipoOrdenAtencion, String accion) {
		this.componente = componente;
		this.valorMedida = valorMedida;
		this.cantidadAsistentes = cantidadAsistentes;
		this.instrumentistas = instrumentistas;
		this.diasHospitalizacion = diasHospitalizacion;
		this.codigoSegus = codigoSegus;
		this.codigoNuevo = codigoNuevo;
		this.estado = estado;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.compania = compania;
		this.centroCosto = centroCosto;
		this.clasificadorMovimiento = clasificadorMovimiento;
		this.conceptoGasto = conceptoGasto;
		this.indicadorImpuesto = indicadorImpuesto;
		this.idClasificacion = idClasificacion;
		this.codClasificacion = codClasificacion;
		this.nomClasificacion = nomClasificacion;
		this.orden = orden;
		this.tipoPrestacion = tipoPrestacion;
		this.indicadorCita = indicadorCita;
		this.indicadorHc = indicadorHc;
		this.cadenaRecursividad = cadenaRecursividad;
		this.indicadorPrestacionPrincipal = indicadorPrestacionPrincipal;
		this.indicadorRequierePersonal = indicadorRequierePersonal;
		this.idServicio = idServicio;
		this.idGrupoAtencion = idGrupoAtencion;
		this.codigo = codigo;
		this.tipoOrdenAtencion = tipoOrdenAtencion;
		this.accion = accion;
	}

	@Column(name = "Componente", nullable = false, length = 25)
	public String getComponente() {
		return this.componente;
	}

	public void setComponente(String componente) {
		this.componente = componente;
	}

	@Column(name = "ValorMedida", precision = 20, scale = 6)
	public BigDecimal getValorMedida() {
		return this.valorMedida;
	}

	public void setValorMedida(BigDecimal valorMedida) {
		this.valorMedida = valorMedida;
	}

	@Column(name = "CantidadAsistentes", precision = 20, scale = 6)
	public BigDecimal getCantidadAsistentes() {
		return this.cantidadAsistentes;
	}

	public void setCantidadAsistentes(BigDecimal cantidadAsistentes) {
		this.cantidadAsistentes = cantidadAsistentes;
	}

	@Column(name = "Instrumentistas")
	public Integer getInstrumentistas() {
		return this.instrumentistas;
	}

	public void setInstrumentistas(Integer instrumentistas) {
		this.instrumentistas = instrumentistas;
	}

	@Column(name = "DiasHospitalizacion", precision = 9)
	public BigDecimal getDiasHospitalizacion() {
		return this.diasHospitalizacion;
	}

	public void setDiasHospitalizacion(BigDecimal diasHospitalizacion) {
		this.diasHospitalizacion = diasHospitalizacion;
	}

	@Column(name = "CodigoSegus", length = 15)
	public String getCodigoSegus() {
		return this.codigoSegus;
	}

	public void setCodigoSegus(String codigoSegus) {
		this.codigoSegus = codigoSegus;
	}

	@Column(name = "CodigoNuevo", length = 15)
	public String getCodigoNuevo() {
		return this.codigoNuevo;
	}

	public void setCodigoNuevo(String codigoNuevo) {
		this.codigoNuevo = codigoNuevo;
	}

	@Column(name = "Estado")
	public Integer getEstado() {
		return this.estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	@Column(name = "Nombre", length = 250)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "Descripcion", length = 300)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "Compania", length = 15)
	public String getCompania() {
		return this.compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}

	@Column(name = "CentroCosto", length = 15)
	public String getCentroCosto() {
		return this.centroCosto;
	}

	public void setCentroCosto(String centroCosto) {
		this.centroCosto = centroCosto;
	}

	@Column(name = "ClasificadorMovimiento", length = 15)
	public String getClasificadorMovimiento() {
		return this.clasificadorMovimiento;
	}

	public void setClasificadorMovimiento(String clasificadorMovimiento) {
		this.clasificadorMovimiento = clasificadorMovimiento;
	}

	@Column(name = "ConceptoGasto", length = 15)
	public String getConceptoGasto() {
		return this.conceptoGasto;
	}

	public void setConceptoGasto(String conceptoGasto) {
		this.conceptoGasto = conceptoGasto;
	}

	@Column(name = "IndicadorImpuesto")
	public Integer getIndicadorImpuesto() {
		return this.indicadorImpuesto;
	}

	public void setIndicadorImpuesto(Integer indicadorImpuesto) {
		this.indicadorImpuesto = indicadorImpuesto;
	}

	@Column(name = "IdClasificacion", nullable = false)
	public int getIdClasificacion() {
		return this.idClasificacion;
	}

	public void setIdClasificacion(int idClasificacion) {
		this.idClasificacion = idClasificacion;
	}

	@Column(name = "CodClasificacion", length = 15)
	public String getCodClasificacion() {
		return this.codClasificacion;
	}

	public void setCodClasificacion(String codClasificacion) {
		this.codClasificacion = codClasificacion;
	}

	@Column(name = "NomClasificacion", length = 250)
	public String getNomClasificacion() {
		return this.nomClasificacion;
	}

	public void setNomClasificacion(String nomClasificacion) {
		this.nomClasificacion = nomClasificacion;
	}

	@Column(name = "Orden")
	public Integer getOrden() {
		return this.orden;
	}

	public void setOrden(Integer orden) {
		this.orden = orden;
	}

	@Column(name = "TipoPrestacion")
	public Integer getTipoPrestacion() {
		return this.tipoPrestacion;
	}

	public void setTipoPrestacion(Integer tipoPrestacion) {
		this.tipoPrestacion = tipoPrestacion;
	}

	@Column(name = "IndicadorCita", nullable = false)
	public int getIndicadorCita() {
		return this.indicadorCita;
	}

	public void setIndicadorCita(int indicadorCita) {
		this.indicadorCita = indicadorCita;
	}

	@Column(name = "IndicadorHC", nullable = false)
	public int getIndicadorHc() {
		return this.indicadorHc;
	}

	public void setIndicadorHc(int indicadorHc) {
		this.indicadorHc = indicadorHc;
	}

	@Column(name = "CadenaRecursividad", length = 150)
	public String getCadenaRecursividad() {
		return this.cadenaRecursividad;
	}

	public void setCadenaRecursividad(String cadenaRecursividad) {
		this.cadenaRecursividad = cadenaRecursividad;
	}

	@Column(name = "IndicadorPrestacionPrincipal")
	public Integer getIndicadorPrestacionPrincipal() {
		return this.indicadorPrestacionPrincipal;
	}

	public void setIndicadorPrestacionPrincipal(Integer indicadorPrestacionPrincipal) {
		this.indicadorPrestacionPrincipal = indicadorPrestacionPrincipal;
	}

	@Column(name = "IndicadorRequierePersonal")
	public Integer getIndicadorRequierePersonal() {
		return this.indicadorRequierePersonal;
	}

	public void setIndicadorRequierePersonal(Integer indicadorRequierePersonal) {
		this.indicadorRequierePersonal = indicadorRequierePersonal;
	}

	@Column(name = "IdServicio")
	public Integer getIdServicio() {
		return this.idServicio;
	}

	public void setIdServicio(Integer idServicio) {
		this.idServicio = idServicio;
	}

	@Column(name = "IdGrupoAtencion")
	public Integer getIdGrupoAtencion() {
		return this.idGrupoAtencion;
	}

	public void setIdGrupoAtencion(Integer idGrupoAtencion) {
		this.idGrupoAtencion = idGrupoAtencion;
	}

	@Column(name = "Codigo", length = 15)
	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Column(name = "TipoOrdenAtencion")
	public Integer getTipoOrdenAtencion() {
		return this.tipoOrdenAtencion;
	}

	public void setTipoOrdenAtencion(Integer tipoOrdenAtencion) {
		this.tipoOrdenAtencion = tipoOrdenAtencion;
	}

	@Column(name = "ACCION", nullable = false, length = 25)
	public String getAccion() {
		return this.accion;
	}

	public void setAccion(String accion) {
		this.accion = accion;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VwServicioPrestacionId))
			return false;
		VwServicioPrestacionId castOther = (VwServicioPrestacionId) other;

		return ((this.getComponente() == castOther.getComponente()) || (this.getComponente() != null
				&& castOther.getComponente() != null && this.getComponente().equals(castOther.getComponente())))
				&& ((this.getValorMedida() == castOther.getValorMedida())
						|| (this.getValorMedida() != null && castOther.getValorMedida() != null
								&& this.getValorMedida().equals(castOther.getValorMedida())))
				&& ((this.getCantidadAsistentes() == castOther.getCantidadAsistentes())
						|| (this.getCantidadAsistentes() != null && castOther.getCantidadAsistentes() != null
								&& this.getCantidadAsistentes().equals(castOther.getCantidadAsistentes())))
				&& ((this.getInstrumentistas() == castOther.getInstrumentistas())
						|| (this.getInstrumentistas() != null && castOther.getInstrumentistas() != null
								&& this.getInstrumentistas().equals(castOther.getInstrumentistas())))
				&& ((this.getDiasHospitalizacion() == castOther.getDiasHospitalizacion())
						|| (this.getDiasHospitalizacion() != null && castOther.getDiasHospitalizacion() != null
								&& this.getDiasHospitalizacion().equals(castOther.getDiasHospitalizacion())))
				&& ((this.getCodigoSegus() == castOther.getCodigoSegus())
						|| (this.getCodigoSegus() != null && castOther.getCodigoSegus() != null
								&& this.getCodigoSegus().equals(castOther.getCodigoSegus())))
				&& ((this.getCodigoNuevo() == castOther.getCodigoNuevo())
						|| (this.getCodigoNuevo() != null && castOther.getCodigoNuevo() != null
								&& this.getCodigoNuevo().equals(castOther.getCodigoNuevo())))
				&& ((this.getEstado() == castOther.getEstado()) || (this.getEstado() != null
						&& castOther.getEstado() != null && this.getEstado().equals(castOther.getEstado())))
				&& ((this.getNombre() == castOther.getNombre()) || (this.getNombre() != null
						&& castOther.getNombre() != null && this.getNombre().equals(castOther.getNombre())))
				&& ((this.getDescripcion() == castOther.getDescripcion())
						|| (this.getDescripcion() != null && castOther.getDescripcion() != null
								&& this.getDescripcion().equals(castOther.getDescripcion())))
				&& ((this.getCompania() == castOther.getCompania()) || (this.getCompania() != null
						&& castOther.getCompania() != null && this.getCompania().equals(castOther.getCompania())))
				&& ((this.getCentroCosto() == castOther.getCentroCosto())
						|| (this.getCentroCosto() != null && castOther.getCentroCosto() != null
								&& this.getCentroCosto().equals(castOther.getCentroCosto())))
				&& ((this.getClasificadorMovimiento() == castOther.getClasificadorMovimiento())
						|| (this.getClasificadorMovimiento() != null && castOther.getClasificadorMovimiento() != null
								&& this.getClasificadorMovimiento().equals(castOther.getClasificadorMovimiento())))
				&& ((this.getConceptoGasto() == castOther.getConceptoGasto())
						|| (this.getConceptoGasto() != null && castOther.getConceptoGasto() != null
								&& this.getConceptoGasto().equals(castOther.getConceptoGasto())))
				&& ((this.getIndicadorImpuesto() == castOther.getIndicadorImpuesto())
						|| (this.getIndicadorImpuesto() != null && castOther.getIndicadorImpuesto() != null
								&& this.getIndicadorImpuesto().equals(castOther.getIndicadorImpuesto())))
				&& (this.getIdClasificacion() == castOther.getIdClasificacion())
				&& ((this.getCodClasificacion() == castOther.getCodClasificacion())
						|| (this.getCodClasificacion() != null && castOther.getCodClasificacion() != null
								&& this.getCodClasificacion().equals(castOther.getCodClasificacion())))
				&& ((this.getNomClasificacion() == castOther.getNomClasificacion())
						|| (this.getNomClasificacion() != null && castOther.getNomClasificacion() != null
								&& this.getNomClasificacion().equals(castOther.getNomClasificacion())))
				&& ((this.getOrden() == castOther.getOrden()) || (this.getOrden() != null
						&& castOther.getOrden() != null && this.getOrden().equals(castOther.getOrden())))
				&& ((this.getTipoPrestacion() == castOther.getTipoPrestacion())
						|| (this.getTipoPrestacion() != null && castOther.getTipoPrestacion() != null
								&& this.getTipoPrestacion().equals(castOther.getTipoPrestacion())))
				&& (this.getIndicadorCita() == castOther.getIndicadorCita())
				&& (this.getIndicadorHc() == castOther.getIndicadorHc())
				&& ((this.getCadenaRecursividad() == castOther.getCadenaRecursividad())
						|| (this.getCadenaRecursividad() != null && castOther.getCadenaRecursividad() != null
								&& this.getCadenaRecursividad().equals(castOther.getCadenaRecursividad())))
				&& ((this.getIndicadorPrestacionPrincipal() == castOther.getIndicadorPrestacionPrincipal())
						|| (this.getIndicadorPrestacionPrincipal() != null
								&& castOther.getIndicadorPrestacionPrincipal() != null
								&& this.getIndicadorPrestacionPrincipal()
										.equals(castOther.getIndicadorPrestacionPrincipal())))
				&& ((this.getIndicadorRequierePersonal() == castOther.getIndicadorRequierePersonal())
						|| (this.getIndicadorRequierePersonal() != null
								&& castOther.getIndicadorRequierePersonal() != null
								&& this.getIndicadorRequierePersonal()
										.equals(castOther.getIndicadorRequierePersonal())))
				&& ((this.getIdServicio() == castOther.getIdServicio()) || (this.getIdServicio() != null
						&& castOther.getIdServicio() != null && this.getIdServicio().equals(castOther.getIdServicio())))
				&& ((this.getIdGrupoAtencion() == castOther.getIdGrupoAtencion())
						|| (this.getIdGrupoAtencion() != null && castOther.getIdGrupoAtencion() != null
								&& this.getIdGrupoAtencion().equals(castOther.getIdGrupoAtencion())))
				&& ((this.getCodigo() == castOther.getCodigo()) || (this.getCodigo() != null
						&& castOther.getCodigo() != null && this.getCodigo().equals(castOther.getCodigo())))
				&& ((this.getTipoOrdenAtencion() == castOther.getTipoOrdenAtencion())
						|| (this.getTipoOrdenAtencion() != null && castOther.getTipoOrdenAtencion() != null
								&& this.getTipoOrdenAtencion().equals(castOther.getTipoOrdenAtencion())))
				&& ((this.getAccion() == castOther.getAccion()) || (this.getAccion() != null
						&& castOther.getAccion() != null && this.getAccion().equals(castOther.getAccion())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getComponente() == null ? 0 : this.getComponente().hashCode());
		result = 37 * result + (getValorMedida() == null ? 0 : this.getValorMedida().hashCode());
		result = 37 * result + (getCantidadAsistentes() == null ? 0 : this.getCantidadAsistentes().hashCode());
		result = 37 * result + (getInstrumentistas() == null ? 0 : this.getInstrumentistas().hashCode());
		result = 37 * result + (getDiasHospitalizacion() == null ? 0 : this.getDiasHospitalizacion().hashCode());
		result = 37 * result + (getCodigoSegus() == null ? 0 : this.getCodigoSegus().hashCode());
		result = 37 * result + (getCodigoNuevo() == null ? 0 : this.getCodigoNuevo().hashCode());
		result = 37 * result + (getEstado() == null ? 0 : this.getEstado().hashCode());
		result = 37 * result + (getNombre() == null ? 0 : this.getNombre().hashCode());
		result = 37 * result + (getDescripcion() == null ? 0 : this.getDescripcion().hashCode());
		result = 37 * result + (getCompania() == null ? 0 : this.getCompania().hashCode());
		result = 37 * result + (getCentroCosto() == null ? 0 : this.getCentroCosto().hashCode());
		result = 37 * result + (getClasificadorMovimiento() == null ? 0 : this.getClasificadorMovimiento().hashCode());
		result = 37 * result + (getConceptoGasto() == null ? 0 : this.getConceptoGasto().hashCode());
		result = 37 * result + (getIndicadorImpuesto() == null ? 0 : this.getIndicadorImpuesto().hashCode());
		result = 37 * result + this.getIdClasificacion();
		result = 37 * result + (getCodClasificacion() == null ? 0 : this.getCodClasificacion().hashCode());
		result = 37 * result + (getNomClasificacion() == null ? 0 : this.getNomClasificacion().hashCode());
		result = 37 * result + (getOrden() == null ? 0 : this.getOrden().hashCode());
		result = 37 * result + (getTipoPrestacion() == null ? 0 : this.getTipoPrestacion().hashCode());
		result = 37 * result + this.getIndicadorCita();
		result = 37 * result + this.getIndicadorHc();
		result = 37 * result + (getCadenaRecursividad() == null ? 0 : this.getCadenaRecursividad().hashCode());
		result = 37 * result
				+ (getIndicadorPrestacionPrincipal() == null ? 0 : this.getIndicadorPrestacionPrincipal().hashCode());
		result = 37 * result
				+ (getIndicadorRequierePersonal() == null ? 0 : this.getIndicadorRequierePersonal().hashCode());
		result = 37 * result + (getIdServicio() == null ? 0 : this.getIdServicio().hashCode());
		result = 37 * result + (getIdGrupoAtencion() == null ? 0 : this.getIdGrupoAtencion().hashCode());
		result = 37 * result + (getCodigo() == null ? 0 : this.getCodigo().hashCode());
		result = 37 * result + (getTipoOrdenAtencion() == null ? 0 : this.getTipoOrdenAtencion().hashCode());
		result = 37 * result + (getAccion() == null ? 0 : this.getAccion().hashCode());
		return result;
	}

}
