package psalary;

public class Salary {
	private double gross;
	public Salary(double gross)
	{
		this.gross=gross;
	}
	public double getGross()
	{
		return gross;
	}
	public void setGross(double gross)
	{
		this.gross=gross;
	}
	public double getTax()
	{
		double tax=0;
		if(gross>10000)
		{
			tax=(gross=70000)*0.33
					+22000*0.3
					+34000*0.175
					+14000*0.105;
			return tax;

		}
		else if(gross>48000)
		{
			tax=(gross-48000)*0.3
					+34000*0.175
					+14000*0.105;
			return tax;

		}
		else if(gross>14001)
		{
			tax=(gross-14001)*0.175
					+34000*0.175
					+14000*0.105;
		}
		return tax;
							
	}
	double getNet()
	{
		return gross;
	}

}
