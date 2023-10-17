package TemplatePattern;

public class UPIPaymentProcessor extends PaymentProcessingTemplate{
    @Override
    public void validatePayment() {
        System.out.println("validating the UPI info is correct or not..");
    }

    @Override
    public void transferMoney() {
        System.out.println("Transferring money through UPI");
    }

    @Override
    public void updatingDB() {
        System.out.println("Updating DB for UPI payment");
    }
}
