package pe.royalsystems.springerp.model.domain;

// default package
// Generated Sep 10, 2015 12:39:11 PM by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * SeguridadAutorizacionCompaniaId generated by hbm2java
 */
@Embeddable
public class SeguridadAutorizacionCompaniaId implements java.io.Serializable {

	private String companyowner;
	private String usuario;
	

	public SeguridadAutorizacionCompaniaId() {
	}

	public SeguridadAutorizacionCompaniaId(String companyowner) {
		this.companyowner = companyowner;
	}

	public SeguridadAutorizacionCompaniaId(String companyowner, String usuario) {
		this.companyowner = companyowner;
		this.usuario = usuario;
		
	}

	@Column(name = "Companyowner", nullable = false, length = 8)
	public String getCompanyowner() {
		return this.companyowner;
	}

	public void setCompanyowner(String companyowner) {
		this.companyowner = companyowner;
	}

	@Column(name = "Usuario", length = 25)
	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SeguridadAutorizacionCompaniaId))
			return false;
		SeguridadAutorizacionCompaniaId castOther = (SeguridadAutorizacionCompaniaId) other;

		return ((this.getCompanyowner() == castOther.getCompanyowner()) || (this.getCompanyowner() != null
				&& castOther.getCompanyowner() != null && this.getCompanyowner().equals(castOther.getCompanyowner())))
				&& ((this.getUsuario() == castOther.getUsuario()) || (this.getUsuario() != null
						&& castOther.getUsuario() != null && this.getUsuario().equals(castOther.getUsuario())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getCompanyowner() == null ? 0 : this.getCompanyowner().hashCode());
		result = 37 * result + (getUsuario() == null ? 0 : this.getUsuario().hashCode());
		return result;
	}

}
