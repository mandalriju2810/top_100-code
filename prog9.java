//Fibonacci Series in Java

import java.util.*;

public class prog9{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number do u want to check fibbonaci");
        int num=sc.nextInt();
        int firstNum=0,seconNum=1;
        System.out.print (firstNum + " , " + seconNum + " , ");
        int nextItem;
        for(int i=2;i<num;i++ ){

            nextItem=firstNum+seconNum;
            firstNum=seconNum;
            seconNum=nextItem;
            System.out.println( nextItem+  ",");

        }

    }
}