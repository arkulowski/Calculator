import java.util.Scanner;
public class Calculator {

    public static void main(String[] args){

    


    Scanner input = new Scanner(System.in);

    System.out.print("Enter the first whole number: ");
    int num1 = input.nextInt();

    System.out.print("Enter the second whole number: ");
    int num2 = input.nextInt();

    int sum = num1 + num2;
    System.out.println("The result of adding the two numbers is: " + sum);
  }
}

    
