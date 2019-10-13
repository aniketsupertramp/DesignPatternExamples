package aniket.behavioral.observer;

public class ConcreteObserverB extends Observer {

    // its the job of observer to add itself in the subject's list of observers
    public ConcreteObserverB(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

    @Override
    void update() {
        this.execute();
    }

    @Override
    void execute() {
        System.out.println("executed ConcreteObserverB");
    }
}
