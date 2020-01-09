package section2;

public class PaybackCard extends Card {
    private int pointsEarned;
    private double totalAmount;

    public int getPointsEarned() {
        return pointsEarned;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setPointsEarned(int pointsEarned) {
        this.pointsEarned = pointsEarned;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public PaybackCard(String cardNumber, String holderName, String expiryDate, int pointsEarned,
            double totalAmount) {

        super(cardNumber, holderName, expiryDate);
        this.pointsEarned = pointsEarned;
        this.totalAmount = totalAmount;

    }

    void show() {
        System.out.println(holderName + "'s Payback Card Details: ");
        System.out.println("Card Number " + cardNumber);
        System.out.println("Points Earned " + pointsEarned);
        System.out.println("Total Amount " + totalAmount);
    }

}
