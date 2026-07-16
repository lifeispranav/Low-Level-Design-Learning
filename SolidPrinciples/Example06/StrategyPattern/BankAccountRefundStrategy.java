package SolidPrinciples.Example06.StrategyPattern;

public class BankAccountRefundStrategy implements RefundStrategy {
    
    @Override
    public void doRefund() {
        System.out.println("Bank Account Refund");
    }
    
}
