package generics.Exercises;


//4. Stwórz typ List w taki sposób, aby elementy były zachowywane w sposób taki:
//        - każdy element "pamięta" element, który jest następny.
public class LinkedList<V> {
    private static int size = 0;
    private ElementOfLinkedList<V> firstElement;

    public LinkedList() {
    }

    public LinkedList(ElementOfLinkedList<V> firstElement) {
        this.firstElement = firstElement;
        size++;
    }

    public ElementOfLinkedList<V> getFirstElement() {
        return firstElement;
    }

    public void add (V value){
        firstElement.addValue(value);
        size++;
    }


    @Override
    public String toString() {
        String result = "";
        return firstElement.toString();
    }

    public int size(){
        return size;
    }
}
