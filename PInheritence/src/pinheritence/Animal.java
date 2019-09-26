package pinheritence;

public abstract class Animal {
	
	protected String name;
	protected String type;
	
	
	public Animal(String name) {
		super();
		this.name = name;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public String speak()
	{
		return "";
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", type=" + type + "]";
	}
	
	
	
	
	

}
