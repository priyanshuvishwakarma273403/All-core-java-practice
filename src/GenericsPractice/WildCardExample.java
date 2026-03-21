package GenericsPractice;

interface NumberContainer<T extends Number> {
    void add(T item);
    T get();
}

class IntegerContainer implements NumberContainer<Integer> {
   private Integer item;

    @Override
    public void add(Integer item) {

    }

    @Override
    public Integer get() {
        return 0;
    }
}

public class WildCardExample {
    public static void printContainer(NumberContainer<?> container) {
        System.out.println(container.get());

    }
}
