package CollectionFrameworksPractice;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayListAdvance {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 2, 8, 1, 9, 3, 7, 4, 6));
        Iterator<Integer> iterator = list.iterator();
        System.out.println("Using Iterator");
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }

        System.out.println("\n\nUsing ListIterator (reverse):");
        ListIterator<Integer> listIterator = list.listIterator(list.size());
        while(listIterator.hasPrevious()){
            System.out.print(listIterator.previous()+" ");
        }

        List<Integer> evenNumber = list.stream()
                .filter(n -> n % 2 ==0)
                .toList();
        System.out.println("\n\nEven numbers: "+evenNumber);

        List<Integer> squared = list.stream()
                .map( n -> n * n)
                .toList();
        System.out.println("Squared numbers: "+squared);

        List<Integer> subList = list.subList(2,6);
        System.out.println("\nSublist [2-6): "+subList);

        Integer[] array = list.toArray(new Integer[0]);
        System.out.println("Array :" + Arrays.toString(array));

        ArrayList<Integer> moreNumbers = new ArrayList<>(Arrays.asList(10, 11, 12));
        list.addAll(moreNumbers);
        System.out.println("\\nAfter addAll : "+list);

        list.removeIf(n -> n >10);
        System.out.println("After removeIf (>10): "+list);

        list.replaceAll(n -> n *2);
        System.out.println("After replaceAll (*2): "+list);





    }
}
