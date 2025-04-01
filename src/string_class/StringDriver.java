package string_class;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringDriver {
    private String str;

    public StringDriver(String str) {
        this.str = str;
    }

    // Instance Methods
    public char charAt(int index) {
        return str.charAt(index);
    }

    public IntStream chars() {
        return str.chars();
    }

    public int codePointAt(int index) {
        return str.codePointAt(index);
    }

    public int codePointBefore(int index) {
        return str.codePointBefore(index);
    }

    public int codePointCount(int beginIndex, int endIndex) {
        return str.codePointCount(beginIndex, endIndex);
    }

    public IntStream codePoints() {
        return str.codePoints();
    }

    public int compareTo(String anotherString) {
        return str.compareTo(anotherString);
    }

    public int compareToIgnoreCase(String anotherString) {
        return str.compareToIgnoreCase(anotherString);
    }

    public String concat(String anotherStrin) {
        return str.concat("Bhola");
    }

    public boolean contains(CharSequence s) {
        return str.contains(s);
    }

    public boolean contentEquals(CharSequence cs) {
        return str.contentEquals(cs);
    }

    public boolean contentEquals(StringBuffer sb) {
        return str.contentEquals(sb);
    }

    public boolean endsWith(String suffix) {
        return str.endsWith(suffix);
    }

    public boolean equals(Object anObject) {
        return str.equals(anObject);
    }

    public boolean equalsIgnoreCase(String anotherString) {
        return str.equalsIgnoreCase(anotherString);
    }

    public byte[] getBytes() {
        return str.getBytes();
    }

    public byte[] getBytes(String charsetName) throws java.io.UnsupportedEncodingException {
        return str.getBytes(charsetName);
    }

    public byte[] getBytes(Charset charset) {
        return str.getBytes(charset);
    }

    public int hashCode() {
        return str.hashCode();
    }

    public int indexOf(int ch) {
        return str.indexOf(ch);
    }

    public int indexOf(String substring) {
        return str.indexOf(substring);
    }

    public boolean isBlank() {
        return str.isBlank();
    }

    public boolean isEmpty() {
        return str.isEmpty();
    }

    public int lastIndexOf(int ch) {
        return str.lastIndexOf(ch);
    }

    public int lastIndexOf(String substring) {
        return str.lastIndexOf(substring);
    }

    public int length() {
        return str.length();
    }

    public boolean matches(String regex) {
        return str.matches(regex);
    }

    public String replace(char oldChar, char newChar) {
        return str.replace(oldChar, newChar);
    }

    public String replace(CharSequence target, CharSequence replacement) {
        return str.replace(target, replacement);
    }

    public String replaceAll(String regex, String replacement) {
        return str.replaceAll(regex, replacement);
    }

    public String[] split(String regex) {
        return str.split(regex);
    }

    public boolean startsWith(String prefix) {
        return str.startsWith(prefix);
    }

    public String toLowerCase() {
        return str.toLowerCase();
    }

    public String toUpperCase() {
        return str.toUpperCase();
    }

    public String trim() {
        return str.trim();
    }

    // Static Methods
    public static String copyValueOf(char[] data) {
        return String.copyValueOf(data);
    }

    public static String format(String format, Object... args) {
        return String.format(format, args);
    }

    public static String join(CharSequence delimiter, CharSequence... elements) {
        return String.join(delimiter, elements);
    }

    public static String valueOf(int i) {
        return String.valueOf(i);
    }

    // Deprecated Method (Handled properly)
    @Deprecated
    public void getBytesDeprecated(int srcBegin, int srcEnd, byte[] dst, int dstBegin) {
        str.getBytes(srcBegin, srcEnd, dst, dstBegin);
    }

    public static void main(String[] args) {
        StringDriver demo = new StringDriver("Hello, World!");
        System.out.println("Character at index 1: " + demo.charAt(1));
        System.out.println("Concatenation: " + demo.concat(" Welcome!"));
        System.out.println("Length: " + demo.length());
        System.out.println("Uppercase: " + demo.toUpperCase());
        System.out.println("Is Empty: " + demo.isEmpty());
        System.out.println("Formatted: " + format("Value: %d", 100));
    }
}
