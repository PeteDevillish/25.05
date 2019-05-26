package generics.Exercises;

public class Pair<T, E> {
    private T type;
    private E element;

    public Pair(T type, E element) {
        this.type = type;
        this.element = element;
    }

    public T getType() {
        return type;
    }

    public E getElement() {
        return element;
    }

}
