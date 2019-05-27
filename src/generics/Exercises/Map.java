package generics.Exercises;

import org.omg.CORBA.Object;

public class Map<K, V> {
    private List<K> keys;
    private List<V> values;

    public Map() {
    }

    public Map(List<K> keys, List<V> values) {
        for (int i = 0; i < keys.getElement().length; i++) {
           put(keys.get(i), values.get(i));
        }
    }


    public void put(K key, V value){
        if (keys.isUniqueValue(key)){
            keys.add(key);
            values.add(value);
        }
    }
    public V get(K key){
        for (int i = 0; i < keys.getElement().length; i++) {
            if (keys.getElement()[i].equals(key))
                return (V) values.getElement()[i];
        }
        return null;
    }

    public void remove(K key){
        for (int i = 0; i < keys.getElement().length; i++) {
            if (keys.getElement()[i].equals(key))
                values.remove(i);
                keys.remove(i);
        }
    }

}
