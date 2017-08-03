import java.io.*;

class ShowFile
{
	public static void main(String args[])
	throws IOException
	{
		int i=0;
		FileInputStream fin;
	
		try
		{
			fin=new FileInputStream(args[0]);
		}
		catch(FileNotFoundException e)	
		{
			System.out.println("File not found");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Usage: ShowFile File");
		}
		fin=new FileInputStream(args[0]);
		do
		{
			i=fin.read();	
			if(i!=-1)
			System.out.print((char)i);
		}while(i!=-1);
		fin.close();
	}
}