package probot;

public class Robot {
	private String name;
	private String fuel;
	
	public Robot(String name,String fuel)
	{
		this.name=name;
		this.fuel=fuel;
		//if pretend there is data checking use setName(name); instead.

	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;		
	}
	public String getFuel()
	{
		return fuel;
	}
	public void setFuel(String fuel)
	{
		this.fuel=fuel;
	}



}
