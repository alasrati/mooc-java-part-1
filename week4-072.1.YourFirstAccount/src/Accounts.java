
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        Account a = new Account("me", 100.0);
        a.deposit(20.0);
        System.out.println(a);
    }

}
