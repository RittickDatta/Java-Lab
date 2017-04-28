import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionsRevision {
    public static void main(String[] args){
        String line = "Hi, this is the best place in the world! Do you agree?";

        String pattern = "(^[best]$)";

        Pattern pattern1 = Pattern.compile(pattern);

        Matcher matcher = pattern1.matcher(line);

        if(matcher.find()){
            System.out.println(matcher.group(0));
            System.out.println(matcher.group(1));
            System.out.println(matcher.group(2));
        }else {
            System.out.println("NO MATCH!");
        }
    }
}
