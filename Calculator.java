import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first whole number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second whole number: ");
        int num2 = input.nextInt();

        System.out.print("Do you want to add or subtract the numbers? Enter 'add' or 'subtract': ");
        String operation = input.next();

        int result;
        if (operation.equals("add")) {
            result = num1 + num2;
            System.out.println("The sum of " + num1 + " and " + num2 + " is " + result);
        } else if (operation.equals("subtract")) {
            result = num1 - num2;
            System.out.println("The difference between " + num1 + " and " + num2 + " is " + result);
        } else {
            System.out.println("Invalid operation entered.");
        }
    }
}

    
