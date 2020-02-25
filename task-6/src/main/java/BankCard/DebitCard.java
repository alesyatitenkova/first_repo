package BankCard;

public class DebitCard extends Card {

    public DebitCard(String cardNumber, Integer pin, Boolean nfc, CardType cardType, String cardHolderName) {
        super(cardNumber, pin, nfc, cardType, cardHolderName);
    }

    @Override
    public String toString() {
        return "DebitCard{}" + super.toString();
    }
}
