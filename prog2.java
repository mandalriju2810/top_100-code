
// even or odd

import java.util.Scanner;

public class prog2 {
   public prog2() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("enter number");
      int var2 = var1.nextInt();
      if (var2 % 2 == 0) {
         System.out.println("" + var2 + "is even");
      } else {
         System.out.println("" + var2 + "is odd");
      }

   }
}
