package file_handling;


//    C:\Users\User\Desktop\FileHandling\batman\honu.txt



import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class WritingData {
    public static void main(String[] args) throws IOException {
        String path = " C:\\Users\\User\\Desktop\\FileHandling\\batman\\honu.txt";
        File file = new File(path);
        //FileOutputStream fos = new FileOutputStream(file, true);
        String message = "Bye bye birds!!";
        //byte[] b = message.getBytes();
        //fos.write(b);

        FileWriter fw = new FileWriter(file, true);
        for (int i = 0; i < message.length(); i++) {
            fw.write(message.charAt(i));
        }
        fw.close();
    }
}