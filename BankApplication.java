import java.util.Scanner;

public class BankApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter bank name: ");
        String bankName = input.nextLine();

        System.out.print("Enter user ID: ");
        int userId = input.nextInt();
        input.nextLine();//to eliminate error we use extra nextLine():

        System.out.print("Enter user name: ");
        String userName = input.nextLine();

        System.out.print("Enter account number: ");
        long accountNumber = input.nextLong();
        input.nextLine();

        System.out.print("Enter account type: ");
        String accountType = input.nextLine();

        System.out.print("Enter opening balance: ");
        double balance = input.nextDouble();

        Bank b3 = new Bank(
                bankName,
                userId,
                userName,
                accountNumber,
                accountType,
                balance);

        int choice;
       do { 
        System.out.println("1.Display Bank Details ");
        System.out.println("2. Deposit Amount ");
        System.out.println("3. Withdraw Amount");
        System.out.println("4. Check Balance ");
        System.out.println("5. Display Account Summary ");
        System.out.println("6. Check Minimum Balance ");
        System.out.println("0. Exit ");
        System.out.println("Enter your choice: ");
        choice =input.nextInt();
        switch(choice){
            case 1: b3.displayBankDetails();
                    b3.displayUserDetails();
                    b3.displayAccountDetails();
                    break;
            case 2: System.out.println("Enter the amount to deposit: ");
                    boolean res = b3.deposit(input.nextInt());
                    if(res==true){
                        System.out.println("Amount Deposited Succeded");
                        System.out.println("Balance after deposit: "+b3.checkBalance());
                    }
                    else{
                        System.out.println("Amount Deposited Failed");
                        System.out.println("balance after deposit: "+b3.checkBalance());
                    }
                    break;
            case 3: System.out.println("Enter the amount to withdraw: ");
                    boolean rest = b3.withdraw(input.nextInt());
                    if(rest==true){
                        System.out.println("Amount withdraw succeeded");
                        System.out.println("Balance after withdraw: "+b3.checkBalance());
                    }
                    else{
                        System.out.println("Amount withdraw failed");
                        System.out.println("balance after withdraw: "+b3.checkBalance());
                    }
            case 4: double st=b3.checkBalance();
                    System.out.println("Balance: "+st);
                    break;
            case 5: String stx=b3.createAccountSummary();
                    System.out.println("Account summary :"+stx);
                    break;
            case 6: double minimumBal=2000.0;
                    boolean reslt=b3.hasMinimumBalance(minimumBal);
                    if(reslt==true){
                        System.out.println("Minimum Balance is maintained");
                    }
                    else{
                        System.out.println("Minimum Balance is not maintaned");
                    }
                    break;
            case 0: break;
            default: System.out.println("Invalid choice");
                     break;
        }
        } while (choice!=0);

        input.close();
    }
}



















