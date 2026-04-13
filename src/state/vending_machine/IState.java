package state.vending_machine;

public interface IState {

    void setVM(VendingMachine vm);

    void insertCoins(int coins);
    void selectProduct();
    void dispenseProduct();


}
