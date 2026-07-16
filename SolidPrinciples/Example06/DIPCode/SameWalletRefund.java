package SolidPrinciples.Example06.DIPCode;

public class SameWalletRefund implements RefundLogic {
    
    @Override
    public void doRefund() {
        System.out.println("Refunding amount to same wallet using Same wallet Refund Algorithm");
    }

}
