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
public class ques2 
{
public static void main(String args[])throws IOException
{
    
    RandomAccessFile f=new RandomAccessFile("d:/navneet/abc.txt","rw");
    f.writeInt(2);
    f.writeDouble(78.6);
    f.writeChar('A');
    f.writeInt('A'+1);
    f.seek(0);
    System.out.println((f.readInt()));
    System.out.println((f.readDouble()));
    f.seek(f.length());
    f.writeChar('B');
    f.seek(14);
    System.out.println((f.readInt()));
    f.seek(18);
    System.out.println((f.readChar()));
    f.close();
}
}
