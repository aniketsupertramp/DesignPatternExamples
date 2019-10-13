package aniket.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class CommandDemo {
    private static List<Command> commandList = new ArrayList<>();

    static void execuetCommand() {
        for (Command command : commandList) {
            command.execute();
        }
    }

    public static void main(String[] args) {
        Command runCommand = new RunCommand();
        Command walkCommand = new WalkCommand();
        Command stopCommand = new StopCommand();
        commandList.add(runCommand);
        commandList.add(walkCommand);
        commandList.add(stopCommand);

        execuetCommand();
    }
}
