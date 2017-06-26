/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author student
 */
public class Encrypt{
public static void main(String args[])
throws IOException
{
int i;
FileInputStream fin;
FileOutputStream fout;
try {
// open input file
try {
fin = new FileInputStream("file3.txt");
} catch(FileNotFoundException e) {
System.out.println("Input File Not Found");
return;
}
// open output file
try {
fout = new FileOutputStream("file4.txt");
} catch(FileNotFoundException e) {
System.out.println("Error Opening Output File");
return;
}
} catch(ArrayIndexOutOfBoundsException e) {
System.out.println("Usage: CopyFile From To");
return;
}
// Copy File
try {
do {
i = fin.read();
System.out.println(i);
if(i != -1) 
fout.write(i+1);
} while(i != -1);
} catch(IOException e) {
System.out.println("File Error");
}
fin.close();
fout.close();
}
}

