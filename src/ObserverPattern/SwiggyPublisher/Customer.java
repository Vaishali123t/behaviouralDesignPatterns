package ObserverPattern.SwiggyPublisher;

public class Customer implements ISubscriber{

    String name;

    public Customer(String name) {
        this.name= name;
    }

    @Override
    public void update(String message) {
        System.out.println(message);
    }
}
