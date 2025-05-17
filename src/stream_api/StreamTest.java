package stream_api;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamTest {
	public static void main(String[] args) {
		String[] arr=new String[] {"Honu","Monu","Sonu"};
		Stream<String> streamArray=Arrays.stream(arr);
		System.out.println(streamArray.toString());
		
	}
	
}
