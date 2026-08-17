import java.util.Scanner;

public class bnk {

     String bankName;//instance variables where we use it in constructor
    int userId;
    String userName;
    long accountNumber;
    String accountType;
    double balance;

    bnk(String bankName,int userId,String userName,long accountNumber,String accountType,double balance){
        this.bankName=bankName;
        this.userId=userId;
        this.userName=userName;
        this.accountNumber=accountNumber;
        this.accountType=accountType;
        this.balance=balance;
    }

    void displayBankDetails(){
        System.out.println("Bank Name: "+bankName);
    }

    void displayUserDetails(){
        System.out.println("User ID: "+userId);
        System.out.println("User Name: "+userName);
    }

    void displayAccountDetails(){
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Account Type: "+accountType);
        System.out.println("Current Balance: "+balance);
    }

    String createAccountSummary(){
        String summary="Bank: "+bankName+" User: "+userName+" Account Number: "+accountNumber+" Account Type: "+accountType+" Balance: "+balance;
        return summary;
    }

    boolean hasMinimumBalance(double minimumBalance){
        boolean result=(balance>=minimumBalance);
        return result;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Bank Name: ");
        System.out.println("Enter User ID: ");
        System.out.println("Enter User Name: ");
        System.out.println("Enter Account Number: ");
        System.out.println("Enter Account Type: ");
        System.out.println("Enter Balance: ");
        
        bnk b3 = new bnk(sc.next(),sc.nextInt(),sc.next(),sc.nextLong(),sc.next(), sc.nextDouble());

        b3.displayBankDetails();
        b3.displayUserDetails();
        b3.displayAccountDetails();

        System.out.println("Account Summary: "+b3.createAccountSummary());

        double minimumBal=2000.0;

        if(b3.hasMinimumBalance(minimumBal)){
            System.out.println("Minimum Balance: "+minimumBal+"is maintained");
        }
        else{
            System.out.println("Minimum Balance: "+minimumBal+"is not maintaned");
        }

        }
       }
    

