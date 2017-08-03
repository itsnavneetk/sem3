import java.util.*;
import java.io.*;

public class Stu{
	
	public static void main(String[] args) throws Exception{
		final String NAME="file.txt";
		Info student=new Info();
		student.enterInfo();
		ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(NAME));
		System.out.println("Writing object");
		out.writeObject(student);
		student=null;
		System.out.println("Student null");
		out.close();
		ObjectInputStream in=new ObjectInputStream(new FileInputStream(NAME));
		student=(Info)in.readObject();
		student.disp();
	}
	
}

class Data implements Serializable
{
	private Scanner sc;
	private ArrayList<ArrayList<Double>> marksList;
	private ArrayList<String> name;
	
	
	public Data(){
		marksList=new ArrayList<ArrayList<Double>>();
		name=new ArrayList<String>();
		sc=new Scanner(System.in);
	}
	
	public void enterInfo(){
		while(true){
			enterMarks();
			System.out.println("Continue (y/n)");
			String s=sc.nextLine();
			if(s.equals("n"))return;
		}
	}
	
	private void enterMarks(){
		System.out.println("Enter name");
		name.add(sc.nextLine());
		System.out.println("Enter marks");
		marksList.add(new ArrayList<Double>());
		ArrayList<Double> list=marksList.get(marksList.size()-1);
		while(true){
			list.add(Double.parseDouble(sc.nextLine()));
			System.out.println("Continue (y/n)");
			String s=sc.nextLine();
			if(s.equals("n"))return;
		}
	}
	
	public void disp(){
		for(int j=0;j<name.size();j++){
			System.out.println("Name : "+name.get(j));
			ArrayList<Double> l=marksList.get(j);
			for(int i=0;i<l.size();i++){
				System.out.println("Subject - "+(i+1)+" Marks : "+l.get(i)+"\tGrade : "+getGrade(l.get(i)));
			}
			System.out.println("Percentage : "+percentage(l)+" %");
		}
	}
	
	private double percentage(ArrayList<Double> l){
		double d=0;
		for(int i=0;i<l.size();i++){
			d+=l.get(i);
		}return d/l.size();
	}
	
	private String getGrade (double d){
		String[] grades={"A+","A","B","C","D","E"};
		double[] m={90,80,70,60,50,40};
		for(int i=0;i<m.length;i++){
			if(d>=m[i])return grades[i];
		}return "F";
	}
	
}