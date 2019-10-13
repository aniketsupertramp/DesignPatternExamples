package aniket.structural.composite;

public class CompositeDemo {

    public static void main(String[] args) {
        Directory directory1 = new Directory("d1");
        File file1 = new File("f1");
        File file2 = new File("f2");
        File file3 = new File("f3");

        directory1.ls();
        System.out.println("----------");

        directory1.add(file1);
        directory1.add(file3);

        directory1.ls();
        System.out.println("----------");

        Directory directory2 = new Directory("d2");

        directory2.add(file2);

        directory2.ls();
        System.out.println("----------");

        directory1.add(directory2);

        directory1.ls();
        System.out.println("----------");
    }
}
