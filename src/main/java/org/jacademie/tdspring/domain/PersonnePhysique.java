package org.jacademie.tdspring.domain;

public class PersonnePhysique {

	private Long id;
	
	private String nrc;
	
	private String nomUsage;
	
	private String prenom;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PersonnePhysique [id=");
		builder.append(id);
		builder.append(", nrc=");
		builder.append(nrc);
		builder.append(", nomUsage=");
		builder.append(nomUsage);
		builder.append(", prenom=");
		builder.append(prenom);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((nomUsage == null) ? 0 : nomUsage.hashCode());
		result = prime * result + ((nrc == null) ? 0 : nrc.hashCode());
		result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonnePhysique other = (PersonnePhysique) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nomUsage == null) {
			if (other.nomUsage != null)
				return false;
		} else if (!nomUsage.equals(other.nomUsage))
			return false;
		if (nrc == null) {
			if (other.nrc != null)
				return false;
		} else if (!nrc.equals(other.nrc))
			return false;
		if (prenom == null) {
			if (other.prenom != null)
				return false;
		} else if (!prenom.equals(other.prenom))
			return false;
		return true;
	}

	public PersonnePhysique(String nrc, String nomUsage, String prenom) {
		super();
		this.nrc = nrc;
		this.nomUsage = nomUsage;
		this.prenom = prenom;
	}
	
	public PersonnePhysique(Long id, String nrc, String nomUsage, String prenom) {
		this(nrc, nomUsage, prenom);
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNrc() {
		return nrc;
	}

	public void setNrc(String nrc) {
		this.nrc = nrc;
	}

	public String getNomUsage() {
		return nomUsage;
	}

	public void setNomUsage(String nomUsage) {
		this.nomUsage = nomUsage;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	
}
