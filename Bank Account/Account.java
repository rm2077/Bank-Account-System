import java.util.ArrayList;
import java.util.Scanner;

public class Account{
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<Integer>();
    private int balance;
    String first_name;
    String last_name;
    Account(int balance, String first_name, String last_name) {
        this.balance = balance;
        this.first_name = first_name;
        this.last_name = last_name;
        
    }
    public void printName() {
        System.out.println(first_name + " " + last_name + "'s bank account");
    }

    public void printBalance() {
        System.out.println("Balance: " + balance);
    }
 
    public void getTransactions() {
        while(list.size() != 5) {
            try {
                System.out.println("Please enter your transactions ");
                int transaction = scanner.nextInt();
                list.add(transaction);
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
            
        }

    }

    public void updateBalance() {
        for (int i: list) {
            balance -= i;
        }
        System.out.println("Your balance is now: " + balance);
    }

    public void checkNegativeBalance() {
        if (balance < 0) {
            System.out.println("Your balance is in the negative");
        } else {
            System.out.println("Your balance is in the clear. Phew!");
        }
    }
}
