package atmpackage;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account2 {
    private int accountNumber;
    private int pinNumber;

    private double savingBalance;
    private double chekingBalance;

    Scanner scan=new Scanner(System.in);
    DecimalFormat moneyFormat= new DecimalFormat("'$'###,##0.00");

    public int getAccountNumber() {return accountNumber;}

    public void setAccountNumber(int accountNumber) {this.accountNumber = accountNumber;}

    public int getPinNumber() { return pinNumber;}

    public void setPinNumber(int pinNumber) {this.pinNumber = pinNumber;}

    public double getSavingBalance() {return savingBalance;}

    public void setSavingBalance(double savingBalance) {this.savingBalance = savingBalance;}

    public double getChekingBalance() {return chekingBalance;}

    public void setChekingBalance(double chekingBalance) {this.chekingBalance = chekingBalance;}

    private double chekingBalanceWithdraw(double amount){
               chekingBalance-=amount;
               return chekingBalance;
    }
    private double chekingBalanceDeposit(double amount){
        chekingBalance+=amount;
        return chekingBalance;
    }
    private double savingBalanceWithdrow(double amout){
        savingBalance-=amout;
        return savingBalance;
    }
    private double savingBalanceDeposit(double amount){
        savingBalance+=amount;
        return savingBalance;
    }
    public void getChekingBalanceWithdraw(){
        System.out.println("Your Checking Balance is: "+moneyFormat.format(chekingBalance));
        System.out.println("Enter the amount you want to withdraw");
        double amount=scan.nextDouble();
        if(amount<=0){
            System.out.println("Amount can not be negative or zero!");
            getChekingBalance();
        }else if(amount<=chekingBalance){
            chekingBalanceWithdraw(amount);
            System.out.println("Your Checking Balance is: "+moneyFormat.format(chekingBalance));
        }else{
            System.out.print("Your balance is not enough!");
        }
    }
    public void getCheckingBalanceDeposit(){
        System.out.println("Your Checking Balance is: "+moneyFormat.format(chekingBalance));
        System.out.println("Enter amount you want to deposit");
        double amount=scan.nextDouble();

        if(amount<=0){
            System.out.println("Amount can not be negative or zero!");
            getCheckingBalanceDeposit();
        }else{
            chekingBalanceDeposit(amount);
            System.out.println("Your Checking Balance is: "+moneyFormat.format(chekingBalance));
        }
    }
    public void getSavingBalanceWithdraw(){
        System.out.println("Your Saving Balance is: "+moneyFormat.format(savingBalance));
        System.out.println("Enter amount you want to withdraw");
        double amount = scan.nextDouble();

        if(amount<=0){
            System.out.println("Amount can not be negative or zero");
            getSavingBalanceWithdraw();
        }else if(amount<=savingBalance){
            savingBalanceWithdrow(amount);
            System.out.println("Your Saving Balance is: "+moneyFormat.format(savingBalance));
        }else{
            System.out.println("Your Saving Balance is not enough");
        }
    }
    public void getSavingBalanceDeposit(){
        System.out.println("Your Saving Balance is: "+moneyFormat.format(savingBalance));
        System.out.println("Enter amount you want to deposit");
        double amount= scan.nextDouble();

        if(amount<=0){
            System.out.println("Amount can not be negative or zero!");
            getSavingBalanceDeposit();
        }else{
            savingBalanceDeposit(amount);
            System.out.println("Your Saving Balance is: "+moneyFormat.format(savingBalance));
        }
    }
}
