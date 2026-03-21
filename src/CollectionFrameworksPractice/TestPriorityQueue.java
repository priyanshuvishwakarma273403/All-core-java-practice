package CollectionFrameworksPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class TestPriorityQueue
{
    public static void main(String[] args)
    {
        PriorityQueue<String> priorityQueue = new PriorityQueue<String>();

        priorityQueue.add("Sachin");
        priorityQueue.add("Vivek");
        priorityQueue.add("Manish");
        priorityQueue.add("Kapil");
        priorityQueue.add("Ajay");

        System.out.println(priorityQueue);

        PriorityQueue<String> priorityQueue2 = new PriorityQueue<String>();
        priorityQueue2.add("Red");
        priorityQueue2.add("Black");
        priorityQueue2.add("Green");

        System.out.println(priorityQueue2);

        PriorityQueue<String> priorityQueue3 = new PriorityQueue<String>(priorityQueue2);

        System.out.println(priorityQueue3);

        PriorityQueue<String> priorityQueue4 = new PriorityQueue<String>(Arrays.asList("North,East,West,South"));
        System.out.println(priorityQueue4);

        PriorityQueue<Integer> priorityQueue5 = getIntegers();

        System.out.println(priorityQueue5);

    }

    private static PriorityQueue<Integer> getIntegers() {
        PriorityQueue<Integer> priorityQueue5 = new PriorityQueue<Integer>(new Comparator<Integer>() {

            @Override
            public int compare(Integer o2, Integer o1) {

                if(o1==o2)
                {
                    return 0;
                }
                else if(o1<o2)
                {
                    return -1;
                }
                else
                {
                    return 1;
                }
            }
        });

        priorityQueue5.add(85);
        priorityQueue5.add(63);
        priorityQueue5.add(74);
        priorityQueue5.add(12);
        priorityQueue5.add(98);
        return priorityQueue5;
    }

}