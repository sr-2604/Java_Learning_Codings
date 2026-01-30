package Basic2;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println("My age is " + (float)age);

        float age_num= sc.nextFloat();
        System.out.println("My age is "+ (int)age_num);

        System.out.println("My age is "+ (age_num+age));
        sc.close();
    }
}
