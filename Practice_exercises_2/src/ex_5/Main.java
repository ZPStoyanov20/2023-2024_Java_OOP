package ex_5;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int ans = rand.nextInt(1,100);
        int input = Integer.parseInt(scan.nextLine());
        while (ans != input)
        {
            if(input > ans)
            {
                System.out.println("down");
            }
            else if(input < ans) {
                System.out.println("up");
            }
            input = Integer.parseInt(scan.nextLine());
        }
        System.out.println("Well done!!!");
    }
}
