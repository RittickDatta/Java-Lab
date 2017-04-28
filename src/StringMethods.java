import java.io.UnsupportedEncodingException;

/**
 * Created by Rittick on 4/28/2017.
 */
public class StringMethods {
    public static void main(String args[]) throws UnsupportedEncodingException {
        String string1 = "Hi, How are you? My name is Rittick.";
        String string2 = "Hi, How are you? My name is Rittick.";
        char[] charArray= {'h', 'e', 'l', 'l', 'o'};
        String string3 ="";

        System.out.println(string1.charAt(0));
        System.out.println(string1.charAt(string1.length()-1));

        System.out.println(string1.compareTo(string2));

        System.out.println(string1.contentEquals(string2));

        System.out.println(string3.copyValueOf(charArray));

        System.out.println(string3.copyValueOf(charArray, 1,2));

        System.out.println(string1.endsWith("."));

        System.out.println(string1.equals(string2));

        System.out.println(new String(string1.getBytes("UTF-8")));

        char[] str = new char[5];
        string1.getChars(0,5,str,0);
        System.out.println(str); //Excluding the last index

        System.out.println(string1.hashCode());

        System.out.println(string1);
        System.out.println(string1.indexOf('i'));

        System.out.println(string1.indexOf('o',6));

        System.out.println(string1.indexOf("name"));

        System.out.println(string1.indexOf("Rittick", 10));

        System.out.println(string1.intern());

        System.out.println(string1.lastIndexOf('H'));

        System.out.println(string1.lastIndexOf('s', 10));

        System.out.println(string1.lastIndexOf("My"));

        System.out.println(string1.length());

        System.out.println(string1.regionMatches(true, 2, string2, 0, string2.length()));

        String string4 =" I want a candy";

        System.out.println(string4.replace('I', 'V'));

        System.out.println(string4.replaceAll(".",  "We"));

        String splitThis = "Hi-You-Are-A_Winner";
        System.out.println(splitThis.split("-")[3]);

        System.out.println(splitThis.split("-", 3)[1]);

        System.out.println(string1.startsWith("Hello"));

        String s ="Hi Hello";
        System.out.println(s.startsWith("Hello", 3));

        System.out.println(string1.subSequence(0,2));
        System.out.println(string1.substring(4));
        System.out.println(string1.substring(4, 7));

        char[] chars = string1.toCharArray();
        System.out.println(chars[4]);

        System.out.println(string1.toLowerCase());
        System.out.println(string1.toUpperCase());
        System.out.println(str.toString());

        System.out.println("   Hello    World   ".trim());
        System.out.println(String.valueOf("100"));
    }
}
