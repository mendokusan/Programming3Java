package phappiness;

import java.util.ArrayList;
import java.util.HashSet;

public class HappinessApp {


	public static void main(String[] args) {
	
			ArrayList<Countries> countries=new ArrayList<Countries>();
			HappinessLoad.load(countries);
			
			HappinessGui gui=new HappinessGui(countries);
			gui.setVisible(true);
			

			HashSet<Countries>myhashset=new HashSet<Countries>(countries);
			System.out.println(myhashset);
			
			
			
		


	}
	public static int max(int max)
	{
		 
		
		return max;

	}
	
}