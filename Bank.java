public class Bank {
    public static void main(String[] args) {
        Bank b1 = new Bank("HDFC",97402646, "Sufiyan", 123456789012L, "Current", 500000.50);
        
        b1.displayBankDetails();
        b1.displayUserDetails();
        b1.displayAccountDetails();
        
        System.out.println("Account Summary: " + b1.createAccountSummary());
        
        double minBal = 2000.0;
        if(b1.hasMinimumBalance(minBal)){
            System.out.println("Minimum balance of " + minBal + " is maintained");
        } else {
            System.out.println("Minimum balance of " + minBal + " is NOT maintained");
        }
    }
    
    String bankName;//instance variables where we use it in constructor
    int userId;
    String userName;
    long accountNumber;
    String accountType;
    double balance;
    
   
    Bank(String bankName ,int userId ,String userName ,long accountNumber ,String accountType ,double balance)
    {
        this.bankName = bankName;
        this.userId = userId;
        this.userName = userName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }
    
 
    void displayBankDetails(){
        System.out.println("Bank Name: " + bankName);
    }
    
   
    void displayUserDetails(){
        System.out.println("User ID: " + userId);
        System.out.println("User Name: " + userName);
    }
    
   
    void displayAccountDetails(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Current Balance: " + balance);
    }
    
    
    String createAccountSummary(){
        String summary = "Bank: " + bankName + ", User: " + userName + ", AccNo: " + accountNumber + ", Type: " + accountType + ", Balance: " + balance;
        return summary;
    }
    
   
    boolean hasMinimumBalance(double minimumBalance){
        boolean result; 
        result= this.balance >= minimumBalance; 
        return result;
    }
    
  
    
}