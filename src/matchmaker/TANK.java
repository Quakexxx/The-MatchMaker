//////////////////////////////////////////////////////////////////////
//WORLD OF TANKS-MATCHMAKINGCALCULATOR								//
//PROGRAMMERS: EOMAER; PSAIKO; EFERDI								//
//PROGRAMMINGENVIORNMENT: Eclipse IDE for Java Developers			//
//Version: Juno Service Release 2									//
//OS: Microsoft Windows [Version 6.0.6002]							//
//////////////////////////////////////////////////////////////////////

package matchmaker;

public class TANK {
	String name;
	int tier_real;
	int tier_virtual_min;
	int tier_virtual_max;
	String category;
	String nation;
	String category_out;
	boolean besonders;
	
	TANK(String n, int t_real, String cat, String nat, boolean b, int virt_min, int virt_max){
		this.set_name(n);
		this.set_tier_real(t_real);
		this.set_category(cat);
		this.set_nation(nat);
		this.set_tier_virtual_min(virt_min);
		this.set_tier_virtual_max(virt_max);
		switch (cat){
		case "light":
			this.set_category_out("Light");
			break;
		case "med":
			this.set_category_out("Medium");
			break;
		case "hvy":
			this.set_category_out("Heavy");
			break;
		case "arty":
			this.set_category_out("Artillery");
			break;
		case "td":
			this.set_category_out("Tank Destroyer");
			break;
		}
		this.set_besonders(b);
		
	}
	
	TANK(String n, int t_real, String cat, String nat, boolean b){
		this.set_name(n);
		this.set_tier_real(t_real);
		this.set_category(cat);
		this.set_nation(nat);
		
		REALTOVIRT translate=new REALTOVIRT(this.tier_real,this.category);
		this.set_tier_virtual_min(translate.get_v_min());
		this.set_tier_virtual_max(translate.get_v_max());
		
		switch (cat){
		case "light":
			this.set_category_out("Light");
			break;
		case "med":
			this.set_category_out("Medium");
			break;
		case "hvy":
			this.set_category_out("Heavy");
			break;
		case "arty":
			this.set_category_out("Artillerie");
			break;
		case "td":
			this.set_category_out("Tank Destroyer");
			break;
			
		}
		this.set_besonders(b);
		
	}
	TANK(String n, int t_real, String cat, String nat){
		this.set_name(n);
		this.set_tier_real(t_real);
		this.set_category(cat);
		this.set_nation(nat);
		
		REALTOVIRT translate=new REALTOVIRT(this.tier_real,this.category);
		this.set_tier_virtual_min(translate.get_v_min());
		this.set_tier_virtual_max(translate.get_v_max());
		
		switch (cat){
		case "light":
			this.set_category_out("Light");
			break;
		case "med":
			this.set_category_out("Medium");
			break;
		case "hvy":
			this.set_category_out("Heavy");
			break;
		case "arty":
			this.set_category_out("Artillerie");
			break;
		case "td":
			this.set_category_out("Tank Destroyer");
			break;
			
		}
		this.set_besonders(false);
		
	}
	
	//set befehle
	public void set_name(String n){
		this.name=n;
	}
	public void set_tier_real(int t_r){
		this.tier_real=t_r;
	}
	public void set_tier_virtual_min(int t_v_min){
		this.tier_virtual_min=t_v_min;
	}
	public void set_tier_virtual_max(int t_v_max){
		this.tier_virtual_max=t_v_max;
	}
	public void set_category(String cat){
		this.category=cat;
	}
	public void set_category_out(String cat){
		this.category_out=cat;
	}
	public void set_nation(String nat){
		this.nation=nat;
	}
	public void set_besonders(boolean b){
		this.besonders=b;
	}
	//get befehle
	public String get_name(){
		return this.name;
	}
	public int get_tier_real(){
		return this.tier_real;
	}
	public int get_tier_virtual_min(){
		return this.tier_virtual_min;
		}
	public int get_tier_virtual_max(){
		return this.tier_virtual_max;
	}
	public String get_category(){
		return this.category;
	}
	public String get_category_out(){
		return this.category_out;
	}
	public String get_nation(){
		return this.nation;
	}
	public boolean get_besonders(){
		return this.besonders;
	}
	public String[] get_all(){
		String[] ret=new String[7];
		ret[0]=this.get_name();
		ret[1]=String.valueOf(this.get_tier_real());
		ret[2]=String.valueOf(this.get_tier_virtual_min());
		ret[3]=String.valueOf(this.get_tier_virtual_max());
		ret[4]=this.get_category();
		ret[5]=this.get_nation();
		ret[6]=String.valueOf(this.get_besonders());
		return ret;	
	}
	
//	TEST testweise anlegen eines kompletten panzers:
//	public static void main(String[] args){
//		TANK t1=new TANK("T1 Cunningham", 1,"light", "American");
//		TANK t2=new TANK("Black Prince", 7,"hvy", "British");
//		TANK t3=new TANK("Centurion Mk. 7/1", 9,"med", "British");
//		
//		System.out.println("Tank: "+t1.get_name()+"\nNation: "+t1.get_nation()+"\nTier: "+t1.get_tier_real()+"\nCategory: "+t1.get_category_out()+"\nBattleTierMin: "+t1.get_tier_virtual_min()+"\nBattleTierMax: "+t1.get_tier_virtual_max()+"\n\n");
//		System.out.println("Tank: "+t2.get_name()+"\nNation: "+t2.get_nation()+"\nTier: "+t2.get_tier_real()+"\nCategory: "+t2.get_category_out()+"\nBattleTierMin: "+t2.get_tier_virtual_min()+"\nBattleTierMax: "+t2.get_tier_virtual_max()+"\n\n");
//		System.out.println("Tank: "+t3.get_name()+"\nNation: "+t3.get_nation()+"\nTier: "+t3.get_tier_real()+"\nCategory: "+t3.get_category_out()+"\nBattleTierMin: "+t3.get_tier_virtual_min()+"\nBattleTierMax: "+t3.get_tier_virtual_max()+"\n\n");		
//	}
	
}
