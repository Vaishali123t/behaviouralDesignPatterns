package state.vending_machine;

public class Client {

    public static void main(String[] args) {

        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.setState(new IdleState(vendingMachine));
        vendingMachine.getState().insertCoins(10);
        vendingMachine.getState().selectProduct();
        vendingMachine.getState().dispenseProduct();
    }

}
