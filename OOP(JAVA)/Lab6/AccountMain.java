import java.util.Scanner;

class Account
{
 String name;
 int accno;
 String type;
 
 float balance;
 float deposit;
 float withdrawal;
 
 Scanner sc=new Scanner(System.in);
 
 Account()
 {
  System.out.print("Name - "); name=sc.next();
  System.out.print("Account number - "); accno=sc.nextInt();
 }
 
 void acceptDeposit()
 {
  System.out.print("Deposit - "); deposit=sc.nextInt();
  balance+=deposit; 
 }
 
 void displayBalance()
 {
  System.out.println("Balance = "+balance);
 }
 
 void computeAndDepositInterest(int rate)
 {//consider per month, this function is called 
   float interest=(float)(rate/100)*balance;
   balance+=interest;  
 }
 
 void acceptWithdrawal()
 {
  System.out.print("Withdrawal - "); withdrawal=sc.nextInt();  
  balance-=withdrawal;
 }
 
 void penaltyCheck(int minimum, int penalty)
 {
  System.out.println("PENALTY CHECK!");
  if(balance<minimum)
   balance-=((float)(penalty/100)*balance);
 }
}
//////////////////////////////////////////////////////////
class CurrentAccount extends Account
{
 int rate, min;
 
 CurrentAccount()
 {
  super();
  Scanner sc=new Scanner(System.in);
  System.out.println("Current Account!");
  System.out.println("Rate = 0"); rate=0;
  System.out.print("Minimum - ");min=sc.nextInt();
  System.out.println("Below minimum penalty = 2%");
 }
 
}
///////////////////////////////////////////////////////////
class SavingsAccount extends Account
{
 SavingsAccount()
 {
  super();
  int rate, min;
  Scanner sc=new Scanner(System.in);
  System.out.println("\n\nSavings Account!");
  System.out.println("Rate - "); rate=sc.nextInt();
  System.out.println("Minimum - ");min=sc.nextInt();
 }
} 
//////////////////////////////////////////////////////////// 
////////////////////////////////////////////////////////////
class AccountMain
{
 public static void main(String ar[])
 {
     
    CurrentAccount CA=new CurrentAccount();
    CA.acceptDeposit();
    CA.displayBalance();
	CA.computeAndDepositInterest(0);
	CA.displayBalance();
    CA.acceptWithdrawal();
	CA.displayBalance();
	CA.penaltyCheck(2000,5);
	CA.displayBalance();
	
	SavingsAccount SA=new SavingsAccount();
    SA.acceptDeposit();
    SA.displayBalance();
	SA.computeAndDepositInterest(9);
	SA.displayBalance();
    SA.acceptWithdrawal();
	SA.displayBalance();
	SA.penaltyCheck(2000,4);
	SA.displayBalance();
 }
}