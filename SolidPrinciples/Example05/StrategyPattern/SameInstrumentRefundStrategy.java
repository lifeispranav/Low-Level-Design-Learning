package SolidPrinciples.Example05.StrategyPattern;

public class SameInstrumentRefundStrategy implements RefundStrategy {
    
    @Override
    public void doRefund() {
        System.out.println("Same Instrument Refund");
    }
    
}
