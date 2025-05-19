package regex;

import java.util.regex.*;

public class PhoneNumberValidator {
    public static void main(String[] args) {
        String regex = "^(\\+\\d{1,3}[- ]?)?\\d{10}$";
        String[] phoneNumbers = {
            "+91 9876543210",
            "+91-9876543210",
            "9876543210",
            "123456789",     
            "+919876543210"
        };

        for (String number : phoneNumbers) {
            if (number.matches(regex)) {
                System.out.println(number + " is valid");
            } else {
                System.out.println(number + " is invalid");
            }
        }
    }
}

