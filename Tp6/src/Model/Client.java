package Model;

import java.util.Objects;

public class Client implements Comparable<Client> {
	
	private String nom;
	private String prenom;
	private String CIN;
	private String civilite;
	public Client(String first ,String last ,String id,String c)
	{
		 nom=first;
	     prenom=last;
		 CIN=id;
		civilite=c;	
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getCIN() {
		return CIN;
	}

	public void setCIN(String cIN) {
		CIN = cIN;
	}

	public String getCivilite() {
		return civilite;
	}

	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}

	@Override
	public int hashCode() {
		return Objects.hash(CIN, civilite, nom, prenom);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		return Objects.equals(CIN, other.CIN) && Objects.equals(civilite, other.civilite)
				&& Objects.equals(nom, other.nom) && Objects.equals(prenom, other.prenom);
	}

	public String toString()
	{
	   return  ""+civilite+". "+nom+" "+prenom+" ("+CIN+")";
	}


	public int compareTo(Client o) {
		return nom.compareTo(o.nom);
	}
	

}
