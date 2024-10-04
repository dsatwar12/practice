package Constructor;
import java.io.*;

class demo{
	demo(String name)
	{
		System.out.println("This Constructor is with only one Parameter::"+name);
	}
	demo(String name, int age)
	{
		System.out.println("This Constructor is with only two Parameter::"+name+" "+age);
	}
	
	demo(long id)
	{
		System.out.println("This Constructor is with only one long Parameter::"+id);
	}
}

public class cnst2 {

	public static void main(String[] args) {
	    demo d1=new demo("Sam");
	    demo d2=new demo("Max",25);
	    demo d3=new demo(325614567);

	}

}
