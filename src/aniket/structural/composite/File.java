package aniket.structural.composite;

public class File {
    private String name;

    public File(String fileName) {
        name = fileName;
    }

    public void ls() {
        System.out.println("File: " + name);
    }
}
