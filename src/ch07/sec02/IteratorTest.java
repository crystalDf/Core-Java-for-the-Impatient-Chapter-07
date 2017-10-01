package ch07.sec02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorTest {

    public static void main(String[] args) {

        Collection<String> collection = new ArrayList<>();

        Iterator<String> iterator = collection.iterator();

        while (iterator.hasNext()) {

            String element = iterator.next();
        }
    }
}
