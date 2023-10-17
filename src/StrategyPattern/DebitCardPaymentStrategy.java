package StrategyPattern;

public class DebitCardPaymentStrategy implements PaymentStrategy{

    @Override
    public void processPayment(double amount) {
        System.out.println("Payment will be done through Debit card. The amount is: "+ amount);
    }
}
