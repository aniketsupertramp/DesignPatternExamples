package aniket.behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomList {
    private List<Integer> list = new ArrayList<>();

    public class CustomIterator {
        private CustomList customList;
        private Iterator iterator;

        public CustomIterator(CustomList cl) {
            customList = cl;
            iterator = cl.list.iterator();
        }

        public int next() {
            return (int) iterator.next();
        }

        public boolean hasNext() {
            return iterator.hasNext();
        }
    }

    public void add(int val) {
        list.add(val);
    }

    public CustomIterator getIterator() {
        return new CustomIterator(this);
    }
}
