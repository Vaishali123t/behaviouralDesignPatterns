package state.vending_machine;

public class DispenseState implements IState{

    VendingMachine vendingMachine;

    public DispenseState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void setVM(VendingMachine vm) {
        vendingMachine = vm;
    }

    @Override
    public void insertCoins(int coins) {
        System.out.println("Dispensing in progress. Please wait till machine is idle");
    }

    @Override
    public void selectProduct() {
        System.out.println("Dispensing in progress. Please wait till machine is idle");
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Dispensing the product");
        vendingMachine.setState(new IdleState(vendingMachine));
    }

}
