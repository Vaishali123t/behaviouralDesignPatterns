package ObserverPattern.SwiggyPublisher;

public interface IPublisher {

    void addSubscriber(ISubscriber subscriber);
    void removeSubscriber(ISubscriber subscriber);
    void notifyObservers();

}
