//writing to a file
// Demonstrate FileOutputStream.
import java.io.*;

class writing
{
 public static void main(String args[]) throws Exception 
 {
	String source="hey its me!!!!!!!!!!";
	byte buf[] = source.getBytes();
	OutputStream f0 = new FileOutputStream("file1.txt");
	for(int i=0; i < buf.length; i++) //writing all the characters
	{
	 f0.write(buf[i]);//after storing it into a byte array
	}
	f0.close();

	OutputStream f1 = new FileOutputStream("file2.txt");
	f1.write(buf);//writing a file directly
	f1.close();
}
}