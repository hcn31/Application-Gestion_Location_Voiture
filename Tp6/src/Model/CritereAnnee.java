package Model;

public class CritereAnnee implements Critere {
	
	private int an;
	public CritereAnnee(int critere)
	{
		an=critere;
	}
	public boolean estSatisfaitPar(Voiture v)
	{
		if(v.getAnnee()==an) return true;
		return false;
	}


}
