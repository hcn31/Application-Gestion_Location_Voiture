package Model;

public class Voiture {
	private String marque;
	private String nom;
	private int annee;
	private double prix;
	private String mat;
	
	public Voiture(String matr,String mar,String n,int a,double p)
	{
		mat=matr;
		marque=mar;
		nom=n;
		annee=a;
		prix=p;
	}
	
	
	public void setMarque(String marque) {
		this.marque = marque;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public void setAnnee(int annee) {
		this.annee = annee;
	}


	public void setPrix(double prix) {
		this.prix = prix;
	}


	public String getMat() {
		return mat;
	}


	public void setMat(String mat) {
		this.mat = mat;
	}


	public String toString()
	{
	   return "La marque : "+getMarque()+"\tLe nom de modele :"+nom+"\tLe prix de location: "+getPrix();
	}

	public String getMarque() {
		return marque;
	}

	public double getPrix() {
		return prix;
	}

	public int getAnnee() {
		return annee;
	}
	public String getNom() {
		return nom;
	}
}
