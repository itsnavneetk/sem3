/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
/**
 *
 * @author student
 */
public class RandomAccessFile {
static File file1;
	static File file2;
	static BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
    public static void main(String args[])throws Exception
	{
		RandomAccessFile f1=new RandomAccessFile(in.readLine());
		try{
		f1.writeInt(23);
		f1.writeDouble(24.45);
		f1.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
    /**
     * @param args the command line arguments
     */
    
}
}
