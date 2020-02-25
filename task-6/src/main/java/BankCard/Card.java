package BankCard;

public class Card {

    private String cardNumber;
    private Integer pin;
    private Boolean nfc;
    private CardType cardType;
    private String cardHolderName;

    public Card(String cardNumber, Integer pin, Boolean nfc, CardType cardType, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.nfc = nfc;
        this.cardType = cardType;
        this.cardHolderName = cardHolderName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Integer getPin() {
        return pin;
    }

    public void setPin(Integer pin) {
        this.pin = pin;
    }

    public Boolean getNfc() {
        return nfc;
    }

    public void setNfc(Boolean nfc) {
        this.nfc = nfc;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardNumber='" + cardNumber + '\'' +
                ", pin=" + pin +
                ", nfc=" + nfc +
                ", cardType=" + cardType +
                ", cardHolderName='" + cardHolderName + '\'' +
                '}';
    }
}
