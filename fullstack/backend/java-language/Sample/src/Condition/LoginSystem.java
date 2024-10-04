package Condition;

import java.util.Scanner;


public class LoginSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
String correctUsername = "user";
String correctPassword = "pass";

System.out.println("Enter username:");
String username = scanner.nextLine();

System.out.println("Enter password:");
String password = scanner.nextLine();

if (username.equals(correctUsername) && password.equals(correctPassword)) {
    System.out.println("Login successful!");
} else {
    System.out.println("Invalid username or password.");
}

scanner.close();

	}

}
