package LldSeries;

interface Iterator<T>{
    boolean hasNext();
    T next();
}

interface Iterable<T>{
    Iterator<T> getIterator();
}

class LinkedList implements Iterable<Integer>{

    public int data;
    public LinkedList next;

    public LinkedList(int value){
        data = value;
        next = null;
    }

    @Override
    public Iterator<Integer> getIterator() {
        return new LinkedListIterator(this);
    }
}

class BinaryTree implements Iterable<Integer>{

    public int data;
    public BinaryTree left;
    public BinaryTree right;

    public BinaryTree(int value){
        data = value;
        left = null;
        right = null;
    }

    @Override
    public Iterator<Integer> getIterator() {
        return new BinaryTreeInorderIterator(this);
    }
}


public class IteratorPattern {
    public static void main(String[] args) {

    }

}
