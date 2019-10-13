package aniket.behavioral.command;

public class RunCommand implements Command {

    @Override
    public void execute() {
       System.out.println("run command executed");
    }
}
