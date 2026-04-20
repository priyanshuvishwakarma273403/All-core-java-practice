package LldSeries;

interface Iterator<T>{
    boolean hasNext();
    T next();
}

interface Iterable<T>{
    Iterator<T> getIterator();
}





public class IteratorPattern {
    public static void main(String[] args) {

    }

}
