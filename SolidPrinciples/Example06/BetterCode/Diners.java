package SolidPrinciples.Example06.BetterCode;

public class Diners extends CreditCard {
    
    @Override
    public void swipeAndPay() {
        System.out.println("Diners Credit Card: Swipe and Pay");
    }
    
    @Override
    public void onlinePayment() {
        System.out.println("Diners Credit Card: Online Payment");
    }
    
    @Override
    public void tapAndPay() {
        System.out.println("Diners Credit Card: Tap and Pay");
    }
    
}
