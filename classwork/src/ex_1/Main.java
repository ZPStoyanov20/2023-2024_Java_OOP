package ex_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        while(!command.equals("End"))
        {
            String[] tokens = command.split("\\s+");
            String actualCommand = tokens[0];
            BankAccount bankAccount;
            if(actualCommand.equals("Create"))
            {
                bankAccount = new BankAccount();
            } else if(actualCommand.equals("Deposit"))
            {
                int id = Integer.parseInt(tokens[1]);
                int amount = Integer.parseInt(tokens[2]);
                bankAccount.deposit(amount);
            } else if(actualCommand.equals("SetInterest"))
            {

            } else if(actualCommand.equals("GetInterest"))
            {

            }
            else {

            }

            command = scanner.nextLine();
        }
    }
}