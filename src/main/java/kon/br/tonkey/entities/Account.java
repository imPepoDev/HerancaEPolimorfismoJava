package kon.br.tonkey.entities;

public class Account {
    private Integer number;
    private String holder;
    protected Double balance;

    public Account() {}

    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    // Lógica para o balance ( COMEÇO )

    public Double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Você não pode retirar um valor maior do que seu saldo.");
        } else if (amount <= balance) {
            balance -= amount + 5;
            System.out.println("Operação realizada com êxito.");
        }
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Operação realizada com êxito.");
    }

    // Lógica para o balance ( Fim )

}
