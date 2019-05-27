package generics.Exercises;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = new List<>(new Integer[] {1,5,7});
        LinkedList<Integer> linkedList = new LinkedList<Integer>(new ElementOfLinkedList<Integer>(new Integer(1)));
        linkedList.add(7);
        System.out.println(linkedList);
        linkedList.add(10);
        System.out.println(linkedList);
        System.out.println(linkedList.size());
    }
}
