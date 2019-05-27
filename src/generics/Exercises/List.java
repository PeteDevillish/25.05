package generics.Exercises;

import java.util.Arrays;

public class List<T> {
    private Object[] elements;
    public List(T[] elements) {
        this.elements = (Object[]) elements;
    }

    public Object[] getElement() {
        return elements;
    }

    public void add(T element){
        elements = Arrays.copyOf(elements, elements.length + 1);
        elements[elements.length - 1] = (Object) element;
    }

    public void remove(int index){
        Object[] newElements = new Object[elements.length - 1];
        System.arraycopy(elements, 0, newElements, 0, index);
        System.arraycopy(elements, index + 1, newElements, index, elements.length - (index + 1));
        elements = newElements;
    }

    public T get(int index) {
        return (T) elements[index];
    }

    public int size() {
        return elements.length;
    }

    public String toString() {
        String result = "[";
        for (int i = 0; i < elements.length; i++) {
            result += elements[i];
            if (i != elements.length - 1) {
                result += ", ";
            }
        }
        return result + "]";
    }

    public boolean isUniqueValue(T value){
        for (Object element : elements){
            if (element.equals(value)) return false;
        }
        return true;
}

}
