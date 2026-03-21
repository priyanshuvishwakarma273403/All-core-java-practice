package GenericsPractice;

interface printable{
    void print();
}

class MyNumber extends Number implements printable{
    private final int value;

    public MyNumber(int value) {
        this.value = value;
    }

    @Override
    public void print() {
        System.out.println("MyNumber "+value);
    }

    @Override
    public int intValue() {
        return value;
    }

    @Override
    public long longValue() {
        return value;
    }

    @Override
    public float floatValue() {
        return value;
    }

    @Override
    public double doubleValue() {
        return value;
    }
}

class Boxx<T extends Number & printable>{
    private T item;
    public Boxx(T item){
        this.item = item;
    }

    public void display(){
        item.print();
    }

    public T getItem(){
        return item;
    }
}

public class MultipleGenericsExtend {
    public static void main(String[] args) {
        MyNumber myNumber = new MyNumber(100);
        Boxx<MyNumber> boxx = new Boxx<MyNumber>(myNumber);
        boxx.display();

    }
}
