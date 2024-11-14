package bank;

public class BankTransferImpl implements BankTransfer{

	private final int fee = 1;
	
    @Override
    public void transfer(BankAccount from, BankAccount to, int amount) {
        if (from.getBalance() < amount) {
            throw new IllegalArgumentException("You have no enough money!!!");
        }

        from.withdraw(amount);
        to.deposit(amount);
    }

    public BankAccount openAccount(int balance) {
        return new BankAccount(balance);
    }
}


