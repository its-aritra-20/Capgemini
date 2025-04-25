package file_handling;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		//String path="C:\\Users\\User\\Desktop\\FilHandling\\Test";
		String path="C:\\Users\\User\\Desktop\\FilHandling\\batman\\honu.txt";
		File file=new File(path);
		//File dark=new File(rename);
		file.createNewFile();
		//file.mkdir();
		//file.mkdirs();
		//file.renameTo(dark);
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
	}

}
