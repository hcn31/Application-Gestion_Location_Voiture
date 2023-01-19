package Contreleur;


import java.util.Iterator;

import javax.swing.table.DefaultTableModel;

import Model.Agence;
import Model.Client;
import Model.Voiture;
import Vue.Application;

public class AfficherClient {
	DefaultTableModel table;
public AfficherClient(DefaultTableModel ta) {
	table=ta;
	Agence aa=Application.getAg();
	Iterator <Client> itr=aa.lesClients();
	while(itr.hasNext())
	{
		Client t=itr.next();
		 table.addRow(new Object[]{t.getCIN(),t.getNom(),t.getPrenom(),t.getCivilite()});
		 
		}
	}
}
	
	

