package collections;

import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(123);
        integerSet.add(123);
        integerSet.add(2728);
        integerSet.add(-190);
        System.out.println(integerSet);
        System.out.println(integerSet);
        System.out.println(integerSet);

        integerSet.forEach(integer -> System.out.println(integer));

    }
}
