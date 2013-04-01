package matchmaker;
//Windowmanager
import javax.swing.*;

import java.awt.*;
//Event brauchen wir fuer das Ereigniss, wenn ein Button geklickt wird
import java.awt.event.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class EINGABE_WINDOW extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel label_unten;
	private JLabel label_ueberschrift;
	private JLabel label_anweisung_nat;
	private JLabel label_anweisung_cat;
	private JLabel label_anweisung_tier;
	private JButton button_weiter;
	private JButton button_abbrechen;
	private JPanel panel_rechts;
	private JPanel panel_links;
	private JPanel panel_oben;
	private JPanel panel_unten;
	private ImageIcon logo=new ImageIcon("src/matchmaker/logo.png");
	private JLabel label_logo=new JLabel("",this.logo,JLabel.CENTER);
	private JLabel label_lizenz=new JLabel("<html><center>This work is licensed under the <br>Creative Commons Attribution-NonCommercial-ShareAlike 3.0 Unported License.<br> To view a copy of this license, visit <br><a href=\"http://creativecommons.org/licenses/by-nc-sa/3.0/\">the website or click on the icon</a>.</center></body></html>");
	private JComboBox<String> nation;
	private String[] nations={"all","American","British","German","French","Soviet","Chinese"};
	private JComboBox<String> category;
	private String[] cat={"all","Light","Medium","Heavy","Tank Destroyer","Artillery"};
	private JComboBox<String> tier;
	private String[] t={"all","1","2","3","4","5","6","7","8","9","10"};
	public TANK[][][] tanks=new TANK[8][7][22];
	public int tier_ausg;
	
	public EINGABE_WINDOW(TANK[][][] tanks){
		super("Choose your Nation");
		this.tanks=tanks;
		this.setLocation(300,300);
		this.setSize(300, 150);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    //Das BorderLayout ist mal das erste
	    getContentPane().setLayout(new BorderLayout(5,5));
	    
	    //ueberschrift Label erzeugen
	    this.label_ueberschrift=new JLabel("Choose your Nation, Category and Tier!");
	    //ueberschrift Label zentrieren
	    this.label_ueberschrift.setHorizontalAlignment(JLabel.CENTER);
	    //unterschrift erzeugen:
		this.label_unten=new JLabel("<html><body>Coded by <a href=\"http:\\www.http://worldoftanks.eu/community/clans/500000894-KLONK/\">[KLONK]</a></body></html>");
	    //unterschrift zentrieren:
	    this.label_unten.setHorizontalAlignment(JLabel.CENTER);
	    //panel erzeugen und label auf panel packen
	    this.panel_oben=new JPanel();
	    this.panel_oben.add(label_ueberschrift);
	    this.panel_unten=new JPanel(new GridLayout(3,1));
	    this.label_unten.setCursor(new Cursor(Cursor.HAND_CURSOR));
        goWebsite(this.label_unten);
        this.label_lizenz.setHorizontalAlignment(JLabel.CENTER);
        this.label_logo.setCursor(new Cursor(Cursor.HAND_CURSOR));
        this.label_lizenz.setCursor(new Cursor(Cursor.HAND_CURSOR));
        goWebsite2(this.label_logo);
        goWebsite2(this.label_lizenz);
        this.panel_unten.add(this.label_unten);
        this.panel_unten.add(this.label_logo);
        this.panel_unten.add(this.label_lizenz);
        
	    //Buttons erstellen
	    this.button_weiter=new JButton("OK");
	    this.button_abbrechen=new JButton("Exit");
	    
	    //Panels fuer die Buttons erstellen
	    this.panel_rechts=new JPanel(new GridLayout(6,1));
	    
	    //Auf das Panel Buttons Packen
	    this.panel_rechts.add(new JLabel(""));
	    this.panel_rechts.add(new JLabel(""));
	    this.panel_rechts.add(this.button_weiter);
	    this.panel_rechts.add(new JLabel(""));
	    this.panel_rechts.add(this.button_abbrechen);
	    this.panel_rechts.add(new JLabel(""));
	    
	    //Listener fuer Buttons
        addButtonListener(this.button_weiter);
	    addButtonListener(this.button_abbrechen);
        
	    //Aus dem String nations eine Liste erstellen.
	    this.nation = new JComboBox<String>(this.nations);
	    this.nation.setSelectedIndex(0);
	    this.category= new JComboBox<String>(this.cat);
	    this.category.setSelectedIndex(0);
	    this.tier = new JComboBox<String>(this.t);
	    this.tier.setSelectedIndex(0);
	    this.label_anweisung_nat=new JLabel ("Choose Nation:");
	    this.label_anweisung_cat=new JLabel ("Choose Category:");
	    this.label_anweisung_tier=new JLabel ("Choose Tier:");
	    
	    //panel vorbereiten undnation auf panel packen
	    this.panel_links = new JPanel(new GridLayout(6,1));
	    this.panel_links.add(this.label_anweisung_nat);
	    this.panel_links.add(this.nation);
	    this.panel_links.add(this.label_anweisung_cat);
	    this.panel_links.add(this.category);
	    this.panel_links.add(this.label_anweisung_tier);
	    this.panel_links.add(this.tier);
	    
	    //panels auf Frame packen (direkt auf das BorderLayout)
        getContentPane().add(BorderLayout.NORTH, this.panel_oben);
        getContentPane().add(BorderLayout.EAST, this.panel_rechts);
        getContentPane().add(BorderLayout.CENTER,this.panel_links);
        getContentPane().add(BorderLayout.SOUTH,this.panel_unten);
	    
	    pack();
	    setVisible(true);
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
	  private void goWebsite2(JLabel website) {
	        website.addMouseListener(new MouseAdapter() {
	            @Override
	            public void mouseClicked(MouseEvent e) {
	                try {
	                    Desktop.getDesktop().browse(new URI("http://creativecommons.org/licenses/by-nc-sa/3.0/"));
	                } catch (URISyntaxException | IOException ex) {
	                    //It looks like there's a problem
	                }
	            }
	        });
	    }
	private void addButtonListener(JButton b){
	   b.addActionListener(new ActionListener() { 
         public void actionPerformed(ActionEvent ae) { 
	            switch (ae.getActionCommand()){
	            case "OK":
	            	ausgabe();
	            	break;
	            case "Exit":
	            	System.exit(0);
	            	break;
	               }
         }
	   });
	}
	private void ausgabe(){
		
		this.setVisible(false);
		switch ((String)this.tier.getSelectedItem()){
		case "all":
			this.tier_ausg=0;
			break;
		case "1":
			this.tier_ausg=1;
			break;
		case "2":
			this.tier_ausg=2;
			break;
		case "3":
			this.tier_ausg=3;
			break;
		case "4":
			this.tier_ausg=4;
			break;
		case "5":
			this.tier_ausg=5;
			break;
		case "6":
			this.tier_ausg=6;
			break;
		case "7":
			this.tier_ausg=7;
			break;
		case "8":
			this.tier_ausg=8;
			break;
		case "9":
			this.tier_ausg=9;
			break;
		case "10":
			this.tier_ausg=10;
			break;
		
		}
		if(this.tier_ausg==0){
			EINGABE_PANZER g=new EINGABE_PANZER((String)this.nation.getSelectedItem(),(String)this.category.getSelectedItem(),this.tanks);
			g.setVisible(true);
		}
		else{
		EINGABE_PANZER g=new EINGABE_PANZER((String)this.nation.getSelectedItem(),(String)this.category.getSelectedItem(),this.tier_ausg,this.tanks);
		g.setVisible(true);
		}
	}
}