/**
 * Creating a main class(parent class) named BankCard which has 5 attributes and
 * a constructor which accepts 4 parameters
 * here this keyword is used to refer to instance variable.
 * Getters method are used as private variables can only be accessed in same class So to make this instance variable available
 * in other class getters are used
 * setter method is used to update the value of clientName and bankAmount.
 *  
 *A proper 
 * @author (Rasik Kayastha)
 * @version 1.1 2023/01/04
 */

public class BankCard
{   
    //instance variables with private access modifiers
    private int cardId; 
    private double balanceAmount;
    private String clientName, issuerBank, bankAccount;

    /**BankCard Constructor**/
    public BankCard(double balanceAmount, int cardId, String bankAccount, String issuerBank)
    {
        this.clientName = "";
        this.balanceAmount = balanceAmount;
        this.cardId = cardId;
        this.bankAccount = bankAccount;
        this.issuerBank = issuerBank;
    }

    /**Accessor Method(Getters method) Of variable cardId with int as return type**/
    public int getCardId() //used to access private variables in another class 
    {
        return this.cardId;
    }

    /**Accessor Method(Getters method) Of variable bankAccount with String as return type**/
    public String getBankAccount()
    {
        return this.bankAccount;
    }

    /**Accessor Method(Getters method) Of variable balanceAmount with double as return type**/
    public double getBalanceAmount()
    {
        return this.balanceAmount;
    }

    /**Accessor Method(Getters method) Of variable issuerBank with String as return type**/  
    public String getIssuerBank()
    {
        return this.issuerBank;
    }

    /**Accessor Method(Getters method) Of variable clientName with String as return type**/
    public String getClientName()
    {
        return this.clientName;
    }

    /**Mutator Method(Setter method) of variable clientName which sets newclientName as clientName in instance variable**/
    public void setClientName(String newclientName) //mutator method to set new client name and balanceAmount
    {
        this.clientName = newclientName;
    }

    /**Mutator Method(Setter method) of variable balanceAmount which sets newbalanceAmount as balanceAmount in instance variable**/
    public void setBalanceAmount(double newbalanceAmount)
    {
        this.balanceAmount = newbalanceAmount; 
    }

    /**Display method to display contents of BankCard**/
    public void display() //display method to display details in screen
    {
        //using if-else condition as to check if client name is empty or not
        if (this.clientName == "") {
            System.out.println("Dear Valued Customer, Please assign your ClientName");
        }
        else {
            System.out.println("Dear,\t" +getClientName()+  "\tHere are your Bank Details you inquired for:");
            System.out.println("Card ID: \t" + getCardId());
            System.out.println("Client name: \t" + this.clientName);
            System.out.println("Issuer bank: \t" + this.issuerBank);
            System.out.println("Bank account: \t" + this.bankAccount);
            System.out.println("Balance amount: Rs" + this.balanceAmount);
            System.out.println("Thank you for choosing \t" + getIssuerBank() + "\t as your banking partner");
        }
    }
}

