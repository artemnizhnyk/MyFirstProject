package work_with_file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Path_FileEx2 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test34.txt");
        Path directoryPath = Paths.get("C:\\Users\\nizhn\\OneDrive\\Desktop\\M");

//        Files.copy(filePath, directoryPath.resolve(filePath));
        Files.copy(filePath, directoryPath.resolve("test4.txt"), StandardCopyOption.REPLACE_EXISTING);
        System.out.println("Done!");
    }
}
