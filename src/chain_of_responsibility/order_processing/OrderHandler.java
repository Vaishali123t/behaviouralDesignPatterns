package chain_of_responsibility.order_processing;

import chain_of_responsibility.service_ticket.TicketHandler;

public abstract class OrderHandler {

    OrderHandler nextHandler;

    public OrderHandler setNextHandler(OrderHandler nextHandler) {
        this.nextHandler = nextHandler;
        return this.nextHandler;
    }

    abstract void handle(Order order);

    protected void passToNext(Order order) {
        if (nextHandler != null) {
            nextHandler.handle(order);
        }
    }

}
