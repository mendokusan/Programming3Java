package pphonebook;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class PhoneApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Person> people=new ArrayList<>();
		String last;
		String first;
		String phone;
		String title;
		String room;
		File text=new File("Phone.csv");
		
		Scanner scan;
		try {
			scan = new Scanner(text);
			while(scan.hasNextLine())
			{
				String line=scan.nextLine();
				String[]fields=line.split(",");
				last=fields[0];
				first=fields[1];
				room=fields[2];
				title=fields[3];
				phone=fields[4];
				people.add(new Person(last,first,room,title,phone));
			}
		}
		
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	Collections.sort(people);
		System.out.println(people);

	}

}
