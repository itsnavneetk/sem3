import java.io.*;
public class FileIO
{
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
			System.out.println("4. Primitive Data");
			System.out.println("5. Count number of chars, lines and words");
			System.out.println("6.Exit");
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
				case 4: primData();
				break;
				case 5: count();
				break;
				case 6: System.exit(0);
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
	static void primData()throws Exception
	{
		RandomAccessFile file1=new RandomAccessFile(in.readLine());
		DataOutputStream dos=new DataOutputStream(new FileOutputStream(file1));
		try{
		dos.writeInt(23);
		dos.writeDouble(24.45);
		dos.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	static void count()
	{
		
	}
}