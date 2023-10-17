package StrategyAndFactoryDesignPattern;

public class UPIPaymentStrategy implements PaymentStrategy{

    @Override
    public void processPayment(double amount) {
        System.out.println("Payment will be done through UPI. The amount is: "+ amount);
    }
}
