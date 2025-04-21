package lambdaexpressionmethods;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.Arrays;

public class LambdaDriver {
	public static void main(String[] args) {
		Demo1 l1= () -> System.out.println("Hello");
		Demo2 l2= () -> System.out.println("Hello2");
		l1.print();
		l2.greet();
		Demo3 l3 = (x,y) ->{
			if(x>y) {
				return x;
			}
			else {
				return y;
			}
		};
		System.out.println(l3.check(10,20));
		//sorting list of integers in descending order using lambda Expression
		List<Integer> list=Arrays.asList(1,2,3,4,5);
		System.out.println(list);
		Comparator<Integer> comparator = (o1,o2) -> o2-o1;
		Collections.sort(list,comparator);
		System.out.println(list);

		
		
		
	}


}
