package chain_of_responsibility.order_processing;

public class Client {

    public static void main(String[] args) {

        Order order = new Order("order", 1000);
        OrderHandler orderHandler = new SecurityHandler();
        orderHandler.setNextHandler(new DiscountHandler()).setNextHandler(new TaxHandler());
        orderHandler.handle(order);
    }
}
