package ex_8;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        System.out.print(face(a,b));
    }
    static int face(int a, int b)
    {
        return a * b;
    }
}
