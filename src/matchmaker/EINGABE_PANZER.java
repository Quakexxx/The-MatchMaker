package matchmaker;
//Windowmanager
import javax.swing.*;

import java.awt.*;
//Event brauchen wir fuer das Ereigniss, wenn ein Button geklickt wird
import java.awt.event.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class EINGABE_PANZER extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel label_unten;
	private JLabel label_ueberschrift;
	private JButton button_weiter;
	private JButton button_abbrechen;
	private JButton button_back;
	private JPanel panel_rechts;
	private JPanel panel_links;
	private JPanel panel_oben;
	private JPanel panel_unten;
	private ImageIcon logo=new ImageIcon("src/matchmaker/logo.png");
	private JLabel label_logo=new JLabel("",this.logo,JLabel.CENTER);
	private JLabel label_lizenz=new JLabel("<html><center>This work is licensed under the <br>Creative Commons Attribution-NonCommercial-ShareAlike 3.0 Unported License.<br> To view a copy of this license, visit <br><a href=\"http://creativecommons.org/licenses/by-nc-sa/3.0/\">the website or click on the icon</a>.</center></body></html>");
	public JComboBox<String> tanks;
	public String nation;
	public int nation_nr;
	public String category;
	public int category_nr;
	public TANK[][][] tanks_all=new TANK[8][7][22];
	public int tier;
	public int tank_counter=0;
	
	EINGABE_PANZER(String nat, String cat, TANK[][][] tanks_all){
		super("Choose your Tank");
		this.set_nation(nat);
		this.set_category(cat);
		this.set_tier(0);
		this.set_tanks(tanks_all);
		mainmeth();		
	}
	EINGABE_PANZER(String nat, String cat, int tier, TANK[][][] tanks_all){
		super("Choose your Tank");
		this.set_nation(nat);
		this.set_category(cat);
		this.set_tier(tier);
		this.set_tanks(tanks_all);
		mainmeth();
	}
	//"main" method
	public void mainmeth(){
		//wieviele Tanks passen auf die Eingegebenen Konditionen
		this.tank_counter();
		//panels vorbereiten
		this.panel_links=new JPanel();
		this.panel_oben=new JPanel();
		this.panel_rechts= new JPanel();
		this.panel_unten=new JPanel();
		//Combobox vorbereiten
		String[] tanknames=new String[this.tank_counter];
		tanknames=this.tankauswahl();
		this.tanks=new JComboBox<String>(tanknames);
		
		//Combox auf Panel Links
	    this.panel_links.add(this.tanks);
	    
		//labels vorbereiten
		this.label_ueberschrift=new JLabel("Choose your Tank");
		this.label_ueberschrift.setHorizontalAlignment(JLabel.CENTER);
		this.label_unten=new JLabel("<html><body>Coded by <a href=\"http:\\www.http://worldoftanks.eu/community/clans/500000894-KLONK/\">[KLONK]</a></body></html>");
		this.label_unten.setHorizontalAlignment(JLabel.CENTER);
		// Fenster Vorbereiten
		setLocation(300,300);
		setSize(300, 150);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    //Das BorderLayout ist mal das erste
	    getContentPane().setLayout(new BorderLayout(5,5));
	    

	    
	    //ueberschrift auf panel oben:
	    this.panel_oben.add(this.label_ueberschrift);
	    
	    //unterschrift auf label unten
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
	    this.button_back=new JButton("Back");
	    //Panels fuer die Buttons erstellen
	    
	    this.panel_rechts=new JPanel(new GridLayout(3,1));
	    
	    //Auf das Panel Buttons Packen
	    this.panel_rechts.add(this.button_weiter);
	    this.panel_rechts.add(this.button_back);
	    this.panel_rechts.add(this.button_abbrechen);
	    	    
	    //Listener fuer Buttons
        addButtonListener(this.button_weiter);
	    addButtonListener(this.button_back);
	    addButtonListener(this.button_abbrechen);
	    
	    //panels auf Frame packen (direkt auf das BorderLayout)
        getContentPane().add(BorderLayout.NORTH, this.panel_oben);
        getContentPane().add(BorderLayout.EAST, this.panel_rechts);
        getContentPane().add(BorderLayout.CENTER,this.panel_links);
        getContentPane().add(BorderLayout.SOUTH,this.panel_unten);
	    
	    pack();
	    setVisible(true);
	    
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
	public TANK[] tankfinal(String name){
		TANK[] tankauswahl=new TANK[1];
			if(this.tier==0){
				for (int i=1;i<7;i++){
					for (int j=1;j<6;j++){
						for (int k=1;k<21;k++){
							if(this.tanks_all[i][j][k].get_name().equals(null)==false){
								if(this.tanks_all[i][j][k].get_tier_virtual_min()!=0||this.tanks_all[i][j][k].get_tier_virtual_max()!=0){
								if(this.tanks_all[i][j][k].get_name().equals(name)){
									tankauswahl[0]=this.tanks_all[i][j][k];
								}
							}}
							if(this.tanks_all[i][j][k+1]==null){
								k=99;
							}
						}
						if(this.tanks_all[i][j+1][1]==null){
							j=99;
						}
					}
					if(this.tanks_all[i+1][1][1]==null){
						i=99;}
				}
			}
			else{
				for (int i=1;i<7;i++){
					for (int j=1;j<6;j++){
						for (int k=1;k<21;k++){
							if(this.tanks_all[i][j][k]!=null && this.tanks_all[i][j][k].get_tier_real()==this.tier){
								if(this.tanks_all[i][j][k].get_tier_virtual_min()!=0||this.tanks_all[i][j][k].get_tier_virtual_max()!=0){
								if(this.tanks_all[i][j][k].get_name().equals(name)){
									tankauswahl[0]=this.tanks_all[i][j][k];
								}}
							}
							if(this.tanks_all[i][j][k+1]==null){
								k=99;
							}
						}
						if(this.tanks_all[i][j+1][1]==null){
							j=99;
						}
					}
					if(this.tanks_all[i+1][1][1]==null){
						i=99;
					}
				}
			}
		
		return tankauswahl;		
	}
	
	//Set Methods
	public void set_nation(String nation){
		this.nation=nation;
		switch (this.nation){
			case "all":
				this.nation_nr=0;
				break;
			case "American":
				this.nation_nr=1;
				break;
			case "British":
				this.nation_nr=2;
				break;
			case "German":
				this.nation_nr=3;
				break;
			case "French":
				this.nation_nr=4;
				break;
			case "Soviet":
				this.nation_nr=5;
				break;
			case "Chinese":
				this.nation_nr=6;
				break;     
		}
	}
	public void set_category(String cat){
		this.category=cat;
		switch(this.category){
		case "all":
			this.category_nr=0;
			break;
		case "Light":
			this.category_nr=1;
			break;
		case "Medium":
			this.category_nr=2;
			break;
		case "Heavy":
			this.category_nr=3;
			break;            
		case "Tank Destroyer":
			this.category_nr=4;
			break;
		case "Artillery":
			this.category_nr=5;
			break;
		}
	}
	public void set_tanks(TANK[][][] tanks){
		this.tanks_all=tanks;
	}
	public void set_tier(int tier){
		this.tier=tier;
	}
	//Berechne Methods
	public void tank_counter(){
		if(this.nation_nr == 0 && this.category_nr == 0){
			if(this.tier==0){
				for (int i=1;i<7;i++){
					for (int j=1;j<6;j++){
						for (int k=1;k<21;k++){
							if(this.tanks_all[i][j][k].get_name().equals(null)==false){
								if(this.tanks_all[i][j][k].get_tier_virtual_min()!=0||this.tanks_all[i][j][k].get_tier_virtual_max()!=0){
								this.tank_counter++;
							}}
							if(this.tanks_all[i][j][k+1]==null){
								k=99;
							}
						}
						if(this.tanks_all[i][j+1][1]==null){
							j=99;
						}
					}
					if(this.tanks_all[i+1][1][1]==null){
						i=99;}
				}
			}
			else{
				for (int i=1;i<7;i++){
					for (int j=1;j<6;j++){
						for (int k=1;k<21;k++){
							if(this.tanks_all[i][j][k]!=null && this.tanks_all[i][j][k].get_tier_real()==this.tier){
								if(this.tanks_all[i][j][k].get_tier_virtual_min()!=0||this.tanks_all[i][j][k].get_tier_virtual_max()!=0){
								this.tank_counter++;
								}
							}
							if(this.tanks_all[i][j][k+1]==null){
								k=99;
							}
						}
						if(this.tanks_all[i][j+1][1]==null){
							j=99;
						}
					}
					if(this.tanks_all[i+1][1][1]==null){
						i=99;
					}
				}
			}
		}
		else if(this.nation_nr == 0 && this.category_nr != 0){
			if(this.tier==0){
				for (int i=1;i<7;i++){
					for (int k=1;k<21;k++){
						if(this.tanks_all[i][this.category_nr][k].get_name().equals(null)==false){
							if(this.tanks_all[i][this.category_nr][k].get_tier_virtual_min()!=0||this.tanks_all[i][this.category_nr][k].get_tier_virtual_max()!=0){
							this.tank_counter++;
						}}
						if(this.tanks_all[i][this.category_nr][k+1]==null){
							k=99;
						}
					}
					if(this.tanks_all[i+1][1][1]==null){
						i=99;}
				}
			}
			else{
				for (int i=1;i<7;i++){
					for (int k=1;k<21;k++){
						if(this.tanks_all[i][this.category_nr][k]!=null && this.tanks_all[i][this.category_nr][k].get_tier_real()==this.tier){
							if(this.tanks_all[i][this.category_nr][k].get_tier_virtual_min()!=0||this.tanks_all[i][this.category_nr][k].get_tier_virtual_max()!=0){
							this.tank_counter++;
						}}
						if(this.tanks_all[i][this.category_nr][k+1]==null){
							k=99;
						}
					}
					if(this.tanks_all[i+1][1][1]==null){
						i=99;
					}
				}
			}
		}
		else if(this.nation_nr != 0 && this.category_nr == 0){
			if(this.tier==0){
				for (int j=1;j<6;j++){
					for (int k=1;k<21;k++){
						if(this.tanks_all[this.nation_nr][j][k]!=null){
							if(this.tanks_all[this.nation_nr][j][k].get_tier_virtual_min()!=0||this.tanks_all[this.nation_nr][j][k].get_tier_virtual_max()!=0){
							this.tank_counter++;
							}}
						if(this.tanks_all[this.nation_nr][j][k+1]==null){
							k=99;
						}
					}
					if(this.tanks_all[this.nation_nr][j+1][1]==null){
						j=99;
					}
				}
			}
			else{
				for (int j=1;j<6;j++){
					for (int k=1;k<21;k++){
						if(this.tanks_all[this.nation_nr][j][k]!=null && this.tanks_all[this.nation_nr][j][k].get_tier_real()==this.tier){
							if(this.tanks_all[this.nation_nr][j][k].get_tier_virtual_min()!=0||this.tanks_all[this.nation_nr][j][k].get_tier_virtual_max()!=0){
							this.tank_counter++;
						}}
						if(this.tanks_all[this.nation_nr][j][k+1]==null){
							k=99;
						}
					}
					if(this.tanks_all[this.nation_nr][j+1][1]==null){
						j=99;
					}
				}
			}
		}
		else if(this.nation_nr != 0 && this.category_nr != 0){
				if(this.tier==0){
					for (int k=1;k<21;k++){
						if(this.tanks_all[this.nation_nr][this.category_nr][k]!=null){
							if(this.tanks_all[this.nation_nr][this.category_nr][k].get_tier_virtual_min()!=0||this.tanks_all[this.nation_nr][this.category_nr][k].get_tier_virtual_max()!=0){
							this.tank_counter++;
						}}
						if(this.tanks_all[this.nation_nr][this.category_nr][k+1]==null){
							k=99;
						}
					}
				}
			else{
				for (int k=1;k<21;k++){
					if(this.tanks_all[this.nation_nr][this.category_nr][k]!=null && this.tanks_all[this.nation_nr][this.category_nr][k].get_tier_real()==this.tier){
						if(this.tanks_all[this.nation_nr][this.category_nr][k].get_tier_virtual_min()!=0||this.tanks_all[this.nation_nr][this.category_nr][k].get_tier_virtual_max()!=0){
							this.tank_counter++;
					}}
					if(this.tanks_all[this.nation_nr][this.category_nr][k+1]==null){
						k=99;
					}
				}
			}
		}
	}
	public String[] tankauswahl(){
		if(this.tank_counter==0){
			this.tank_counter=1;
		}
		String[] tankauswahl=new String[this.tank_counter];
		int zahl=0;
		if(this.nation_nr == 0 && this.category_nr == 0){
			if(this.tier==0){
				for (int i=1;i<7;i++){
					for (int j=1;j<6;j++){
						for (int k=1;k<21;k++){
							if(this.tanks_all[i][j][k].get_name().equals(null)==false){
								if(this.tanks_all[i][j][k].get_tier_virtual_min()!=0||this.tanks_all[i][j][k].get_tier_virtual_max()!=0){
									tankauswahl[zahl]=(String) this.tanks_all[i][j][k].get_name(); zahl++;
							}}
							if(this.tanks_all[i][j][k+1]==null){
								k=99;
							}
						}
						if(this.tanks_all[i][j+1][1]==null){
							j=99;
						}
					}
					if(this.tanks_all[i+1][1][1]==null){
						i=99;}
				}
			}
			else{
				for (int i=1;i<7;i++){
					for (int j=1;j<6;j++){
						for (int k=1;k<21;k++){
							if(this.tanks_all[i][j][k]!=null && this.tanks_all[i][j][k].get_tier_real()==this.tier){
								if(this.tanks_all[i][j][k].get_tier_virtual_min()!=0||this.tanks_all[i][j][k].get_tier_virtual_max()!=0){
									tankauswahl[zahl]=(String) this.tanks_all[i][j][k].get_name(); zahl++;
							}}
							if(this.tanks_all[i][j][k+1]==null){
								k=99;
							}
						}
						if(this.tanks_all[i][j+1][1]==null){
							j=99;
						}
					}
					if(this.tanks_all[i+1][1][1]==null){
						i=99;
					}
				}
			}
		}
		else if(this.nation_nr == 0 && this.category_nr != 0){
			if(this.tier==0){
				for (int i=1;i<7;i++){
					for (int k=1;k<21;k++){
						if(this.tanks_all[i][this.category_nr][k].get_tier_virtual_min()!=0||this.tanks_all[i][this.category_nr][k].get_tier_virtual_max()!=0){
							tankauswahl[zahl]=(String) this.tanks_all[i][this.category_nr][k].get_name(); zahl++;
					}
						if(this.tanks_all[i][this.category_nr][k+1]==null){
							k=99;
						}
					}
					if(this.tanks_all[i+1][1][1]==null){
						i=99;}
				}
			}
			else{
				for (int i=1;i<7;i++){
					for (int k=1;k<21;k++){
						if(this.tanks_all[i][this.category_nr][k]!=null && this.tanks_all[i][this.category_nr][k].get_tier_real()==this.tier){
							if(this.tanks_all[i][this.category_nr][k].get_tier_virtual_min()!=0||this.tanks_all[i][this.category_nr][k].get_tier_virtual_max()!=0){
								tankauswahl[zahl]=(String) this.tanks_all[i][this.category_nr][k].get_name(); zahl++;
						}}
						if(this.tanks_all[i][this.category_nr][k+1]==null){
							k=99;
						}
					}
					if(this.tanks_all[i+1][1][1]==null){
						i=99;
					}
				}
			}
		}
		else if(this.nation_nr != 0 && this.category_nr == 0){
			if(this.tier==0){
				for (int j=1;j<6;j++){
					for (int k=1;k<21;k++){
						if(this.tanks_all[this.nation_nr][j][k]!=null){
							if(this.tanks_all[this.nation_nr][j][k].get_tier_virtual_min()!=0||this.tanks_all[this.nation_nr][j][k].get_tier_virtual_max()!=0){
								tankauswahl[zahl]=(String) this.tanks_all[this.nation_nr][j][k].get_name(); zahl++;
						}}
						if(this.tanks_all[this.nation_nr][j][k+1]==null){
							k=99;
						}
					}
					if(this.tanks_all[this.nation_nr][j+1][1]==null){
						j=99;
					}
				}
			}
			else{
				for (int j=1;j<6;j++){
					for (int k=1;k<21;k++){
						if(this.tanks_all[this.nation_nr][j][k]!=null && this.tanks_all[this.nation_nr][j][k].get_tier_real()==this.tier){
							if(this.tanks_all[this.nation_nr][j][k].get_tier_virtual_min()!=0||this.tanks_all[this.nation_nr][j][k].get_tier_virtual_max()!=0){
								tankauswahl[zahl]=(String) this.tanks_all[this.nation_nr][j][k].get_name(); zahl++;
						}}
						if(this.tanks_all[this.nation_nr][j][k+1]==null){
							k=99;
						}
					}
					if(this.tanks_all[this.nation_nr][j+1][1]==null){
						j=99;
					}
				}
			}
		}
		else if(this.nation_nr != 0 && this.category_nr != 0){
				if(this.tier==0){
					for (int k=1;k<21;k++){
						if(this.tanks_all[this.nation_nr][this.category_nr][k]!=null){
							if(this.tanks_all[this.nation_nr][this.category_nr][k].get_tier_virtual_min()!=0||this.tanks_all[this.nation_nr][this.category_nr][k].get_tier_virtual_max()!=0){
								tankauswahl[zahl]=(String) this.tanks_all[this.nation_nr][this.category_nr][k].get_name(); zahl++;
						}}
						if(this.tanks_all[this.nation_nr][this.category_nr][k+1]==null){
							k=99;
						}
					}
				}
			else{
				for (int k=1;k<21;k++){
					if(this.tanks_all[this.nation_nr][this.category_nr][k]!=null && this.tanks_all[this.nation_nr][this.category_nr][k].get_tier_real()==this.tier){
						if(this.tanks_all[this.nation_nr][this.category_nr][k].get_tier_virtual_min()!=0||this.tanks_all[this.nation_nr][this.category_nr][k].get_tier_virtual_max()!=0){
							tankauswahl[zahl]=(String) this.tanks_all[this.nation_nr][this.category_nr][k].get_name(); zahl++;
					}}
					if(this.tanks_all[this.nation_nr][this.category_nr][k+1]==null){
						k=99;
					}
				}
			}
		}
		if(tankauswahl[0]==null){
			tankauswahl[0]="No Tank Available";
		}
		return tankauswahl;
	}
	//Methoden zum Fensterzeichnen
	public void Combox(String[] names){
		this.tanks=new JComboBox<String>(names);
	}
	//Methoden zur Ausgabe verschiedener Variabeln... debugging
	public void ausgabe_var(){
		System.out.println(this.nation);
		System.out.println(this.nation_nr);
		System.out.println(this.category);
		System.out.println(this.category_nr);
		System.out.println(this.tier);
	}

	//Buttonlistener und Weiter methoden
	private void addButtonListener(JButton b){
	   b.addActionListener(new ActionListener() { 
		   public void actionPerformed(ActionEvent ae) { 
	            switch (ae.getActionCommand()){
	            case "OK":
	            	ausgabe();
	            	break;
	            case "Back":
	            	back();
	            	break;
	            case "Exit":
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
	private void ausgabe(){
		this.tank_counter();
		String[] tanknames=new String[this.tank_counter];
		tanknames=this.tankauswahl();
		
		this.setVisible(false);
		//Wenn kein tank waehlbar, dann wird auch nix ausgegeben
		if(tanknames[0].equals("No Tank Available")==true){
			JFrame frame = new JFrame("JOptionPane showMessageDialog example");
			JOptionPane.showMessageDialog(frame, "<html><body><center><h1>THERE IS NO TANK AVAILABLE!</h1><br>What a tankcommander are you, <br>to drive into a battle without a tank?"//+"<br>because of guys like you the ENDSIEG was canceled!"
					+"<br> Think about it and do it again!"+//"<br><FONT FACE=\"Segoe Script\">The Fuhrer"+
					"</center></html>", "NO TANK AVAILABLE!", JOptionPane.ERROR_MESSAGE);
			back();
		}
		else{
		AUSGABE_WINDOW g=new AUSGABE_WINDOW(this.tanks_all, this.tankfinal((String) this.tanks.getSelectedItem()));
		g.setVisible(true);
		}
	}
}