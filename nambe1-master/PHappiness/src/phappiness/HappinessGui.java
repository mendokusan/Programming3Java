package phappiness;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;

public class HappinessGui extends JFrame implements ActionListener {
	//data fields
	private ArrayList<Countries>countries;
	private JPanel contentPane;
	 

	 private JTable table_1;
	 private DefaultTableModel tm = new DefaultTableModel(
				new Object[][] {
					{null, null, null, null, null, null, null, null},
				},
				new String[] {
					"New column", "Country", "GDP", "freedom", "Social Support", "Generosity", "Perception Of Corruption", "Dystopia"
				}
			);
	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public HappinessGui(ArrayList<Countries>countries) {
		super("Happiness Index");
		this.countries=countries;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 414, 239);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("New tab", null, panel, null);
		
		JPanel table = new JPanel();
		tabbedPane.addTab("Table", null, table, null);
		table.setLayout(null);
		
		JLabel lblAllCountries = new JLabel("All Countries");
		lblAllCountries.setBounds(10, 11, 63, 14);
		table.add(lblAllCountries);
		
		table_1 = new JTable();
		table_1.setModel(tm);
		table_1.getColumnModel().getColumn(6).setPreferredWidth(133);
		table_1.setBounds(20, 36, 379, 164);
		table.add(table_1);
	drawTable();
		
	}
	


	public void drawTable()
	{
		int listCount=countries.size();
		tm.setRowCount(0);
		for(int i=0;i<listCount;i++)
		{
			Object[] object=new Object[8];
			object[0]=countries.get(i).getCountry();
			object[1]=countries.get(i).getGdp();
			object[2]=countries.get(i).getSocialSupport();
			object[3]=countries.get(i).getLifeExpectancy();
			object[4]=countries.get(i).getFreedom();
			object[5]=countries.get(i).getPreseptionsOfCorruption();
			object[6]=countries.get(i).getDystopia();
			object[7]=countries.get(i).getGenerosity();
			tm.addRow(object);
		
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
