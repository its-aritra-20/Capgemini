package file_handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CsvWrite {
	public static void main(String[] args) throws Exception{
		String path="C:\\Users\\User\\Desktop\\FilHandling\\batman\\bruh.csv";
		File file=new File(path);
		file.createNewFile();
		try (FileWriter writer=new FileWriter(file)){
			writer.append("id,name,age\n");
			writer.append("1,Rohit,10\n");
			writer.append("1,Rohit,100\n");
			System.out.println("CSV file written succesfully");
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
