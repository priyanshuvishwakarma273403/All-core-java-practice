package GenericsPractice;

public class GenericMethod {
    public<T> void printArray(T[] array){
        for(T element : array ){
            System.out.print(element+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        GenericMethod example = new GenericMethod();
        Integer[] intArray = new Integer[]{1,2,3,4,5};
        String [] stringArray = new String[]{"A","B","C","D"};

        example.printArray(intArray);
        example.printArray(stringArray);
    }
}
