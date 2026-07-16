package SolidPrinciples.Example06.ProblematicCode;

public class RupayCC extends CreditCard {
    
    RupayCC(String cardNumber, String cardHolderName, String expiryDate, String cvv) {
        super(cardNumber, cardHolderName, expiryDate, cvv);
    }

    @Override
    public void swipeAndPay() {
        System.out.println("Rupay Credit Card: Swipe and Pay");
    }

    @Override
    public void doRefund() {
        System.out.println("Rupay Credit Card: Do Refund");
    }

    @Override
    public void onlinePayment() {
        System.out.println("Rupay Credit Card: Online Payment");
    }

    @Override
    public void tapAndPay() {
        System.out.println("Rupay Credit Card: Tap and Pay");
    }

    @Override
    public void UPIPayment() {
        System.out.println("Rupay Credit Card: UPI Payment");
    }
    
    @Override
    public void internationalPayment() {
        System.out.println("Rupay Credit Card: International Payment");
    }

}
