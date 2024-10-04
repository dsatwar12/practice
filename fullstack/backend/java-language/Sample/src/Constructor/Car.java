package Constructor;

public class Car {
	
	String brand;
	int year;
	Car(String b,int y){
		brand=b;
		year=y;
	}
	void display() {
		System.out.println("Brand:"+brand+",Year:"+year);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car c1=new Car("BMW",2000);
Car c2=new Car("Audi",1958);
c1.display();
c2.display();
	}

}
