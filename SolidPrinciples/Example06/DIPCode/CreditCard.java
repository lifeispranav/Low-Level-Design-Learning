package SolidPrinciples.Example06.DIPCode;

public abstract class CreditCard {   

    protected String cardNumber;
    protected String cardHolderName;
    protected String expiryDate;
    protected String cvv;
    
    // Getters and Setters

    public abstract void swipeAndPay();
    public abstract void onlinePayment();
    public abstract void tapAndPay();
    
}
