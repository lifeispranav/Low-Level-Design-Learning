package SolidPrinciples.Example05.StrategyPattern;

public class VisaCC extends CreditCard implements RefundCompatibleCC {
    
    private RefundStrategy refundStrategy;

    public VisaCC() {
        this.refundStrategy = new BankAccountRefundStrategy();
    }
    
    @Override
    public void swipeAndPay() {
        System.out.println("Visa Credit Card: Swipe and Pay");
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
    public void doRefund() {
        this.refundStrategy.doRefund();
    }
    
}
