public class Variables_data_type {
    public static void main(String[] args) {
        int age = 20;
        byte system = 13;
        double marks = 85.0;
        float number = 89.0f;
        System.out.println("Her age is " + age);
        System.out.println("Byte of system " + system);
        System.out.println("Mark in Math is "+ marks);
        System.out.println("number is "+number);

        //Explicit Use Of DataType:
        System.out.println("DATA TYPE CONVERSION");
        System.out.println("Her age is " + (double)age);
        System.out.println("Byte of system " + (long)system);
        System.out.println("Mark in Math is "+ (long)marks);
        System.out.println("number is "+(float)number);

    }
}
