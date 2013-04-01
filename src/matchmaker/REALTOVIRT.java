//////////////////////////////////////////////////////////////////////
//WORLD OF TANKS-MATCHMAKINGCALCULATOR								//
//PROGRAMMERS: EOMAER; PSAIKO; EFERDI								//
//PROGRAMMINGENVIORNMENT: Eclipse IDE for Java Developers			//
//Version: Juno Service Release 2									//
//OS: Microsoft Windows [Version 6.0.6002]							//
//////////////////////////////////////////////////////////////////////
package matchmaker;
public class REALTOVIRT {
	int real;
	String cat;
	int v_min;
	int v_max;
	
	//construktoren
	REALTOVIRT(int r, String cat){
		this.set_real(r);
		this.set_cat(cat);
		switch(this.get_real()){
		case 1:
			switch(this.get_cat()){
			case "light":
				this.set_virt_max(2);
				this.set_virt_min(1);
				break;
			case "med":
				this.set_virt_max(2);
				this.set_virt_min(1);
				break;}
			break;
		case 2:
			switch(this.get_cat()){
			case "light":
				this.set_virt_max(3);
				this.set_virt_min(2);
				break;
			case "med":
				this.set_virt_max(3);
				this.set_virt_min(2);
				break;
			case "td":
				this.set_virt_max(3);
				this.set_virt_min(2);
				break;
			case "arty":
				this.set_virt_max(4);
				this.set_virt_min(3);
				break;
			}
			break;
		case 3:
			switch(this.get_cat()){
			case "light":
				this.set_virt_max(5);
				this.set_virt_min(3);
				break;
			case "med":
				this.set_virt_max(5);
				this.set_virt_min(3);
				break;
			case "td":
				this.set_virt_max(6);
				this.set_virt_min(4);
				break;
			case "arty":
				this.set_virt_max(5);
				this.set_virt_min(3);
				break;
			}
			break;
		case 4:
			switch(this.get_cat()){
			case "light":
				this.set_virt_max(8);
				this.set_virt_min(4);
				break;
			case "med":
				this.set_virt_max(6);
				this.set_virt_min(4);
				break;
			case "hvy":
				this.set_virt_max(5);
				this.set_virt_min(4);
				break;
			case "td":
				this.set_virt_max(6);
				this.set_virt_min(4);
				break;
			case "arty":
				this.set_virt_max(8);
				this.set_virt_min(5);
				break;
			}
			break;
		case 5:
			switch(this.get_cat()){
			case "light":
				this.set_virt_max(9);
				this.set_virt_min(6);
				break;
			case "med":
				this.set_virt_max(7);
				this.set_virt_min(5);
				break;
			case "hvy":
				this.set_virt_max(7);
				this.set_virt_min(5);
				break;
			case "td":
				this.set_virt_max(7);
				this.set_virt_min(5);
				break;
			case "arty":
				this.set_virt_max(9);
				this.set_virt_min(7);
				break;
			}
			break;
		case 6:
			switch(this.get_cat()){
			case "light":
				this.set_virt_max(10);
				this.set_virt_min(7);
				break;
			case "med":
				this.set_virt_max(8);
				this.set_virt_min(6);
				break;
			case "hvy":
				this.set_virt_max(8);
				this.set_virt_min(6);
				break;
			case "td":
				this.set_virt_max(8);
				this.set_virt_min(6);
				break;
			case "arty":
				this.set_virt_max(10);
				this.set_virt_min(9);
				break;
			}
			break;
		case 7:
			switch(this.get_cat()){
			case "light":
				this.set_virt_max(11);
				this.set_virt_min(8);
				break;
			case "med":
				this.set_virt_max(9);
				this.set_virt_min(7);
				break;
			case "hvy":
				this.set_virt_max(9);
				this.set_virt_min(7);
				break;
			case "td":
				this.set_virt_max(9);
				this.set_virt_min(7);
				break;
			case "arty":
				this.set_virt_max(10);
				this.set_virt_min(9);
				break;
			}
			break;
		case 8:
			switch(this.get_cat()){
			case "light":
				this.set_virt_max(12);
				this.set_virt_min(9);
				break;
			case "med":
				this.set_virt_max(10);
				this.set_virt_min(8);
				break;
			case "hvy":
				this.set_virt_max(10);
				this.set_virt_min(8);
				break;
			case "td":
				this.set_virt_max(10);
				this.set_virt_min(8);
				break;
			case "arty":
				this.set_virt_max(11);
				this.set_virt_min(10);
				break;
			}
			break;
		case 9:
			switch(this.get_cat()){
			case "light":
				this.set_virt_max(11);
				this.set_virt_min(9);
				break;
			case "med":
				this.set_virt_max(11);
				this.set_virt_min(9);
				break;
			case "hvy":
				this.set_virt_max(11);
				this.set_virt_min(9);
				break;
			case "td":
				this.set_virt_max(11);
				this.set_virt_min(9);
				break;
			case "arty":
				this.set_virt_max(11);
				this.set_virt_min(9);
				break;
			}
			break;
		case 10:
			switch(this.get_cat()){
			case "light":
				this.set_virt_max(12);
				this.set_virt_min(10);
				break;
			case "med":
				this.set_virt_max(12);
				this.set_virt_min(10);
				break;
			case "hvy":
				this.set_virt_max(12);
				this.set_virt_min(10);
				break;
			case "td":
				this.set_virt_max(12);
				this.set_virt_min(10);
				break;
			case "arty":
				this.set_virt_max(12);
				this.set_virt_min(10);
				break;
			}
			break;
		}
	}
	
