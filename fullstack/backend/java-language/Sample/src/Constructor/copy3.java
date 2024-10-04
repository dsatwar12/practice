package Constructor;

public class copy3 {
	
	copy3()
	{
		this(5);
		System.out.println("Hello , Default Constructor");
	}
	
	copy3(int x)
	{
		this(5,15);
		System.out.println(x);
	}
	
	copy3(int x,int y)
	{
		System.out.println(x*y);
	}

	public static void main(String[] args) {
		new copy3();
	}

}
