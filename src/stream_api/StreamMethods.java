package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(2,3,3,4,8,1,1,4);
		System.out.println(list);
//		Stream s=list.stream();
//		Stream s1=s.distinct();
//		s1.forEach(n->System.out.println(n));
		list.stream().distinct().forEach(n->System.out.print(n+" "));
		System.out.println(list);
		
		//min
		Optional<Integer> optional=list.stream().distinct().min((o1,o2)->o1-o2);
		if(optional.isPresent()) {
			System.out.println(optional.get());
		}
		
		//max
		Integer i=list.stream().max((o1,o2)->o1-o2).get();
		System.out.println(i);
		
		System.out.println("----------------------------");
		
		//sorted
		//Ascending
		list.stream().sorted().forEach(n->System.out.print(n+" "));
		System.out.println();
		//Descending
		list.stream().sorted((o1,o2)->o2-o1).forEach(n->System.out.print(n+" "));
		System.out.println(); 
		
		
		//n*n
		//map fucntion
		list.stream().distinct().sorted().map(n->n*n).forEach(n->System.out.print(n+" "));
		System.out.println();
		
		
		//predicate interface   filter(Predicate)
		list.stream().distinct().filter(n->n%2==0).forEach(n->System.out.print(n+ " "));
	
		//toList()
		System.out.println();
		List<Integer>li =list.stream().distinct().filter(n->n%2==0).toList();
		System.out.println(li);
		
		
		Stream s=Stream.of(1,4,7,3,"Demo,98.6");
		s.forEach(n->System.out.print(n));
		System.out.println("------------------------------");
		
		//findFirst
		Optional<Integer> op=list.stream().findFirst();
		System.out.println(op.get());
		
		
		//findAny
		System.out.println(list.stream().findAny().get());
		
		//count
		
		System.out.println(list.stream().count());
		System.out.println("-------------------------");
		
		
		//concat
		List<String> strings=Arrays.asList("Hello","demo","hi");
		List<Integer> num=Arrays.asList(1,2,3);
		Stream s1=strings.stream();
		Stream s2=num.stream();
		
		Stream.concat(s1, s2).forEach(n-> System.out.print(n+" "));
		System.out.println();
		
		
		
		//allMatch(Predicate)
		
		System.out.println(list.stream().distinct().allMatch(n->n%2==0));
		
		
		//anyMatch(Predicate)
		System.out.println(list.stream().distinct().anyMatch(n->n%2==0));
		
		
		
		
		
	}

}
