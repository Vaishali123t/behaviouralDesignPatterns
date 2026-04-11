package CommandPattern.HomeSystem;

public class LightOffCommand implements ICommand{

    Light light;

    LightOffCommand() {
        this.light = new Light();
    }

    @Override
    public void execute() {
        light.turnOff();
    }

    @Override
    public void undo() {
        light.turnOn();
    }
}
