package CommandPattern.HomeSystem;

public class Client {

    public static void main(String[] args) {

        HomeSystem system = new HomeSystem();
        system.setCommand(new LightOnCommand());
        system.executeCommand();
        system.setCommand(new LightOffCommand());
        system.executeCommand();
        system.undoLastCommand();
        system.setCommand(new FanOffCommand());
        system.executeCommand();
        system.undoLastCommand();
    }

}
