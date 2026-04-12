package chain_of_responsibility.service_ticket;

public abstract class TicketHandler {

    TicketHandler nextHandler;

    public void setNextHandler(TicketHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    abstract void handle(int priority);

}
