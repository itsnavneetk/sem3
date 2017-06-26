import java.util.Scanner;
interface AreaInterface {
    void calculate(int x);
}

class Rect implements AreaInterface{
    int b;
    public void calculate(int l)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter breadth:");
        b=sc.nextInt();
        int area=l*b;
        System.out.println("Area = "+area);
    }
}

class Circ implements AreaInterface{
    public void calculate(int radius)
    {
        double area=3.14*radius*radius;
        System.out.println("Area = "+area);
    }
}

class Inh{
    public static void main(String args[])
    {
        AreaInterface r=new Rect();
        AreaInterface c=new Circ();
        Scanner sc=new Scanner(System.in);
        System.out.println("1. Rectangle 2. Circle");
        int ch=sc.nextInt();
        if(ch==2)
        {
            System.out.println("Enter the radius:");
            int radius=sc.nextInt();
            c.calculate(radius);
        }
        if(ch==1)
        {
            System.out.println("Enter the length:");
            int l=sc.nextInt();
            r.calculate(l);
        }
    }
}