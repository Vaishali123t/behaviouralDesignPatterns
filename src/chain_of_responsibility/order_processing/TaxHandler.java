package chain_of_responsibility.order_processing;

public class TaxHandler extends OrderHandler{

    @Override
    void handle(Order order) {
        double tax = order.getPrice()*0.05;
        order.setPrice(order.getPrice()+tax);
        System.out.println("5% tax added");
        passToNext(order);
    }
}
