import java.util.Scanner;
interface Products
{
    int sales(int sales);
}
class Hardware implements Products
{
    public int sales(int sales)
    {
       System.out.println("Hardware Products: ");
       System.out.println("1) Keyboard:Microsoft");
       System.out.println("2) Mouse:Microsoft");
       System.out.println("3) Processors:Intel");
       
       return ++sales;
     
       
    }
}
class Software implements Products
{
    public int sales(int sales)
    {
       System.out.println("Software Products: ");
       System.out.println("1) Connectify:Windows,Mac");
       System.out.println("2) AVG:Windows,Mac");
       System.out.println("3) Bash:Linux,Mac");
       
       return ++sales;
    }     

}
class Test
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter h for buying hardware, s for software:");
        char ch = s.next().charAt(0);
        int sales = 400, total=400;
        
        if(ch == 'h')
        {
            Hardware hObj = new Hardware();
            total = hObj.sales(sales);
        }
        else if(ch == 's')
        {
            Software sObj = new Software();
            total = sObj.sales(sales);
        }
        else
            System.out.println("Wrong Input");
        System.out.println("Total sales: "+total);
        
    }
}