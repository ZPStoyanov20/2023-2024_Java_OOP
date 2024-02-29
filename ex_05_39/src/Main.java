import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Dell dell = new Dell(name);
        System.out.print(dell.getDetails());
    }
}