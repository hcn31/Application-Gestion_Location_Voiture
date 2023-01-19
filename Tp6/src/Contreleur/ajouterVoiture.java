package Contreleur;


import javax.swing.JTextField;

import Model.Voiture;
import Vue.Application;

public class ajouterVoiture {
public ajouterVoiture(JTextField e, JTextField a,JTextField b,JTextField c,JTextField d) {
	Voiture V=new Voiture(e.getText(),a.getText(),b.getText(),Integer.parseInt(c.getText()),Double.parseDouble(d.getText()));
	Application.getAg().addVoiture(V);
}
}
