
package lab10;
import java.util.*;


class exc2 extends Exception{
    String l;
    public exc2(String m){
        l=m;
    }
    public String toString(){
        return l;
    }
}

public class userD {
    static void check(int r,int c)throws exc2{
        if(r!=c){
            throw new exc2("Not a Square Matrix");
        }
    }
    
    
    
    public static void main(String args[])throws exc2{
        Scanner sc = new Scanner(System.in);
        while(true)
        {
        System.out.println("Input row and column: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        try{
          userD x = new userD();
               x.check(r,c);
            
        }
            catch(exc2 k){
                System.out.println("Not possible"+k);
                continue;
            }
          System.out.println("Possible");
          break;
        }
    }
}
   

