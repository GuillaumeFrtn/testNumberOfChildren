package test;

public class Generate3 implements Interface3 {
	
	private int number;
	
	public Generate3() {
		this.number = 3;
	}

	@Override
	public int getNumber() {
		return number;
	}

}
