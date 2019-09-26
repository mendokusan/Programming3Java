package pfriend;

import java.util.Arrays;

public class ThreeWaysApp {
	
	public static void main(String[]args)
	{
		Friend f1=new Friend("None","Existent",1999,7,25,Gender.Other,"Neverland","anemail@gmail.com",Relationship.Single);
		Friend f2=new Friend("Some","Ghost",1999,9,25);
		Friend f3=new Friend("Another","Individual");
		Friend f4=new Friend("Other","Friend");
		Friend f5=new Friend("Another","Ghost",2000,8,5,Gender.Female,"Neverland","anemail@gmail.com",Relationship.Single);
		Friend f6=new Friend("Null","Person",1987,7,3,Gender.Male,"Neverland","anemail@gmail.com",Relationship.Single);


		
		Friend[] friends= {f1,f2,f3,f4,f5,f6};
		
		GenderCompare gc=new GenderCompare();
		
		AgeCompare ac=new AgeCompare();
		
		
		//Arrays.sort(friends,new GenderCompare());
		
		
		//right clock-source-auto generate get and sets
		Arrays.sort(friends,ac);
		
		for(Friend item:friends)
		{
			System.out.println(item);
		}

		
	}

}
