package pinheritence;

public class Horse extends Animal implements Domesticated {

	public Horse(String name) {
		super(name);
	}

	@Override
	public String work() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String reward() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return super.getType();
	}

	@Override
	public void setType(String type) {
		// TODO Auto-generated method stub
		super.setType(type);
	}

	@Override
	public String speak() {
		// TODO Auto-generated method stub
		return super.speak();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
