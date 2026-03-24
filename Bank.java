
import java.util.*;

class Account {
    int acNumber;
    String pass;
    String name;
    String Email;
    int balace = 0;
    static int Member = 0;

    int showBalance() {
        return balace;
    }

    void deposit(int x) {
        balace += x;
    }

    void withdraw(int x) {
        if (balace < x) {
            System.out.println("Not enough balance");
            return;
        } else {
            balace -= x;
        }
    }

    void SendMoney(Account[] accounts, int id, int amount, int c) {
        if (amount > balace) {
            System.out.println("Not enough balance");
            return;
        }
        int index = -1;
        for (int i = 0; i < c; i++) {
            if (accounts[i].acNumber == id) {
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("Account doesn't exist");
            return;
        }
        this.withdraw(amount);
        accounts[index].deposit(amount);

    }

    Account() {
        Member++;
    }

    Account(String name, String p, String email) {
        Member++;
        acNumber = Member;
        this.name = name;
        pass = p;
        Email = email;
    }

}

public class Bank {
    static void showMenu1() {
        System.out.println("1. Create Account");
        System.out.println("2. Log in");
    }

    static void showMenu2() {
        System.out.println("1. Send money");
        System.out.println("2. Depositn");
        System.out.println("3. Withdraw");
        System.out.println("4. Check balance");
        System.out.println("5. Exit");
    }

    static Account CreateAccount() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String n = scanner.nextLine();
        System.out.print("Enter email: ");
        String e = scanner.nextLine();
        System.out.print("Enter password: ");
        String p = scanner.nextLine();
        Account account = new Account(n, p, e);

        return account;
    }

    static int LogIn(Account[] accounts, String e, String p, int c) {
        int index = -1;
        for (int i = 0; i < c; i++) {
            if (accounts[i].Email.equals(e) == true && accounts[i].pass.equals(p) == true) {
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        System.out.print("Enter member limit:");
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int n = scanner.nextInt();
        scanner.nextLine();
        int count = 0;
        Account[] accounts = new Account[n];
        String quite = "";
        System.out.println("");
        do {// showing menu 1
            showMenu1();
            System.out.print("Enter:");
            int c1 = scanner.nextInt();
            scanner.nextLine();
            switch (c1) {
                case 1:
                    if (count == n) {
                        System.out.println("No more Accounts can be added.");
                        break;
                    }
                    Account a = CreateAccount();
                    accounts[count] = a;
                    count++;
                    break;
                case 2:
                    System.out.print("Enter email: ");
                    String e = scanner.nextLine();
                    System.out.print("Enter password: ");
                    String p = scanner.nextLine();
                    int index = LogIn(accounts, e, p, count);
                    if (index == -1) {
                        System.out.println("No accounts found!!");
                        break;
                    }
                    showMenu2();
                    System.out.print("Enter:");
                    int c2 = scanner.nextInt();
                    scanner.nextLine();
                    switch (c2) {
                        case 1:
                            System.out.print("Enter amount: ");
                            int amount = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Enter account number:");
                            int ac = scanner.nextInt();
                            scanner.nextLine();
                            accounts[index].SendMoney(accounts, ac, amount, count);
                            break;
                        case 2:
                            System.out.print("Enter amount: ");
                            amount = scanner.nextInt();
                            scanner.nextLine();
                            accounts[index].deposit(amount);
                            break;
                        case 3:
                            System.out.print("Enter amount: ");
                            amount = scanner.nextInt();
                            scanner.nextLine();
                            accounts[index].withdraw(amount);
                            break;
                        case 4:
                            System.out.println("Balance: " + accounts[index].showBalance());
                        case 5:
                            break;
                        default:
                            System.out.println("Wrong!!");
                            break;
                    }
                    break;

                default:
                    System.out.println("Wrong!!");
                    break;
            }
            System.out.print("Enter Q to leave: ");
            quite = scanner.nextLine().toUpperCase();
        } while (!quite.equals("Q"));
        scanner.close();
    }

}
