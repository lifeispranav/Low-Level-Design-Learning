package SolidPrinciples.Example06.ProblematicCode;

public class Amex extends CreditCard implements RefundCompatibleCC {
    
    public RefundAlgorithm refundAlgorithm;

    @Override
    public void swipeAndPay() {
        System.out.println("Amex Credit Card: Swipe and Pay");
    }
    
    @Override
    public void onlinePayment() {
        System.out.println("Amex Credit Card: Online Payment");
    }
    
    @Override
    public void tapAndPay() {
        System.out.println("Amex Credit Card: Tap and Pay");
    }

    @Override
    public void refundAmount() {
        refundAlgorithm.algo2();
    }
    
}
