package Constructor;

public class Employee {
	String name;
	int id;
	String department;
	Employee(){
		name="unknown";
		id=0;
		department="Not Asigned";
	}
	Employee(String n,int i){
		name=n;
		id=i;
		String d = null;
		department=d;
		
	}
	public Employee(String string, int i, String string2) {
		// TODO Auto-generated constructor stub
	}
	void display() {
		System.out.println("Name:"+name+",ID:"+id+",Department:"+department);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee e1=new Employee();
Employee e2=new Employee("Alice",101);
Employee e3=new Employee("deeps",102,"HR");
e1.display();
e2.display();
e3.display();

	}

}
