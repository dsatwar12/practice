package Assesment;

import java.util.Scanner;

public class SwapNumbrs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
System.out.println("eneter the first number");
int a=scanner.nextInt();
System.out.println("eneter the second number");
int b=scanner.nextInt();
System.out.println("before swaming:a="+a+",b=+b+");
a=a+b;
b=a-b;
System.out.println("aftr swaming:a="+a+",b=+b+");
scanner.close();
	}

}
