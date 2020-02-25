package BankCard;

public class Runner {

    public static void main(String[] args) {
        Card debitCard = new DebitCard("132123123", 1234, false,
                CardType.MAESTRO, "Debit holder name");
        System.out.println(debitCard);
        Card creditCard = new CreditCard("321321321", 4321, true,
                CardType.VISA, "Credit holder name", CardProject.GOLD, 123);
        System.out.println(creditCard);
        Card creditCard2 = new CreditCard("456745674567", 4434, true,
                CardType.VISA, "Credit holder name", CardProject.PLATINUM, 333);
        System.out.println(creditCard2);
    }
}
