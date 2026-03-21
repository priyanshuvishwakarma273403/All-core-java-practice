package Practice;
import java.util.Locale;
import java.nio.charset.Charset;


public class cwh_121 {
    public static class StringFunctions {
        private String value;

        public StringFunctions(String value) {
            this.value = value;
        }

        public char charAt(int index) {
            return value.charAt(index);
        }

        public int codePointAt(int index) {
            return value.codePointAt(index);
        }

        public int codePointBefore(int index) {
            return value.codePointBefore(index);
        }

        public int codePointCount(int beginIndex, int endIndex) {
            return value.codePointCount(beginIndex, endIndex);
        }

        public int compareTo(String anotherString) {
            return value.compareTo(anotherString);
        }

        public int compareToIgnoreCase(String str) {
            return value.compareToIgnoreCase(str);
        }

        public String concat(String str) {
            return value.concat(str);
        }

        public boolean contains(CharSequence s) {
            return value.contains(s);
        }

        public boolean contentEquals(CharSequence cs) {
            return value.contentEquals(cs);
        }

        public boolean contentEquals(StringBuffer sb) {
            return value.contentEquals(sb);
        }

        public static String copyValueOf(char[] data) {
            return String.copyValueOf(data);
        }

        public static String copyValueOf(char[] data, int offset, int count) {
            return String.copyValueOf(data, offset, count);
        }

        public boolean endsWith(String suffix) {
            return value.endsWith(suffix);
        }

        public boolean equals(Object anObject) {
            return value.equals(anObject);
        }

        public boolean equalsIgnoreCase(String anotherString) {
            return value.equalsIgnoreCase(anotherString);
        }

        public static String format(Locale l, String format, Object... args) {
            return String.format(l, format, args);
        }

        public static String format(String format, Object... args) {
            return String.format(format, args);
        }

        public byte[] getBytes() {
            return value.getBytes();
        }

        public byte[] getBytes(Charset charset) {
            return value.getBytes(charset);
        }

        @Deprecated
        public void getBytes(int srcBegin, int srcEnd, byte[] dst, int dstBegin) {
            value.getBytes(srcBegin, srcEnd, dst, dstBegin);
        }

        public byte[] getBytes(String charsetName) throws java.io.UnsupportedEncodingException {
            return value.getBytes(charsetName);
        }

        public void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) {
            value.getChars(srcBegin, srcEnd, dst, dstBegin);
        }

        public int hashCode() {
            return value.hashCode();
        }

        public int indexOf(int ch) {
            return value.indexOf(ch);
        }

        public int indexOf(int ch, int fromIndex) {
            return value.indexOf(ch, fromIndex);
        }

        public int indexOf(String str) {
            return value.indexOf(str);
        }

        public int indexOf(String str, int fromIndex) {
            return value.indexOf(str, fromIndex);
        }

        public String intern() {
            return value.intern();
        }

        public boolean isEmpty() {
            return value.isEmpty();
        }

        public static String join(CharSequence delimiter, CharSequence... elements) {
            return String.join(delimiter, elements);
        }

        public static String join(CharSequence delimiter, Iterable<? extends CharSequence> elements) {
            return String.join(delimiter, elements);
        }

        public int lastIndexOf(int ch) {
            return value.lastIndexOf(ch);
        }

        public int lastIndexOf(int ch, int fromIndex) {
            return value.lastIndexOf(ch, fromIndex);
        }

        public int lastIndexOf(String str) {
            return value.lastIndexOf(str);
        }

        public int lastIndexOf(String str, int fromIndex) {
            return value.lastIndexOf(str, fromIndex);
        }

        public int length() {
            return value.length();
        }

        public boolean matches(String regex) {
            return value.matches(regex);
        }

        public int offsetByCodePoints(int index, int codePointOffset) {
            return value.offsetByCodePoints(index, codePointOffset);
        }

