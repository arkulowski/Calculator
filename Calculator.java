import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first whole number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second whole number: ");
        int num2 = input.nextInt();

        System.out.print("Enter the operation you want to perform (+, -, *, /): ");
        String operation = input.next();

        double result;
        if (operation.equals("+")) {
            result = num1 + num2;
            System.out.println("The sum of " + num1 + " and " + num2 + " is " + result);
        } else if (operation.equals("-")) {
            result = num1 - num2;
            System.out.println("The difference between " + num1 + " and " + num2 + " is " + result);
        } else if (operation.equals("*")) {
            result = num1 * num2;
            System.out.println("The product of " + num1 + " and " + num2 + " is " + result);
        } else if (operation.equals("/")) {
            if (num2 == 0) {
                System.out.println("Cannot divide by zero.");
            } else {
                result = (double) num1 / num2;
                System.out.println("The quotient of " + num1 + " and " + num2 + " is " + result);
            }
        } else {
            System.out.println("Invalid operation entered.");
        }
    }
}

    
