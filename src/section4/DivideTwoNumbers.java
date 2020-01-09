package section4;

import java.util.Scanner;

public class DivideTwoNumbers {

    public static void main(String[] args) {
        int x, y;

        Scanner sc = new Scanner(System.in);
        try {
            System.out.println(" Enter the 2 numbers  ");
            x = sc.nextInt();
            y = sc.nextInt();
            System.out.println("The quotient of " + x + " / " + y + " = " + (x / y));
        } catch (ArithmeticException e) {
            System.out.println("DivideByZeroException caught ");
        } finally {
            System.out.println("Inside finally block ");
            sc.close();
        }

    }

}
