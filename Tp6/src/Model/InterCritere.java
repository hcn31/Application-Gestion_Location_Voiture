package Model;


import java.util.Iterator;
import java.util.ArrayList;
public class InterCritere implements Critere {
	
	
	private ArrayList <Critere> lesCriteres;
	
	public InterCritere() {
		lesCriteres=new ArrayList <Critere>();
	}
	
	public boolean addCritere(Critere c)
	{
		return lesCriteres.add(c);
	}
	
	public boolean  estSatisfaitPar(Voiture v)
	{
		Iterator <Critere> itr  =lesCriteres.iterator();
		while(itr.hasNext())
		{
			if(!itr.next().estSatisfaitPar(v)) return false;
				
		}
		return true;
	}

}