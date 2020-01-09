package section3;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long id = 0;
        String productName = null;
        String supplierName = null;
        System.out.println("Enter the product id");
        id = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter the product name");
        productName = sc.nextLine();
        System.out.println("Enter the supplier name");
        supplierName = sc.nextLine();
        Product1 p = new Product1(id, productName, supplierName);
        p.display();
        System.out.println("Enter the product id");
        id = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter the product name");
        productName = sc.nextLine();
        System.out.println("Enter the supplier name");
        supplierName = sc.nextLine();
        Product1 p1 = new Product1(id, productName, supplierName);
        p1.display();
        if (p.equals(p1)) {
            System.out.println("The two products are the same");
        } else {
            System.out.println("The two products are different");
        }

        sc.close();

    }

}
