package pmyfirst;

import java.util.Random;

public class MyFirstApp {
	private static int  number;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("My first line");
		System.out.println(Math.PI);
		//print out 5 more methods from the math class
		Random generator=new Random();
		int dice=(generator.nextInt(6)+1);
		System.out.println("Number is a static class variable.");
		int number=5;
		//declare a local method variable called number2

	}

}
