package CommandPattern.HomeSystem;

public class LightOnCommand implements ICommand{

    Light light;

    LightOnCommand() {
        this.light = new Light();
    }

    @Override
    public void execute() {
        light.turnOn();
    }

    @Override
    public void undo() {
        light.turnOff();
    }
}
