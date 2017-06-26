/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.io.*;
import java.util.*;
/**
 *
 * @author MAHE
 */
public class ques1 
{
    public static void main(String args[])throws IOException
    {
        Scanner in=new Scanner(System.in);
        try
        {
       
        FileInputStream f=new FileInputStream("d:/navneet/abc.txt");
        FileOutputStream f1=new FileOutputStream("d:/navneet/def.txt");
        while(true)
        {
            System.out.println("1.write to a file");
            System.out.println("2.read from a file");
            System.out.println("3.copy bytes");
            System.out.println("4.exit");
            System.out.println("enter ur choice:");
            int c=in.nextInt();
            
            switch(c)
            {   
                case 1:String s;
                in.nextLine();
                System.out.println("enter the data to write:");
                s=in.nextLine();
                f1.write(s.getBytes());
                break;
                
                case 2:int b;
                
                    while((b=f.read())!=-1)
                {
                    System.out.println((char)b);
                }
                    break;
                    
                case 3:int x;
                        while(true)
                        {
                            x=f.read();
                            if(x==-1)
                                break;
                            else
                                f1.write(x);
                        }
                        break;
                
                default:System.exit(0);
            }
           
           
        
        }
        
        }
      
        
      catch(Exception e)
      {
          System.out.println(e);
      }
        
        
    }
}

                        
                    
   