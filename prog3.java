// sum of N nutural number


//for theory
import java .util.*;
public class prog3 {
    public static void main(String args[]){
        // Scanner sc=new Scanner(System.in);
        // System.out.println("enter number::");
        // int n=sc.nextInt();
        //  System.out.println("sun of" + n+ "number is"+ (n*(n+1)/2));



        // for recursion

        int n=10;
        int sum=getSum (n);
        System.out.println(sum);


    }

    static int getSum(int n){
        if(n==0)
        return n;

        return n+getSum(n-1);
    }
    
}
