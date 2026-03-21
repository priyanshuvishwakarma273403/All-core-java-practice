//package Practice;
//
//public class cwh_119 {
//    public static void main(String[] args) {
//
//
//        public boolean regionMatches ( boolean ignoreCase, int toffset, String other,int ooffset, int len){
//            return value.regionMatches(ignoreCase, toffset, other, ooffset, len);
//        }
//
//        public boolean regionMatches ( int toffset, String other,int ooffset, int len){
//            return value.regionMatches(toffset, other, ooffset, len);
//        }
//
//        public String replace ( char oldChar, char newChar){
//            return value.replace(oldChar, newChar);
//        }
//
//        public String replace (CharSequence target, CharSequence replacement){
//            return value.replace(target, replacement);
//        }
//
//        public String replaceAll (String regex, String replacement){
//            return value.replaceAll(regex, replacement);
//        }
//
//        public String replaceFirst (String regex, String replacement){
//            return value.replaceFirst(regex, replacement);
//        }
//
//        public String[] split (String regex){
//            return value.split(regex);
//        }
//
//        public String[] split (String regex,int limit){
//            return value.split(regex, limit);
//        }
//
//        public boolean startsWith (String prefix){
//            return value.startsWith(prefix);
//        }
//
//        public boolean startsWith (String prefix,int toffset){
//            return value.startsWith(prefix, toffset);
//        }
//
//        public CharSequence subSequence ( int beginIndex, int endIndex){
//            return value.subSequence(beginIndex, endIndex);
//        }
//
//        public String substring ( int beginIndex){
//            return value.substring(beginIndex);
//        }
//
//        public String substring ( int beginIndex, int endIndex){
//            return value.substring(beginIndex, endIndex);
//        }
//
//        public char[] toCharArray () {
//            return value.toCharArray();
//        }
//
//        public String toLowerCase () {
//            return value.toLowerCase();
//        }
//
//        public String toLowerCase (Locale locale){
//            return value.toLowerCase(locale);
//        }
//
//        public String toString () {
//            return value.toString();
//        }
//
//        public String toUpperCase () {
//            return value.toUpperCase();
//        }
//
//        public String toUpperCase (Locale locale){
//            return value.toUpperCase(locale);
//        }
//
//        public String trim () {
//            return value.trim();
//        }
//
//        public static String valueOf ( boolean b){
//            return String.valueOf(b);
//        }
//
//        public static String valueOf ( char c){
//            return String.valueOf(c);
//        }
//
//        public static String valueOf ( char[] data){
//            return String.valueOf(data);
//        }
//
//        public static String valueOf ( char[] data, int offset, int count){
//            return String.valueOf(data, offset, count);
//        }
//
//        public static String valueOf ( double d){
//            return String.valueOf(d);
//        }
//
//        public static String valueOf ( float f){
//            return String.valueOf(f);
//        }
//
//        public static String valueOf ( int i){
//            return String.valueOf(i);
//        }
//
//        public static String valueOf ( long l){
//            return String.valueOf(l);
//        }
//
//        public static String valueOf (Object obj){
//            return String.valueOf(obj);
//        }
//    }
//
//
//
//        // Example main method to demonstrate usage
//        public static void main(String[] args) throws Exception {
//            StringFunctions sf = new StringFunctions("Hello, World!");
//        System.out.println("charAt(1): " + sf.charAt(1));
//        System.out.println("codePointAt(1): " + sf.codePointAt(1));
//        System.out.println("codePointBefore(1): " + sf.codePointBefore(1));
//        System.out.println("codePointCount(0,5): " + sf.codePointCount(0,5));
//        System.out.println("compareTo('Hello'): " + sf.compareTo("Hello"));
//        System.out.println("compareToIgnoreCase('hello, world!'): " + sf.compareToIgnoreCase("hello, world!"));
//        System.out.println("concat(' Test'): " + sf.concat(" Test"));
//        System.out.println("contains('World'): " + sf.contains("World"));
//        System.out.println("contentEquals('Hello, World!'): " + sf.contentEquals("Hello, World!"));
//        System.out.println("endsWith('!'): " + sf.endsWith("!"));
//        System.out.println("equals('Hello, World!'): " + sf.equals("Hello, World!"));
//        System.out.println("equalsIgnoreCase('hello, world!'): " + sf.equalsIgnoreCase("hello, world!"));
//        System.out.println("format('%s %d', 'Number:', 10): " + StringFunctions.format("%s %d", "Number:", 10));
//        System.out.println("getBytes().length: " + sf.getBytes().length);
//        System.out.println("hashCode(): " + sf.hashCode());
//        System.out.println("indexOf('o'): " + sf.indexOf('o'));
//        System.out.println("isEmpty(): " + sf.isEmpty());
//        System.out.println("join('-', 'a', 'b', 'c'): " + StringFunctions.join("-", "a", "b", "c"));
//        System.out.println("lastIndexOf('l'): " + sf.lastIndexOf('l'));
//        System.out.println("length(): " + sf.length());
//        System.out.println("matches('.*World.*'): " + sf.matches(".*World.*"));
//        System.out.println("replace('l', 'x'): " + sf.replace('l', 'x'));
//        System.out.println("replaceAll('l', 'L'): " + sf.replaceAll("l", "L"));
//        System.out.println("split(',')[0]: " + sf.split(",")[0]);
//        System.out.println("startsWith('Hello'): " + sf.startsWith("Hello"));
//        System.out.println("substring(7): " + sf.substring(7));
//        System.out.println("toLowerCase(): " + sf.toLowerCase());
//        System.out.println("toUpperCase(): " + sf.toUpperCase());
//        System.out.println("trim(): " + sf.trim());
//        System.out.println("valueOf(123): " + StringFunctions.valueOf(123));
//    }
//}
