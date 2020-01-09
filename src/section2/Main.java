package section2;

import java.util.Scanner;

import section1.Circle;
import section1.Rectangle;
import section1.Square;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Rectangle \n2. Square \n3. Circle \n4.Hexagon");
        System.out.println("Area Calculator --- Choose your shape ");
        int choose = sc.nextInt();
        switch (choose) {
        case 1:
            System.out.println("Enter length and breadth: ");
            int length = sc.nextInt();
            int breadth = sc.nextInt();
            Rectangle r = new Rectangle(length, breadth, "Rectangle");
            System.out.printf("Area of Rectangle is:%.2f", r.calculateArea());
            break;
        case 2:
            System.out.println("Enter side: ");
            int side = sc.nextInt();
            Square s = new Square(side, "Square");
            System.out.printf("Area of Square is:%.2f", s.calculateArea());
            break;
        case 3:
            System.out.println("Enter Radius: ");
            int radius = sc.nextInt();
            Circle c = new Circle(radius, "Circle");
            System.out.printf("Area of Circle is:%.2f", c.calculateArea());
            break;
        case 4:
            System.out.println("Enter Side: ");
            int side1 = sc.nextInt();
            Hexagon h = new Hexagon("Hexagon", side1);
            System.out.printf("Area of Hexagon is: %.2f", h.calculateArea());
            break;
        default:
            System.out.println("Choose an appropriate number");

        }

        sc.close();
    }

}
