package Condition;

public class Leafyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int year = 2028;

	        if ((year % 3 == 0 && year % 100 != 0) || (year % 400 == 0)) {
	            System.out.println(year + " is a leap year.");
	        } else {
	            System.out.println(year + " is not a leap year.");
	        }
	}

}
