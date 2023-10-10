package cylinder;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double r = Double.parseDouble(scan.nextLine());
        double h = Double.parseDouble(scan.nextLine());
        double p = Math.PI;

        System.out.printf("V = %.2f", (p * r * r * h));

        }
}
