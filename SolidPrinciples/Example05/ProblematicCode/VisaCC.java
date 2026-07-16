package SolidPrinciples.Example05.ProblematicCode;

public class VisaCC extends CreditCard {
    
    VisaCC(String cardNumber, String cardHolderName, String expiryDate, String cvv) {
        super(cardNumber, cardHolderName, expiryDate, cvv);
    }

    @Override
    public void swipeAndPay() {
        System.out.println("Visa Credit Card: Swipe and Pay");
    }

    @Override
    public void doRefund() {
        System.out.println("Visa Credit Card: Do Refund");
    }

    @Override
    public void onlinePayment() {
        System.out.println("Visa Credit Card: Online Payment");
    }

    @Override
    public void tapAndPay() {
        System.out.println("Visa Credit Card: Tap and Pay");
    }

    @Override
    public void UPIPayment() {
        throw new UnsupportedOperationException("Visa Credit Card does not support UPI Payment");
    }
    
    @Override
    public void internationalPayment() {
        System.out.println("Visa Credit Card: International Payment");
    }

}
