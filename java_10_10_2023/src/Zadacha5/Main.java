package Zadacha5;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = Double.parseDouble(scan.nextLine());
        double b = Double.parseDouble(scan.nextLine());
        System.out.printf("a + b = %.2f%na - b = %.2f",(a + b),(a - b));
        }
}
