package Vue;

import java.awt.BorderLayout;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

import Contreleur.AfficherClient;

public class Panel4 {

	JInternalFrame cont;
	JPanel panel;

	public Panel4(JInternalFrame cnt)
	{
		cont=cnt;
		panel=new JPanel(new BorderLayout());
		
		 DefaultTableModel model = new DefaultTableModel();
	        JTable table = new JTable(model);
	        model.addColumn("CIN");
	        model.addColumn("Nom");
	        model.addColumn("Prenom");
	        model.addColumn("Civilivite");
	        JPanel tmp=new JPanel();
	       new AfficherClient(model);
	       panel.add(new JScrollPane(table),BorderLayout.CENTER);
	       
		cont.add(panel);
		
	}
	
	
}
