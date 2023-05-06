package sabaq;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Task_01 {
    public static void main(String[] args){
        String text = "eraaaslhaadfaa";
        int count = 0;
        Pattern pattern = Pattern.compile("(?=aa(?!a))");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            count++;
        }
        System.out.println(count);
    }
}
