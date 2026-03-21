package ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFound {
    public static void main(String[] args) {
        String root = System.getProperty("user,dir");
        System.out.println("Curent root directory" + root);

        String path = root + "\\message.txt";
        System.out.println("File path" + path);
        try {
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);

            for (int counter = 0; counter < 3; counter++) {
                System.out.println(br.readLine());
                fr.close();
            }
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found"+e.getMessage());
        }
        catch(IOException e)
        {
            System.out.println("IO Exception"+e.getMessage());
        }
    }
}
