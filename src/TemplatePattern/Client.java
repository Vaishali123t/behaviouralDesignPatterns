package TemplatePattern;

public class Client {

    public static void main(String args[]){


        PaymentProcessingTemplate upiPaymentProcessor= new UPIPaymentProcessor();
        PaymentProcessingTemplate debitCardPaymentProcessor= new DebitCardPaymentProcessor();

        upiPaymentProcessor.processPayment();
        System.out.println("******");
        debitCardPaymentProcessor.processPayment();


    }

}
