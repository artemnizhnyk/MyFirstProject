package work_with_file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Path_ClassEx {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test34.txt");
        Path directoryPath = Paths.get("C:\\Users\\nizhn\\OneDrive\\Desktop\\M");

        System.out.println(filePath.getFileName());
        System.out.println(directoryPath.getFileName());
        System.out.println("------------------------------");
        System.out.println(filePath.getParent());
        System.out.println(directoryPath.getParent());
        System.out.println("------------------------------");
        System.out.println(filePath.getRoot());
        System.out.println(directoryPath.getRoot());
        System.out.println("------------------------------");
        if (!Files.exists(filePath)) {
            Files.createFile(filePath);
        }
        if (!Files.exists(directoryPath)) {
            Files.createDirectory(directoryPath);
        }


    }
}
