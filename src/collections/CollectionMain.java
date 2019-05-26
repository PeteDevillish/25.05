package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionMain {
    public static void main(String[] args) {
        Collection<String> stringCollection = Arrays.asList("Abc", "ksks", "idjdid");
        stringCollection.forEach(s -> System.out.println(s + "z"));
    }

}
