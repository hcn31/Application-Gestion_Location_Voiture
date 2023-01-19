package Vue;

import java.awt.Choice;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Model.Client;
import Model.V_Existe;
import Model.V_Loue;
import Model.Voiture;




public class InterLouer{
	JDialog myd;
	TextField T1;
	TextField T2;
	TextField T3;
	Choice T4;
	JButton Confirmer;
	Client myc;
	Voiture V;
public InterLouer(JPanel parent,Voiture myv) {
	 myd=new JDialog(myd, "Client a loue");
     myd.setSize(400, 300);
     myd.setLocationRelativeTo(parent);
JPanel all=new JPanel();

     JLabel label = new JLabel("Ajouter les informations du client");
     all.add(label);
	T1=new TextField(30);
	T2=new TextField(30);
	T3=new TextField(30);
	T4=new Choice();
	T4.addItem("Mr");
	T4.addItem("Mme");
	JLabel a=new JLabel("Nom");
	JLabel b=new JLabel("Prenom");
	JLabel c=new JLabel("Cin");
	JLabel d=new JLabel("Civilicite");
	
	JPanel all1=new JPanel();
	all1.add(a);
	all1.add(T1);

	JPanel all2=new JPanel();
	all2.add(b);
	all2.add(T2);

	JPanel all3=new JPanel();
	all3.add(c);
	all3.add(T3);
	
	JPanel all4=new JPanel();
	all4.add(d);
	all4.add(T4);
	
	Confirmer=new JButton("Confirmer");
	JPanel all5=new JPanel();
	all5.add(Confirmer);
	
	all.add(all1);
	all.add(all2);
	all.add(all3);
	all.add(all4);
	all.add(all5);
	myd.add(all);
	V=myv;
	
	Confirmer.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if(T4.getSelectedIndex()==0) 
			myc=new Client(T1.getText(),T2.getText(),T3.getText(),"Mr");
			else
			myc=new Client(T1.getText(),T2.getText(),T3.getText(),"Mme");
			
    	 try {
				Application.getAg().loueVoiture(myc, V);
			} catch (V_Existe e1) {
				e1.printStackTrace();
			} catch (V_Loue e1) {
				e1.printStackTrace();
			}
    	 myd.setVisible(false);
		}
	});
	
	
	myd.setVisible(true);
}
public Client getMyc() {
	return myc;
}
public void setMyc(Client myc) {
	this.myc = myc;
}

}
