public class operator {
    static void main() {

        int a = 52;
        int b = 43;
//          ARITHMETIC OPERATORS
        int add = a + b ;
        System.out.println(add);

        int diff = a - b ;
        System.out.println(diff);

        int mul = a * b ;
        System.out.println(mul);

        int div = a / b ;
        System.out.println(div);

        int mod = a % b;
        System.out.println(mod);


//      RELATIONAL OPERATOR

        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a < b);
        System.out.println(a > b);
        System.out.println(a <= b);
        System.out.println(a >= b);

//      LOGICAL OPERATOR

        boolean gettingInFaang = true ;
        boolean notGettingInFaang = false ;

        System.out.println( gettingInFaang && notGettingInFaang);
        System.out.println( gettingInFaang  || notGettingInFaang);
        System.out.println(!gettingInFaang);



//      ASSIGNMENT OPERATOR

        int rating_points = 100;

        rating_points +=20;
        System.out.println(rating_points);

        rating_points -=5 ;
        System.out.println(rating_points);

        rating_points *= 4;
        System.out.println(rating_points);

        rating_points /=4 ;
        System.out.println(rating_points);

        rating_points %= 2;
        System.out.println(rating_points);

        int subMarks = 25 ;

        int preSubMarks = ++subMarks; //26
        int postSubMarks = subMarks++;//will print 26 but value changed to 27

        System.out.println(preSubMarks); //26
        System.out.println(postSubMarks);//26
        System.out.println(subMarks);//27


    }
}
