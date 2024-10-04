package Assesment;

import java.util.Scanner;

public class Airthmatic {

	public static  void main(String[] args) {
		// TODO Auto-generated method stub

		int num1,num2,num3;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the first number");
		num1=scanner.nextInt();
		
		
		System.out.println("enter the second number");
		num2=scanner.nextInt();
		
		
		System.out.println("enter the third number");
	    num3=scanner.nextInt();
	
	int sum = num1+num2+num3;
	int sub = num1-num2-num3;
	int mul = num1*num2*num3;
	double div = num1/num2/num3;
	
	System.out.println("sum:"+sum);
	System.out.println("sub:"+sub);
	System.out.println("sum:"+mul);
	System.out.println("sum:"+div);
	scanner.close();

	
	
	
	
	
	
	
	}

}
