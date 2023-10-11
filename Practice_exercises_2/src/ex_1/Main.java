package ex_1;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String nums = scan.nextLine();
        ArrayList<Integer> arr = new ArrayList<>();
        String num = "";
        for (int i = 0; i < nums.length(); i++) {
            if (nums.charAt(i) != ' ') {
                num += nums.charAt(i);
            } else {
                if (!num.isEmpty()) {
                    arr.add(Integer.parseInt(num));
                    num = "";
                }
            }
        }
        if (!num.isEmpty()) {
            arr.add(Integer.parseInt(num));
        }
        int ans = 0;
        for (int i = 0; i < arr.size(); i++) {
            ans += arr.get(i);
        }
        double average = (double) ans / arr.size();
        System.out.printf("%.2f",average);
    }
}
