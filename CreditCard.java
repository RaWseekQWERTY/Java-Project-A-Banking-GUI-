
/**
 * CreditCard is another child of parent class BankCard with 6 attributes. 
 * A constructor of CreditCard is made with 8 parameters in which Constructor with 4 parameters and setter method is called using super keyword.
 * Each attributes of CreditCard has their own corresponding accessor method. A method to set creditLimit is created along with a method to cancel creditcard.
 * A display method is created with same signature as BankCard which displays suitable information along with suitable annotation. 
 *
 * @author (Rasik Kayastha)
 * @version (2023/01/14)
 */
public class CreditCard extends BankCard
{
    //instance variables with private access modifiers
    private int cvcNumber, gracePeriod;
    private double creditLimit, interestRate;
    private String expirationDate;
    private boolean isGranted;
    
    /**CreditCard Constructor with 8 parameters**/
    public CreditCard(int cardId, String clientName, String issuerBank, String bankAccount, double balanceAmount, int cvcNumber, double interestRate, String expirationDate)
    {
      super(balanceAmount, cardId, bankAccount, issuerBank); //super keyword is used to call constructor from parent/main class
      super.setClientName(clientName);
      super.setBalanceAmount(balanceAmount);
      this.cvcNumber = cvcNumber; //this keyword is used to refer attributes defined in main class i.e. instance variables
      this.interestRate = interestRate;
      this.expirationDate = expirationDate;
      this.isGranted = false;
    }
    /**Accessor method of variable cvcNumber with int as its return type**/
    public int getCvCNumber()
    {
        return this.cvcNumber;
    }
    /**Accessor method of variable gracePeriod with int as its return type**/
    public int getGracePeriod()
    {
        return this.gracePeriod;
    }
    /**Accessor method of variable creditLimit with double as its return type**/
    public double getCreditLimit()
    {
        return this.creditLimit;
    }
    /**Accessor method of variable interestRate with double as its return type**/
    public double getInterestRate()
    {
        return this.interestRate;
    }
    /**Accessor method of variable expirationDate with String as its return type**/
    public String getExpirationDate()
    {
        return this.expirationDate;
    }
    /**Accessor method of variable isGranted with boolean as its return type**/
    public boolean getIsGranted()
    {
        return isGranted;
    }
    /**Mutator method to set newCreditLimit and newGracePeriod as its value in its corresponding instance variable**/
    public void setCreditLimit(double newCreditLimit, int newGracePeriod)
    {
      //if-else condition is used as creditLimit can only be updated if creditLimit is 2.5 times the balanceamount
      if(newCreditLimit <= 2.5* getBalanceAmount()){
         this.creditLimit = newCreditLimit;
         this.gracePeriod = newGracePeriod;
         this.isGranted = true;
         System.out.println("Your Credit has been set");
         System.out.println("Your Credit limit is:"+getCreditLimit());
         System.out.println("Your Grace Period is:"+getGracePeriod()+"years");
      }
      else{
          System.out.println("Some error occured while issuing the credit. Please make sure you have sufficient Balance Amount.");
          System.out.println("your current Balance Amount is:" + getBalanceAmount());
      }
    }
    /**Method to cancel CreditCard by assigning the value as 0 of cvcNumber,creditLimit and gracePeriod**/
    public void cancelCreditCard()
    {
        this.cvcNumber = 0;
        this.creditLimit = 0;
        this.gracePeriod = 0;
        this.isGranted = false;
        System.out.println("Your credit card was cancelled successfully");
    }
    /**Display method using method overlapping which displays from main class as well as displays credit card info**/
    public void display()
    {
        super.display();
        System.out.println("Dear"+getClientName()+"Here are your credit card details:");
        System.out.println("CVC: " + this.cvcNumber);
        System.out.println("Interest rate: " + this.interestRate);
        System.out.println("Expiration date: " + this.expirationDate);
        /*using if-else conditional statement as it shows all details of BankCard as well as
         * CreditLimit and GracePeriod if isGranted is true 
         * 
         */ 
        if (this.isGranted == true) {
            super.display();
            System.out.println("Credit limit: " + this.creditLimit);
            System.out.println("Grace period: " + this.gracePeriod);
        } else {
            System.out.println("Credit has not been granted yet.");
        }
    }  
}

