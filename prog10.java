
//factorial of a given number

import java.util.*;

public class prog10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter factorial number:");
        int num = sc.nextInt();
        System.out.println("Factorial of a number" + num + "is" + factorial(num));

    }

    static int factorial(int n) {
        if (n == 0)
            return 1;
        return n * factorial(n - 1);

    }

}
