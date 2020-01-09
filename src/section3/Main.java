package section3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the product id ");
        long id = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter the product name");
        String productName = sc.nextLine();
        System.out.println("Enter the supplier name");
        String supplierName = sc.nextLine();
        Product p = new Product(id, productName, supplierName);
        System.out.println(p.toString());
        System.out.println("Invoking getClass() method:class " + p.getClass().getSimpleName());

        sc.close();

    }

}
