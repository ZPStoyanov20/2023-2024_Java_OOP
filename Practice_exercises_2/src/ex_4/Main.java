package ex_4;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String sym = scan.nextLine();
        double num1 = Double.parseDouble(scan.nextLine());
        double num2 = Double.parseDouble(scan.nextLine());
        if(sym.equals("+")) {
            System.out.printf("%.2f + %.2f = %.2f", num1, num2, (num1 + num2));
        }
        if(sym.equals("-")) {
            System.out.printf("%.2f - %.2f = %.2f", num1, num2, (num1 - num2));
        }
        if(sym.equals("*")) {
            System.out.printf("%.2f * %.2f = %.2f", num1, num2, (num1 * num2));
        }
        if(sym.equals("/")) {
            System.out.printf("%.2f / %.2f = %.2f", num1, num2, (num1 / num2));
        }

    }
}
