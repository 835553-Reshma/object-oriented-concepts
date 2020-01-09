package section2;

import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String holderName;
        String cardNumber;
        String expiryDate;
        System.out.println("Select the Card ");
        System.out.println("1.Payback Card \n2.Membership Card ");
        int choice = sc.nextInt();
        sc.nextLine();
        if (choice == 1) {
            System.out.println("Enter the Card Details: ");
            String[] details = sc.nextLine().split("\\|");
            holderName = details[0];
            cardNumber = details[1];
            expiryDate = details[2];
            System.out.println("Enter points in card ");
            int pointsEarned = sc.nextInt();
            System.out.println("Enter Amount ");
            double totalAmount = sc.nextDouble();
            PaybackCard pay = new PaybackCard(cardNumber, holderName, expiryDate, pointsEarned,
                    totalAmount);
            pay.show();
        }
        if (choice == 2) {
            System.out.println("Enter the Card Details: ");
            String[] details = sc.nextLine().split("\\|");
            holderName = details[0];
            cardNumber = details[1];
            expiryDate = details[2];
            System.out.println("Enter rating in card ");
            int rating = sc.nextInt();

            MembershipCard member = new MembershipCard(cardNumber, holderName, expiryDate, rating);
            member.display();
        }

        sc.close();

    }

}
