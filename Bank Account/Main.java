public class Main {
    public static void main(String[] args) {
        Account account = new Account(500, "Raunak", "Maheshwari");
        account.printName();
        account.printBalance();
        account.getTransactions();
        account.updateBalance();
        account.checkNegativeBalance();
    }
}