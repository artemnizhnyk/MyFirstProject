package work_with_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class PictureReaderEx {
    public static void main(String[] args) {
        try (FileInputStream inputStream = new FileInputStream(
                "C:\\Users\\nizhn\\OneDrive\\Desktop\\abstract-rose-wallpaper.jpg");
             FileOutputStream outputStream = new FileOutputStream("JavaFirstPicture.jpg")
        ) {
            int i;
            while ((i = inputStream.read()) != -1) {
                outputStream.write(i);
            }
            System.out.println("Done!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
