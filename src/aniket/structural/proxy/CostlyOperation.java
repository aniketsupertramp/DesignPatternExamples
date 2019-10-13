package aniket.structural.proxy;

public class CostlyOperation implements Operation {
    @Override
    public void operate() {
        System.out.println("costly operation being operated...");
    }
}
