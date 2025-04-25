package file_handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CsvRead {
	public static void main(String[] args) throws Exception{
		String path="C:\\Users\\User\\Desktop\\FilHandling\\batman\\bruh.csv";
		File file=new File(path);
		file.createNewFile();
		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            boolean isHeader = true;

            while ((line = reader.readLine()) != null) {
                if (isHeader) {
                    isHeader = false; // Skip header
                    continue;
                }

                String[] values = line.split(",");

                int id = Integer.parseInt(values[0].trim());
                String name = values[1].trim();
                int age = Integer.parseInt(values[2].trim());

                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

}
