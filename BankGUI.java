/**
 * 
 * @author (Rasik Kayastha)
 * @version 1.1 2023/05/06
 */
import javax.swing.*;
import java.util.ArrayList;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class BankGUI extends JFrame implements ActionListener
{
    //Instance Variables with private access modifiers
    private ArrayList<BankCard> listBankCard;
    private JPanel pnlSide, pnlBankCard, pnlDebitCard, pnlCreditCard;
    private JLabel lblFleeca, lblNameBank,lblAccDetails, lblID, lblGetID, lblBlcAmount, lblAmt,lblDebitHeader,
    lblGetAmt, lblBankHeader, lblClientName, lblCardID, lblIssuerBank, lblBankAccount, lblBalanceAmount,
    lblPinNumber, lblWithdrawalDate, lblWithdrawalAmountz, lblHeaderCredit, lblcvcNumber, lblInterest, lblexpDate, lblcreditLimit, lblGrace, lblLimit;
    private JTextField txtClientName, txtCardID, txtIssuerBank, txtBankAccount, txtBalanceAmount, txtPinNumber,txtWithdrawalAmount, txtcvc, txtInterest, txtClimit, txtGrace;
    private JButton btnBankCard, btnDebitCard, btnCreditCard, btnAddBankCard, btnDisplay, btnClear, btnAddDebit,btnWithdraw, btnAddCredit, btnSetCredit,
    btnCancelCredit, btnDisplayDebit,btnDisplayCredit;
    private JComboBox cbWithdrawalDate, cbExpirationDate;
    /**BankGUI Constructor**/
    public BankGUI()
    {
        //setting Title for JFrame
        this.setTitle("BankGUI");
        //Creating an ArrayList for BankCard
        this.listBankCard = new ArrayList<BankCard>();
        //setting Panels for BankCard
        pnlBankCard = new JPanel();
        pnlBankCard.setBounds(341, 0, 619, 522);
        pnlBankCard.setBackground(Color.white);
        pnlBankCard.setLayout(null);

        //setting panel for Side Panel
        pnlSide = new JPanel();
        pnlSide.setBounds(0, 0, 361, 522);
        pnlSide.setBackground(Color.black);
        pnlSide.setLayout(null);

        //setting Panel for DebittCard
        pnlDebitCard = new JPanel();
        pnlDebitCard.setBounds(341, 0, 619, 522);
        pnlDebitCard.setBackground(Color.white);
        pnlDebitCard.setLayout(null);

        //setting panel for CreditCard
        pnlCreditCard = new JPanel();
        pnlCreditCard.setBounds(341, 0, 619, 522);
        pnlCreditCard.setBackground(Color.white);
        pnlCreditCard.setLayout(null);

        //setting Labels for Side Panel
        lblFleeca = new JLabel("FLeeCA");
        lblFleeca.setBounds(76, 37, 285, 44);
        lblFleeca.setFont(new Font("Acme", Font.BOLD, 48));
        lblFleeca.setForeground(new Color(129, 212, 82));

        lblNameBank = new JLabel("B A N K");
        lblNameBank.setBounds(129, 96, 183, 34);
        lblNameBank.setFont(new Font("Arial", Font.BOLD, 24));
        lblNameBank.setForeground(new Color(129, 212, 82));

        lblAccDetails = new JLabel("Account Details");
        lblAccDetails.setBounds(57, 184, 227, 42);
        lblAccDetails.setForeground(Color.white);
        lblAccDetails.setFont(new Font("Arial",Font.BOLD,30));

        lblID = new JLabel("ID:");
        lblID.setBounds(109, 231, 40, 42);
        lblID.setForeground(Color.white);
        lblID.setFont(new Font("Arial",Font.BOLD,30));

        lblGetID = new JLabel("");
        lblGetID.setBounds(157, 231, 87, 42);
        lblGetID.setForeground(Color.white);
        lblGetID.setFont(new Font("Arial",Font.BOLD,30));

        lblBlcAmount = new JLabel("Balance Amount");
        lblBlcAmount.setBounds(57, 278, 328, 42);
        lblBlcAmount.setForeground(Color.white);
        lblBlcAmount.setFont(new Font("Arial",Font.BOLD,30));

        lblAmt = new JLabel("Rs.");
        lblAmt.setBounds(106, 325, 63, 45);
        lblAmt.setForeground(Color.white);
        lblAmt.setFont(new Font("Arial",Font.BOLD,30));

        lblGetAmt = new JLabel("");
        lblGetAmt.setBounds(148, 325, 192, 42);
        lblGetAmt.setForeground(Color.white);
        lblGetAmt.setFont(new Font("Arial",Font.BOLD,30));

        //setting Buttons for Side Panel
        btnDisplay = new JButton("Display");
        btnDisplay.setBounds(19, 400, 118, 42);
        btnDisplay.setForeground(Color.black);
        btnDisplay.setBackground(new Color(244, 235, 73));
        btnDisplay.setFont(new Font("Arial",Font.BOLD,20));
        btnDisplay.setFocusable(false);
        btnDisplay.addActionListener(this);

        btnDisplayDebit = new JButton("Display");
        btnDisplayDebit.setBounds(19, 400, 118, 42);
        btnDisplayDebit.setForeground(Color.black);
        btnDisplayDebit.setBackground(new Color(244, 235, 73));
        btnDisplayDebit.setFont(new Font("Arial",Font.BOLD,20));
        btnDisplayDebit.setFocusable(false);
        btnDisplayDebit.addActionListener(this);

        btnDisplayCredit = new JButton("Display");
        btnDisplayCredit.setBounds(19, 400, 118, 42);
        btnDisplayCredit.setForeground(Color.black);
        btnDisplayCredit.setBackground(new Color(244, 235, 73));
        btnDisplayCredit.setFont(new Font("Arial",Font.BOLD,20));
        btnDisplayCredit.setFocusable(false);
        btnDisplayCredit.addActionListener(this);

        btnClear = new JButton("Clear");
        btnClear.setBounds(207, 400, 118, 42);
        btnClear.setForeground(Color.black);
        btnClear.setBackground(new Color(244, 235, 73));
        btnClear.setFont(new Font("Arial",Font.BOLD,24));
        btnClear.setFocusable(false);
        btnClear.addActionListener(this);

        //setting Label for BankCard Details
        lblBankHeader = new JLabel("BankCard Details");
        lblBankHeader.setBounds(176, 67, 258, 42);
        lblBankHeader.setFont(new Font("Arial",Font.BOLD,30));

        lblClientName = new JLabel("Client Name:");
        lblClientName.setBounds(70, 112, 139, 34);
        lblClientName.setFont(new Font("Arial",Font.PLAIN,24));

        lblCardID = new JLabel("Card ID:");
        lblCardID.setBounds(70, 155, 125, 34);
        lblCardID.setFont(new Font("Arial",Font.PLAIN,24));

        lblIssuerBank = new JLabel("Issuer Bank:");
        lblIssuerBank.setBounds(70, 198, 135, 34);
        lblIssuerBank.setFont(new Font("Arial",Font.PLAIN,24));

        lblBankAccount = new JLabel("Bank Account:");
        lblBankAccount.setBounds(70, 241, 160, 34);
        lblBankAccount.setFont(new Font("Arial",Font.PLAIN,24));

        lblBalanceAmount = new JLabel("Balance Amount:");
        lblBalanceAmount.setBounds(70, 284, 190, 34);
        lblBalanceAmount.setFont(new Font("Arial",Font.PLAIN,24));

        //setting Text Field for BankCard
        txtClientName = new JTextField();
        txtClientName.setBounds(255,112,292,34);

        txtCardID = new JTextField();
        txtCardID.setBounds(255, 155, 292, 34);

        txtIssuerBank = new JTextField();
        txtIssuerBank.setBounds(255, 198, 292, 34);  

        txtBankAccount = new JTextField();
        txtBankAccount.setBounds(255,241,292,34);

        txtBalanceAmount = new JTextField();
        txtBalanceAmount.setBounds(255,284,292,34);

        //setting buttons for BankCard
        btnBankCard = new JButton("BankCard");
        btnBankCard.setBounds(53, 15, 146, 49);
        btnBankCard.setBackground(Color.black);
        btnBankCard.setForeground(Color.white);
        btnBankCard.setFont(new Font("Arial",Font.BOLD,24));
        btnBankCard.addActionListener(this);

        btnDebitCard = new JButton("DebitCard");
        btnDebitCard.setBounds(209, 15, 156, 49);
        btnDebitCard.setBackground(Color.white);
        btnDebitCard.setForeground(Color.black);
        btnDebitCard.setFont(new Font("Arial",Font.BOLD,24));
        btnDebitCard.addActionListener(this);

        btnCreditCard = new JButton("CreditCard");
        btnCreditCard.setBounds(375, 15, 166, 49);
        btnCreditCard.setBackground(Color.white);
        btnCreditCard.setForeground(Color.black);
        btnCreditCard.setFont(new Font("Arial",Font.BOLD,24));
        btnCreditCard.addActionListener(this);

        btnAddBankCard = new JButton("Add");
        btnAddBankCard.setBounds(236,415,126,42);
        btnAddBankCard.setBackground(Color.black);
        btnAddBankCard.setForeground(Color.white);
        btnAddBankCard.setFont(new Font("Arial",Font.BOLD,24));
        btnAddBankCard.addActionListener(this);

        //adding to Side panel
        pnlSide.add(lblFleeca);
        pnlSide.add(lblNameBank);
        pnlSide.add(lblAccDetails);
        pnlSide.add(lblID);
        pnlSide.add(lblGetID);
        pnlSide.add(lblBlcAmount);
        pnlSide.add(lblAmt);
        pnlSide.add(lblGetAmt);
        pnlSide.add(btnDisplay);
        pnlSide.add(btnClear);
        //adding to BankCard Panel
        pnlBankCard.add(lblBankHeader);
        pnlBankCard.add(lblClientName);
        pnlBankCard.add(lblCardID);
        pnlBankCard.add(lblIssuerBank);
        pnlBankCard.add(lblBankAccount);
        pnlBankCard.add(lblBalanceAmount);

        pnlBankCard.add(txtClientName);
        pnlBankCard.add(txtCardID);
        pnlBankCard.add(txtIssuerBank);
        pnlBankCard.add(txtBankAccount);
        pnlBankCard.add(txtBalanceAmount);

        pnlBankCard.add(btnBankCard);
        pnlBankCard.add(btnDebitCard);
        pnlBankCard.add(btnCreditCard);
        pnlBankCard.add(btnAddBankCard);

        //buttons for DebitCard
        btnAddDebit = new JButton("Add");
        btnAddDebit.setBounds(261, 370, 94, 34);
        btnAddDebit.setBackground(new Color(146, 211, 110));
        btnAddDebit.addActionListener(this);

        btnWithdraw = new JButton("Withdraw");
        btnWithdraw.setBounds(417, 446, 105, 33);
        btnWithdraw.setBackground(new Color(146, 211, 110));
        btnWithdraw.addActionListener(this);

        //Buttons for CreditCard
        btnAddCredit = new JButton("Add");
        btnAddCredit.setBounds(351, 368, 105, 32);
        btnAddCredit.setBackground(new Color(146, 211, 110));
        btnAddCredit.addActionListener(this);

        btnSetCredit = new JButton("Set");
        btnSetCredit.setBounds(426, 432, 66, 31);
        btnSetCredit.setBackground(new Color(146, 211, 110));
        btnSetCredit.addActionListener(this);

        btnCancelCredit = new JButton("Cancel");
        btnCancelCredit.setBounds(498, 432, 75, 31);
        btnCancelCredit.setBackground(new Color(146, 211, 110));
        btnCancelCredit.addActionListener(this);

        //adding to JFrame
        this.add(pnlBankCard);
        this.add(pnlSide);
        this.add(pnlDebitCard);
        this.add(pnlCreditCard);

        pnlDebitCard.setVisible(false);
        pnlCreditCard.setVisible(false);
        //setting JFrame
        this.setSize(940, 522);
        this.setVisible(true);
        this.setResizable(false);
        this.setLayout(null); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //default close operation
    }

    /**Overriding method of super classes to implement interface methods**/
    @Override
    public void actionPerformed(ActionEvent e)
    {
        //onClick Event for DebitCard Button to navigate to debitcard panel
        if(e.getSource() == btnDebitCard)
        {
            pnlBankCard.setVisible(false);
            pnlDebitCard.setVisible(true);
            pnlCreditCard.setVisible(false);
            pnlSide.remove(btnDisplay);
            pnlSide.add(btnDisplayDebit);
            pnlSide.remove(btnDisplayCredit);

            //setting Buttons for DebitCard Panel
            btnBankCard.setBackground(Color.white);
            btnBankCard.setForeground(Color.black);
            btnDebitCard.setBackground(Color.black);
            btnDebitCard.setForeground(Color.white);
            btnCreditCard.setBackground(Color.white);
            btnCreditCard.setForeground(Color.black);

            //adding extra labels and buttons to DebitCard
            lblDebitHeader = new JLabel("DebitCard Details");
            lblDebitHeader.setBounds(176, 67, 258, 42);
            lblDebitHeader.setFont(new Font("Arial",Font.BOLD,30));

            lblPinNumber = new JLabel("PIN number:");
            lblPinNumber.setBounds(68, 327, 141, 32);
            lblPinNumber.setFont(new Font("Arial",Font.PLAIN,24));

            txtPinNumber = new JTextField(4);
            txtPinNumber.setBounds(255, 327, 292, 34);

            lblWithdrawalDate = new JLabel("Withdrawal Date:");
            lblWithdrawalDate.setBounds(40, 408, 186, 34);
            lblWithdrawalDate.setFont(new Font("Arial",Font.PLAIN,22));

            lblWithdrawalAmountz = new JLabel("Withdrawal Amount:");
            lblWithdrawalAmountz.setBounds(40, 440, 219, 34);
            lblWithdrawalAmountz.setFont(new Font("Arial",Font.PLAIN,22));

            txtWithdrawalAmount = new JTextField();
            txtWithdrawalAmount.setBounds(242, 446, 162, 29);

            String[] withdrawalDate = {"January,2023","February.2023","March,2023","April,2023","May,2023","June,2023","July,2023",
                    "August,2023","Spetember,2023","October,2023","November,2023","December,2023"};
            cbWithdrawalDate = new JComboBox<String>(withdrawalDate);
            cbWithdrawalDate.setBounds(205, 413, 168, 29);

            //adding to DebitCard Panel
            pnlDebitCard.add(lblDebitHeader);
            pnlDebitCard.add(lblClientName);
            pnlDebitCard.add(lblCardID);
            pnlDebitCard.add(lblIssuerBank);
            pnlDebitCard.add(lblBankAccount);
            pnlDebitCard.add(lblBalanceAmount);
            pnlDebitCard.add(lblPinNumber);
            pnlDebitCard.add(lblWithdrawalDate);
            pnlDebitCard.add(lblWithdrawalAmountz);
            pnlDebitCard.add(txtClientName);
            pnlDebitCard.add(txtCardID);
            pnlDebitCard.add(txtIssuerBank);
            pnlDebitCard.add(txtBankAccount);
            pnlDebitCard.add(txtBalanceAmount);
            pnlDebitCard.add(txtPinNumber);
            pnlDebitCard.add(txtWithdrawalAmount);
            pnlDebitCard.add(cbWithdrawalDate);
            pnlDebitCard.add(btnBankCard);
            pnlDebitCard.add(btnDebitCard);
            pnlDebitCard.add(btnCreditCard);
            pnlDebitCard.add(btnAddDebit);
            pnlDebitCard.add(btnWithdraw);
            pnlSide.add(btnDisplayDebit);
        }
        //onClick Event for BankCard Button to navigate to bankcard panel
        if(e.getSource() == btnBankCard)
        {
            pnlBankCard.setVisible(true);
            pnlDebitCard.setVisible(false);
            pnlCreditCard.setVisible(false);
            pnlSide.add(btnDisplay);
            pnlSide.remove(btnDisplayDebit);
            pnlSide.remove(btnDisplayCredit);

            //setting Buttons for BankCard Panel
            btnBankCard.setBackground(Color.black);
            btnBankCard.setForeground(Color.white);
            btnDebitCard.setBackground(Color.white);
            btnDebitCard.setForeground(Color.black);
            btnCreditCard.setBackground(Color.white);
            btnCreditCard.setForeground(Color.black);

            //readding to BankCard Panel as a instance can only have one parent at a time
            pnlBankCard.add(btnBankCard);
            pnlBankCard.add(btnDebitCard);
            pnlBankCard.add(btnCreditCard);
            pnlBankCard.add(lblClientName);
            pnlBankCard.add(lblCardID);
            pnlBankCard.add(lblIssuerBank);
            pnlBankCard.add(lblBankAccount);
            pnlBankCard.add(lblBalanceAmount);
            pnlBankCard.add(txtClientName);
            pnlBankCard.add(txtCardID);
            pnlBankCard.add(txtIssuerBank);
            pnlBankCard.add(txtBankAccount);
            pnlBankCard.add(txtBalanceAmount);
            pnlSide.add(btnDisplay);
        }
        //onClick Event for CreditCard Button to navigate to creditcard panel
        if(e.getSource() == btnCreditCard)
        {
            //adding extra details to creditCard panel
            lblHeaderCredit = new JLabel("CreditCard Details");
            lblHeaderCredit.setBounds(176, 67, 258, 42);
            lblHeaderCredit.setFont(new Font("Arial",Font.BOLD,27));

            lblcvcNumber = new JLabel("CvC Number:");
            lblcvcNumber.setBounds(23,325,147,34);
            lblcvcNumber.setFont(new Font("Arial",Font.PLAIN,23));

            txtcvc = new JTextField();
            txtcvc.setBounds(165, 328, 113, 34);

            lblInterest = new JLabel("Interest Rate:");
            lblInterest.setBounds(292, 325, 141, 34);
            lblInterest.setFont(new Font("Arial",Font.PLAIN,23));

            txtInterest = new JTextField();
            txtInterest.setBounds(436, 328, 131, 34);

            lblexpDate = new JLabel("Expiration Date:");
            lblexpDate.setBounds(28, 368, 174, 34);
            lblexpDate.setFont(new Font("Arial",Font.PLAIN,23));

            String[] expirationDate = {"January,2023","February.2023","March,2023","April,2023","May,2023","June,2023","July,2023",
                    "August,2023","Spetember,2023","October,2023","November,2023","December,2023"};
            cbExpirationDate = new JComboBox<String>(expirationDate);
            cbExpirationDate.setBounds(204, 368, 131, 32);

            lblLimit = new JLabel("Credit Limit");
            lblLimit.setBounds(243, 399, 143, 34);
            lblLimit.setFont(new Font("Arial",Font.BOLD,22));

            lblcreditLimit = new JLabel("Credit Limit:");
            lblcreditLimit.setBounds(20, 431, 132, 31);
            lblcreditLimit.setFont(new Font("Arial",Font.PLAIN,20));

            txtClimit = new JTextField();
            txtClimit.setBounds(127, 431, 92, 34);

            lblGrace = new JLabel("Grace Period:");
            lblGrace.setBounds(226, 431, 149, 31);
            lblGrace.setFont(new Font("Arial",Font.PLAIN,20));

            txtGrace = new JTextField();
            txtGrace.setBounds(351, 431, 66, 34);

            pnlBankCard.setVisible(false);
            pnlDebitCard.setVisible(false);
            pnlCreditCard.setVisible(true);
            pnlSide.remove(btnDisplay);
            pnlSide.remove(btnDisplayDebit);
            pnlSide.add(btnDisplayCredit);

            //setting buttons for CreditCard Panel
            btnCreditCard.setBackground(Color.black);
            btnCreditCard.setForeground(Color.white);
            btnDebitCard.setBackground(Color.white);
            btnDebitCard.setForeground(Color.black);
            btnBankCard.setBackground(Color.white);
            btnBankCard.setForeground(Color.black);

            //adding to CreditCard Panel
            pnlCreditCard.add(btnBankCard);
            pnlCreditCard.add(btnDebitCard);
            pnlCreditCard.add(btnCreditCard);
            pnlCreditCard.add(lblHeaderCredit);
            pnlCreditCard.add(lblClientName);
            pnlCreditCard.add(lblCardID);
            pnlCreditCard.add(lblIssuerBank);
            pnlCreditCard.add(lblBankAccount);
            pnlCreditCard.add(lblBalanceAmount);
            pnlCreditCard.add(lblcvcNumber);
            pnlCreditCard.add(lblInterest);
            pnlCreditCard.add(lblexpDate);
            pnlCreditCard.add(lblLimit);
            pnlCreditCard.add(lblcreditLimit);
            pnlCreditCard.add(lblGrace);
            pnlCreditCard.add(txtClientName);
            pnlCreditCard.add(txtCardID);
            pnlCreditCard.add(txtIssuerBank);
            pnlCreditCard.add(txtBankAccount);
            pnlCreditCard.add(txtBalanceAmount);
            pnlCreditCard.add(txtcvc);
            pnlCreditCard.add(txtInterest);
            pnlCreditCard.add(txtClimit);
            pnlCreditCard.add(txtGrace);
            pnlCreditCard.add(cbExpirationDate);
            pnlCreditCard.add(btnAddCredit);
            pnlCreditCard.add(btnSetCredit);
            pnlCreditCard.add(btnCancelCredit);
        }
        // button to display information in BankCard Panel
        if(e.getSource() == btnDisplay)
        {
            if(listBankCard.isEmpty()){
                JOptionPane.showMessageDialog(this,"Nothing to Display, Please Add a Bank Card First!!!","Empty 404",JOptionPane.WARNING_MESSAGE);                
            }
            try{
                for (BankCard cardBank : listBankCard){
                    System.out.println("********************************************B A N K*****C A R D******D E T A I L S**********************************************************************");
                    String newclientName = txtClientName.getText().trim();
                    cardBank.setClientName(newclientName);
                    cardBank.display();
                    System.out.println("*********************************************THANK YOU****************************************************************************************");

                }
            } catch(NumberFormatException arg0){
                JOptionPane.showMessageDialog(this,"Please input all information and Try Again!\n"+arg0,"Alert",JOptionPane.WARNING_MESSAGE);
            }
        }
        //Button to display information in DebitCard Panel and details of DebitCard
        if(e.getSource() == btnDisplayDebit){
            if(listBankCard.isEmpty()){
                JOptionPane.showMessageDialog(this,"Nothing to Display, Please Add a Debit Card First!!!","Empty 404",JOptionPane.WARNING_MESSAGE);                
            }
            try{
                for (BankCard cardBank : listBankCard){
                    if(cardBank instanceof DebitCard) {
                        double newwithdrawalAmount = Double.parseDouble(txtWithdrawalAmount.getText());
                        String newdateOfWithdrawal = (String) cbWithdrawalDate.getSelectedItem();
                        ((DebitCard) cardBank).setWithDrawalAmount(newwithdrawalAmount);
                        ((DebitCard) cardBank).setDateOfWithDrawal(newdateOfWithdrawal);
                        System.out.println("********************************************D E B I T*****C A R D******D E T A I L S**********************************************************************");
                        ((DebitCard) cardBank).display();  
                        System.out.println("**************************************************T H A N K*****Y O U*******************************************************************************************************");
                    }
                }
            } catch(NumberFormatException arg0){
                JOptionPane.showMessageDialog(this,"Please input all information and Try Again!\n"+arg0,"Alert",JOptionPane.WARNING_MESSAGE);
            }
        }
        //button to display information of CreditCard Class
        if(e.getSource() == btnDisplayCredit){
            if(listBankCard.isEmpty()){
                JOptionPane.showMessageDialog(this,"Nothing to Display, Please Add a Credit Card First!!!","Empty 404",JOptionPane.WARNING_MESSAGE);                
            }
            try{
                for (BankCard cardBank : listBankCard){
                    if(cardBank instanceof CreditCard) {
                        System.out.println("********************************************C R E D I T*****C A R D******D E T A I L S**********************************************************************");
                        ((CreditCard) cardBank).display();  
                        System.out.println("********************************************T H A N K***Y O U************************************************************************************************");
                    }
                }
            } catch(NumberFormatException arg0){
                JOptionPane.showMessageDialog(this,"Please input all information and Try Again!\n"+arg0,"Alert",JOptionPane.WARNING_MESSAGE);
            }

        }
        //button to clear textfield areas
        if(e.getSource() == btnClear)
        {
            try{
                txtClientName.setText("");
                txtCardID.setText("");
                txtIssuerBank.setText("");
                txtBankAccount.setText("");
                txtBalanceAmount.setText("");
                txtPinNumber.setText("");
                txtWithdrawalAmount.setText("");
                txtcvc.setText("");
                txtInterest.setText("");
                txtClimit.setText("");
                txtGrace.setText("");
            } catch(NullPointerException arg9){
                JOptionPane.showMessageDialog(this,"Already Emptied \n"+arg9,"Alert",JOptionPane.WARNING_MESSAGE);
            }
        }
        //Button to Add Bankcard details to ArrayList of BankCard type
        if(e.getSource() == btnAddBankCard)
        {   
            if(txtClientName.getText().trim().isEmpty() || txtCardID.getText().trim().isEmpty() ||txtIssuerBank.getText().trim().isEmpty() || txtBankAccount.getText().trim().isEmpty()
            || txtBalanceAmount.getText().trim().isEmpty())
            {
                JOptionPane.showMessageDialog(this,"Please enter the information","Invalid",JOptionPane.INFORMATION_MESSAGE);  
            }
            else
            {
                try{
                    String clientName = txtClientName.getText().trim();
                    int cardId = Integer.parseInt(txtCardID.getText().trim());
                    String issuerBank = txtIssuerBank.getText().trim();
                    String bankAccount = txtBankAccount.getText().trim();
                    double balanceAmount = Double.parseDouble(txtBalanceAmount.getText().trim());
                    boolean bankCardIdexist = false;
                    //checking if the cardId is already present in ArrayList
                    for(BankCard cardBank : listBankCard)  {
                        if(cardBank.getCardId() == cardId)  {
                            bankCardIdexist = true;
                            break;
                        }
                    }
                    //if not adding BankCard object to ArrayList
                    if(!bankCardIdexist) {
                        BankCard bankCardList = new BankCard(balanceAmount, cardId, bankAccount, issuerBank);
                        this.listBankCard.add(bankCardList);
                        JOptionPane.showMessageDialog(this,"Added BankCard Successfully","Done",JOptionPane.INFORMATION_MESSAGE);
                        lblGetID.setText(String.valueOf(cardId));
                        lblGetAmt.setText(String.valueOf(balanceAmount));
                    }
                    else {
                        JOptionPane.showMessageDialog(this,"Card ID already exists","Error",JOptionPane.WARNING_MESSAGE);
                    }
                }catch (NumberFormatException  arg){
                    JOptionPane.showMessageDialog(this,"Invalid Input!!! Please Try Again!!!\n"+arg,"Alert",JOptionPane.WARNING_MESSAGE);
                }
            }
        }
        //button to add DebitCard Object to ArrayList of Bankcard
        if(e.getSource() == btnAddDebit)
        {
            if(txtClientName.getText().trim().isEmpty() || txtCardID.getText().trim().isEmpty() ||txtIssuerBank.getText().trim().isEmpty() || txtBankAccount.getText().trim().isEmpty()
            || txtBalanceAmount.getText().trim().isEmpty()||txtPinNumber.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this,"Please enter the information","Invalid",JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                try{
                    String clientName = txtClientName.getText().trim();
                    int cardId = Integer.parseInt(txtCardID.getText().trim());
                    String issuerBank = txtIssuerBank.getText().trim();
                    String bankAccount = txtBankAccount.getText().trim();
                    double balanceAmount = Double.parseDouble(txtBalanceAmount.getText().trim());
                    int pinNumber = Integer.parseInt(txtPinNumber.getText().trim());
                    boolean debitCardIdexist = false;
                    //doesn't add to ArrayList if cardID of same already exists
                    for(BankCard cardBank : listBankCard)  {
                        if(cardBank.getCardId() == cardId)  {
                            debitCardIdexist = true;
                            break;
                        }
                    }
                    if(!debitCardIdexist) {
                        DebitCard debitCardList = new  DebitCard(balanceAmount, cardId, bankAccount, issuerBank, clientName, pinNumber);
                        this.listBankCard.add(debitCardList);
                        JOptionPane.showMessageDialog(this,"Added Debit Card Successfully","Done",JOptionPane.INFORMATION_MESSAGE);
                        lblGetID.setText(String.valueOf(cardId));
                        lblGetAmt.setText(String.valueOf(balanceAmount));
                    }
                    else {
                        JOptionPane.showMessageDialog(this,"Card ID already exists","Error",JOptionPane.WARNING_MESSAGE);
                    }
                }catch (NumberFormatException arg1){
                    JOptionPane.showMessageDialog(this,"Invalid Input!!! Please Try Again!!!\n"+arg1,"Alert",JOptionPane.WARNING_MESSAGE);
                }
            }
        }
        //button to withdraw amount in DebitCard 
        if(e.getSource() == btnWithdraw)
        {
            try{
                String strCardId = JOptionPane.showInputDialog(null, "Enter CardID:");
                int cardIdDebit = Integer.parseInt(strCardId.trim());
                int cardId = Integer.parseInt(txtCardID.getText().trim());
                double withdrawalAmount = Double.parseDouble(txtWithdrawalAmount.getText());
                String dateOfWithdrawal = (String) cbWithdrawalDate.getSelectedItem();
                int pinNumber = Integer.parseInt(txtPinNumber.getText().trim());
                double balanceAmount = Double.parseDouble(txtBalanceAmount.getText().trim());
                String strPin = JOptionPane.showInputDialog(null, "Enter Pin Number:");
                int pin = Integer.parseInt(strPin);
                //To find Debit Card with matching card
                boolean debitID = false;
                //only withdraws if CardID and pin matches with entered cardid and pin in arraylist
                for(BankCard cardDebit : listBankCard){
                    if (cardDebit.getCardId() == cardIdDebit && cardDebit instanceof DebitCard) {
                        DebitCard debitCard = (DebitCard) cardDebit; //downcasting the parent instance
                        if(debitCard.getPinNumber() == pin) {
                            debitID = true;
                            debitCard.withdraw(withdrawalAmount, dateOfWithdrawal, pin);
                            JOptionPane.showMessageDialog(this, "Withdrawal of $" + withdrawalAmount + " from card " + cardId + " successful!");
                            double newBalanceAmount = (balanceAmount-withdrawalAmount);
                            lblGetAmt.setText(String.valueOf(newBalanceAmount));
                            break;
                        }
                        else {
                            JOptionPane.showMessageDialog(this, "Your Pin Number is Incorrect. Please try again.");
                            break;
                        }
                    }

                }
                if (!debitID) {
                    JOptionPane.showMessageDialog(this, "Debit Card not found with given Card ID","Not Found",JOptionPane.WARNING_MESSAGE);

                }
            } catch(NumberFormatException arg2){
                JOptionPane.showMessageDialog(this,"Invalid Input!!! Please Fill all information Again!!!\n"+arg2,"Alert",JOptionPane.WARNING_MESSAGE);

            } catch (NullPointerException arg20){

            }
        }

        if(e.getSource() == btnAddCredit){
            if(txtClientName.getText().trim().isEmpty() || txtCardID.getText().trim().isEmpty() ||txtIssuerBank.getText().trim().isEmpty() || txtBankAccount.getText().trim().isEmpty()
            || txtBalanceAmount.getText().trim().isEmpty()||txtcvc.getText().isEmpty()||txtInterest.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null,"Please enter the information","Invalid",JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                try{
                    String clientName = txtClientName.getText().trim();
                    int cardId = Integer.parseInt(txtCardID.getText().trim());
                    String issuerBank = txtIssuerBank.getText().trim();
                    String bankAccount = txtBankAccount.getText().trim();
                    double balanceAmount = Double.parseDouble(txtBalanceAmount.getText().trim());
                    int cvcNumber = Integer.parseInt(txtcvc.getText().trim());
                    double interestRate = Double.parseDouble(txtInterest.getText().trim());
                    String expirationDate =(String) cbExpirationDate.getSelectedItem();
                    boolean creditCardIdexist = false;
                    for(BankCard cardBank : listBankCard)  {
                        if(cardBank.getCardId() == cardId)  {
                            creditCardIdexist = true;
                            break;
                        }
                    }
                    if(!creditCardIdexist) {
                        CreditCard cardCreditList = new CreditCard(cardId, clientName, issuerBank, bankAccount, balanceAmount, cvcNumber, interestRate, expirationDate);
                        this.listBankCard.add(cardCreditList);
                        JOptionPane.showMessageDialog(this,"Added Credit Card Successfully","Done",JOptionPane.INFORMATION_MESSAGE);
                        lblGetID.setText(String.valueOf(cardId));
                        lblGetAmt.setText(String.valueOf(balanceAmount));
                    }
                    else {
                        JOptionPane.showMessageDialog(this,"Card ID already exists","Error",JOptionPane.WARNING_MESSAGE);
                    }
                }catch (NumberFormatException arg4){
                    JOptionPane.showMessageDialog(this,"Invalid Input!!! Please Try Again!!!\n"+arg4,"Alert",JOptionPane.WARNING_MESSAGE);
                }
            }
        }

        if(e.getSource() == btnSetCredit) {
            if(txtGrace.getText().isEmpty() || txtClimit.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this,"Invalid!! Credit Limit and Grace Period Missing","Empty 404",JOptionPane.WARNING_MESSAGE);   
            }
            else{
                try{
                    String strCardId = JOptionPane.showInputDialog(null, "Enter CardID:");
                    int cardID = Integer.parseInt(strCardId.trim());
                    double newCreditLimit = Double.parseDouble(txtClimit.getText().trim());
                    int newGracePeriod = Integer.parseInt(txtGrace.getText().trim());
                    boolean creditID = false;
                    for(BankCard cardCredit : listBankCard) {
                        if(cardCredit.getCardId() == cardID && cardCredit instanceof CreditCard) {
                            CreditCard cardC = (CreditCard) cardCredit;
                            cardC.setCreditLimit(newCreditLimit, newGracePeriod);
                            JOptionPane.showMessageDialog(this,"Credit Limit has been approved","Thank you",JOptionPane.INFORMATION_MESSAGE);
                            creditID = true;
                        }
                    }
                    if (!creditID) {
                        JOptionPane.showMessageDialog(this, "Credit Card not found with given Card ID","Not Found",JOptionPane.WARNING_MESSAGE);

                    }
                } catch(NumberFormatException arg7) {
                    JOptionPane.showMessageDialog(this,"Invalid Input!!! Please Try Again!!!\n"+arg7,"Alert",JOptionPane.WARNING_MESSAGE);
                } catch (NullPointerException arg20){

                }
            }
        }

        if(e.getSource() == btnCancelCredit) {
            try {
                String strCardId = JOptionPane.showInputDialog(null, "Enter CardID:");
                int cardID = Integer.parseInt(strCardId.trim());
                boolean sameID = false;
                for(BankCard cardCredit : listBankCard) {
                    if(cardCredit.getCardId() == cardID && cardCredit instanceof CreditCard) {
                        ((CreditCard) cardCredit). cancelCreditCard();
                        listBankCard.remove(cardCredit);
                        lblGetID.setText("0");
                        lblGetAmt.setText("0");
                        JOptionPane.showMessageDialog(this,"Successfully Cancelled","Thank you",JOptionPane.INFORMATION_MESSAGE);
                    }
                }
                if(!sameID) {
                    JOptionPane.showMessageDialog(this, "Credit Card not found with given Card ID","Not Found",JOptionPane.WARNING_MESSAGE);                
                }
            } catch(NumberFormatException arg51) {
                JOptionPane.showMessageDialog(this,"Some Error Occured Please Try Again!!!\n"+arg51,"Alert",JOptionPane.WARNING_MESSAGE);
            } catch (NullPointerException arg20){

            }
        }
    }

    /**Main method to call Constructor and display GUI**/
    public static void main(String[] args)
    {
        new BankGUI();
    }
}

