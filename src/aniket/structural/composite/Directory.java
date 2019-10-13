package aniket.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory {
    private String name;
    private List<Object> contentsInDirectory;

    public void add(Object obj) {
        contentsInDirectory.add(obj);
    }

    public Directory(String directoryName) {
        name = directoryName;
        contentsInDirectory = new ArrayList<>();
    }

    public void ls() {
        System.out.println("DIRECTORY" + name + ":");
        for (Object obj : contentsInDirectory) {
            String className = obj.getClass().getSimpleName();
            if (className.equalsIgnoreCase("Directory")) {
                ((Directory) obj).ls();
            } else {
                ((File) obj).ls();
            }
        }
    }
}
