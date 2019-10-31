import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import java.awt.Panel;
import java.util.Locale;
import javax.swing.JTabbedPane;


public class libraryGui extends JFrame {

	private JPanel contentPane;
	private final JTabbedPane jTabbedPanel = new JTabbedPane(JTabbedPane.TOP);
	private final JPanel panel = new JPanel();
	private final JPanel panel_1 = new JPanel();
	private final JPanel panel_2 = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					libraryGui frame = new libraryGui();
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
	public libraryGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 406);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		jTabbedPanel.setBounds(50, 38, 321, 255);
		
		contentPane.add(jTabbedPanel);
		
		
		createAPieGraph();
		createALineChartTab();
		creat4eABarChart();
	}
	private void createAPieGraph(){
		
		DefaultPieDataset data=new DefaultPieDataset();
		data.setValue("Principal Lecturer",5);
		data.setValue("Lecturer", 7);
		data.setValue("Administration", 2);
		
		JFreeChart chart=ChartFactory.createPieChart("Sample Pie Chart",data,true,true,Locale.ENGLISH);
		
		ChartPanel mypanel=new ChartPanel(chart);
		mypanel.setVisible(true);
		
		jTabbedPanel.add("Pie Graph",mypanel);
		
	}
	private void createALineChartTab()
	{
	XYSeries series1=new XYSeries("weight and exercise");
	series1.add(60,10);
	series1.add(55,140);
	series1.add(50,420);
	series1.add(52,300);
	series1.add(57,20);
	series1.add(65,5);
	
	XYSeriesCollection dataset=new XYSeriesCollection();
	dataset.addSeries(series1);
	
	JFreeChart chart=ChartFactory.createXYLineChart("Weight vs Excersize", "Kilograms", "Minutes",dataset,PlotOrientation.HORIZONTAL,true,true,true);
	XYPlot plot=chart.getXYPlot();
	
	NumberAxis domain=(NumberAxis) plot.getDomainAxis();
	domain.setRange(45,80);
	domain.setTickUnit(new NumberTickUnit(10));
	domain.setVerticalTickLabels(true);
	
	NumberAxis range=(NumberAxis) plot.getRangeAxis();
	range.setRange(0,450);
	range.setTickUnit(new NumberTickUnit(50));
	
	ChartPanel mypanel2=new ChartPanel(chart);
	jTabbedPanel.add("Line Graph",mypanel2);
	
	}
	
	private void creat4eABarChart()
	{
		DefaultCategoryDataset dataset=new DefaultCategoryDataset();
		dataset.addValue(70, "Java", "2007");
		dataset.addValue(75, "Java", "2008");
		dataset.addValue(80, "Java", "2009");
		dataset.addValue(87, "Java", "2010");
		dataset.addValue(90, "Java", "2011");
		
		JFreeChart chart=ChartFactory.createBarChart("Java Completion Rates", "years", "percentage", dataset,PlotOrientation.VERTICAL,true,true,false);
		ChartPanel mypanel3=new ChartPanel(chart);
		jTabbedPanel.add("Bar Graph",mypanel3);
		
	}
}
