package Constructor;

public class Student {
	
	
	
	String name;
	int age;
	
	
	Student(){
	name="john";
	age=18;



	}
void display() {
System.out.println("name:"+name+",Age:"+age);}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		s1.display();
	
	
}
}
