package chain_of_responsibility.order_processing;

public class DiscountHandler extends OrderHandler{
    @Override
    void handle(Order order) {
        System.out.println("Discount handling");
        if (order.getPrice() > 100) {
            order.setPrice(order.getPrice()-10);
            System.out.println("Reduced price by 10 rs");
        }
        passToNext(order);
    }
}
