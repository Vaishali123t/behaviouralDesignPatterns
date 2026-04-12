package chain_of_responsibility.service_ticket;

public class L2Handler extends TicketHandler{

    @Override
    public void handle(int priority) {
        if (priority == 2) {
            System.out.println("L2 support issue: handled");
        }
        else if (nextHandler != null) {
            System.out.println("Issue could not be handled by L2 support. Passing to next handler.");
            nextHandler.handle(priority);
        }
        else {
            System.out.println("Issue could not be handled.");
    }
    }
}
