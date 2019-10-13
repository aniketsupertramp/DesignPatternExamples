package aniket.behavioral.observer;

public class ObserverDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer observerA = new ConcreteObserverA(subject);
        Observer observerB = new ConcreteObserverB(subject);

        subject.executeEvent();
    }
}
