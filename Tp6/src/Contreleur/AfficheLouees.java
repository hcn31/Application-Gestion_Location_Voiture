package Contreleur;


import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;


import javax.swing.JButton;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;



import Model.Agence;
import Model.Client;
import Model.CritereAnnee;
import Model.CritereMarque;
import Model.CriterePrix;
import Model.InterCritere;
import Model.Voiture;
import Vue.Application;

public class AfficheLouees {
	DefaultTableModel tab;
	ArrayList<Voiture> voitures;
	JButton button;
	JTable table;

	public AfficheLouees(DefaultTableModel a,JTable ta,JTextField a1,JTextField a2,JTextField a3) {
		tab =a;
		table=ta;
		Agence aa=Application.getAg();
		Iterator <Voiture> itr;
	 
		itr=aa.lesVoituresLouees();
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
			
			if(aa.estLoue(t))
			{
				Client c=aa.Loueur(t);
			 tab.addRow(new Object[]{t.getMarque(),t.getNom(),t.getAnnee(),t.getPrix(),c});

			}
		
	}

		 table.addMouseListener(new MouseAdapter() {
			 public void mouseClicked(MouseEvent e) {
				 int ligne= table.getSelectedRow();
				  Client cl=(Client)table.getValueAt(ligne, 4);
				
				 int er=JOptionPane.showConfirmDialog(table,"La voiture louée par "+cl+" est rendu","Message", JOptionPane.YES_NO_CANCEL_OPTION);
				 if(er==0)
					 aa.rendVoiture(cl);
				 int i=tab.getRowCount();
					while(i>0) {
						tab.removeRow(i-1);
						i--;
					}
					
					Iterator <Voiture> itr;

					itr=aa.lesVoituresLouees();
					while(itr.hasNext())
					{
						Voiture t=itr.next();
						
						if(aa.estLoue(t))
						{
							Client c=aa.Loueur(t);
						 tab.addRow(new Object[]{t.getMarque(),t.getNom(),t.getAnnee(),t.getPrix(),c});

						}
					
				}
				
				
				 
			  
			 }
			});	
}


}



