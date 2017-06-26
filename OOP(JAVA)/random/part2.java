
package lab10;
import java.util.*;


class exc extends Exception{
    String l;
    public exc(String m){
        l=m;
    }
    public String toString(){
        return l;
    }
}

public class part2 {
    static void check(int r)throws exc{
        if(r<0){
            throw new exc("Negetive root");
        }
    }
    
    
    
    public static void main(String args[])throws exc{
        Scanner sc = new Scanner(System.in);
        while(true)
        {
        System.out.println("Input number for root: ");
        int r = sc.nextInt();
        
        try{
          part2 x = new part2();
               x.check(r);
            
        }
            catch(exc k){
                System.out.println("Not possible"+k);
                continue;
            }
          System.out.println("Possible");
          break;
        }
    }
}
   

