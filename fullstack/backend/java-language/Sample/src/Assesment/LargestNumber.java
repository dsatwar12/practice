package Assesment;

import java.util.Scanner;


public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the first number");
		int num1=scanner.nextInt();
		System.out.println("enter the second number");
		int num2=scanner.nextInt();
		System.out.println("eneter the third number");
		int num3=scanner.nextInt();
		
		
		int largest;
		if (num1 >= num2 && num1 > num3)
		{
			largest = num1;
		}
		else if (num2 >= num1 && num2 >= num3)
		{
			largest =num2;
		}
		else
		{
			largest=num3;
		}
		System.out.println("the largest number is :"+largest);
		scanner.close();
	}

}
