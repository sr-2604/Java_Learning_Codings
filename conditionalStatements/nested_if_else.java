package conditionalStatements;

public class nested_if_else {
    public static void main(String[] args) {
        int a =5;
        int b=8;
        int c=4;
        int d=9;
        
        if (a>b)
            System.out.println("a is bigger");
        if (a>c)
            System.out.println("a is bigger");
        else System.out.println("b is bigger");
        System.out.println(" c is bigger");
        System.out.println("d is bigger");

        if (b>a)
            System.out.println("b is bigger");
        if (b>c)
            System.out.println("b is bigger");
        if (b>d)
            System.out.println("b is bigger");
        else System.out.println("a is bigger");
        System.out.println("c is bigger");
        System.out.println("d is bigger");
    }
    
}
