import java.util.Scanner;

class ATMInterfaceDemo {
    double balance = 200000, withdraw, deposit , transfer ;

    Scanner sc = new Scanner(System.in);
        public void oprerations()
    {
        System.out.println("********** WELCOME TO ATM SERVICE **********");
        while (true)
        {
            System.out.println("1: Check Balance");
            System.out.println("2: Withdraw");
            System.out.println("3: Deposit");
            System.out.println("4: Transfer");
            System.out.println("5: Quit");
            System.out.print("choose one operation given above: ");

            int userChoice = sc.nextInt();
            switch (userChoice)
            {
                case 1:
                    System.out.println("Your Available Balance Is : "+ balance);
                    System.out.println("");
                    break;


                case 2:
                    System.out.print("Enter money to withdraw: ");
                    withdraw = sc.nextInt();
                    if (balance >= withdraw) {
                        balance = balance - withdraw;
                        System.out.print("Collect Your Money");
                    } else {
                        System.out.println("Insufficient Amount to withdraw");
                    }
                    System.out.println(" ");
                    break;


                case 3:
                    System.out.print("enter amount to deposited: ");
                    deposit = sc.nextInt();
                    balance = balance + deposit;
                    System.out.println("Your money has been successfully deposited");
                    System.out.println("");
                    break;

                case 4:
                    System.out.print("Enter 6 digit Account No of person to transfer money: ");
                     int transferToACno = sc.nextInt();
                    System.out.print("Enter money to transfer: ");
                        transfer = sc.nextInt(); // taking amount
                        if (balance >= transfer)
                        {
                            balance = balance - transfer;
                            System.out.print("Money Transferred to Account Number " + transferToACno);
                        }
                        else
                        {
                            System.out.println("Insufficient Amount To Transfer");
                        }
                       System.out.println("");
                         break;

                case 5:
                    System.out.println("");
                    System.out.println("***** THANK YOU *****");
                    System.exit(0);

            }
        }
    }
}

public class ATMInterface {
    public static void main(String[] args) {

        ATMInterfaceDemo obj = new ATMInterfaceDemo();

        String userId, password;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your userId: ");
        userId = sc.nextLine();

        System.out.print("Enter your Password: ");
        password = sc.nextLine();

        if (userId.equals("hp") && password.equals("123"))
        {
            obj.oprerations();
        }
        else
        {
            System.out.println("userId or Password is invalid  'please try again' ");
        }
    }
}
