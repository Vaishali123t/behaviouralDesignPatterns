package TemplatePattern;

abstract class PaymentProcessingTemplate {

    public final void processPayment(){
        validatePayment();
        transferMoney();
        updatingDB();
    }

    public abstract void validatePayment();
    public abstract void transferMoney();
    public abstract void updatingDB();

}
