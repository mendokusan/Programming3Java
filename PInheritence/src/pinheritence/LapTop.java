package pinheritence;

public class LapTop extends Computer {

	private static final String DEFAULT_MAN="HP";
	private double screenSize;
	private double weight;
	
	public LapTop(String manufacturer, String processor, int ramSize,int diskSize,double screenSize, double weight) {
		super(manufacturer,processor,ramSize,diskSize);
		this.screenSize = screenSize;
		this.weight = weight;
	}
	
	public LapTop(String processor, int ramSize, int diskSize, double screenSize, double weight) {
		super(DEFAULT_MAN,processor, ramSize, diskSize);
		this.screenSize = screenSize;
		this.weight = weight;
	}
	
	
	
	public double getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
	

}
