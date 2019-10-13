package aniket.behavioral.command;

public class StopCommand implements Command {

    @Override
    public void execute() {
        System.out.println("stop command executed");
    }
}
