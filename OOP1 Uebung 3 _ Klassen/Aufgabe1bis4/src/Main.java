public class Main {
    public static void main (String[] args) {
        //__________________________________________________________
        // Bank test-managers, test-customers, and test-accounts:

        // new Manager
        BankManager claude = new BankManager("Claude Bregenzer", 2);
        BankManager hans = new BankManager("Hans Müller", 1);

        // new Customers
        BankCustomer mattia = new BankCustomer("Mattia", "Stettler", 22, "Via d'Immez 3", hans);
        BankCustomer melanie = new BankCustomer("Melanie", "Müller", 27, "Hauptstrasse 99", hans);
        BankCustomer luca = new BankCustomer("Luca", "Heinrich", 55, "Neue Jonastr. 95", claude);

        // Opening of Accounts:
        BankAccount accountMattia = new BankAccount(mattia);
        BankAccount accountStoksMattia = new BankAccount(mattia);
        BankAccount accountMelanie = new BankAccount(melanie);
        BankAccount accountStoksMelanie = new BankAccount(melanie);
        BankAccount accountLuca = new BankAccount(luca);

        //____________________________________________________________
        //------TEST PURPOSE ONLY BELOW------


        // Transaction for Test-purpose ONLY
        accountMattia.deposit(300);
        accountMattia.withdraw(80);

        accountStoksMattia.deposit(4_000);
        accountStoksMattia.deposit(-480);

        accountMelanie.deposit(30);
        accountMelanie.withdraw(40);

        accountStoksMelanie.deposit(3_900_000);

        accountLuca.withdraw(40_000);

        // Test print methods task 4
        accountMattia.print();
        luca.print();
        System.out.println("Same customer <<check account mattia/mattia --> TRUE>>: " + accountMattia.sameCustomer(accountMattia, accountStoksMattia));
        System.out.println("Same customer <<check account mattia/melanie --> FALSE>>: " + accountMattia.sameCustomer(accountMelanie, accountStoksMattia));
        System.out.println("Get manager <<check account mattia>>: ");
        accountMattia.getManager().print();
        // Output Bank Balance for debug/ test/ visualize ONLY
        System.out.println("____________________________________________________");
        System.out.println("Balance account Mattia    " + accountMattia.getBalance());
        System.out.println("Balance stoks Mattia      " + accountStoksMattia.getBalance());
        System.out.println("Balance account Melanie   " + accountMelanie.getBalance());
        System.out.println("Balance stoks Melanie     " + accountStoksMelanie.getBalance());
        System.out.println("Balance account Luca      " + accountLuca.getBalance());

    }
}
