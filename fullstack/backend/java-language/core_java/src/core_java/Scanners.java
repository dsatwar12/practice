package core_java;

import java.util.Scanner;
 

public class Scanners {

	public static void main(String[] args) {
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Float Value::");
		float f1=s1.nextFloat();
		System.out.println("Float Value is::"+f1);
		
		
		
		System.out.println("Enter Double Value::");
		double d1=s1.nextDouble();
		System.out.println("DOuble Value is::"+d1);
		
		
		
		
		
		System.out.println("Enter String Value::");
		String str1=s1.next();
		System.out.println("String Value is::"+str1);
		
		
		
		
		System.out.println("Enter Integer Value::");
		Integer i1=s1.nextInt();
		System.out.println("Integer Value is::"+i1);
		
		
		
		// TODO Auto-generated method stub
		int a=10;
		float b=2.3f;
		double c=2.333;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}

}
