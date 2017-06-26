/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
/**
 *
 * @author student
 */
public class FileMenu {

    /**
     * @param args the command line arguments
     */
    static File file1;
	static File file2;
	static BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
	public static void main(String args[])throws Exception
	{
		int choice=0;
		while(true)
		{
			System.out.println("MENU");
			System.out.println("1. Write to a file");
			System.out.println("2. Read from a file");
			System.out.println("3. Copy bytes");
			System.out.println("4. Count number of chars, vowels, lines and words");
			System.out.println("5.Exit");
			System.out.print("Enter Choice: ");
			choice=Integer.parseInt(in.readLine());
			switch(choice)
			{
				case 1: writeTo();
				break;
				case 2: readFrom();
				break;
				case 3: copyBytes();
				break;	
				case 4: count();
				break;
				case 5: System.exit(0);
			}
		}
	}
	static void writeTo()throws Exception
	{
		System.out.println("Enter filename: ");
		file1=new File(in.readLine());
		System.out.println("Enter data to write: ");
		String data=in.readLine();
		FileWriter fw=new FileWriter(file1, true);
		fw.write(data, 0, data.length());
		fw.close();
	}
	static void readFrom()throws Exception
	{
		System.out.println("Enter filename: ");
		file1=new File(in.readLine());
		FileInputStream fis=new FileInputStream(file1);
		int x=0;
		while(true)
		{
			x=fis.read();
			if(x==-1)
			break;
			else
			System.out.print(""+(char)x);
		}
		System.out.println("\n");
		fis.close();
	}
	static void copyBytes()throws Exception
	{
		System.out.println("Enter source filename: ");
		file1=new File(in.readLine());
		System.out.println("Enter destination filename: ");
		file2=new File(in.readLine());
		FileInputStream fis=new FileInputStream(file1);
		FileOutputStream fos=new FileOutputStream(file2, true);
		int x=0;
		while(true)
		{
			x=fis.read();
			if(x==-1)
			break;
			else
			fos.write(x);
		}
		fis.close();
		fos.close();
	}
	static void count()throws Exception
	{
		System.out.println("Enter the file name:");
                file1=new File(in.readLine());
                FileInputStream fis=new FileInputStream(file1);
                int x=0,c=0,l=0,vow=0,words=0;
                while(true)
                {
                    x=fis.read();
                    if(x==-1)
                        break;
                    else if(x==' ')
                        words++;
                    else if(x=='a'||x=='A'||x=='e'||x=='E'||x=='i'||x=='I'||x=='o'||x=='O'||x=='u'||x=='U')
                        vow++;
                    else if(x=='.')
                        l++;
                    c++;
                    
                }
                System.out.println("Number of characters is: "+c);
                System.out.println("Number of words is: "+(words+1));
                System.out.println("Number of vowels is: "+vow);
                System.out.println("Number of lines is: "+(l+1));
	}
}

    

