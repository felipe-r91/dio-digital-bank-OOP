package dio.basecamp;

public class CheckingAccount extends Account{


    public CheckingAccount(Client client, Bank bank) {
        super(client, bank);
    }


    @Override
    public void printCommonInfo() {
        System.out.println("=== Checking Account Balance ===");
        super.printCommonInfo();
    }
}
