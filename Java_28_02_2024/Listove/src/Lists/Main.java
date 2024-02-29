package Lists;

import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> printerQueue = new ArrayDeque<>();
        String input = scanner.nextLine();
        while (!input.equals("print"))
        {
            if(!input.equals("cancel"))
            {
                printerQueue.offer(input);
            }else{
                System.out.println("Canceled " + printerQueue.poll());
            }

            input=scanner.nextLine();
        }
        printerQueue.forEach(e -> System.out.println(e));
    }
}