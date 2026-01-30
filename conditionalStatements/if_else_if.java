package conditionalStatements;

public class if_else_if {
    public static void main(String[] args) 
    {
    //   int Marks = 70;
    //   if (Marks >= 90)
    //     System.out.println("Student Passed with Grade A");
    // else if(Marks >= 75)
    //     System.out.println("Student passed with Grade B");
    // else if(Marks >=60)
    //     System.out.println("Student passed with Grade C");
    // else if(Marks >=35)
    //     System.out.println("Student passed with Grade D");
    // else System.out.println("Student is failed");
    int pass_mark = 65;
    int Math_mark=79;
    int English_mark=87;
    int Hindi_mark=98;
    int Science_mark = 64;
    //  if (Math_mark >= pass_mark)
    //     System.out.println("Student is passed in Math");
    // if(English_mark>=pass_mark)
    // System.out.println("Student is passed in English subject");
    // if (Hindi_mark >= pass_mark)
    //     System.out.println("Student is passed in Hindi subject");
    // if (Science_mark >= pass_mark)
    //     System.out.println("Student is Passed in Science");
    // else System.out.println("Student is failed in every subjects");
    if (Math_mark >= pass_mark &&
        English_mark>= pass_mark &&
        Hindi_mark >=pass_mark &&
        Science_mark >=pass_mark)
        System.out.println("Student is Passed");
    else System.out.println("Student is Failed");
    }   
}
