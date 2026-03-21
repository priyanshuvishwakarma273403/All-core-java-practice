package FileHandlingPractice;

import java.io.*;

public class TestDemo {
    public static void main(String[] args) throws IOException {

        File source = new File("D:\\java\\Array\\src\\FileHandlingPractice\\user.txt");
        File dest = new File("D:\\java\\Array\\src\\DataUser.txt");
        try(FileInputStream fis = new FileInputStream(source);
            FileOutputStream fos = new FileOutputStream(dest))
        {
            int byteData;
            while ((byteData = fis.read()) != -1){
                fos.write(byteData);
            }
            System.out.println("File copied successfully");
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
