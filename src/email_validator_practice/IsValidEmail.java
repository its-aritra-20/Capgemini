package email_validator_practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IsValidEmail {
	public static void main(String[] args) {
		String a="aritra123@gmail.com";
		String b="user#domain.com";
		String regex="[a-zA-Z0-9_.]+@[a-zA-Z]+"
				+ "\\.[a-zA-Z]{2,5}$";
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher = pattern.matcher(a);
		Matcher matcher1 = pattern.matcher(b);
		if(matcher.find()) {
			System.out.println(matcher.group());
		}else {
			System.out.println("Invalid");
		}
		if(matcher1.find()) {
			System.out.println(matcher.group());
		}else {
			System.out.println("Invalid");
		}
	}
}
