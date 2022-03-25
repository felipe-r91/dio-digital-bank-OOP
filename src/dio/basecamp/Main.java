package dio.basecamp;



public class Main {
    public static void main(String[] args) {

        Bank hsbc = new Bank();
        hsbc.setName("HSBC");

        Client felipe = new Client();
        felipe.setName("Felipe");

        Client franciele = new Client();
        franciele.setName("Franciele");

        Account ca = new CheckingAccount(felipe, hsbc);
        SavingsAccount sa = new SavingsAccount(felipe, hsbc);
        Account ca1 = new CheckingAccount(franciele, hsbc);
        Account sa1 = new SavingsAccount(franciele,hsbc);

        ca.deposit(7000);
        ca.transfer(500,sa);
        ca.printCommonInfo();
        sa.printCommonInfo();
        sa.savingsIncome();
        ca1.deposit(5000);
        ca1.transfer(700,sa1);
        ca1.printCommonInfo();
        sa1.printCommonInfo();
    }
}