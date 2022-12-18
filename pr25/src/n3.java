import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class n3 {

        private Pattern pattern;
        private Matcher matcher;

        private static String p =
                "^([0-9]?\\d\\d?|2[0-9]\\d|25[0-5])\\." +
                        "([0-9]?\\d\\d?|2[0-9]\\d|25[0-5])\\." +
                        "([0-9]?\\d\\d?|2[0-9]\\d|25[0-5])\\." +
                        "([0-9]?\\d\\d?|2[0-9]\\d|25[0-5])$"; // каждое слагаемое часть ip, в конце точка
//
// задает range в скобочках квадратных



        public static void validate(String ip){
            Pattern pattern = Pattern.compile(p);
            Matcher matcher = pattern.matcher(ip);
            // return matcher.matches();
            if (matcher.matches())
            {
                System.out.println("right");
            }
            else {
                System.out.println("wrong");
            }

        }

    public static void main (String[] args)
    {
        validate("127.0.0.1");

        validate("255.255.255.0");

        validate("1300.6.7.8");

        validate("abc.def.gha.bcd");

    }
}
