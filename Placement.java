import java.lang.*;
import java.util.*;

class CalcPlacement{
	private int cse,ecs,mech;
	public CalcPlacement(int cse,int ecs,int mech){
		this.cse = cse;
		this.ecs = ecs;
		this.mech = mech;

	}
	public String checkRank(){
		if((this.cse == this.ecs) && (this.mech == this.cse )){
			return "None of the department has got the higher placement";
		}
		else if((this.cse > this.ecs) && (this.cse > this.mech)){
			return "CSE";
		}
		else if((this.ecs > this.cse) && (this.ecs > this.mech)){
			return "ECS";
		}
		else{
			return "MECH";
		}
	}
}

class Placement{
	public static void main(String[] args) {
		try{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number of student place in CSE");
			int cse = sc.nextInt();
			System.out.println("Enter number of student place in ECS");
			int ecs = sc.nextInt();
			System.out.println("Enter number of student place in MECH");
			int mech = sc.nextInt();
			if(cse < 0 || ecs < 0 || mech < 0){
				System.out.println("Input is Invalid");
				System.exit(0);
			}
			CalcPlacement cobj = new CalcPlacement(cse,ecs,mech);
			String str = cobj.checkRank();
			System.out.println("Highest Placement\n"+str);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}