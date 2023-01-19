package Vue;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;



import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Contreleur.AfficherDisp;
import Contreleur.afficherVoiture;
import Model.Client;
import Model.V_Existe;
import Model.V_Loue;
import Model.Voiture;



public class Panel2 {
	JPanel panel; 
	JTextField cri1;
	JTextField cri2;
	JTextField cri3; 
	public Voiture getV() {
		return V;
	}
	public void setV(Voiture v) {
		V = v;
	}
	
	Voiture V;
	public Panel2(JInternalFrame cnt)
	{
		panel=new JPanel(new BorderLayout());
		
	
		 DefaultTableModel model = new DefaultTableModel();
	        JTable table = new JTable(model);
	        JPanel chercher=new JPanel();
	        
	        cri1=new JTextField(10);
	        cri2=new JTextField(10);
	        cri3=new JTextField(10);
	        JLabel l1=new JLabel("Marque");
	        JLabel l2=new JLabel("Annee");
	        JLabel l3=new JLabel("Prix");
	        chercher.add(l1);
	        chercher.add(cri1);
	        chercher.add(l2);
	        chercher.add(cri2);
	        chercher.add(l3);
	        chercher.add(cri3);
	        panel.add(chercher,BorderLayout.NORTH);
	        model.addColumn("Matr");
	        model.addColumn("Marque");
	        model.addColumn("Nom");
	        model.addColumn("Annee");
	        model.addColumn("Prix");
	        panel.add(new JScrollPane(table),BorderLayout.CENTER);
	       
	        new AfficherDisp(model,cri1,cri2,cri3);   
	        panel.setVisible(true);
	        cri3.addActionListener(new ActionListener() {
	    		@Override
	    		public void actionPerformed(ActionEvent e) {
	    		new AfficherDisp(model,cri1,cri2,cri3);
	    		}
	    		});
			cri1.addActionListener(new ActionListener() {
	    		@Override
	    		public void actionPerformed(ActionEvent e) {
	    		new AfficherDisp(model,cri1,cri2,cri3);
	    		}
	    		});
			cri2.addActionListener(new ActionListener() {
	    		@Override
	    		public void actionPerformed(ActionEvent e) {
	    		new AfficherDisp(model,cri1,cri2,cri3);
	    		}
	    		});
	       table.addMouseListener(new MouseAdapter() {
	    	   public void mouseClicked(MouseEvent e) {	
	    		
	    		 int ligne=table.getSelectedRow();
	    		 
	    		String m1=(String)table.getValueAt(ligne,0);
	    		System.out.println(m1);
	    		 V =Application.getAg().getV(m1);	
	    		 System.out.println(V);
	    		 InterLouer In=new InterLouer(panel,V);
	    	   }
		});

	       
	        
		cnt.add(panel);
	}
}
