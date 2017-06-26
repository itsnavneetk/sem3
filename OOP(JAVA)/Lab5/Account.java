/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_5;
import java.util.*;

public class Account {
    String  cusName, accType;
    int balance;
    String accNo;
    
    void getData(){
        System.out.println("Enter details:");
        Scanner sc = new Scanner(System.in);
        System.out.println("customer name : ");
        cusName = sc.next();
        System.out.println("Account type : ");
        accType = sc.next();
        System.out.println("Account number : ");
        accNo = sc.next();
        System.out.println("Balance : ");
        balance = sc.nextInt();
}    
    int accT(){
        int flag =1;
        if ("saving".equals(accType)){
            flag=0;
        }
        else{
            flag=1;
        }
        return flag;
    }
}
    
 class Saving extends Account{
    int deposit,withdraw,penalty;
        
        int update (int bb,int d,int w,int p,int time){
            if(bb<1000){
                System.out.println(" Balance below rs.1000 Penalty charges 2%");
                p = (2*bb/100 );
            }
            else{
                p=0;
            }
            
            
            balance = bb;
            if(d!=0){
                System.out.println("Intrest on savings account : 10% p.a");
            int intrest = 10;
            d=d+((balance+d)*intrest/100*time);
            
        }          
            int total = balance + (d-w-p);
            return total;
        } 
        
        void disp(Account m){
            System.out.println("Account details: \n"+ m.cusName+"\n"+m.accNo+"\nsaving \n"+"Rs." + m.balance);
            
        }
 }



 class Current extends Account{
    int deposit,withdraw,penalty;
         int update (int bb,int d,int w,int p,int time){
               if(bb<1000){
                   System.out.println("Penalty charges 5%");
                p = (5*bb/100 );
            }
               else{
                   p=0;
               }
             balance = bb;
             if(d!=0){
                System.out.println("Intrest on current account : 0% p.a");
            int intrest = 0;
            d=d+((balance+d)*intrest/100*time);
            
        }          
             balance = balance + (d-w-p);
            return balance;
        }
        void disp(Account m){
            System.out.println("Account details: \n"+ m.cusName+"\n"+m.accNo+"\ncurrent \n"+"Rs." + m.balance);
            
        }
}

class MainAcc{
    public static void main(String args[]){
        Account obj;
        int temp;
        obj = new Account();
        obj.getData();
        temp = obj.accT();
        Current obj1 = new Current();
        Saving obj2 = new Saving();
           
        if (temp == 1){
            System.out.println("Current Account");                 
        }
        else{
            System.out.println("Saving Account");
            }
        
        boolean error=true;
        Scanner s = new Scanner(System.in);
        while(error == true){
            
            System.out.println("\n \n Enter 1.Account info \n 2.Deposit \n 3.Withdraw  ");
            int ans = s.nextInt();
            
            if(ans == 1){
                if(temp == 1){
                    obj1.disp(obj);
                }
                else{
                    obj2.disp(obj);
                }
              error = true;  
            }
            else if(ans == 2){
                System.out.println("Enter the amount to be deposited and time");
                int d = s.nextInt();
                int y = s.nextInt();
                   if(temp == 1){
                    int newB =obj1.update(obj.balance,d,0,0,y);
                    obj.balance = newB;
                    obj1.disp(obj);
                }
                else{
                               
                    int newB =obj2.update(obj.balance,d,0,0,y);
                    obj.balance = newB;
                    obj2.disp(obj);
                   
                }
                
                error = true;
            }
            else if(ans == 3){
                    System.out.println("Enter amout to withdraw");
                    int w = s.nextInt();
                if(temp == 1){
                    int newB =obj1.update(obj.balance,0,w,0,0);
                    obj.balance = newB;
                    obj1.disp(obj);                      

                }
                else{
                    int newB =obj2.update(obj.balance,0,w,0,0);
                    obj.balance = newB;
                    obj2.disp(obj);
                }
                error = true;
            }
            else{
                
                error = false;
                System.out.println("EXIT");
            }
        }
        
        
     
    }
}


