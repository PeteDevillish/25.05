package generics.Exercises;

public class ElementOfLinkedList<V> {
    private V value;
    private ElementOfLinkedList<V> nextElement;
//    private boolean isLastElement = false;

    public ElementOfLinkedList(V value) {
        this.value = value;
    }

    public ElementOfLinkedList(V value, ElementOfLinkedList<V> nextElement) {
        this.value = value;
        this.nextElement = nextElement;

    }

    public V getValue() {
        return value;
    }

    public ElementOfLinkedList<V> getNextElement() {
        return nextElement;
    }


    public void addValue(V value) {
//        if (value == null) {
//            setValue(value);
//
//        } else {
//            nextElement = new ElementOfLinkedList<>(value);
//        }
        if (nextElement == null){
            nextElement = new ElementOfLinkedList<>(value);
        }
        else if (nextElement != null){
            nextElement.nextElement = new ElementOfLinkedList<>(value);
        }

    }

    private void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        String a = "";
        if (nextElement == null){
            return "Value: " + value + " ";
        }
        else{
            return "Value: " + value + ", " + nextElement;
        }
    }
}
