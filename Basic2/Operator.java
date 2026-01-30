package Basic2;

public class Operator {
    static void main(String[] args){
     int a= 8;
     int b=3;
     double c=a%(double)b;
     int d=(int)c+b;
     System.out.println(c);
     System.out.println(d);

     //Assigment Operator
        a-=b; //a=a-b;
        a*=b;//a=a*b;
        System.out.println(a);
     //Relational Operator
        System.out.println(a==b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
    //Logical Operator
        System.out.println("LOGICAL OPERATOR");
        boolean firstExpression = true;
        boolean secondExpression = false;
        System.out.println(firstExpression && secondExpression);
        System.out.println(firstExpression || secondExpression);
        System.out.println(!firstExpression);
        System.out.println(!secondExpression);
        System.out.println("BITWISE OPERATOR-INCREMENT/DECREMENT ORDER");
        int x=8;
        int y=x+1;
        y++;
        x--;
        System.out.println(y);
        System.out.println(x);
    }
}
