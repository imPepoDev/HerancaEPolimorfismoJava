package kon.br.tonkey;

import kon.br.tonkey.entities.Account;
import kon.br.tonkey.entities.BusinessAccount;
import kon.br.tonkey.entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {

        Account acc = new Account(1, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.00, 500.00);

        // Upcasting (
        //            • Casting da subclasse para superclasse
        //            • Uso comum: polimorfismo
        //)

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.00, 200.00);
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

        // Downcasting (
        //            • Casting da superclasse para subclasse
        //            • Palavra instanceof
        //            • Uso comum: métodos que recebem parâmetros genéricos (ex: Equals)
        //)

        // BusinessAccount acc4 = acc2; -> TypeError
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

        Account acc01 = new Account(1001, "Pedro", 200.0);
        acc01.withdraw(100);

        System.out.println(acc01.getBalance());

        Account acc02 = new SavingsAccount(1002, "Alex", 200.0, 0.1);
        acc02.withdraw(100);
        System.out.println(acc02.getBalance());

        Account acc03 = new BusinessAccount(1003, "John", 1000.0, 500.0);
        acc03.withdraw(200);
        System.out.println(acc03.getBalance());


    }
}