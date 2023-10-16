package ex_9;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double temp = Double.parseDouble(scan.nextLine());
        System.out.printf("Celsius to Fahrenheit is %.2f",(temp*(9/5) + 32));
    }
}
