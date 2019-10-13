package aniket.behavioral.command;

public class WalkCommand implements Command {
    @Override
    public void execute() {
        System.out.println("walk command executed");
    }
}
