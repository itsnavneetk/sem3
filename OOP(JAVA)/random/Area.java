import java.util.Scanner;
public abstract class Area {
    abstract void calculate();
}

abstract class Rectangle{
    static int area;
    static void calculate(int l,int b)
    {
        area=l*b;
        System.out.println("Area = "+area);
    }
}

class Circle extends Rectangle{
    static double area;
    static void calculate(int radius)
    {
        area=3.14*radius*radius;
        System.out.println("Area = "+area);
    }
}

class xyz
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("1. Rectangle 2. Circle");
        int ch=sc.nextInt();
        if(ch==1)
        {
            System.out.println("Enter length and breadth:");
            int l=sc.nextInt();
            int b=sc.nextInt();
            Rectangle.calculate(l,b);
        }
        else if(ch==2)
        {
            System.out.println("Enter radius:");
            int r=sc.nextInt();
            Circle.calculate(r);
        }
    }
}