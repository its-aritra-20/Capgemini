package file_handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

//     C:\Users\User\Desktop\FilHandling\batman


public class DeSerializeEmployee {
	public static void main(String[] args) throws Exception{
		
	
	String path="C:\\Users\\User\\Desktop\\FilHandling\\batman\\serialized.txt";
	     File file = new File(path);
	        file.createNewFile();
	        FileInputStream fis=new FileInputStream(file);
	        ObjectInputStream ois=new ObjectInputStream(fis);
	        Employee employee=(Employee)ois.readObject();
	        System.out.println(employee);
	        
	}
}