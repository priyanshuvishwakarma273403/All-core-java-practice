package CollectionQuestion;

import java.util.Iterator;
import java.util.LinkedList;

public class Practice1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        usingIterator(list);
    }

    public static void usingIterator(LinkedList<Integer> list){
        System.out.println("Iterating the LinkedList using Iterator :");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next()+" ");
        }

    }
}
