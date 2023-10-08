import java.util.Scanner;

class bank1 {

    static int balance = 10000;
    static int newbal;

    

}

public class task3 extends bank1 {

    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {

            System.out.println("JAVA BANK ATM");
            System.out.print("PLEASE CHOOSE THE OPTIONS BELOW: \n1.WITHDRAW\n2.DEPOSIT\n3.CHECK BALANCE\n4.EXIT\n");

            Scanner sc = new Scanner(System.in);
            int opt = sc.nextInt();
            if (opt == 1) {
                withdraw(balance);
            } else if (opt == 2) {
                System.out.println("DIPOSIT SECURE PAGE");
                System.out.print("ENTER THE AMOUNT: ");
                int dip = sc.nextInt();
                deposit(balance, dip);

            } else if (opt == 3) {

                checkbal(newbal);
            } else if (opt == 4) {
                System.out.println("SUCCESSFULLY EXITED");
                break;
            }

            else {
                System.out.println("WRONG INPUT");
            }
            
        }
    }

    public static void withdraw(int balance) {
        System.out.println("WITHDRAW SECURE PAGE");
        System.out.print("ENTER THE AMOUNT: ");
        Scanner with = new Scanner(System.in);

        int a = with.nextInt();
        if (a > balance) {
            System.out.println("WITHDRAW IS UNSUCCESSFUL INSUFFECIENT BALANCE\n");
        } else if (a <= balance) {
            newbal = balance - a;
            System.out.println("WITHDWAW SUCCESSFUL\nYOUR BALANCE: " + newbal + "\n");
        }
        
    }

    public static void deposit(int balance, int dip) {

        newbal = newbal + dip;
        System.out.println("DIPOSIT SUCCESSFUL\n YOUR BALANCE: " + newbal + "\n");
    }

    public static void checkbal(int a) {

        int newbal = balance;
        System.out.println("BALANCE SECURE PAGE\n" + "YOUR BALANCE: " + newbal + "\n");
    }
    
}