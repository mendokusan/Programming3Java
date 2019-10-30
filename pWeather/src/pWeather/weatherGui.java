package pWeather;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class weatherGui extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup temp = new ButtonGroup();
	private final ButtonGroup humidity = new ButtonGroup();
	private final ButtonGroup weather = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					weatherGui frame = new weatherGui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public weatherGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 486, 341);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.controlHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdbtnMild = new JRadioButton("Mild");
		temp.add(rdbtnMild);
		rdbtnMild.setBounds(120, 5, 84, 23);
		contentPane.add(rdbtnMild);

		
		JRadioButton rdbtnCold = new JRadioButton("Cold");
		temp.add(rdbtnCold);
		rdbtnCold.setBounds(6, 5, 109, 23);
		contentPane.add(rdbtnCold);
		rdbtnCold.setActionCommand("Cold");
		
		JRadioButton rdbtnHot = new JRadioButton("Hot");
		temp.add(rdbtnHot);
		rdbtnHot.setBounds(232, 5, 109, 23);
		contentPane.add(rdbtnHot);

		
		JRadioButton rdbtnDry = new JRadioButton("Dry");
		humidity.add(rdbtnDry);
		rdbtnDry.setBounds(6, 58, 109, 23);
		contentPane.add(rdbtnDry);
		
		JRadioButton rdbtnWet = new JRadioButton("Wet");
		humidity.add(rdbtnWet);
		rdbtnWet.setBounds(120, 58, 109, 23);
		contentPane.add(rdbtnWet);
		
		JRadioButton rdbtnRain = new JRadioButton("Rain");
		weather.add(rdbtnRain);
		rdbtnRain.setBounds(6, 103, 109, 23);
		contentPane.add(rdbtnRain);
		
		JRadioButton rdbtnSnow = new JRadioButton("Snow");
		weather.add(rdbtnSnow);
		rdbtnSnow.setBounds(120, 103, 109, 23);
		contentPane.add(rdbtnSnow);
		
		rdbtnCold.setActionCommand("Cold");
		rdbtnMild.setActionCommand("Mild");
		rdbtnHot.setActionCommand("Hot");
		rdbtnDry.setActionCommand("Dry");
		rdbtnWet.setActionCommand("Wet");
		rdbtnRain.setActionCommand("Rain");
		rdbtnSnow.setActionCommand("Snow");
		
		JButton btnShowConditions = new JButton("Show Conditions");
		btnShowConditions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JTextArea textarea=new JTextArea();
				textarea.append(temp.getSelection().getActionCommand());
				textarea.append(humidity.getSelection().getActionCommand());
				textarea.append(humidity.getSelection().getActionCommand());			
				}
			
		});
		btnShowConditions.setBounds(305, 249, 139, 23);
		contentPane.add(btnShowConditions);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(Color.WHITE);
		textArea.setBounds(182, 150, -156, 141);
		contentPane.add(textArea);
		
		JTextArea textArea2 = new JTextArea();
		textArea2.setBackground(SystemColor.inactiveCaptionBorder);
		textArea2.setBounds(10, 150, 162, 111);
		contentPane.add(textArea2);
	}
}
