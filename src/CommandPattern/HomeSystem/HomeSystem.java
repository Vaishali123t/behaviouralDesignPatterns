package CommandPattern.HomeSystem;

import java.util.Stack;

public class HomeSystem {

    Stack<ICommand> commands;
    ICommand currentCommand;

    HomeSystem() {
        currentCommand = null;
        commands = new Stack<>();
    }

    void setCommand(ICommand command) {
        currentCommand = command;
    }

    void executeCommand() {
        if (currentCommand == null) {
            System.out.println("Command is null");
        }
        else {
            currentCommand.execute();
            commands.add(currentCommand);
        }
    }

    void undoLastCommand() {
        if (!commands.isEmpty()) {
            ICommand command = commands.pop();
            command.undo();
        }
        else {
            System.out.println("No prev command found");
        }
    }

}
