import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class n4 {

    private Pattern pattern;
    private Matcher matcher;



    private static void checkExpression(String input) {
        // input.replaceAll("[^0-9],", "");
        //input.replaceAll("\\*", "");
        input= input.replaceAll("\\w|\\d|\s|\\*|\\+|\\–", "");



        System.out.println(input);

        Pattern pattern = Pattern.compile("(^((?:\\((?)\\)|\\)(?)\\)|)++)$)");
        Matcher matcher = pattern.matcher(input);
        if(matcher.find()) {
            System.out.println("right");
        }
        else
        {
            System.out.println("wrong");
        }
    }

    public static void main (String[] args)
    {
        checkExpression("(3*+*5)*–*9*4");



        checkExpression("(3*+*5)*–*9***4()()()()()()()()()()()()()()()()()((()()()()()())()()()()())");


    }
}
