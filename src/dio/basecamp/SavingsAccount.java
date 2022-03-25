package dio.basecamp;

public class SavingsAccount extends Account{


    public SavingsAccount(Client client, Bank bank) {
        super(client, bank);
        savingsIncome();

    }

    @Override
    public void printCommonInfo() {
        System.out.println("=== Savings Account Balance ===");
        super.printCommonInfo();
    }

    public void savingsIncome(){
        if(balance > 0){
            double originalBalance = this.balance;
            balance += (this.balance * 0.005);
            double income = this.balance - originalBalance;
            System.out.printf("Your savings paid off: %.2f%n", income);
            System.out.printf("Actual balance: %.2f%n", balance);
        }


    }
}
