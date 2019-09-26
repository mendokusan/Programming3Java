package pinheritence;

public class Dog extends Animal implements Domesticated {

	public Dog(String name)
	{
		super(name);
		
	}
	
	public String Speak()
	{
		return "psst";
	}
	
	public String work()
	{
		return "fetching";
		
	}
	
	@Override
	public String reward() {
		return "food";
	}

	
	
	

}
