/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_8;

import java.util.Scanner;

/**
 *
 * @author student
 */



public class NewClass {

       static String rev(String s)
    {
        String str="";
        int l=s.length();
        int i=0;
        char ch;
        while(i<l)
        {
            ch=s.charAt(i);
            str=ch+str;
            i++;
        }
        return str;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter String");
        String s = sc.next();
        System.out.println("Enter SubString");
        String sub = sc1.next();
        String revsub = rev(sub);
        System.out.println(rev(sub)); 
        
        
        String s3;
       s3=s.replaceAll(s, revsub);
       System.out.println("final::" + s3);
       
        
    }
}
   

