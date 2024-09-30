package student;

import java.util.Scanner;
public class Calculator {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter first number: ");
double num1 = scanner.nextDouble();
System.out.print("Enter second number: ");
double num2 = scanner.nextDouble();
System.out.print("Enter an operator (+, -, *, /, %): ");
char operator = scanner.next().charAt(0);
double result = 0;
boolean validOperation = true;
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
try {
result = num1 / num2;
} catch (ArithmeticException e) {
System.out.println("Error: Division by zero.");
validOperation = false;
}
break;
case '%':
try {
result = num1 % num2;
} catch (ArithmeticException e) {
System.out.println("Error: Modulo by zero.");
validOperation = false;
}
break;
default:
System.out.println("Invalid operator");
validOperation = false;
}
if (validOperation) {
System.out.println("Result: " + result);
}
}
}
