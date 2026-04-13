package state.vending_machine;

public class HasMoneyState implements IState{

    VendingMachine vm;

    public HasMoneyState(VendingMachine vendingMachine) {
        this.vm = vendingMachine;
    }

    @Override
    public void setVM(VendingMachine vm) {
        this.vm = vm;
    }

    @Override
    public void insertCoins(int coins) {
        System.out.println("Money already inserted");
    }

    @Override
    public void selectProduct() {
        System.out.println("Product selected");
        vm.setState(new DispenseState(vm));
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Select a product first");
    }

}
