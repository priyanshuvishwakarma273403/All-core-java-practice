public class MyHashMap {
    // Node class
    static class Node<K, V> {
        int hash;
        K key;
        V value;
        Node<K, V> next;

        Node(int hash, K key, V value, Node<K, V> next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }

        private Node<K, V>[] table;
        private int size;
        private int capacity = 16;
    }

//    public static void main(String[] args) {
//        MyHashMap<String, Integer> map = new MyHashMap<>();
//
//    }
}
