package matchmaker;

import javax.swing.*;

import java.awt.*;

//Event brauchen wir für das Ereigniss, wenn ein Button geklickt wird
import java.awt.event.*;
import java.awt.Cursor;
import java.awt.Desktop;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class AUSGABE_WINDOW extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel label_unten;
	private JLabel label_ueberschrift;
	private JLabel label_selected;
	private JLabel label_tank;
	private JLabel label_possible;
	private JButton button_schließen;
	private JButton button_begin;
	private JPanel panel_rechts;
	private JPanel panel_links;
	private JPanel panel_oben;
	private JPanel panel_unten;
	private JPanel panel_links_1;
	private JPanel panel_links_2;
	private JTable tabelle_panzer;
	public TANK[][][] tanks_all=new TANK[8][7][22];
	public TANK[] chosen=new TANK[2];
	public TANK[] tanks_available;
	public int[] errors;
	public int tank_count=0;


	
	AUSGABE_WINDOW(TANK[][][] tanks, TANK[] chosen){
		super("OUTPUT");
		this.set_tanks(tanks);
		this.set_chosen(chosen);
		this.setSize(600, 600);
		this.setLocation(300, 300);
	    //Das BorderLayout ist mal das erste
	    getContentPane().setLayout(new BorderLayout(5,5));
		
		//Panels vorbereiten
		this.panel_links=new JPanel(new BorderLayout(5,5));
		this.panel_oben=new JPanel();
		this.panel_rechts= new JPanel(new GridLayout(6,1));
		this.panel_unten=new JPanel();
		this.panel_links_1=new JPanel(new BorderLayout(5,5));
		this.panel_links_2=new JPanel(new BorderLayout(5,5));
	    
		//Buttons vorbereiten
		this.button_begin=new JButton("AGAIN");
		this.button_schließen=new JButton("EXIT");
		//Auf das Panel Buttons Packen
		this.panel_rechts.add(new JLabel(""));
		this.panel_rechts.add(new JLabel(""));
		this.panel_rechts.add(this.button_begin);
		this.panel_rechts.add(new JLabel(""));
	    this.panel_rechts.add(this.button_schließen);
	    this.panel_rechts.add(new JLabel(""));
	    //Listener für Buttons
	    this.addButtonListener(this.button_begin);
	    this.addButtonListener(this.button_schließen);
	    
		//Labels vorbereiten
		this.label_ueberschrift=new JLabel("OUTPUT:");
		this.label_ueberschrift.setHorizontalAlignment(JLabel.CENTER);
		this.label_unten=new JLabel("<html><body>Coded by <a href=\"http://www.worldoftanks.eu/community/clans/500000894-KLONK/\">[KLONK]</a></body></html>");
		this.label_selected=new JLabel("You have selected the following as Your tank");
		this.label_selected.setHorizontalAlignment(JLabel.CENTER);
		this.label_tank=new JLabel("<html><body>NAME: "+this.chosen[0].get_name()+"<br>Nation: "+this.chosen[0].get_nation()+"<br>Category: "+this.chosen[0].get_category_out()+"<br>Tier: "+this.chosen[0].get_tier_real()+"<br>This results in a Battletier of min "+this.chosen[0].get_tier_virtual_min()+"<br>and max "+this.chosen[0].get_tier_virtual_max()+".</body></html>");
		this.label_tank.setHorizontalAlignment(JLabel.CENTER);
		this.label_possible=new JLabel("<html><body>The<br>Possible<br>Tanks<br>you<br>can<br>drive<br>with<br>are:</body></html>");
		this.label_possible.setHorizontalAlignment(JLabel.CENTER);
		//Liste mit errors vorbereiten
		this.tanks_available=this.tankberechnen();
		this.errors=this.errorcodes();
		//überschrift auf panel oben:
	    this.panel_oben.add(this.label_ueberschrift);
		
		//Tabelle Vorbereiten
		String[] head={"Tank-Name","Notification"};
		Object[][] data;
		data=this.make_data_file();
		this.tabelle_panzer=new JTable(data, head);
		this.tabelle_panzer.setPreferredScrollableViewportSize(new Dimension(400, 200));
        this.tabelle_panzer.setFillsViewportHeight(true);
        this.tabelle_panzer.getColumn("Tank-Name").setPreferredWidth(150);
        this.tabelle_panzer.getColumn("Notification").setPreferredWidth(250);
        JScrollPane sp = new JScrollPane(this.tabelle_panzer, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        //PanelLinks Bauen
        this.panel_links_2.add(BorderLayout.NORTH, this.label_tank);
        this.panel_links_2.add(BorderLayout.CENTER, sp);
        this.panel_links_2.add(BorderLayout.WEST, this.label_possible);
        this.panel_links_1.add(BorderLayout.CENTER, this.panel_links_2);
        this.panel_links_1.add(BorderLayout.NORTH, this.label_selected);
        this.panel_links.add(BorderLayout.WEST, this.panel_links_1);
        //Cursor wird über KLONK zu einer Hand
        this.label_unten.setCursor(new Cursor(Cursor.HAND_CURSOR));
        this.panel_unten.add(this.label_unten);
        goWebsite(this.label_unten);
        
        //Alles auf den Frame
        getContentPane().add(BorderLayout.NORTH, this.panel_oben);
        getContentPane().add(BorderLayout.EAST, this.panel_rechts);
        getContentPane().add(BorderLayout.CENTER,this.panel_links);
        getContentPane().add(BorderLayout.SOUTH,this.panel_unten);
        pack();
        this.setVisible(true);
        
        

	}
	
	
	  private void goWebsite(JLabel website) {
	        website.addMouseListener(new MouseAdapter() {
	            @Override
	            public void mouseClicked(MouseEvent e) {
	                try {
	                    Desktop.getDesktop().browse(new URI("http://www.worldoftanks.eu/community/clans/500000894-KLONK/#wot&mt_order_by=-role"));
	                } catch (URISyntaxException | IOException ex) {
	                    //It looks like there's a problem
	                }
	            }
	        });
	    }
	
	public void set_tanks(TANK[][][] t){
		this.tanks_all=t;
	}
	public void set_chosen(TANK[] t){
		this.chosen=t;
	}
	public TANK[] tankberechnen(){
		
		for(int i=1;i<7;i++){
			for (int j=1;j<6;j++){
				for(int k=1; k<21;k++){
					//ist ein Tank vorhanden?
					if(this.tanks_all[i][j][k].get_name().equals(null)==false){
					//Battletiermin gleich oder 1 kleiner
						if(this.tanks_all[i][j][k].get_tier_virtual_min()!=0||this.tanks_all[i][j][k].get_tier_virtual_max()!=0){
						int test_min=0;
						test_min = this.chosen[0].get_tier_virtual_min()-this.tanks_all[i][j][k].get_tier_virtual_min();
						
					//Battletiermax gleich oder 1 größer
						int test_max=0;
						test_max = this.tanks_all[i][j][k].get_tier_virtual_max()-this.chosen[0].get_tier_virtual_max();
						
						if((test_min==0||test_min==1||test_min==-1) && (test_max==0|| test_max==1||test_max==-1)){
							this.tank_count++;
						}
						else if(test_min>1 && (test_max==0|| test_max==1)){
							this.tank_count++;														
						}
						else if((test_min==0||test_min==1)&& test_max>1 ){
							this.tank_count++;
						}
						else{}
					}}
					//ABBRUCHBEDINGUNGEN
					if(this.tanks_all[i][j][k+1]==null){k=99;}
				}
				if(this.tanks_all[i][j+1][1]==null){j=99;}
			}
			if(this.tanks_all[i+1][1][1]==null){i=99;}
		}
		TANK[] tankauswahl=new TANK[this.tank_count];
		int zahler = 0;
		int[] errors=new int[this.tank_count];
		for(int i=1;i<7;i++){
			for (int j=1;j<6;j++){
				for(int k=1; k<21;k++){
					//ist ein Tank vorhanden?
					if(this.tanks_all[i][j][k].get_name().equals(null)==false){
						if(this.tanks_all[i][j][k].get_tier_virtual_min()!=0||this.tanks_all[i][j][k].get_tier_virtual_max()!=0){
						//Battletiermin gleich oder 1 kleiner
						int test_min=0;
						test_min = this.chosen[0].get_tier_virtual_min()-this.tanks_all[i][j][k].get_tier_virtual_min();
					//Battletiermax gleich oder 1 größer
						int test_max=0;
						test_max = this.tanks_all[i][j][k].get_tier_virtual_max()-this.chosen[0].get_tier_virtual_max();
						if((test_min==0||test_min==1||test_min==-1) && (test_max==0|| test_max==1||test_max==-1)){
							tankauswahl[zahler]=this.tanks_all[i][j][k];
							errors[zahler] = 0;
							zahler++;
						}
						else if(test_min>1 &&(test_max==0|| test_max==1)){
							tankauswahl[zahler]=this.tanks_all[i][j][k];
							errors[zahler] = 1;
							zahler++;						
						}
						else if((test_min==0||test_min==1) && test_max>1 ){
							tankauswahl[zahler]=this.tanks_all[i][j][k];
							errors[zahler] = 0;
							zahler++;
						}
						else{}
					}}
					//ABBRUCHBEDINGUNGEN
					if(this.tanks_all[i][j][k+1]==null){k=99;}
				}
				if(this.tanks_all[i][j+1][1]==null){j=99;}
			}
			if(this.tanks_all[i+1][1][1]==null){i=99;}
		}
		return tankauswahl;
	}
	public int[] errorcodes(){
		TANK[] tankauswahl=new TANK[this.tank_count];
		int zahler = 0;
		int[] errors=new int[this.tank_count];
		for(int i=1;i<7;i++){
			for (int j=1;j<6;j++){
				for(int k=1; k<21;k++){
					//ist ein Tank vorhanden?
					if(this.tanks_all[i][j][k].get_name().equals(null)==false){
						if(this.tanks_all[i][j][k].get_tier_virtual_min()!=0||this.tanks_all[i][j][k].get_tier_virtual_max()!=0){
					//Battletiermin gleich oder 1 kleiner
						int test_min=0;
						test_min = this.chosen[0].get_tier_virtual_min()-this.tanks_all[i][j][k].get_tier_virtual_min();
					//Battletiermax gleich oder 1 größer
						int test_max=0;
						test_max = this.tanks_all[i][j][k].get_tier_virtual_max()-this.chosen[0].get_tier_virtual_max();
							if((test_min==0||test_min==1||test_min==-1) && (test_max==0|| test_max==1||test_max==-1)){
							tankauswahl[zahler]=this.tanks_all[i][j][k];
							errors[zahler] = 0;
							if(test_min==0 && test_max==0){
								errors[zahler]=3;
							}
							zahler++;
						}
						else if(test_min>1 && (test_max==0|| test_max==1)){
							tankauswahl[zahler]=this.tanks_all[i][j][k];
							errors[zahler] = 1;
							zahler++;						
						}
						else if((test_min==0||test_min==1) && test_max>1 ){
							tankauswahl[zahler]=this.tanks_all[i][j][k];
							errors[zahler] = 2;
							zahler++;
						}
						else{}
					}}
					//ABBRUCHBEDINGUNGEN
					if(this.tanks_all[i][j][k+1]==null){k=99;}
				}
				if(this.tanks_all[i][j+1][1]==null){j=99;}
			}
			if(this.tanks_all[i+1][1][1]==null){i=99;}
		}
		return errors;
	}
	public Object[][] make_data_file(){
		String[][] data= new String[this.tank_count][3];
		
		for(int i=0; i<this.tank_count; i++){
			
			data[i][0]=this.tanks_available[i].get_name();
			String errormessage="";
			switch (this.errors[i]){
			case 0:
				errormessage="";
				break;
			case 1:
				errormessage="you can pull him into higher tier matches";
				break;
			case 2:
				errormessage="he can pull you into higher tier matches";
				break;
			case 3:
				errormessage="exactly same battletiers";
				break;
			}
			data[i][1]=errormessage;
		}
		return data;
	}
	//Buttonlistener und Weitermethoden
	private void addButtonListener(JButton b){
		   b.addActionListener(new ActionListener() { 
			   public void actionPerformed(ActionEvent ae) { 
		            switch (ae.getActionCommand()){
		            case "AGAIN":
		            	back();
		            	break;
		            case "EXIT":
		            	System.exit(0);
		            	break;
		               }
			   }
		  });
		}
	private void back(){
			this.setVisible(false);
			EINGABE_WINDOW g=new EINGABE_WINDOW(this.tanks_all);
			g.setVisible(true);
			
	}
	
	
}