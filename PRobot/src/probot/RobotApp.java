package probot;

public class RobotApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Making the robots. . .");
		
		Robot machine1=new Robot("r2d2","solar");
		Robot machine2=new Robot("c3p0","solar");
		
		System.out.println(machine1.getName()+" runs on "+machine1.getFuel());
		System.out.println(machine2.getName()+" runs on "+machine2.getFuel());

	}

}
