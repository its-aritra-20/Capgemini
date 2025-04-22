package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
	public static void main(String[] args) {
		String str="Hello world\n today is 22";
		String regex="[^a]";
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(str);
		while(matcher.find()) {
			System.out.print(matcher.group());
			

		}
		String email = "test@example.com";
		boolean isValid = email.matches("^[\\w.-]+@[\\w.-]+\\.\\w+$");
		System.out.println();
		System.out.println(isValid);
	}
}
