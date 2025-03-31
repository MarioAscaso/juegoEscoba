package input;

import java.util.Scanner;

public class InputKeyboard {
    private static final Scanner sc =  new Scanner(System.in);

    private static String stringValue;
    private static void getString(){stringValue = sc.nextLine();}
    public static String getStringValue(){
        getString();
        return stringValue;
    }

}
