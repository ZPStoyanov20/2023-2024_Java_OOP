import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car myClass = new Car();
        String name = scanner.nextLine();
        myClass.setDetails(name);
        System.out.printf("%s, %s, %s",myClass.getDetails(),myClass.getModel(),myClass.getSpeed());
    }
}