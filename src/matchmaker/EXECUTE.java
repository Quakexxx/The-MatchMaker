//////////////////////////////////////////////////////////////////////
//WORLD OF TANKS-MATCHMAKINGCALCULATOR								//
//PROGRAMMERS: EOMAER; PSAIKO; EFERDI								//
//PROGRAMMINGENVIORNMENT: Eclipse IDE for Java Developers			//
//Version: Juno Service Release 2									//
//OS: Microsoft Windows [Version 6.0.6002]							//
//////////////////////////////////////////////////////////////////////

package matchmaker;

public class EXECUTE {
	
	public static void main(String[] args){
		TANK[][][] t=eingabe_panzer();
		EINGABE_WINDOW g=new EINGABE_WINDOW(t);
		g.setVisible(true);
	}
	public static TANK[][][] eingabe_panzer(){
		TANK[][][] t=new TANK[8][7][22];;
		//American Tanks

		//American Lights
		t[1][1][1]=new TANK("T1 Cunningham", 1,"light", "American", false, 1, 2);
		t[1][1][2]=new TANK("M2 light Tank", 2,"light", "American", false, 2, 3);
		t[1][1][3]=new TANK("T1E6", 2,"Light", "American", false, 2, 3);
		t[1][1][4]=new TANK("T2 Light Tank", 2,"light", "American", true, 2, 4);
		t[1][1][5]=new TANK("M22 Locust", 3,"light", "American", false, 3, 5);
		t[1][1][6]=new TANK("M3 Stuart", 3,"light", "American", false, 3, 5);
		t[1][1][7]=new TANK("MTLS-1G14", 3,"light", "American", false, 3, 5);
		t[1][1][8]=new TANK("M5 Stuart", 4,"light", "American", false, 4, 8);
		t[1][1][9]=new TANK("M24 Chaffee", 5,"light", "American", true, 7, 12);
		t[1][1][10]=new TANK("T21", 6,"light", "American", false, 7, 11);
		t[1][1][11]=new TANK("T71", 7,"light", "American", false, 8, 11);
	    t[1][1][12]=new TANK("T31", 99,"light", "American", false,0,0);
	    t[1][1][13]=new TANK("Type 95 Ha-Go", 99,"light", "American", false,0,0);
		
		//American Mediums
		t[1][2][1]=new TANK("T2 Medium Tank", 2,"med", "American", false, 2, 3);
		t[1][2][2]=new TANK("M2 Medium Tank", 3,"med", "American", false, 3, 5);
		t[1][2][3]=new TANK("M3 Lee", 4,"med", "American", false, 4, 6);
		t[1][2][4]=new TANK("M4 Sherman", 5,"med", "American", false, 5, 7);
		t[1][2][5]=new TANK("M4A2E4", 5,"med", "American", true, 5, 6);
		t[1][2][6]=new TANK("M7", 5,"med", "American", false, 5, 7);
		t[1][2][7]=new TANK("Ram-II", 5,"med", "American", false, 5, 7);
		t[1][2][8]=new TANK("M4A3E2 Sherman Jumbo", 6,"med", "American", false, 6, 8);
		t[1][2][9]=new TANK("M4A3E8 Sherman", 6,"med", "American", false, 6, 8);
		t[1][2][10]=new TANK("T20", 7,"med", "American", false, 7, 9);
		t[1][2][11]=new TANK("M26 Pershing", 8,"med", "American", false, 8, 10);
		t[1][2][12]=new TANK("T23", 8,"med", "American", false, 8, 10);
		t[1][2][13]=new TANK("T26E4 Super Pershing", 8,"med", "American", true, 8, 9);
		t[1][2][14]=new TANK("T69", 8,"med", "American", false, 8, 10);
		t[1][2][15]=new TANK("M46 Patton", 9,"med", "American", false, 9, 11);
		t[1][2][16]=new TANK("T54E1", 9,"med", "American", false, 9, 11);
		t[1][2][17]=new TANK("M48A1", 10,"med", "American", false, 10,12);
	    t[1][2][18]=new TANK("Type 97 Shinhoto Chi-Ha", 99,"med", "American", false,0,0);

		//American Heavys
		t[1][3][1]=new TANK("T1 Heavy Tank", 5,"hvy", "American", false,5,7);
		t[1][3][2]=new TANK("T14", 5,"hvy", "American", true, 5, 6);
		t[1][3][3]=new TANK("M6", 6,"hvy", "American", false,6,8);
		t[1][3][4]=new TANK("T29", 7,"hvy", "American", false,7,9);
		t[1][3][5]=new TANK("M6A2E1", 8,"hvy", "American", false,8,10);
		t[1][3][6]=new TANK("T32", 8,"hvy", "American", false,8,10);
		t[1][3][7]=new TANK("T34", 8,"hvy", "American", false,8,10);
		t[1][3][8]=new TANK("M103", 9,"hvy", "American", false,9,11);
		t[1][3][9]=new TANK("T110E5", 10,"hvy", "American", false,10,12);
		t[1][3][10]=new TANK("T57 Heavy Tank", 10,"hvy", "American", false,10,12);
	    t[1][3][11]=new TANK("MK VIII International", 99,"hvy", "American", false,0,0);
	    t[1][3][12]=new TANK("Type 5 Chi-Ri", 99,"hvy", "American", false,0,0);
		
		//American Tank Destroyer
		t[1][4][1]=new TANK("T18", 2,"td", "American", false,2,3);
		t[1][4][2]=new TANK("T82", 3,"td", "American", false,3,5);
		t[1][4][3]=new TANK("M8A1", 4,"td", "American", false,4,6);
		t[1][4][4]=new TANK("T40", 4,"td", "American", false,4,6);
		t[1][4][5]=new TANK("M10 Wolverine", 5,"td", "American", false,5,7);
		t[1][4][6]=new TANK("T49", 5,"td", "American", false,5,7);
		t[1][4][7]=new TANK("M18 Hellcat", 6,"td", "American", false,6,8);
		t[1][4][8]=new TANK("M36 Jackson", 6,"td", "American", false,6,8);
		t[1][4][9]=new TANK("T25 AT", 7,"td", "American", false,7,9);
		t[1][4][10]=new TANK("T25/2", 7,"td", "American", false,7,9);
		t[1][4][11]=new TANK("T28", 8,"td", "American", false,8,10);
		t[1][4][12]=new TANK("T28 Prototype", 8,"td", "American", false,8,10);
		t[1][4][13]=new TANK("T30", 9,"td", "American", false,9,11);
		t[1][4][14]=new TANK("T95", 9,"td", "American", false,9,11);
		t[1][4][15]=new TANK("T110E3", 10,"td", "American", false,10,12);
		t[1][4][16]=new TANK("T110E4", 10,"td", "American", false,10,12);
	    t[1][4][17]=new TANK("T88", 99,"td", "American", false,0,0);
		
		//American Artillery
		t[1][5][1]=new TANK("T57", 2,"arty", "American", false,3,4);
		t[1][5][2]=new TANK("M37", 3,"arty", "American", false,4,6);
	    t[1][5][3]=new TANK("Sexton I", 3,"arty", "American", true, 0, 0);
		t[1][5][4]=new TANK("M7 Priest", 4,"arty", "American", false,5,8);
		t[1][5][5]=new TANK("M41", 5,"arty", "American", false,7,9);
		t[1][5][6]=new TANK("M12", 6,"arty", "American", false,9,10);
		t[1][5][7]=new TANK("M40/M43", 7,"arty", "American", false,10,11);
		t[1][5][8]=new TANK("T92", 8,"arty", "American", false,11,12);
		t[1][5][11]=new TANK("T3", 99,"arty", "American", false,0,0);
		
	//British Tanks
		//British Lights
		t[2][1][1]=new TANK("Cruiser Mk. I", 2,"light", "British", false,2,3);
		t[2][1][2]=new TANK("Cruiser Mk. III", 2,"light", "British", false,2,3);
		t[2][1][3]=new TANK("Cruiser Mk. II", 3,"light", "British", false,3,5);
	    t[2][1][4]=new TANK("Cruiser Mk. IV", 3,"light", "British", false,3,5);
		t[2][1][5]=new TANK("Covenanter", 4,"light", "British", true, 4, 6);
		t[2][1][6]=new TANK("Valentine", 4,"light", "British", true, 4, 6);
		t[2][1][7]=new TANK("Crusader", 5,"light", "British", true, 5, 7);
		
		//British Mediums
		t[2][2][1]=new TANK("Vickers Medium Mk. I", 1,"med", "British", false,1,2);
		t[2][2][2]=new TANK("Vickers Medium Mk. II", 2,"med", "British", false,2,3);
		t[2][2][3]=new TANK("Vickers Medium Mk. III", 3,"med", "British", false,3,5);
		t[2][2][4]=new TANK("Matilda", 4,"med", "British", false,4,6);
		t[2][2][5]=new TANK("Matilda Black Prince", 5,"med", "British", true, 5, 6);
		t[2][2][6]=new TANK("Cromwell", 6,"med", "British", false,6,8);
		t[2][2][7]=new TANK("Comet", 7,"med", "British", false,7,9);
		t[2][2][8]=new TANK("Centurion Mk. I", 8,"med", "British", false,8,10);
		t[2][2][9]=new TANK("Centurion Mk. 7/1", 9,"med", "British", false,9,11);
		t[2][2][10]=new TANK("FV4202", 10,"med", "British", false,10,12);
		
		//British Heavys
		t[2][3][1]=new TANK("Churchill I", 5,"hvy", "British", false,5,7);
		t[2][3][2]=new TANK("Churchill VII", 6,"hvy", "British", false,6,8);
		t[2][3][3]=new TANK("TOG II*", 6,"hvy", "British", true, 6, 7);
		t[2][3][4]=new TANK("Black Prince", 7,"hvy", "British", false,7,9);
		t[2][3][5]=new TANK("Caernarvon", 7,"hvy", "British", false,8,10);
		t[2][3][6]=new TANK("Conqueror", 9,"hvy", "British", false,9,11);
		t[2][3][7]=new TANK("FV215b", 10,"hvy", "British", false,10,12);

		//British Tank Destroyer
		t[2][4][1]=new TANK("Universal Carrier 2-pdr", 2,"td", "British", false,2,3);
		t[2][4][2]=new TANK("Valentine AT", 3,"td", "British", false,3,5);
		t[2][4][3]=new TANK("Alecto ", 4,"td", "British", false,4,6);
		t[2][4][4]=new TANK("AT 2", 5,"td", "British", false,5,7);
		t[2][4][5]=new TANK("Churchill Gun Carrier", 6,"td", "British", false,6,8);
		t[2][4][6]=new TANK("AT 8", 6,"td", "British", false,6,8);
		t[2][4][7]=new TANK("AT-15A", 7,"td", "British", false,7,9);
		t[2][4][8]=new TANK("AT 7", 7,"td", "British", false,7,9);
		t[2][4][9]=new TANK("AT 15", 8,"td", "British", false,8,10);
		t[2][4][10]=new TANK("Tortoise", 9,"td", "British", false,9,11);
		t[2][4][11]=new TANK("FV215b (183)", 10,"td", "British", false,10,12);
		
		//British Artillery
	    t[2][5][4]=new TANK("Sexton", 3,"arty", "British", true, 0, 0);

	//German Tanks

		//German Lights
		t[3][1][1]=new TANK("Leichttraktor", 1,"light", "German", false,1,2);
		t[3][1][2]=new TANK("PzKpfw 35 (t)", 2,"light", "German", false,2,3);
		t[3][1][3]=new TANK("PzKpfw 38H735 (f)", 2,"light", "German", false,2,3);
		t[3][1][4]=new TANK("Pz.Kpfw I", 2,"light", "German", true, 2, 2);
		t[3][1][5]=new TANK("PzKpfw II", 2,"light", "German", false,2,3);
		t[3][1][6]=new TANK("PzKpfw 38 (t)", 3,"light", "German", false,3,5);
		t[3][1][7]=new TANK("PzKpfw I Ausf. C", 3,"light", "German", false,3,5);
		t[3][1][8]=new TANK("Pz.Kpfw. II Ausf. G", 3,"light", "German", false,3,5);
		t[3][1][9]=new TANK("PzKpfw II Ausf. J", 3,"light", "German", true, 3, 4);
		t[3][1][10]=new TANK("PzKpfw III Ausf. A", 3,"light", "German", false,3,5);
		t[3][1][11]=new TANK("T-15", 3,"light", "German", false,3,5);
		t[3][1][12]=new TANK("PzKpfw 38 nA", 4,"light", "German", false,4,8);
		t[3][1][13]=new TANK("PzKpfw II Luchs", 4,"light", "German", false,4,8);
		t[3][1][14]=new TANK("VK 1602 Leopard", 5,"light", "German", false,5,9);
		t[3][1][15]=new TANK("VK 2801", 6,"light", "German", false,7,11);
	    t[3][1][16]=new TANK("PzKpfw BT 742 (r)", 99,"light", "German", false,0,0);
		
		//German Mediums
		t[3][2][1]=new TANK("PzKpfw S35 739 (f)", 3,"med", "German", false,3,5);
		t[3][2][2]=new TANK("PzKpfw III", 4,"med", "German", false,4,6);
		t[3][2][3]=new TANK("PzKpfw III/IV", 5,"med", "German", false,5,7);
		t[3][2][4]=new TANK("PzKpfw IV", 5,"med", "German", false,5,7);
		t[3][2][5]=new TANK("PzKpfw IV Hydraulic", 5,"med", "German", true, 5, 6);
		t[3][2][6]=new TANK("T-25", 5,"med", "German", false,5,7);
		t[3][2][7]=new TANK("PzKpfw IV Schmalturm", 6,"med", "German", false,6,8);
		t[3][2][8]=new TANK("PzKpfw V-IV", 6,"med", "German", true, 6, 7);
		t[3][2][9]=new TANK("PzKpfw V-IV Alpha", 6,"med", "German", true, 6, 7);
		t[3][2][10]=new TANK("VK 3001 (H)", 6,"med", "German", false,6,8);
		t[3][2][11]=new TANK("VK 3001 (P)", 6,"med", "German", false,6,8);
		t[3][2][12]=new TANK("VK 3601 (H)", 6,"med", "German", false,6,8);
		t[3][2][13]=new TANK("Panther-M10", 7,"med", "German", true, 7, 8);
		t[3][2][14]=new TANK("PzKpfw V Panther", 7,"med", "German", false,7,9);
		t[3][2][15]=new TANK("VK 3002 (DB)", 7,"med", "German", false,7,9);
		t[3][2][16]=new TANK("Panther II", 8,"med", "German", false,8,10);
		t[3][2][17]=new TANK("E-50", 9,"med", "German", false,9,11);
		t[3][2][18]=new TANK("E-50 Ausf. M", 10,"med", "German", false,10,12);
	    t[3][2][19]=new TANK("PzKpfw T34 742 (r)", 99,"med", "German", false,0,0);
		
		//German Heavys
		t[3][3][1]=new TANK("PzKpfw B2 740 (f)", 4,"hvy", "German", true, 4, 4);
		t[3][3][2]=new TANK("PzKpfw VI Tiger", 7,"hvy", "German", false,7,9);
		t[3][3][3]=new TANK("PzKpfw VI Tiger (P)", 7,"hvy", "German", false,7,9);
		t[3][3][4]=new TANK("Löwe", 8,"hvy", "German", false,8,10);
		t[3][3][5]=new TANK("PzKpfw VIB Tiger II", 8,"hvy", "German", false,8,10);
		t[3][3][6]=new TANK("VK 4502 (P) Ausf. A", 8,"hvy", "German", false,8,10);
		t[3][3][7]=new TANK("E-75", 9,"hvy", "German", false,9,11);
		t[3][3][8]=new TANK("VK 4502 (P) Ausf. B", 9,"hvy", "German", false,9,11);
		t[3][3][9]=new TANK("E-100", 10,"hvy", "German", false,10,12);
		t[3][3][10]=new TANK("Maus", 10,"hvy", "German", false,10,12);
	    t[3][3][11]=new TANK("NbFz", 99,"hvy", "German", false,0,0);
	    t[3][3][12]=new TANK("PzKpfw KV-1 756 (r)", 99,"hvy", "German", false,0,0);
		
		//German Tank Destroyer
		t[3][4][1]=new TANK("Panzerjäger I", 2,"td", "German", false,2,3);
		t[3][4][2]=new TANK("Marder II", 3,"td", "German", false,3,5);
		t[3][4][3]=new TANK("Hetzer", 4,"td", "German", false,4,6);
		t[3][4][4]=new TANK("StuG III", 5,"td", "German", false,5,7);
		t[3][4][5]=new TANK("Dicker Max", 6,"td", "German", false,6,8);
		t[3][4][6]=new TANK("JagdPz IV", 6,"td", "German", false,6,8);
		t[3][4][7]=new TANK("Jagdpanther", 7,"td", "German", false,7,9);
		t[3][4][8]=new TANK("8.8 cm PaK 43 Jagdtiger", 8,"td", "German", true, 8, 9);
		t[3][4][9]=new TANK("Ferdinand", 8,"td", "German", false,8,10);
		t[3][4][10]=new TANK("Jagdpanther II", 8,"td", "German", false,8,10);
		t[3][4][11]=new TANK("Jagdtiger", 9,"td", "German", false,9,11);
		t[3][4][12]=new TANK("JagdPz E-100", 10,"td", "German", false,10,12);
	    t[3][1][16]=new TANK("E-10", 99,"td", "German", false,0,0);
	    t[3][1][16]=new TANK("E-25", 99,"td", "German", false,0,0);
		
		//German Artillery
		t[3][5][1]=new TANK("Sturmpanzer I Bison", 2,"arty", "German", true, 3, 5);
		t[3][5][2]=new TANK("Sturmpanzer II", 3,"arty", "German", false,4,6);
		t[3][5][3]=new TANK("Wespe", 3,"arty", "German", false,4,6);
		t[3][5][4]=new TANK("Grille", 4,"arty", "German", false,5,8);
		t[3][5][5]=new TANK("Hummel", 5,"arty", "German", false,7,9);
		t[3][5][6]=new TANK("GW Panther", 6,"arty", "German", false,9,10);
		t[3][5][7]=new TANK("GW Tiger", 7,"arty", "German", false,10,11);
		t[3][5][8]=new TANK("GW Typ E", 8,"arty", "German", false,11,12);
		
	//French Tanks

		//French Lights
		t[4][1][1]=new TANK("RenaultFT", 1,"light", "French", false,1,2);
		t[4][1][2]=new TANK("D1", 2,"light", "French", false,2,3);
		t[4][1][3]=new TANK("Hotchkiss H35", 2,"light", "French", false,2,3);
		t[4][1][4]=new TANK("AMX 38", 3,"light", "French", false,3,5);
		t[4][1][5]=new TANK("AMX 40", 4,"light", "French", true, 4, 6);
		t[4][1][6]=new TANK("ELC AMX", 5,"light", "French", true, 6, 9);
		t[4][1][7]=new TANK("AMX 12t", 6,"light", "French", false,7,11);
		t[4][1][8]=new TANK("AMX 13 75", 7,"light", "French", false,8,11);
		t[4][1][9]=new TANK("AMX 13 90", 8,"light", "French", false,9,12);
	    t[4][1][10]=new TANK("AMR 35", 2,"light", "French", false,0,0);
	    t[4][1][11]=new TANK("Renault R35", 2,"light", "French", false,0,0);
	    t[4][1][12]=new TANK("FCM 36", 3,"light", "French", false,0,0);
	    t[4][1][13]=new TANK("FCM 20t", 4,"light", "French", false,0,0);
	    t[4][1][14]=new TANK("AMR P103", 99,"light", "French", false,0,0);
	    t[4][1][15]=new TANK("L6/40", 99,"light", "French", false,0,0);
	    t[4][1][16]=new TANK("AMX 13 FL 11", 99,"light", "French", false,0,0);

		//French Mediums
		t[4][2][1]=new TANK("D2", 3,"med", "French", false,3,5);
		t[4][2][2]=new TANK("Lorraine 40 t", 9,"med", "French", false,9,11);
		t[4][2][3]=new TANK("Bat Chatillon 25 t", 10,"med", "French", false,10,12);
	    t[4][2][4]=new TANK("AMC 35", 3,"med", "French", false,0,0);
	    t[4][2][5]=new TANK("Somua S35", 4,"med", "French", false,0,0);
	    t[4][2][6]=new TANK("Poniatowski G1P", 5,"med", "French", false,0,0);
	    t[4][2][7]=new TANK("Renault G1 R", 99,"med", "French", false,0,0);
	    t[4][2][8]=new TANK("G1 L", 99,"med", "French", false,0,0);
	    t[4][2][9]=new TANK("M15/42", 99,"med", "French", false,0,0);
		
		//French Heavys
		t[4][3][1]=new TANK("B1", 4,"hvy", "French", false,4,5);
		t[4][3][2]=new TANK("BDR G1B", 5,"hvy", "French", false,5,7);
		t[4][3][3]=new TANK("ARL 44", 6,"hvy", "French", false,6,8);
		t[4][3][4]=new TANK("AMX M4(1945)", 7,"hvy", "French", false,7,9);
		t[4][3][5]=new TANK("AMX 50 100", 8,"hvy", "French", false,8,10);
		t[4][3][6]=new TANK("FCM 50 t", 8,"hvy", "French", true, 8, 9);
		t[4][3][7]=new TANK("AMX 50 120", 9,"hvy", "French", false,9,11);
		t[4][3][8]=new TANK("AMX 50B", 10,"hvy", "French", false,10,12);
	    t[4][3][9]=new TANK("AMX Tracteur C 40", 6,"hvy", "French", false,0,0);
	    t[4][3][10]=new TANK("AMX M4(1948)", 8,"hvy", "French", false,0,0);
	    t[4][3][11]=new TANK("AMX 65t", 9,"hvy", "French", false,0,0);
	    t[4][3][12]=new TANK("FCM F1", 99,"hvy", "French", false,0,0);
	    t[4][3][13]=new TANK("FCM 2C", 99,"hvy", "French", false,0,0);
	    t[4][3][14]=new TANK("P.40", 99,"hvy", "French", false,0,0);
		
		//French Tank Destroyer
		t[4][4][1]=new TANK("RenaultFT AC", 2,"td", "French", false,2,3);
		t[4][4][2]=new TANK("FCM36 PaK40", 3,"td", "French", false,3,5);
		t[4][4][3]=new TANK("Renault UE 57", 3,"td", "French", false,3,5);
		t[4][4][4]=new TANK("Somua SAu-40", 4,"td", "French", false,4,6);
		t[4][4][5]=new TANK("S-35 CA", 5,"td", "French", false,5,7);
		t[4][4][6]=new TANK("ARL V39", 6,"td", "French", false,6,8);
		t[4][4][7]=new TANK("AMX AC Mle. 1946", 7,"td", "French", false,7,9);
		t[4][4][8]=new TANK("AMX AC Mle. 1948", 8,"td", "French", false,8,10);
		t[4][4][9]=new TANK("AMX 50 Foch", 9,"td", "French", false,9,11);
		t[4][4][10]=new TANK("AMX 50 Foch (155)", 10,"td", "French", false,10,12);
	    t[4][4][11]=new TANK("Panzerjäger 35R", 99,"td", "French", false,0,0);
	    t[4][4][12]=new TANK("2C Bis", 99,"td", "French", false,0,0);
	    t[4][4][13]=new TANK("28/32 Pz.Kpfw. 38 H (f)", 99,"td", "French", false,0,0);
		
		//French Artillery
		t[4][5][1]=new TANK("RenaultBS", 2,"arty", "French", false,3,4);
		t[4][5][2]=new TANK("Lorraine39 L AM", 3,"arty", "French", false,4,6);
		t[4][5][3]=new TANK("105 leFH18B2", 4,"arty", "French", false,5,8);
		t[4][5][4]=new TANK("AMX 105AM", 4,"arty", "French", false,5,8);
		t[4][5][5]=new TANK("AMX 13 F3 AM", 5,"arty", "French", false,7,9);
		t[4][5][6]=new TANK("Lorraine155 50", 6,"arty", "French", false,9,10);
		t[4][5][7]=new TANK("Lorraine155 51", 7,"arty", "French", false,10,11);
		t[4][5][8]=new TANK("Bat CHatillon 155", 8,"arty", "French", false,11,12);
	    t[4][5][11]=new TANK("R35 AC", 99,"arty", "French", false,0,0);
	    t[4][5][12]=new TANK("ACL 135", 99,"arty", "French", false,0,0);

	//Soviet Tanks
		//Soviet Lights
		t[5][1][1]=new TANK("MS-1", 1,"light", "Soviet", false,1,2);
		t[5][1][2]=new TANK("BT-2", 2,"light", "Soviet", false,2,3);
		t[5][1][3]=new TANK("Tetrach", 2,"light", "Soviet", false,2,3);
		t[5][1][4]=new TANK("T26", 2,"light", "Soviet", false,2,3);
		t[5][1][5]=new TANK("BT-7", 3,"light", "Soviet", false,3,5);
		t[5][1][6]=new TANK("BT-SV", 3,"light", "Soviet", true, 3, 4);
		t[5][1][7]=new TANK("M3 Stuart Lend Lease", 3,"light", "Soviet", true, 3, 4);
		t[5][1][8]=new TANK("T-127", 3,"light", "Soviet", true, 3, 4);
		t[5][1][9]=new TANK("T-46", 3,"light", "Soviet", false,3,5);
		t[5][1][10]=new TANK("A-20", 4,"light", "Soviet", false,4,8);
		t[5][1][11]=new TANK("T-50", 4,"light", "Soviet", true, 5, 9);
		t[5][1][12]=new TANK("Valentine II", 4,"light", "Soviet", true, 4, 4);
		t[5][1][13]=new TANK("T50-2", 5,"light", "Soviet", true, 7, 12);
	    t[5][1][14]=new TANK("T-19", 2,"light", "Soviet", false,0,0);
	    t[5][1][15]=new TANK("T-60", 2,"light", "Soviet", false,0,0);
	    t[5][1][16]=new TANK("T-70", 3,"light", "Soviet", false,0,0);
	    t[5][1][17]=new TANK("T-80", 4,"light", "Soviet", false,0,0);
	    t[5][1][18]=new TANK("RBT-5", 99,"light", "Soviet", false,0,0);
	    t[5][1][19]=new TANK("L640", 99,"light", "Soviet", false,0,0);

		//Soviet Mediums
		t[5][2][1]=new TANK("A-32", 4,"med", "Soviet", true, 4, 5);
		t[5][2][3]=new TANK("T-28", 4,"med", "Soviet", false,4,6);
		t[5][2][4]=new TANK("Matilda IV", 5,"med", "Soviet", true, 5, 6);
		t[5][2][5]=new TANK("T-34", 5,"med", "Soviet", false,5,7);
		t[5][2][6]=new TANK("T-34-85", 6,"med", "Soviet", false,6,8);
		t[5][2][7]=new TANK("KV-13", 7,"med", "Soviet", false,7,9);
		t[5][2][8]=new TANK("T-43", 7,"med", "Soviet", false,7,9);
		t[5][2][9]=new TANK("T-44", 8,"med", "Soviet", false,8,10);
		t[5][2][10]=new TANK("T-54", 9,"med", "Soviet", false,9,11);
		t[5][2][11]=new TANK("T62A", 10,"med", "Soviet", false,10,12);
	    t[5][2][12]=new TANK("T-24", 3,"med", "Soviet", false,0,0);
	    t[5][2][13]=new TANK("T-46-5", 4,"med", "Soviet", false,0,0);
	    t[5][2][14]=new TANK("A-43", 6,"med", "Soviet", false,0,0);
	    t[5][2][15]=new TANK("A-44", 7,"med", "Soviet", false,0,0);
	    t[5][2][16]=new TANK("Object 416", 8,"med", "Soviet", false,0,0);
	    t[5][2][17]=new TANK("Pz. V Panther", 99,"med", "Soviet", false,0,0);
	    t[5][2][18]=new TANK("TG", 99,"med", "Soviet", false,0,0);
	    t[5][2][19]=new TANK("Pz. IV", 99,"med", "Soviet", false,0,0);
		
		//Soviet Heavys
		t[5][3][1]=new TANK("Churchill III", 5,"hvy", "Soviet", true, 5, 6);
		t[5][3][2]=new TANK("KV", 5,"hvy", "Soviet", false,5,7);
		t[5][3][3]=new TANK("KV-1", 5,"hvy", "Soviet", false,5,7);
		t[5][3][4]=new TANK("KV-220", 5,"hvy", "Soviet", false, 5, 7);
		t[5][3][5]=new TANK("KV-220 Beta-Test", 5,"hvy", "Soviet", true, 5, 6);
		t[5][3][6]=new TANK("KV-1s", 6,"hvy", "Soviet", false,6,8);
		t[5][3][7]=new TANK("KV-2", 6,"hvy", "Soviet", false,6,8);
		t[5][3][8]=new TANK("T-150", 6,"hvy", "Soviet", false,6,8);
		t[5][3][9]=new TANK("IS", 7,"hvy", "Soviet", false,7,9);
		t[5][3][10]=new TANK("KV-3", 7,"hvy", "Soviet", false,7,9);
		t[5][3][11]=new TANK("IS-3", 8,"hvy", "Soviet", false,8,10);
		t[5][3][12]=new TANK("IS-6", 8,"hvy", "Soviet", true, 8, 9);
		t[5][3][13]=new TANK("KV-4", 8,"hvy", "Soviet", false,8,10);
		t[5][3][14]=new TANK("KV-5", 8,"hvy", "Soviet", true, 8, 9);
		t[5][3][15]=new TANK("IS-8", 9,"hvy", "Soviet", false,9,11);
		t[5][3][16]=new TANK("ST-I", 9,"hvy", "Soviet", false,9,11);
		t[5][3][17]=new TANK("IS-4", 10,"hvy", "Soviet", false,10,12);
		t[5][3][18]=new TANK("IS-7", 10,"hvy", "Soviet", false,10,12);
	    t[5][3][19]=new TANK("T-35", 99,"hvy", "Soviet", false,0,0);
		
		//Soviet Tank Destroyer
		t[5][4][1]=new TANK("AT-1", 2,"td", "Soviet", false,2,3);
		t[5][4][2]=new TANK("SU-76", 3,"td", "Soviet", false,3,5);
		t[5][4][3]=new TANK("SU-85B", 4,"td", "Soviet", false,4,6);
		t[5][4][4]=new TANK("SU-85", 5,"td", "Soviet", false,5,7);
		t[5][4][5]=new TANK("SU-85I", 5,"td", "Soviet", false,5,7);
		t[5][4][6]=new TANK("SU-100", 6,"td", "Soviet", false,6,8);
		t[5][4][7]=new TANK("SU-100Y", 6,"td", "Soviet", false,6,8);
		t[5][4][8]=new TANK("SU-100M1", 7,"td", "Soviet", false,7,9);
		t[5][4][9]=new TANK("SU-122-44", 7,"td", "Soviet", false,7,9);
		t[5][4][10]=new TANK("SU-152", 7,"td", "Soviet", false,7,9);
		t[5][4][11]=new TANK("ISU-152", 8,"td", "Soviet", false,8,10);
		t[5][4][12]=new TANK("SU-101", 8,"td", "Soviet", false,8,10);
		t[5][4][13]=new TANK("Object 704", 9,"td", "Soviet", false,9,11);
		t[5][4][14]=new TANK("SU-122-54", 9,"td", "Soviet", false,9,11);
		t[5][4][15]=new TANK("Object 263", 10,"td", "Soviet", false,10,12);
		t[5][4][16]=new TANK("Object 268", 10,"td", "Soviet", false,10,12);
	    t[5][4][17]=new TANK("IT-45", 3,"td", "Soviet", false,0,0);
	    t[5][4][18]=new TANK("SU-76BM", 4,"td", "Soviet", false,0,0);
	    t[5][2][19]=new TANK("SU-76(I)", 99,"td", "Soviet", false,0,0);
	    t[5][2][20]=new TANK("ZIS-30", 99,"td", "Soviet", false,0,0);
		
		//Soviet Artillery
		t[5][5][1]=new TANK("SU-18", 2,"arty", "Soviet", false,3,4);
		t[5][5][2]=new TANK("SU-26", 3,"arty", "Soviet", false,4,6);
		t[5][5][3]=new TANK("SU-5", 4,"arty", "Soviet", false,5,8);
		t[5][5][4]=new TANK("SU-8", 5,"arty", "Soviet", false,7,9);
		t[5][5][5]=new TANK("S-51", 6,"arty", "Soviet", false,9,10);
		t[5][5][6]=new TANK("SU-14", 6,"arty", "Soviet", false,9,10);
		t[5][5][7]=new TANK("Object 212", 7,"arty", "Soviet", false,10,11);
		t[5][5][8]=new TANK("Object 261", 8,"arty", "Soviet", false,11,12);
	    t[5][5][11]=new TANK("SG-122", 99,"arty", "Soviet", false,0,0);

	//Chinese Tanks

		//"Chinese" Lights
		t[6][1][1]=new TANK("Renault NC-31", 1,"light", "Chinese", false,1,2);
		t[6][1][2]=new TANK("Vickers Mk. E Type B", 2,"light", "Chinese", false,2,3);
		t[6][1][3]=new TANK("Type 2597 Chi-Ha", 3,"light", "Chinese", false,3,5);
		t[6][1][4]=new TANK("M5A1 Stuart", 4,"light", "Chinese", false,4,8);
		t[6][1][5]=new TANK("59-16", 6,"light", "Chinese", false,7,11);
		t[6][1][6]=new TANK("Type 62", 7,"light", "Chinese", false,8,11);
		t[6][1][7]=new TANK("WZ-131", 7,"light", "Chinese", false,8,11);
		t[6][1][8]=new TANK("WZ-132", 8,"light", "Chinese", false,9,12);

		//Chinese Mediums
		t[6][2][1]=new TANK("Type T-34", 5,"med", "Chinese", false,5,7);
		t[6][2][2]=new TANK("Type 58", 6,"med", "Chinese", false,6,8);
		t[6][2][3]=new TANK("T-34-1", 7,"med", "Chinese", false,7,9);
		t[6][2][4]=new TANK("T-34-2", 8,"med", "Chinese", false,8,10);
		t[6][2][5]=new TANK("Type 59", 8,"med", "Chinese", true, 8, 9);
		t[6][2][6]=new TANK("Type 59 G", 8,"med", "Chinese", true, 8, 10);
		t[6][2][7]=new TANK("WZ-120", 9,"med", "Chinese", false,9,11);
		t[6][2][8]=new TANK("121", 10,"med", "Chinese", false,10,12);

		//Chinese Heavys
		t[6][3][1]=new TANK("IS-2", 7,"hvy", "Chinese", false,7,9);
		t[6][3][2]=new TANK("110", 8,"hvy", "Chinese", false,8,10);
		t[6][3][3]=new TANK("WZ-111", 8,"hvy", "Chinese", false,8,10);
		t[6][3][4]=new TANK("WZ-111 model 1-4", 9,"hvy", "Chinese", false,9,11);
		t[6][3][5]=new TANK("113", 10,"hvy", "Chinese", false,10,12);

		return t;
		
	}
}
