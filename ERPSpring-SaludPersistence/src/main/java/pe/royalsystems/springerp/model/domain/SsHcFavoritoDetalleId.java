package pe.royalsystems.springerp.model.domain;
// Generated Aug 27, 2015 10:27:10 AM by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * SsHcFavoritoDetalleId generated by hbm2java
 */
@Embeddable
public class SsHcFavoritoDetalleId implements java.io.Serializable {

	private int idFavorito;
	private int numeroFavorito;
	private int secuencia;

	public SsHcFavoritoDetalleId() {
	}

	public SsHcFavoritoDetalleId(int idFavorito, int numeroFavorito, int secuencia) {
		this.idFavorito = idFavorito;
		this.numeroFavorito = numeroFavorito;
		this.secuencia = secuencia;
	}

	@Column(name = "IdFavorito", nullable = false)
	public int getIdFavorito() {
		return this.idFavorito;
	}

	public void setIdFavorito(int idFavorito) {
		this.idFavorito = idFavorito;
	}

	@Column(name = "NumeroFavorito", nullable = false)
	public int getNumeroFavorito() {
		return this.numeroFavorito;
	}

	public void setNumeroFavorito(int numeroFavorito) {
		this.numeroFavorito = numeroFavorito;
	}

	@Column(name = "Secuencia", nullable = false)
	public int getSecuencia() {
		return this.secuencia;
	}

	public void setSecuencia(int secuencia) {
		this.secuencia = secuencia;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SsHcFavoritoDetalleId))
			return false;
		SsHcFavoritoDetalleId castOther = (SsHcFavoritoDetalleId) other;

		return (this.getIdFavorito() == castOther.getIdFavorito())
				&& (this.getNumeroFavorito() == castOther.getNumeroFavorito())
				&& (this.getSecuencia() == castOther.getSecuencia());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdFavorito();
		result = 37 * result + this.getNumeroFavorito();
		result = 37 * result + this.getSecuencia();
		return result;
	}

}