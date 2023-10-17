package StrategyAndFactoryDesignPattern;

//this is the context from where the trigger to strategies will take place
public class PaymentProcessor {

    private PaymentStrategy paymentStrategy;

    public PaymentProcessor() {
        paymentStrategy = null;
    }

    public void setPaymentStrategy(String strategy){

        if (paymentStrategy != null) {
            // Clean up the previous strategy
            paymentStrategy = null;
        }
        paymentStrategy = PaymentStrategyFactory.createPaymentStrategy(strategy);
    }

    public void processPayment(double amount) {
        if (paymentStrategy != null) {
            paymentStrategy.processPayment(amount);
        } else {
            System.err.println("Payment strategy not set.");
        }
    }


}
