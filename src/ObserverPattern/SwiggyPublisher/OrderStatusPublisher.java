package ObserverPattern.SwiggyPublisher;

import java.util.ArrayList;
import java.util.List;

public class OrderStatusPublisher{

    private List<ISubscriber> subscribers;
    private int id;
    private String status;

    public OrderStatusPublisher(int id, String status) {
        this.subscribers = new ArrayList<>();
        this.id= id;
        this.status= status;
    }

    public void addSubscriber(ISubscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void removeSubscriber(ISubscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifyObservers() {
        String message= "Order with order id: "+this.id+" has been "+this.status+".";
        for(ISubscriber sub: subscribers){
            sub.update(message);
        }
    }

    void setStatus(String status){
        this.status= status;
        notifyObservers();
    }

}
