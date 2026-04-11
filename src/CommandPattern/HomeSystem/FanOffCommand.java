package CommandPattern.HomeSystem;

public class FanOffCommand implements ICommand{

    Fan fan;

    FanOffCommand() {
        fan = new Fan();
    }

    @Override
    public void execute() {
        fan.turnOff();
    }

    @Override
    public void undo() {
        fan.turnOn();
    }
}
