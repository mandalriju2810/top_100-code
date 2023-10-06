//Java Program to Check Leap Year or not

import java.util.*;

public class prog6 {

    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter year");
    int year=sc.nextInt();
    if(year % 400==0 || (year % 4 ==0 && year % 100 !=0)){
        System.out.println(year + "is leep year");
    }
    else{
        System.out.println("not leap year");
    }
    }
}
