package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordStrength {

    public static boolean isValidPassword(String password) {
        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,20}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String passwordOne = "Strong@123";
        String passwordTwo = "weakpass";
        System.out.println("Password 1 valid? " + isValidPassword(passwordOne));
        System.out.println("Password 2 valid? " + isValidPassword(passwordTwo));
    }
}