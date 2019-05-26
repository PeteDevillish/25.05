package collections;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("ABC");
        stringList.add("ZYZ");
        System.out.println(stringList);
        stringList.forEach(s -> System.out.println(s));
        stringList.remove("ABC");

    }
}
