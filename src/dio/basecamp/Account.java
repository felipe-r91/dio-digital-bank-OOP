package dio.basecamp;




public class Account{
    private static final int AGENCY_DEFAULT = 1;
    private static int SEQUENTIAL = 1;

    protected int agency;
    protected int number;
    protected double balance;
    protected Client client;
    protected Bank bank;

    public Account(Client client, Bank bank){
        this.bank = bank;
        this.agency = AGENCY_DEFAULT;
        this.number = SEQUENTIAL++;
        this.client = client;

    }

    public void withdraw(double value) {
        balance -= value;

    }

    public void deposit(double value) {
        balance += value;

    }

    public void transfer(double value, Account destinyAccount) {
        this.withdraw(value);
        destinyAccount.deposit(value);
    }



    public void printCommonInfo(){
        System.out.printf("Bank: %s%n", this.bank.getName());
        System.out.printf("Client: %s%n", this.client.getName());
        System.out.printf("Agency: %d%n", this.agency );
        System.out.printf("Account: %d%n", this.number);
        System.out.printf("Balance: %.2f%n", this.balance);

    }

}
