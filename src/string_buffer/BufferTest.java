package string_buffer;

public class BufferTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s = new StringBuffer();
		s.append(true);
		s.append("Hello");
		System.out.println(s);
		char[] ch={'a','b','c'};
		StringBuffer a=new StringBuffer();
		a.append(ch);
		System.out.println(a);
		s.insert(1, false);
		System.out.println(s);
		s.insert(3,ch,0,2);
		System.out.println(s);
		a.reverse();
		System.out.println(a);
		a.setCharAt(0, 'H');
		System.out.println(a);
		
		

	}

}