	//set methoden
	public void set_real(int r){
		this.real=r;
	}
	public void set_cat(String cat){
		this.cat=cat;
	}
	public void set_virt_min(int v_min){
		this.v_min=v_min;
	}
	public void set_virt_max(int v_max){
		this.v_max=v_max;
	}

	//get methoden
	public  int get_real(){
		return this.real;
	}
	public int get_v_min(){
		return this.v_min;
	}
	public String get_cat(){
		return this.cat;
	}
	public int get_v_max(){
		return this.v_max;
	}
	public int[] get_all_int(){
		int[] ret=new int[3];
		ret[0]=this.get_real();
		ret[1]=this.get_v_min();
		ret[2]=this.get_v_max();
		return ret;
	}
	public String[] get_all(){
		String[] ret=new String[4];
		int[] get=this.get_all_int();
		ret[0]=String.valueOf(get[0]);
		ret[1]=this.cat;
		ret[2]=String.valueOf(get[1]);
		ret[3]=String.valueOf(get[2]);
		return ret;
	}
	
//		TEST: zum testweise anlegen der Panzertiers...
//		public static void main(String[] args){
//		realtovirt test=new realtovirt(5,"light");
//		realtovirt test2=new realtovirt(10,"med");
//		realtovirt test3=new realtovirt(4,"hvy");
//		realtovirt test4=new realtovirt(7,"td");
//		realtovirt test5=new realtovirt(6,"arty");
//		
//		System.out.println(" Tier: "+test.get_real()+"\n Category: "+test.get_cat()+"\n battletier min: "+test.get_v_min()+"\n battletier max: "+test.get_v_max()+"\n\n");
//		System.out.println(" Tier: "+test2.get_real()+"\n Category: "+test2.get_cat()+"\n battletier min: "+test2.get_v_min()+"\n battletier max: "+test2.get_v_max()+"\n\n");
//		System.out.println(" Tier: "+test3.get_real()+"\n Category: "+test3.get_cat()+"\n battletier min: "+test3.get_v_min()+"\n battletier max: "+test3.get_v_max()+"\n\n");
//		System.out.println(" Tier: "+test4.get_real()+"\n Category: "+test4.get_cat()+"\n battletier min: "+test4.get_v_min()+"\n battletier max: "+test4.get_v_max()+"\n\n");
//		System.out.println(" Tier: "+test5.get_real()+"\n Category: "+test5.get_cat()+"\n battletier min: "+test5.get_v_min()+"\n battletier max: "+test5.get_v_max()+"\n\n");
//	}
}
