package chain_of_responsibility.service_ticket;

public class L1Handler extends TicketHandler{

    @Override
    public void handle(int priority) {
        if (priority == 1) {
            System.out.println("Basic support issue: handled");
        }
        else if (nextHandler != null) {
            System.out.println("Issue could not be handled by L1 support. Passing to L2.");
            nextHandler.handle(priority);
        }
    }
}
