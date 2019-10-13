package aniket.structural.proxy;

public class ProxyOperation implements Operation {

    Operation operation;

    boolean isValid() {
        //some validation
        return true;
    }

    @Override
    public void operate() {
        // do something
        if (isValid()) {
            operation = new CostlyOperation();
            operation.operate();
        }
        // do something
    }
}
