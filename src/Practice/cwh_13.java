package Practice;

import java.util.Arrays;
import java.util.HashMap;

public class cwh_13 {
    public static void main(String[] args) {
        int [] a = {84,54,65,76,33,7,45,6,46,43,
                    345,556,76,86,56,54,34,
                     55,656,34,45,64,454,65,32};
        String [] arr ={"java","Python","Developer","mern","mein",
                         "mogodb","Sql", "Hashmap","LinkedList"};



        System.out.println("OriginL array:"+Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("Sort Int array:"+Arrays.toString(a));
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sort String array:"+Arrays.toString(arr));
    }
}
