package CommandPattern.HomeSystem;

public class FanOnCommand implements ICommand{

    Fan fan;

    FanOnCommand() {
        fan = new Fan();
    }

    @Override
    public void execute() {
        fan.turnOn();
    }

    @Override
    public void undo() {
        fan.turnOff();
    }
}
