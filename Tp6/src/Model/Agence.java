package Model;

import java.util.Map;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.ArrayList;
public class Agence {
	
	private ArrayList <Voiture> voitures;
	private Map<Client,Voiture> locations;
	public ArrayList<Voiture> getVoitures() {
		return voitures;
	}

	public void setVoitures(ArrayList<Voiture> voitures) {
		this.voitures = voitures;
	}

	public Map<Client, Voiture> getLocations() {
		return locations;
	}

	public void setLocations(Map<Client, Voiture> locations) {
		this.locations = locations;
	}

	public Agence()
	{
		voitures=new ArrayList <Voiture>();
		locations=new TreeMap<Client,Voiture>();
	}

	public void addVoiture(Voiture v)
	{
		voitures.add(v);
	}
	
	public  Iterator <Voiture>  selectionne(Critere c )
	{
		Iterator <Voiture> itr=voitures.iterator();
		
		ArrayList <Voiture> vtr=new ArrayList <Voiture>();
		while(itr.hasNext())
		{
			Voiture v=itr.next();
			if(c.estSatisfaitPar(v))
				vtr.add(v);
		}
		return vtr.iterator();
	}

	  public void afficheSelection(Critere c)
	  {
		
		  Iterator<Voiture> itr=voitures.iterator();
		  itr=selectionne(c);
			
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
	  }
	  
	 public boolean VoitureExiste(Voiture v)
	 {
		 return voitures.contains(v);
	 }
	 
	 public Voiture getV(String matr) {
		 Iterator<Voiture> itr=voitures.iterator();
		 while(itr.hasNext())
		 {
			 Voiture t=itr.next();
			 if(t.getMat().equals(matr))
				 return t ;
		 }
		return null;
		}
	
	 
	 public boolean estLoue(Voiture v)
	 {
		 return locations.containsValue(v);
	 }
	 
	 
	 
	 
	 
	 
	 public void loueVoiture(Client client,Voiture v) throws V_Existe,V_Loue	 
	 {
		 if(!VoitureExiste(v)) throw new V_Existe();
		 if(estLoue(v)) throw new V_Loue();
		 locations.put(client,v);
	 }
	 
	 public boolean estLoueur(Client client) 
	 {
			return locations.containsKey(client);
	 }
	 
	 public void rendVoiture(Client client) 
	    {
			if(estLoueur(client)) locations.remove(client);	
		}
	 
	 public Iterator<Voiture> lesVoituresLouees() 
	 {
		 ArrayList <Voiture> v_louees=new ArrayList<>();
			for (Map.Entry<Client,Voiture> Element : locations.entrySet())
			{
				v_louees.add(Element.getValue());
			}
			return v_louees.iterator();
		}
	 
	 public Iterator<Voiture> Voituredisp() 
	 {
		 ArrayList <Voiture> v_louees=voitures;
		 
			for (Map.Entry<Client,Voiture> Element : locations.entrySet())
			{
				
				v_louees.remove(Element.getValue());
			}
			return v_louees.iterator();
		}
	 
	 public Iterator<Client> lesClients() 
	 {
		 ArrayList <Client> cli=new ArrayList<>();
			for (Map.Entry<Client,Voiture> Element : locations.entrySet())
			{
				cli.add(Element.getKey());
			}
			return cli.iterator();
		}

	 public void afficher_Locations()
		{
		 for (Map.Entry<Client,Voiture> Element : locations.entrySet())
			{
			 System.out.println("- "+Element.getKey()+"\t Loue La voiture :{ "+Element.getValue()+" }");
			}
		}
	 
	 public Client  Loueur(Voiture V)
	 {
		 for (Map.Entry<Client,Voiture> Element : locations.entrySet())
			{
				if(Element.getValue().equals(V)) return Element.getKey();
					
			}
		 
		return null;
		 
	 }

	 
	 
	 
	 
	}


