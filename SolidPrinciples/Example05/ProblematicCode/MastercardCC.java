package SolidPrinciples.Example05.ProblematicCode;

public class MastercardCC extends CreditCard {
    
    MastercardCC(String cardNumber, String cardHolderName, String expiryDate, String cvv) {
        super(cardNumber, cardHolderName, expiryDate, cvv);
    }

    @Override
    public void swipeAndPay() {
        System.out.println("Mastercard Credit Card: Swipe and Pay");
    }

    @Override
    public void doRefund() {
        System.out.println("Mastercard Credit Card: Do Refund");
    }

    @Override
    public void onlinePayment() {
        System.out.println("Mastercard Credit Card: Online Payment");
    }

    @Override
    public void tapAndPay() {
        System.out.println("Mastercard Credit Card: Tap and Pay");
    }

    @Override
    public void UPIPayment() {
        throw new UnsupportedOperationException("Mastercard Credit Card does not support UPI Payment");
    }
    
    @Override
    public void internationalPayment() {
        System.out.println("Mastercard Credit Card: International Payment");
    }

}
