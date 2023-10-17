package TemplatePattern;

public class DebitCardPaymentProcessor  extends PaymentProcessingTemplate{

    @Override
    public void validatePayment() {
        System.out.println("validating the debit card info is correct or not..");
    }

    @Override
    public void transferMoney() {
        System.out.println("Transferring money through debit card");
    }

    @Override
    public void updatingDB() {
        System.out.println("Updating DB for debit card payment");
    }

}
