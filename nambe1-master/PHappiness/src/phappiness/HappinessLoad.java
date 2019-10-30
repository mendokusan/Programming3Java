package phappiness;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HappinessLoad {

	public static void load(ArrayList<Countries> countries) {
		String country;
		double gdp;
		double socialSupport;
		double lifeExpectancy;
		double freedom;
		double generosity;
		double preseptionsOfCorruption;
		double dystopia;
		Scanner scan;
		File text=new File("happiness2017.csv");
		try {
			scan=new Scanner(text);
			int i=0;
			while(scan.hasNextLine())
			{
				System.out.println(i);
				String line=scan.nextLine();
				String[]fields=line.split(",");
				country=fields[0];
				gdp= Double.parseDouble(fields[1]);
				socialSupport= Double.parseDouble(fields[2]);
				lifeExpectancy= Double.parseDouble(fields[3]);
				freedom= Double.parseDouble(fields[4]);
				generosity= Double.parseDouble(fields[5]);
				preseptionsOfCorruption= Double.parseDouble(fields[6]);
				dystopia= Double.parseDouble(fields[7]);
				countries.add(new Countries(country,gdp,socialSupport,
				lifeExpectancy,freedom,generosity,preseptionsOfCorruption,dystopia));
				
			}
			
		}
		
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Collections.sort(countries);
		System.out.println(countries);
		


	}

}
