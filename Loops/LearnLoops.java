package Loops;

import java.util.Scanner;

public class LearnLoops {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a number");
            int n = sc.nextInt();
            // for (int i=1;i<=10;i++)
            // System.out.println(i*n);
            
            System.out.println("Sum of Natural Number");
            int sum=0;
            for (int i=1;i<=n;i++)
                {
                    sum += 2*i;
                }
                System.out.println("Sum of Even Numbers is: "+sum);
        }
    
}
