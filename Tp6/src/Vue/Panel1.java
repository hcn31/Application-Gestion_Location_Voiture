package Vue;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

import Contreleur.afficherVoiture;

public class Panel1 {
	JPanel panel; 
	JButton aj;
	JInternalFrame cont;
	JTextField cri1;
	JTextField cri2;
	JTextField cri3; 
	public Panel1(JInternalFrame cnt)
	{
		cont=cnt;
		panel=new JPanel(new BorderLayout());
	
		
        DefaultTableModel model = new DefaultTableModel();
        JTable table = new JTable(model);
        model.addColumn("Matricule");
        model.addColumn("Marque");
        model.addColumn("Nom");
        model.addColumn("Annee");
        model.addColumn("Prix");
        model.addColumn("Statut");
    	
    
      
        cri1=new JTextField(10);
        cri2=new JTextField(10);
        cri3=new JTextField(10);
        JLabel l1=new JLabel("Marque");
        JLabel l2=new JLabel("Annee");
        JLabel l3=new JLabel("Prix");
        // Add items to the combo box
        
        
        new afficherVoiture(model,cri1,cri2,cri3);        	
       
        aj=new JButton("Ajouter voiture");
		
        JPanel tmp=new JPanel();
        
		panel.add(tmp,BorderLayout.NORTH);
		panel.add(new JScrollPane(table),BorderLayout.CENTER);
		aj.addActionListener(new ActionListener() {
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			InterAddV t=new InterAddV();
    			panel.setVisible(false); 
    			t.setVisible(true);
    			cont.add(t);
    		}
    		});

	    tmp.add(l1);
        tmp.add(cri1);
        tmp.add(l2);
        tmp.add(cri2);
        tmp.add(l3);
        tmp.add(cri3);
      
        
		cri3.addActionListener(new ActionListener() {
    		@Override
    		public void actionPerformed(ActionEvent e) {
    		new afficherVoiture(model,cri1,cri2,cri3);
    		}
    		});
		cri1.addActionListener(new ActionListener() {
    		@Override
    		public void actionPerformed(ActionEvent e) {
    		new afficherVoiture(model,cri1,cri2,cri3);
    		}
    		});
		cri2.addActionListener(new ActionListener() {
    		@Override
    		public void actionPerformed(ActionEvent e) {
    		new afficherVoiture(model,cri1,cri2,cri3);
    		}
    		});
		panel.add(aj,BorderLayout.SOUTH);
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
