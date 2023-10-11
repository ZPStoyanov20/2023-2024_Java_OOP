package ex_6;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String sent = scan.nextLine();
        if(isPalindrom(sent) == true)
            System.out.print("its Palindrom");
        else
            System.out.print("its NOT Palindrom");
    }
    static boolean isPalindrom(String str)
    {
        for(int i = 0; i < str.length() / 2; i++)
        {
            if(str.charAt(i) != str.charAt(str.length() - i -1 ))
            {
                return false;
            }
        }
        return true;
    }
}
