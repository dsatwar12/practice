package Constructor;

public class StaticConst {
	int rollno;
	String name;
	static String dept =  "Electronics";
	StaticConst(int r,String n)
	{
		rollno = r;name = n;
	}
	void disp()
	{
		System.out.println(rollno +" "+name+ " "+dept);
	}
	
	public static void main(String[] args) {
		StaticConst s1 = new StaticConst(101,"dep");
		StaticConst s2 = new StaticConst(102,"prai");
	
		/*StaticConst.dept="cs";*/
		s1.disp();
		s2.disp();
		
	}

}


