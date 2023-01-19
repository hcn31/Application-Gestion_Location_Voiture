package Vue;


import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Contreleur.ajouterVoiture;

public class InterAddV extends JPanel {
	JTextField T0;
	JTextField T1;
	JTextField T2;
	JTextField T3;
	JTextField T4;
	public InterAddV() {
		new GridLayout(5,0);
	JPanel A0=new JPanel();
	JPanel A=new JPanel();
	JPanel B=new JPanel();
	JPanel C=new JPanel();
	JPanel D=new JPanel();
	JLabel l0=new JLabel("Matricule");
	JLabel l1=new JLabel("Marque");
	JLabel l2=new JLabel("Nom");
	JLabel l3=new JLabel("Annee");
	JLabel l4=new JLabel("Prix");
	 T0=new JTextField(50);
	 T1=new JTextField(50);
	 T2=new JTextField(50);
	 T3=new JTextField(50);
	 T4=new JTextField(50);
	JButton add=new JButton("Ajouter");
	A0.add(l0);
	A0.add(T0);
	A.add(l1);
	A.add(T1);
	B.add(l2);
	B.add(T2);
	C.add(l3);
	C.add(T3);
	D.add(l4);
	D.add(T4);
	add(A0);
	add(A);
	add(B);
	add(C);
	add(D);
	add(add);
	add.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			new ajouterVoiture(T0,T1, T2, T3, T4);
			T0.setText("");
			T1.setText("");
			T2.setText("");
			T3.setText("");
			T4.setText("");
		
		}
	});
	}
}
