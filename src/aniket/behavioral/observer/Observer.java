package aniket.behavioral.observer;

public abstract class Observer {
    public Subject subject;
    abstract void update();
    abstract void execute();
}
