package Contreleur;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Model.Agence;
import Model.Critere;
import Model.CritereAnnee;
import Model.CritereMarque;
import Model.CriterePrix;
import Model.InterCritere;
import Model.Voiture;
import Vue.Application;

public class afficherVoiture {
	DefaultTableModel tab;
	ArrayList<Voiture> voitures;
public afficherVoiture(DefaultTableModel a,JTextField a1,JTextField a2,JTextField a3) {
	tab =a;
	
	Agence aa=Application.getAg();
	Iterator <Voiture> itr;
	
	
	ArrayList<Voiture> Voit = aa.getVoitures();
	itr=Voit.iterator();
	InterCritere allc=new InterCritere();
	 
	if(!a1.getText().equals("")) 
	{
	allc.addCritere(new CritereMarque(a1.getText()));		
	}	
		
	if(!a2.getText().equals("")) 
	{
		
		allc.addCritere(new CritereAnnee(Integer.parseInt(a2.getText())));
		
	}	
	if(!a3.getText().equals("")) 
	{
		
		allc.addCritere(new CriterePrix(Double.parseDouble(a3.getText())));
		
	}		
		
	int i=tab.getRowCount();
	while(i>0) {
		tab.removeRow(i-1);
		i--;
	}
	while(itr.hasNext())
	{
		Voiture t=itr.next();
		if(allc.estSatisfaitPar(t)) {
		String statut=aa.estLoue(t)?"Louée":"Disponible";
		 tab.addRow(new Object[]{t.getMat(), t.getMarque(),t.getNom(),t.getAnnee(),t.getPrix(),statut});
		}
	}
		
	
}
}
