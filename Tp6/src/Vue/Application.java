package Vue;

import Model.Agence;
import Model.Client;
import Model.Voiture;


public class Application {
private static Agence Ag=new Agence();




	public static void main(String[] args) {
		
		//// Remlissage prealable
		
		Voiture v=new Voiture("125454","Audi","RS3",2020,150);
		Voiture v1=new Voiture("28487","Renault","Clio4",2009,100);
		Voiture v2=new Voiture("3887","Mercedes","Benz",1998,80);
		Voiture v3=new Voiture("87878","Renault","8",1998,80);
		Voiture v4=new Voiture("38487","Bugatti","15",1998,80);
		Voiture v5=new Voiture("387/787","Wolswagn","Golf 7",2016,80);
		Ag.addVoiture(v);
		Ag.addVoiture(v1);
		Ag.addVoiture(v2);
		Ag.addVoiture(v3);
		Ag.addVoiture(v4);
		Ag.addVoiture(v5);
	
		
		Client c1=new Client("HASSANI","Elmehdi","TK28496","Mr");
		Client c2=new Client("Essaidi","Houcine","TK28250","Mr");
		Client c3=new Client("moham","amine","TK28250","Mr");
		Client c4=new Client("islam","salma","TK28250","Mme");
		try {
			Ag.loueVoiture(c1, v1);
			Ag.loueVoiture(c2, v2);
			Ag.loueVoiture(c2, v3);
			Ag.loueVoiture(c1, v4);
		} catch (Exception e) {
			System.err.println(e);
		} 
	
		
		new InterfaceAgence();
		
	}
	public static Agence getAg() {
		return Ag;
	}
	

}
