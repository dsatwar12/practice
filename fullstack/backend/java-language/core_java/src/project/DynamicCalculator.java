package project;

import java.util.Scanner;

public class DynamicCalculator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
	
	System.out.println("enter number 1");
	
	int a=sc.nextInt();
	System.out.println("enter number 2");
	int b=sc.nextInt();
	int sum=(a+b);
	System.out.println("sum is"+sum);
	int sub=(a-b);
	System.out.println("substraction is"+sub);
	int mul=(a*b);
	System.out.println("multiplication is"+mul);
	int div=(a/b);
	System.out.println("division is"+div);
	
	
	
	
	}

}