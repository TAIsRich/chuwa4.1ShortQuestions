package exception_hw;
import com.sun.nio.sctp.SendFailedNotification;

import java.util.Scanner;
import java.lang.Exception;
import java.util.regex.Pattern;

public class Exception_LY {

    public static void main(String[] args)
    {
        try {
            myObj = new Scanner(System.in);
            System.out.println("Enter your email: ");

            String userEmail = myObj.nextLine();
        }
        catch(Exception e//SendFailedNotification s)
        {
            e.printStack
        }



    }

    public static boolean patternMatches(String emailAddress, String regexPattern)
    {
        return Pattern.compile(regexPattern)
                .matcher(emailAddress)
                .matches();
    }
    private void sendEmail(String host, String port)

}
