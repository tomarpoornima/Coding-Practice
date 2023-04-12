import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(".xx.");
        Matcher matcher = pattern.matcher("Mxxy");
        System.out.println(matcher.matches());
        //pattern = Pattern.compile("*xx*"); PatterhSyntaxException

        String str = "bbb";
        System.out.println(str.matches(".bb"));
        System.out.println(Pattern.matches(".bb", str));
    }
}
