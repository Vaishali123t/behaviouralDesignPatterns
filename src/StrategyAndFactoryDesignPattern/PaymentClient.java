package StrategyAndFactoryDesignPattern;

public class PaymentClient {

    public static void main(String[] args) {


        // creating a context object
        PaymentProcessor paymentProcessor= new PaymentProcessor();

        // setting the strategy of PaymentProcessor at runtime
        // creating a composition between PaymentProcessor and PaymentStrategy
        paymentProcessor.setPaymentStrategy("UPI");

        // calling the payment method
        paymentProcessor.processPayment(60.0);

        // Change the payment strategy
        paymentProcessor.setPaymentStrategy("DebitCard");

        // Process another payment using the new strategy
        paymentProcessor.processPayment(50.0);

    }

}
