package ObserverPattern.SwiggyPublisher;

public class Restaurant implements ISubscriber{

    String name;

    public Restaurant(String name) {
        this.name= name;
    }

    @Override
    public void update(String message) {
        System.out.println(message);
    }
}
