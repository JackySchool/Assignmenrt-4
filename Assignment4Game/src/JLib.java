import java.util.*;
import java.util.concurrent.TimeUnit;
public class JLib {
    public static void main(String[] args) throws Exception {
    }

    public static void print(String text) {
        System.out.println(text);
    }

    public static String textreadout(String text) throws InterruptedException {
        String letter = "";
        for(int x = 0; x<text.length(); x++) {
            char getletter = text.charAt(x);
            letter = String.valueOf(getletter);
        }
        TimeUnit.SECONDS.sleep(1);
        return letter;
    }  
}
