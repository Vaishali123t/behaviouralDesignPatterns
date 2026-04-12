package chain_of_responsibility.order_processing;

public class SecurityHandler extends OrderHandler{

    @Override
    void handle(Order order) {
        System.out.println("Security check");
        passToNext(order);
    }
}
