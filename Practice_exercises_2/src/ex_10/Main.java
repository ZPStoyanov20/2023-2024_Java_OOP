package ex_10;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int p = Integer.parseInt(scan.nextLine());
        System.out.print(recourse(p));
    }
    static int recourse(int p)
    {
        if(p <= 0)
            return 1;
        else {
            return p * recourse(p - 1);
        }
    }
}