        public boolean regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len) {
            return value.regionMatches(ignoreCase, toffset, other, ooffset, len);
        }

        public boolean regionMatches(int toffset, String other, int ooffset, int len) {
            return value.regionMatches(toffset, other, ooffset, len);
        }

        public String replace(char oldChar, char newChar) {
            return value.replace(oldChar, newChar);
        }

        public String replace(CharSequence target, CharSequence replacement) {
            return value.replace(target, replacement);
        }

        public String replaceAll(String regex, String replacement) {
            return value.replaceAll(regex, replacement);
        }

        public String replaceFirst(String regex, String replacement) {
            return value.replaceFirst(regex, replacement);
        }

        public String[] split(String regex) {
            return value.split(regex);
        }

        public String[] split(String regex, int limit) {
            return value.split(regex, limit);
        }

        public boolean startsWith(String prefix) {
            return value.startsWith(prefix);
        }

        public boolean startsWith(String prefix, int toffset) {
            return value.startsWith(prefix, toffset);
        }

        public CharSequence subSequence(int beginIndex, int endIndex) {
            return value.subSequence(beginIndex, endIndex);
        }

        public String substring(int beginIndex) {
            return value.substring(beginIndex);
        }

        public String substring(int beginIndex, int endIndex) {
            return value.substring(beginIndex, endIndex);
        }

        public char[] toCharArray() {
            return value.toCharArray();
        }

        public String toLowerCase() {
            return value.toLowerCase();
        }

        public String toLowerCase(Locale locale) {
            return value.toLowerCase(locale);
        }

        public String toString() {
            return value.toString();
        }

        public String toUpperCase() {
            return value.toUpperCase();
        }

        public String toUpperCase(Locale locale) {
            return value.toUpperCase(locale);
        }

        public String trim() {
            return value.trim();
        }

        public static String valueOf(boolean b) {
            return String.valueOf(b);
        }

        public static String valueOf(char c) {
            return String.valueOf(c);
        }

        public static String valueOf(char[] data) {
            return String.valueOf(data);
        }

        public static String valueOf(char[] data, int offset, int count) {
            return String.valueOf(data, offset, count);
        }

        public static String valueOf(double d) {
            return String.valueOf(d);
        }

        public static String valueOf(float f) {
            return String.valueOf(f);
        }

        public static String valueOf(int i) {
            return String.valueOf(i);
        }

        public static String valueOf(long l) {
            return String.valueOf(l);
        }

        public static String valueOf(Object obj) {
            return String.valueOf(obj);
        }

        public static void main(String[] args) throws Exception {
            StringFunctions sf = new StringFunctions("Hello, World!");
            System.out.println("charAt(1): " + sf.charAt(1));
            System.out.println("codePointAt(1): " + sf.codePointAt(1));
            System.out.println("codePointBefore(1): " + sf.codePointBefore(1));
            System.out.println("codePointCount(0,5): " + sf.codePointCount(0, 5));
            System.out.println("compareTo('Hello'): " + sf.compareTo("Hello"));
            System.out.println("compareToIgnoreCase('hello, world!'): " + sf.compareToIgnoreCase("hello, world!"));
            System.out.println("concat(' Test'): " + sf.concat(" Test"));
            System.out.println("contains('World'): " + sf.contains("World"));
            System.out.println("contentEquals('Hello, World!'): " + sf.contentEquals("Hello, World!"));
            System.out.println("endsWith('!'): " + sf.endsWith("!"));
            System.out.println("equals('Hello, World!'): " + sf.equals("Hello, World!"));
            System.out.println("equalsIgnoreCase('hello, world!'): " + sf.equalsIgnoreCase("hello, world!"));
            System.out.println("format('%s %d', 'Number:', 10): " + StringFunctions.format("%s %d", "Number:", 10));
            System.out.println("getBytes().length: " + sf.getBytes().length);
            System.out.println("hashCode(): " + sf.hashCode());
            System.out.println("indexOf('o'): " + sf.indexOf('o'));
            System.out.println("isEmpty(): " + sf.isEmpty());
            System.out.println("join('-', 'a', 'b', 'c'): " + StringFunctions.join("-", "a", "b", "c"));
            System.out.println("lastIndexOf('l'): " + sf.lastIndexOf('l'));
            System.out.println("length(): " + sf.length());
            System.out.println("matches('.*World.*'): " + sf.matches(".*World.*"));
            System.out.println("replace('l', 'x'): " + sf.replace('l', 'x'));
            System.out.println("replaceAll('l', 'L'): " + sf.replaceAll("l", "L"));
            System.out.println("split(',')[0]: " + sf.split(",")[0]);
            System.out.println("startsWith('Hello'): " + sf.startsWith("Hello"));
            System.out.println("substring(7): " + sf.substring(7));
            System.out.println("toLowerCase(): " + sf.toLowerCase());
            System.out.println("toUpperCase(): " + sf.toUpperCase());
            System.out.println("trim(): " + sf.trim());
            System.out.println("valueOf(123): " + StringFunctions.valueOf(123));
        }

    }
}

        // Example main method to demonstrate usage


