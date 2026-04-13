package state.vending_machine;

public class VendingMachine {

    IState currState;

    public void setState(IState state) {
        this.currState = state;
    }

    public IState getState() {
        return currState;
    }



}
