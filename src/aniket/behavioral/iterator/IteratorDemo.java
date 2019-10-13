package aniket.behavioral.iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        CustomList customList = new CustomList();
        int i = 0;
        while (i < 5) {
            customList.add(i);
            i++;
        }

        CustomList.CustomIterator iterator = customList.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
