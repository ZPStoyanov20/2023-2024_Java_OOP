package ex_2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        System.out.print(factoriel(num));
    }
    static int factoriel(int num)
    {
        int flag = 1;
        for(int i = 1; i <= num; i++)
        {
            flag *= i;
        }
        return flag;
    }
};
