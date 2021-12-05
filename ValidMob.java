import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidMob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Pattern p = Pattern.compile("[0|91]?[0-9]{10}");
        Matcher M = p.matcher(str);
        int c=0;
        while (M.find())
        {
            c++;
            if(c==0)
            {
                System.out.println("Invalid number");
            }
            else
                System.out.println("Valid number");
        }

    }
}
