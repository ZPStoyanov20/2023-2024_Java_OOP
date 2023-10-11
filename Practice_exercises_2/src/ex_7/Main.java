package ex_7;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String sent = scan.nextLine();
        int len = 0;
        boolean flag = false;
        boolean lastFlag = true;
        String[] arr = new String[100];

        for(int i = 0; i < sent.length(); i++) {
            String word = "";
            if (sent.charAt(i) == ' ') {
                len++;
                flag = !flag;
            }
            if (lastFlag != flag) {
                arr[len] = word;
                len++;
                lastFlag = flag;
            }
            else
            {
                word += sent.charAt(i);
            }
        }
        System.out.println(arr[0]);
    }
}
