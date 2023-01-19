package Vue;


import java.awt.*;
import java.awt.event.*;


import javax.swing.*;

import javax.swing.border.TitledBorder;


public class InterfaceAgence {
	JFrame mainFrame;
	JInternalFrame option1;
	JButton Return;
    static public Panel1 aff;
	public Panel1 getAff() {
		return aff;
	}
	public void setAff(Panel1 aff) {
		this.aff = aff;
	}
	public InterfaceAgence()
	{
		mainFrame = new JFrame("Agence");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(600, 500);
        mainFrame.setLocationRelativeTo(null);
         
        Container content = mainFrame.getContentPane();
      
        content.setLayout(new GridLayout(2,0));
        
          /// Panel logo ----------------------------
        JPanel panelLogo = new JPanel();
        
    
        panelLogo.setBackground(Color.WHITE);
     
        JLabel fancyLabel = new JLabel("Agence de location de voitures "); 
        		 Font fancyFont = new Font("Serif", Font.BOLD | Font.ITALIC, 32);
        		 fancyLabel.setFont(fancyFont);
        		 JPanel	 pnlTitle=new JPanel() ;
        		 pnlTitle.setBackground(Color.WHITE);
        		pnlTitle.add(fancyLabel);
        		panelLogo.add(pnlTitle);
        		 JPanel imgPnl = new JPanel();
        		 imgPnl.setBackground(Color.WHITE);
        JLabel	 imageLabel=new JLabel() ;
        imageLabel.setIcon(new ImageIcon("C:/Users/HP/eclipse-workspace/Tp6/src/Vue/image.png"));
        imgPnl.add(imageLabel);
        panelLogo.add(imgPnl);
        
       /// -----------------------------
        		 Return=new JButton("Retourner au menu");
        
        /// Panel menu ------------------
        JPanel panelMenu = new JPanel(new GridLayout(4,0,0,10));
        panelMenu.setBackground(Color.WHITE);
            
        JButton B1,B2,B3,B4;
       
        B1=new JButton("Gestion des voitures de l'agence");
        B1.setFont(new Font("Serif", Font.BOLD, 20));
        B2=new JButton("Gestion des voiturs disponibles");
        B2.setFont(new Font("Serif", Font.BOLD, 20));
        B3=new JButton("Gestion des voiturs louées");
        B3.setFont(new Font("Serif", Font.BOLD, 20));
        B4=new JButton("Gestion des clients");
        B4.setFont(new Font("Serif", Font.BOLD, 20));
      

        
        B1.setBorder(new TitledBorder (new TitledBorder("1")));
        B2.setBorder(new TitledBorder (new TitledBorder("2")));
        B3.setBorder(new TitledBorder (new TitledBorder("3")));
        B4.setBorder(new TitledBorder (new TitledBorder("4")));
       

             /// Les 4 options 
        panelMenu.add(B1);
        panelMenu.add(B2);
        panelMenu.add(B3);
        panelMenu.add(B4);
      
        
         
         content.add(panelLogo);
       content.add(panelMenu);
   ///--------------------------------------------------------------------------------
        B1.addActionListener(new ActionListener() {
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			
    			panelLogo.setVisible(false); 
    			panelMenu.setVisible(false); 
    		
    			option1= new JInternalFrame("Gestion des voitures de l'agence");
    			
    		 aff=new Panel1(option1);
    			option1.setVisible(true);
    			
    			content.setLayout(new BorderLayout());
    			content.add(option1,BorderLayout.CENTER);
    			
    			content.add(Return,BorderLayout.SOUTH);
    			Return.setVisible(true);
    			Return.addActionListener(new ActionListener() {
    		    		@Override
    		    		public void actionPerformed(ActionEvent e) {
    		    			option1.setVisible(false);
    		    			Return.setVisible(false);
    		    			
    		    			panelLogo.setVisible(true); 
    		    			panelMenu.setVisible(true); 
    		    			
    		    		}
    		    	});
    		}
    	});

    ///--------------------------------------------------------------------------------       
        B2.addActionListener(new ActionListener() {
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			
    			panelLogo.setVisible(false); 
    			panelMenu.setVisible(false); 
    		
    			option1= new JInternalFrame("Gestion des voitures disponibles");
    			
    			new Panel2(option1);
    			option1.setVisible(true);
    			
    			content.setLayout(new BorderLayout());
    			content.add(option1,BorderLayout.CENTER);
    			
    			content.add(Return,BorderLayout.SOUTH);
    			Return.setVisible(true);
    			Return.addActionListener(new ActionListener() {
    		    		@Override
    		    		public void actionPerformed(ActionEvent e) {
    		    			option1.setVisible(false);
    		    			Return.setVisible(false);
    		    			
    		    			panelLogo.setVisible(true); 
    		    			panelMenu.setVisible(true); 
    		    			
    		    		}
    		    	});
    		}
    	});
        
        
 ///--------------------------------------------------------------------------------   
        B3.addActionListener(new ActionListener() {
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			
    			panelLogo.setVisible(false); 
    			panelMenu.setVisible(false); 
    		
    			option1= new JInternalFrame("Gestion des voiturs louées");
    			
    			new Panel3(option1);
    			option1.setVisible(true);
    			
    			content.setLayout(new BorderLayout());
    			content.add(option1,BorderLayout.CENTER);
    			
    			content.add(Return,BorderLayout.SOUTH);
    			Return.setVisible(true);
    			Return.addActionListener(new ActionListener() {
    		    		public void actionPerformed(ActionEvent e) {
    		    			option1.setVisible(false);
    		    			Return.setVisible(false);
    		    			
    		    			panelLogo.setVisible(true); 
    		    			panelMenu.setVisible(true); 
    		    			
    		    		}
    		    	});
    		}
    	});
        
        
        B4.addActionListener(new ActionListener() {
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			
    			panelLogo.setVisible(false); 
    			panelMenu.setVisible(false); 
    		
    			option1= new JInternalFrame("Gestion des cliens");
    			
    			new Panel4(option1);
    			option1.setVisible(true);
    			
    			content.setLayout(new BorderLayout());
    			content.add(option1,BorderLayout.CENTER);
    			
    			content.add(Return,BorderLayout.SOUTH);
    			Return.setVisible(true);
    			Return.addActionListener(new ActionListener() {
    		    		public void actionPerformed(ActionEvent e) {
    		    			option1.setVisible(false);
    		    			Return.setVisible(false);
    		    			
    		    			panelLogo.setVisible(true); 
    		    			panelMenu.setVisible(true); 
    		    			
    		    		}
    		    	});
    		}
    	});
        
       
         

       
        mainFrame.setVisible(true);   
	}
		 
	

	
        
}
