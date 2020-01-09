package section2;

public abstract class Card {
    String holderName;
    String cardNumber;
    String expiryDate;

    public String getCardNumber() {
        return cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public Card(String holderName, String cardNumber, String expiryDate) {
        this.cardNumber = cardNumber;
        this.holderName = holderName;
        this.expiryDate = expiryDate;

    }

}
