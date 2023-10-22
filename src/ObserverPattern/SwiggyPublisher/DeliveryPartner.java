package ObserverPattern.SwiggyPublisher;

public class DeliveryPartner implements ISubscriber{

    String name;

    public DeliveryPartner(String name) {
        this.name= name;
    }

    @Override
    public void update(String message) {
        System.out.println(message);
    }
}
