//palindrome number

import java.util.*;


public class prog8 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int reverse=0,rem,temp;
        temp=num;
        while(temp!=0){
            rem=temp%10;
            reverse=reverse*10+rem;
            temp=temp/10;

        }
        if (num == reverse)
       System.out.println (num + " is Palindrome");
     else
       System.out.println (num + " is not Palindrome");
    }
    
}
