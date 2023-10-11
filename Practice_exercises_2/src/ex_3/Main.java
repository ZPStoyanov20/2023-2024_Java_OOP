package ex_3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        System.out.printf("prosto li e: %b",simple(num));
    }
    static boolean simple(int num)
    {
        for(int i = 2; i < num; i++)
        {
            if(num % i == 0)
                return false;
        }
        return true;
    }
}
