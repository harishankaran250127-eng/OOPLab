package Exp3;

import java.util.Scanner;

public class FiboMain {
    static int count=0;
    static int fib(int n) {
        count++;
        if (n==0)
            return 0;
        if (n==1)
            return 1;
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if (n<=0) {
            System.out.println("Invalid Input");
        } else {
            for (int i=0;i<n;i++)
                System.out.print(fib(i)+ " ");
            count=0;
            int value = fib(n);
            System.out.println();
            System.out.println("Fibonacci value = "+value);
            System.out.println("Function Calls = "+count);
        }
        sc.close();
    }
}