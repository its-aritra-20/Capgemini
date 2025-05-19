package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		OptionalDouble optional=list.stream().mapToInt(Integer::intValue).average();

	}

}
