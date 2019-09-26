import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SimpleGUI extends JFrame implements ActionListener {
	private JButton yes;
	private JButton no;
	private JLabel label;
	private JPanel back;
	private JTextArea text;
	
	public SimpleGUI()

	{
		yes= new JButton("Yes");
		no= new JButton("No");
		label=new JLabel("Click for yes or no");
		back=new JPanel();
		text=new JTextArea(10,10);
		Container cp=getContentPane();
		
		//Add the buttons to the panel
		back.add(no);
		back.add(yes);
		cp.add(text);
		cp.add(label);
		cp.add(back);
		cp.setLayout(new FlowLayout());
		yes.addActionListener(this);
		no.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object buttonPressed=e.getSource();
		
		if (buttonPressed==yes)
		{
			text.append("Yes button pressed.");
		}
		else
		{
			text.append("No button pressed.");
		}
				
		
	}
	

	

	

}
