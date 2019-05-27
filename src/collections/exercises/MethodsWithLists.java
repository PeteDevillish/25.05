package collections.exercises;


import generics.Exercises.Pair;

import java.util.*;

//1. Tworzymy metodę zadanie1, która przyjmie za parametr listę, której elementy są typu Integer, a która wypisze wszystkie elementy listy.
//2. Tworzymy metodę zadanie2, która przyjmie za parametr listę, której elementy są typu Integer, a która wypisze wszystkie elementy listy wraz z ich indeksami.
//3. Tworzymy metodę zadanie3, która przyjmie za parametr listę, której elementy są typu Integer, a która zwróci średnią wartości z tej listy.
//4. Tworzymy metodę zadanie4, która przyjmie za parametr listę Stringów, a która zwróci odpowiedź na pytanie, czy lista zawiera łańcuch znaków, który rozpoczyna się od znaków "abc".
//5. Tworzymy metodę zadanie5, która przyjmie za parametr listę Stringów, a która zwróci odpowiedź na pytanie, ile elementów ma nieparzystą liczbę znaków.
//6. Tworzymy metodę zadanie6, która przyjmie za parametr zbiór Stringów, a która zwróci odpowiedź na pytanie, czy w zbiorze mamy łańcuch znaków, który kończy się na tekst "cde".
//7. Tworzymy metodę zadanie7, która za parametr przyjmie listę Stringów, a zwróci zbiór, zawierający elementy tej listy.
//8. Tworzymy metodę zadanie8, która za parametr przyjmie zbiór Stringów, a zwróci listę, zawierającą elementy tego zbioru.
//9. Tworzymy metodę zadanie9, która za parametr przyjmie listę stringów, a zwróci listę zawierającą długości elementów argumentu.
//10. Tworzymy metodę zadanie10, która za parametr przyjmie listę łańcuchów znaków, a która zwróci zbiór obiektów typu Pair (tworzonego na poprzednich zajęciach), którego lewy element to łańcuch znaków, który wystąpił w liście, a prawy to liczba wystąpień tego łańcucha.
//11. Tworzymy klasę Converter, która będzie typem generycznym, która będzie miała w generyczny sposób napisane metody z zadań 7 oraz 8 (nazwijmy je toSet oraz toList).
//12. W klasie Converter zamieniamy metody na statyczne metody generyczne (googlujemy).
//13. Napisz metodę, która przyjmie jako argument listę łańcuchów znaków - nazw drużyn. Metoda zwróci listę zbiorów par (obydwa elementy pary to łańcuchy znaków - nazwy drużyn). Każdy kolejny element listy będzie reprezentował spotkania rozgrywane w kolejce rozgrywek. W jednej kolejce jedna drużyna może zagrać tylko raz, każda drużyna ma zagrać z każdą inną drużyną raz oraz najlepiej, aby w każdej kolejce było jak najwięcej meczów.
public class MethodsWithLists {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("1");
        set.add("2");
        set.add("3");
        set.add("4");
        ex8(set);
        System.out.println(ex8(set));
        System.out.println(listToSet(Arrays.asList("abc", "d", "abc")));
    }

    public static void ex1(List<Integer> list) {
        list.forEach(integer -> System.out.println(integer));
    }

    public static void ex2(List<Integer> list) {
        int counter = 0;
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + i);
        }
    }

    public static double ex3(List<Integer> list) {
        double sum = 0;
        for (Integer integer : list) {
            System.out.println(sum += integer);
        }
        return sum / list.size();
    }

    //4. Tworzymy metodę zadanie4, która przyjmie za parametr listę Stringów, a która zwróci odpowiedź na pytanie, czy lista zawiera łańcuch znaków, który rozpoczyna się od znaków "abc".
    public static boolean ex4(List<String> input) {
        for (String s : input) {
            if (s.charAt(0) == 'a' && s.charAt(1) == 'b' && s.charAt(2) == 'c') {
                return true;
            }
        }
        return false;
    }

    //5. Tworzymy metodę zadanie5, która przyjmie za parametr listę Stringów, a która zwróci odpowiedź na pytanie, ile elementów ma nieparzystą liczbę znaków.
    public static int ex5(List<String> list) {
        int counter = 0;
        for (String s : list) {
            if (s.length() % 2 == 1)
                counter++;
        }
        return counter;
    }
//6. Tworzymy metodę zadanie6, która przyjmie za parametr zbiór Stringów, a która zwróci odpowiedź na pytanie, czy w zbiorze mamy łańcuch znaków, który kończy się na tekst "cde".
//7. Tworzymy metodę zadanie7, która za parametr przyjmie listę Stringów, a zwróci zbiór, zawierający elementy tej listy.

    public static boolean ex6(List<String> input) {
        for (String s : input) {
            if (s.charAt(s.length() - 1) == 'e' && s.charAt(s.length() - 2) == 'd' && s.charAt(s.length() - 3) == 'c') {
                return true;
            }
        }
        return false;
    }

    public static Set<String> listToSet(List<String> list) {
        Set<String> set = new HashSet<>(list);
        return set;
    }

    //8. Tworzymy metodę zadanie8, która za parametr przyjmie zbiór Stringów, a zwróci listę, zawierającą elementy tego zbioru.
    public static List ex8(Set<String> set) {
        List<String> list = new ArrayList<String>(set);
        return list;
    }

    //9. Tworzymy metodę zadanie9, która za parametr przyjmie listę stringów, a zwróci listę zawierającą długości elementów argumentu.
    public static List<Integer> ex9(List<String> list) {
        List<Integer> list1 = new ArrayList<>();
        for (String s : list) {
            list1.add(s.length());
        }
    return list1;

    }

    //10. Tworzymy metodę zadanie10, która za parametr przyjmie listę łańcuchów znaków, a która zwróci zbiór obiektów typu Pair (tworzonego na poprzednich zajęciach),
    // którego lewy element to łańcuch znaków, który wystąpił w liście, a prawy to liczba wystąpień tego łańcucha.
//    public static Set<Pair> ex10(List<String> list){
//        Set<Pair<String, Integer>> pairs = new HashSet<>();
//        int i = 0;
//        String stringBox = new String();
//        while(list.size()>0){
//            int sizeBeforeRemove = list.size();
//            stringBox = list.get(0);
//            final String qa = stringBox;
//            list.removeIf(s -> {s.equals(qa);});
//            list.forEach(element -> System.out.println(element));
//            for (String s : list) {
//                System.out.println(s);
//            }
//        }
//        return new Pair<String, Integer>(list, value);
//    }
//11. Tworzymy klasę Converter, która będzie typem generycznym, która będzie miała w generyczny sposób napisane metody z zadań 7 oraz 8 (nazwijmy je toSet oraz toList).
//12. W klasie Converter zamieniamy metody na statyczne metody generyczne (googlujemy).
//13. Napisz metodę, która przyjmie jako argument listę łańcuchów znaków - nazw drużyn. Metoda zwróci listę zbiorów par (obydwa elementy pary to łańcuchy znaków - nazwy drużyn). Każdy kolejny element listy będzie reprezentował spotkania rozgrywane w kolejce rozgrywek. W jednej kolejce jedna drużyna może zagrać tylko raz, każda drużyna ma zagrać z każdą inną drużyną raz oraz najlepiej, aby w każdej kolejce było jak najwięcej meczów.


}
