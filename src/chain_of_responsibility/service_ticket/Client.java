package chain_of_responsibility.service_ticket;

public class Client {
    public static void main(String[] args) {
        TicketHandler level1Handler = new L1Handler();
        TicketHandler level2Handler = new L2Handler();

        level1Handler.setNextHandler(level2Handler);

        level1Handler.handle(1);
        System.out.println("#######");
        level1Handler.handle(2);
        System.out.println("#######");
        level1Handler.handle(3);
    }
}