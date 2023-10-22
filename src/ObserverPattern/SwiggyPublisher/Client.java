package ObserverPattern.SwiggyPublisher;

public class Client {

    public static void main(String[] args) {

        // create an Order and assign subscribers to Status Publisher
        ISubscriber customer= new Customer("Vaishali");
        ISubscriber restaurant= new Restaurant("Haldiram's");
        ISubscriber deliveryPartner= new DeliveryPartner("Sneha");

        OrderStatusPublisher publisher= new OrderStatusPublisher(1,"Placed");
        publisher.addSubscriber(customer);
        publisher.addSubscriber(restaurant);
        publisher.addSubscriber(deliveryPartner);

        publisher.notifyObservers();

        publisher.setStatus("Accepted");

//        publisher.notifyObservers();

        publisher.setStatus("Delivered");

//        publisher.notifyObservers();

    }

}
