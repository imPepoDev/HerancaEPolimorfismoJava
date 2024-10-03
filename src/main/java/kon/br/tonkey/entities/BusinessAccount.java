package kon.br.tonkey.entities;

public class BusinessAccount extends Account {
    private double loanLimit;

    public BusinessAccount() { super(); }

    public BusinessAccount(Integer number, String holder, Double balance, double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan (double amount) {
        if (amount <= loanLimit) {
            deposit(amount);
        }
        else {
            System.out.println("Não compativel com seu limite");
        }
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        balance -= 2.0;
    }
}
