package Vue;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import Contreleur.AfficheLouees;
import Contreleur.afficherVoiture;

public class Panel3 {
	JPanel panel; 
	JTextField cri1;
	JTextField cri2;
	JTextField cri3; 
	JInternalFrame cont;
	
	public Panel3(JInternalFrame cnt)
	{
		cont=cnt;
		panel=new JPanel(new BorderLayout());
		
		
        DefaultTableModel model = new DefaultTableModel();
        JTable table = new JTable(model);
        model.addColumn("Marque");
        model.addColumn("Nom");
        model.addColumn("Annee");
        model.addColumn("Prix");
        model.addColumn("Loueur");
      
        cri1=new JTextField(10);
        cri2=new JTextField(10);
        cri3=new JTextField(10);
        JLabel l1=new JLabel("Marque");
        JLabel l2=new JLabel("Annee");
        JLabel l3=new JLabel("Prix");
       
        new AfficheLouees(model,table,cri1,cri2,cri3);       	
       
        JPanel tmp=new JPanel();
        tmp.add(l1);
        tmp.add(cri1);
        tmp.add(l2);
        tmp.add(cri2);
        tmp.add(l3);
        tmp.add(cri3);
		panel.add(tmp,BorderLayout.NORTH);
		JScrollPane JS=new JScrollPane(table);
		panel.add(JS,BorderLayout.CENTER);
		
		
		
		JS.setBorder(BorderFactory.createTitledBorder(
			      BorderFactory.createEtchedBorder(), "Cliquer sur la voiture pour la rendre !!", TitledBorder.CENTER,
			      TitledBorder.TOP));
		panel.add(JS);
		
		cri3.addActionListener(new ActionListener() {
    		@Override
    		public void actionPerformed(ActionEvent e) {
    		new AfficheLouees(model,table,cri1,cri2,cri3);
    		}
    		});
		cri1.addActionListener(new ActionListener() {
    		@Override
    		public void actionPerformed(ActionEvent e) {
    		new AfficheLouees(model,table,cri1,cri2,cri3);
    		}
    		});
		cri2.addActionListener(new ActionListener() {
    		@Override
    		public void actionPerformed(ActionEvent e) {
    		new AfficheLouees(model,table,cri1,cri2,cri3);
    		}
    		});
		panel.setVisible(true);
		cont.add(panel);
	}
	public JInternalFrame getCont() {
		return cont;
	}
	public void setCont(JInternalFrame cont) {
		this.cont = cont;
	}

	
}
