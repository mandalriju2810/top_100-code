//gratest number with inbuilt max number

import java.util.*;

public class prog5 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number 1");
        int num1=sc.nextInt();
         System.out.println("enter number 2");
        int num2=sc.nextInt();

        if(num1== num2){
           System.out.println("both are equal");
        }
        else{
            System.out.println(Math.max(num1, num2)+"is greater");
        }

    }
    
}
