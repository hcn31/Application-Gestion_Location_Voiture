package Model;

public class CriterePrix implements Critere{
	
	
	
	private double pr;
	public CriterePrix(double critere)
	{
		pr=critere;
	}
	public boolean estSatisfaitPar(Voiture v)
	{
		if(v.getPrix()<pr) return true;
		return false;
	}

}
