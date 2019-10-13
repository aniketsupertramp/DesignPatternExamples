package aniket.structural.proxy;

public class ProxyDemo {
    public static void main(String[] args) {
        Operation operation = new ProxyOperation();

        operation.operate();
    }
}
