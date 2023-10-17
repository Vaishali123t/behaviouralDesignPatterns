package StrategyPattern;

public class PaymentClient {

    public static void main(String[] args) {

        // creating a strategy object
        PaymentStrategy paymentStrategy= new UPIPaymentStrategy();

        // creating a context object
        PaymentProcessor paymentProcessor= new PaymentProcessor();

        // setting the strategy of PaymentProcessor at runtime
        // association between PaymentProcessor and PaymentStrategy
        paymentProcessor.setPaymentStrategy(paymentStrategy);

        // calling the payment method
        paymentProcessor.processPayment(60.0);

        // Change the payment strategy
        paymentStrategy = new DebitCardPaymentStrategy();
        paymentProcessor.setPaymentStrategy(paymentStrategy);

        // Process another payment using the new strategy
        paymentProcessor.processPayment(50.0);

    }

}
