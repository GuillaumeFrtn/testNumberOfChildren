package test;

public class Main 
{	
	public static void main(String[] args) 
	{
		Interface1 g1 = new Generate1();
		Interface2 g2 = new Generate2();
		Interface3 g3 = new Generate3();
		Interface4 g4 = new Generate4();
		Interface5 g5 = new Generate5();
		Interface6 g6 = new Generate6();
		Interface7 g7 = new Generate7();
		Interface8 g8 = new Generate8();
		Interface9 g9 = new Generate9();
		Interface10 g10 = new Generate10();

		for(int j=0; j<10000000; ++j)
		{
			g1 = new Generate1();
			g2 = new Generate2();
			g3 = new Generate3();
			g4 = new Generate4();
			g5 = new Generate5();
			g6 = new Generate6();
			g7 = new Generate7();
			g8 = new Generate8();
			g9 = new Generate9();
			g10 = new Generate10();
		}
	}
}
