package atmpackage;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Options extends Account{
    Scanner scan = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
    HashMap<Integer, Integer> data = new HashMap<>();
    boolean flag = true;
    public void login(){
        System.out.println("Hi! Welcome to Techproed ATM..");
        do {
            data.put(12345, 1234); //user 1
            data.put(23456, 2345); // user 2
            data.put(34567, 3456); // user 3
            data.put(45678,4567);  // user 4
            try {
                System.out.println("Enter account number");
                setAccountNumber(scan.nextInt());
                System.out.println("Enter the pin number");
                setPinNumber(scan.nextInt());
            }catch ( Exception e){
                System.out.println("Hey! You have entered an invalid character!");
                System.out.println("Please enter an integer to proceed or you can type in 'Q' to exit");
                scan.nextLine();
                String exit = scan.next().toLowerCase();
                if(exit.equals("q")){
                    flag = false;
                }
                e.printStackTrace();
            }
            int count = 0;
            for(Map.Entry<Integer, Integer> w : data.entrySet()){

                if(w.getKey().equals(getAccountNumber()) && w.getValue().equals(getPinNumber())){
                    System.out.println("Welcome to your account!");
                }else{
                    count++;
                }
            }
            if(count == data.size()){
                System.out.println("Account number or pin number does not match our users");
                System.out.println("invalid User");
                System.out.println("Press any integer to try again or Press 'Q' to exit");
                String exit = scan.next();
                if(exit.equalsIgnoreCase("q")){
                    flag = false;
                }
            }
        }while (flag );
    }
    public void selectAccount(){
       do {
           System.out.println("Select Option: ");
           System.out.println("1: Checking Account operations");
           System.out.println("2: Saving Accoount operations");
           System.out.println("3: Exit");
           int option = scan.nextInt();
           if (option == 3) {
               break;
           }else if(option==1){
               
           } else if (option==2) {
               
           }else{
               System.out.println("Invalid Option! Please select a correct one");
           }
       }while(true);
    }
public void checkingOperations(){
    do {

        System.out.println("Select Option:");
        System.out.println("1: View Balance");
        System.out.println("2: Withdrow ");
        System.out.println("3: Deposit");
        System.out.println("4: Exit");

        int option=scan.nextInt();
        if(option==4){
            break;
        }
        switch(option){
            case 1:
                System.out.println("Your checking account balance is: "+moneyFormat.format(getCheckingBalance()));
                 break;
            case  2:
                if(getCheckingBalance()>0){
                getCheckingWithdraw();
            }else{
                    System.out.println("You do not have enough money, please deposit first!");
                }
            break;
            case 3:
                getCheckingDeposit();
                break;
            default:
                System.out.println("Invalid Option! Please select 1, 2, 3 or 4");
        }
    }while(true);
}
















    
}