
package Condition;
import java.util.Scanner;




public class SwitchBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
System.out.println("Enter first number:");
double num1 = scanner.nextDouble();

System.out.println("Enter second number:");
double num2 = scanner.nextDouble();

System.out.println("Enter an operator (+, -, *, /):");
char operator = scanner.next().charAt(0);

double result;

switch (operator) {
    case '+':
        result = num1 + num2;
        break;
    case '-':
        result = num1 - num2;
        break;
    case '*':
        result = num1 * num2;
        break;
    case '/':
        if (num2 != 0) {
            result = num1 / num2;
        } else {
            System.out.println("Error! Division by zero.");
            return; // Use return to exit the method if division by zero
        }
        break;
    default:
        System.out.println("Invalid operator!");
        return; // Exit the method if the operator is invalid
}

System.out.println("The result is: " + result);
scanner.close();
	}

}
