
/**
 * DebitCard is a child(sub-class) of main parent(main-class) BankCard in which its constructor with 4 parameters as well as setter method
 * is called using super keyword
 *A constructor of DebitCard is made with 6 parameters and boolean attribute is assigned to false
 *Getter method(accessor method) of each attribute is made  and a mutator(setter) method of withdrawalAmount is made.
 *A withdraw method is made in which amount,date and pin is accepted as argument which deducts money directly from client account
 * @author (Rasik Kayastha)
 * @version 1.1 (2023/1/13)
 */
public class DebitCard extends BankCard
{
    //instance variables with private access modifiers
    private int pinNumber;
    private double withdrawalAmount;
    private String dateOfWithdrawal;
    private boolean hasWithdrawn;

    /**DebitCard Constructor with 6 parameters**/
    public DebitCard(double balanceAmount, int cardId, String bankAccount, String issuerBank, String clientName, int pinNumber)
    {
        super(balanceAmount, cardId, bankAccount, issuerBank); //super keyword is used to call constructor with 4 parameters from parent/main class
        super.setClientName(clientName);
        this.pinNumber = pinNumber; //this keyword is used to refer attributes defined in main class i.e. instance variables
        this.hasWithdrawn = false;
    }
    /*
     * accesor method of corresponding attributes so,
     * it can be accessible outside the class
     */
    /**Accessor method of variable pinNumber with int as its return type**/
    public int getPinNumber()
    {
        return this.pinNumber;
    }

    /**Accessor method of variable withdrawalAmount with double as its return type**/
    public double getWithDrawalAmount()
    {
        return this.withdrawalAmount;
    }

    /**Accessor method of variable dateOfWithdrawal with String as its return type**/
    public String getDateOfWithDrawal()
    {
        return this.dateOfWithdrawal;
    }

    /**Accessor method of variable hasWithdrawn with boolean as its return type**/
    public boolean getHasWithdrawn()
    {
        return this.hasWithdrawn;
    }
    /*
     * mutator method of WithdrawalAmount as to set amount which is to 
     * be withdrawn
     */
    /**Mutator method of withdrawalAmount which sets new withdrawalAmount as withdrawalAmount in instance variable**/
    public void setWithDrawalAmount(double newwithdrawalAmount)
    {
        this.withdrawalAmount = newwithdrawalAmount;
    }

    /**Mutator method of withdrawalAmount which is used to update value of dateOfWithdrawal instance variable**/
    public void setDateOfWithDrawal(String newdateOfWithdrawal)//to fix null error
    {
        this.dateOfWithdrawal = newdateOfWithdrawal;
    }

    /**withdraw method to deduct amount directly from client**/
    public void withdraw(double withdrawalAmount, String dateOfWithdrawal, int pin)
    {
        //using nested if which runs only if pinNumber is valid and there is sufficient balance.
        if(pin == this.pinNumber) {
            if(withdrawalAmount <= getBalanceAmount()) {
                setBalanceAmount(getBalanceAmount() - withdrawalAmount);
                this.hasWithdrawn = true;
                System.out.println("Your amount was withdrawn successfuly on."+dateOfWithdrawal);
                System.out.println("Your new balance is" + getBalanceAmount());
            }
            else{
                System.out.println("Insufficient balance. cannot withdraw the desired amount");
            }
        }
        else{
            System.out.println("Invalid Pin. Please try again");
        }

    }

    /**Display method using method overlapping which displays from main class and displays Debit card info only if the client hasWithdrawn amount**/
    public void display() 
    {
        super.display();
        if (hasWithdrawn == true) {
            System.out.println("The transaction has been carried out with the following details:");
            System.out.println("Pin number: " + this.pinNumber);
            System.out.println("Withdrawal amount: " + this.withdrawalAmount);
            System.out.println("Date of withdrawal: " + this.dateOfWithdrawal);
            System.out.println("Thank you for choosing" + getIssuerBank() + "as your banking partner");
        } else {
            System.out.println("Dear valued customer, please carry out a transaction first.");
            System.out.println("Your current balance is:" + getBalanceAmount());
        }
    } 
}
