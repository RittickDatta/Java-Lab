public class StringDemo {
    public static void main(String args[]) {
        String string1 = "Hello World";
        System.out.println(string1);

        Integer length = string1.length();
        System.out.println("Length of String: " + length);

        String string2 = " It is a good day";
        String newString = string1.concat(string2);
        System.out.println(newString);

        System.out.print("This is a sentence: " + newString + "Sentence is over");


        String fs = String.format("Integer: %d. Float: %f, String: %s", 1, 1.0, string1);
        System.out.println(fs);



    }
}