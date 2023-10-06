//Find the Sum of the Numbers in a Given Range using brout force

import java.util.*;
public class prog4 {
    public static void main(String args[]){
        System.out.println("enter the range of number");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int sum=0;
        for(int i=num1;i<=num2;i++)
            sum=sum+i;

            System.out.println("the sum is"+sum);

        
        
    }
    
}
