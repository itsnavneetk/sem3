//Program to count and display number of characters, words, lines and vowels in a string

import java.util.Scanner;

class String1
{
 static boolean isVowel(char a)
 {
	if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U')
	return true;
	return false;
 }
 
 static boolean isChar(char a)
 {
	if((a>=65&&a<=90)||(a>=97&&a<=122))
	return true;
	return false;
 }
 
 public static void main(String[] ar)
 { 
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a string - ");
	String str=sc.nextLine();
	
	int charcount=0;
	int vowelcount=0;
	int wordcount=1;
	int linecount=0;
	
	for(int i=0;i<str.length();i++)
	{
	 
	 if(isVowel(str.charAt(i))) vowelcount++;
	 if(isChar(str.charAt(i))) charcount++;
	 if(str.charAt(i)==' ') wordcount++;
	 if(str.charAt(i)=='.') linecount++;
	} 
	 
		
	System.out.println("Number of vowels = "+vowelcount);
	System.out.println("Number of characters = "+charcount);
	System.out.println("Number of words = "+wordcount);
	System.out.println("Number of lines = "+linecount);
 }
}