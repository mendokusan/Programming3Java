package pnameinstars;

import javax.swing.JOptionPane;

public class NameInStarsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//get the users name
		String userName=JOptionPane.showInputDialog("Name plase.");
		//Create a NameInStars object that stores the users name
		NameInStars you=new NameInStars(userName);
		//display the name
		JOptionPane.showMessageDialog(null,you.surroundNameInStars());
		

	}

}
