package GenericsPractice;

interface Pair2 <K,V>{
    K getKey();
    V getValue();
}
class KeyValuePair<K,V> implements Pair2<K, V>{
    private K key;
    private V value;

    public KeyValuePair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Pair2<String,Integer> pair = new KeyValuePair<>("Mohan",32);
        System.out.println(pair.getKey()+" "+pair.getValue());

    }
}
