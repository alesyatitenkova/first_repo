package BankCard;

public class CreditCard extends Card {

    private CardProject cardProject;
    private Integer cvv;

    public CreditCard(String cardNumber, Integer pin, Boolean nfc, CardType cardType,
                      String cardHolderName, CardProject cardProject, Integer cvv) {
        super(cardNumber, pin, nfc, cardType, cardHolderName);
        this.cardProject = cardProject;
        this.cvv = cvv;
    }

    public CardProject getCardProject() {
        return cardProject;
    }

    public void setCardProject(CardProject cardProject) {
        this.cardProject = cardProject;
    }

    public Integer getCvv() {
        return cvv;
    }

    public void setCvv(Integer cvv) {
        this.cvv = cvv;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "cardProject=" + cardProject +
                ", cvv=" + cvv +
                '}' + super.toString();
    }
}
