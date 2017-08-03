//counting
import java.io.*;
class count {
public static void main(String args[])
throws IOException
{
int words=0;
int count=0;
char c='\0';
int i;
FileInputStream fin;

try {
// open input file
try {
fin = new FileInputStream("file1.txt");
} catch(FileNotFoundException e) {
System.out.println("Input File Not Found");
return;
}
} catch(ArrayIndexOutOfBoundsException e) {
System.out.println("Usage: CopyFile From To");
return;
}
try {
do {
i = fin.read();
if(i != -1) 
{
c=(char)i;
if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
count=count+1;
if(c==' ')
words=words+1;
}
} while(i != -1);
} catch(IOException e) {
System.out.println("File Error");
}
System.out.println("no of vowels of file are"+(count));
System.out.println("no of words of file are"+(words+1));
fin.close();

}
}