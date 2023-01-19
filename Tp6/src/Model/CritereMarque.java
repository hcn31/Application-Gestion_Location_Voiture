package Model;

public class CritereMarque implements Critere{
	
	private String crt;
	public CritereMarque(String critere)
	{
		crt=critere;
	}
	public boolean estSatisfaitPar(Voiture v)
	{
		if(v.getMarque().equals(crt)) return true;
		return false;
	}

}
