package package1;

public class Fibonachi {
	
	private int a;
	private int b;
	private int c;
	
	public Fibonachi()
	{
		a = 0;
		b = 1;
		c = 1;		
	}
	
	public int GetFibonachi(int count)
	{	
		a = 0;
		b = 1;
		c = 1;	

		for (int i = 1; i <= count; i++) {
			a = b;
			b = c;
			c = a + b;
		}
		
		
		return c;
	}
}
