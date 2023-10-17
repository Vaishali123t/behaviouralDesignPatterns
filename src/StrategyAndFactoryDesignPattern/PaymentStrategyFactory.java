package StrategyAndFactoryDesignPattern;

public class PaymentStrategyFactory {

    public static PaymentStrategy createPaymentStrategy(String paymentMethod){

        if(paymentMethod.equals("UPI"))
            return new UPIPaymentStrategy();
        else if (paymentMethod.equals("DebitCard")) {
            return new DebitCardPaymentStrategy();
        }
        return null;
    }

}
