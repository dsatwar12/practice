package Constructor;
public class stst1 {

	
	int rollno;
	String name;
	
	static String dept="Computers";
	
	stst1(int r, String n)
	{
		rollno=r;
		name=n;
	}
	
	void disp()
	{
		System.out.println(rollno + " " +name+" "+ dept);
	}
	public static void main(String[] args) {
		stst1 s1=new stst1(101,"Sam");
		stst1 s2=new stst1(102,"Max");
		
		stst1.dept="IT";
		
		s1.disp();
		s2.disp();

	}

}