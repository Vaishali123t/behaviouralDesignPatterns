package state.vending_machine;

public class IdleState implements IState{

    VendingMachine vendingMachine;

    public IdleState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void setVM(VendingMachine vm) {
        vendingMachine = vm;
    }

    @Override
    public void insertCoins(int coins) {
        System.out.println("inserted coins: "+ coins);
        vendingMachine.setState(new HasMoneyState(vendingMachine));
    }

    @Override
    public void selectProduct() {
        System.out.println("Insert coins first");
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Insert coins first");
    }


}
