package GenericsPractice;

class Pair<k,V>{
    private k key;
    private V value;

    public Pair(k key,V value){
        this.key=key;
        this.value=value;
    }

    public k getKey(){
        return key;
    }

    public V getValue(){
        return value;
    }

}

public class MoreParameters {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Age",30);
        System.out.println("Key "+pair.getKey());
        System.out.println("Value "+pair.getValue());

    }
}
