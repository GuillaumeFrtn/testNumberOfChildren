package test;

public class Generate1 implements Interface1{
	
	private int number;
	
	public Generate1() {
		this.number = 1;
	}

	@Override
	public int getNumber() {
		return number;
	}

}
