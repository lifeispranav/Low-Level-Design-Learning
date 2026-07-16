package SolidPrinciples.Example06.DIPCode;

public class SameInstrumentRefund implements RefundLogic {
    
    @Override
    public void doRefund() {
        System.out.println("Refunding amount to same instrument using Same instrument Refund Algorithm");
    }
    
}
