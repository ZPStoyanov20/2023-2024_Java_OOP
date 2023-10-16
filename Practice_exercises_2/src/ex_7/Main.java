package ex_7;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String sent = scan.nextLine();
        String arr[] = sent.split(" ");

        for(int i = arr.length - 1; i >= 0;i--)
            System.out.print(arr[i] + " ");
    }
}
