package FileHandlingPractice;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;
import java.util.List;

public class NioExample {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("user.txt");
        List<String> lines = Arrays.asList("FirstLine","SecondLine","ThirdLine");
        Files.write(path,lines, StandardCharsets.UTF_8);

        List<String> readLines = Files.readAllLines(path, StandardCharsets.UTF_8);
        readLines.forEach(System.out::println);

        Path destPath = Paths.get("modern_file_copy.txt");
        Files.copy(path, destPath, StandardCopyOption.REPLACE_EXISTING);


        System.out.println("NIO operations complete!");
    }
}
