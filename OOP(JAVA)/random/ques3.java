/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.io.*;
/**
 *
 * @author MAHE
 */
public class ques3 
{
 public static void main(String args[])throws IOException
 {
     int c,x=0,word=0,line=0,vowel=0;
     try (FileReader f = new FileReader("D:/navneet/abc.txt")) {
         while((c=f.read())!=-1)
         {
             if(c==' ')
                 word++;
             else if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
                 vowel++;
             else if(c=='.')
                 line++;
             x++;
             
         }
         System.out.println("no of characters:"+x);
         System.out.println("no of words:"+(word+1));
         System.out.println("no of vowels:"+vowel);
         System.out.println("no of line:"+line);
     }
 }
}
         
     