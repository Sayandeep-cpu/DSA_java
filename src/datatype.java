public class datatype {

    static void main() {

        //Numeric Datatypes

        byte num1 = 100;
        System.out.println(num1);
        long newNum2 = 700 ; // implicit conversion
        System.out.println(newNum2);

        short no1 = 50;
        System.out.println(no1);
//        short no2 = 200000;
//        System.out.println(no2);

        int num3 = 5000000;
        System.out.println(num3);

        long num_4 = 30481343;
        System.out.println(num_4);

        float num5 = 89831.2f;  // should give f atlast
        System.out.println(num5);
        float num6 = 9.12332f;
        System.out.println(num6);

        double num_7 = 1030132.313131;
        System.out.println(num_7);

        boolean isPassed = true;
        System.out.println(isPassed);

        char firstName = 'a'; // always should be in single quotation
        System.out.println("my first letter is : " + (firstName+7) ); // gives the character ascii value
        System.out.println((char)(firstName+12));// coverts the asciii to character


        long value1 = 393942762;
        int value2 = (int)value1;
        System.out.println(value2);


    }





}
