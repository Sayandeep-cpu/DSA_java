import java.util.Scanner;

public class conditional {
    static void main() {

        int lecNo = 9 ;

        //  IF Statement

        if(lecNo >= 5){
            System.out.println("4th April lecture no. : " + lecNo);
        }


        // IF-ELSE statement

        int age = 22;

        if(age > 22 ){
            System.out.println("get a job or do Mtech");
        }else{
            System.out.println("study hard and get into IITS or in FAANG");
        }


        // IF ELSE IF LADDER

        int codeSolved = 5 ;

        if (codeSolved < 1){
            System.out.println("will get a package of 3-4 lpa");
        } else if (codeSolved < 2) {
            System.out.println("will get a package of 4-5 lpa");
        }else if( codeSolved < 3){
            System.out.println("will get a package of 5-9 lpa");
        }else if ( codeSolved < 4){
            System.out.println("will get a package of 9-15 lpa");
        }else{
            System.out.println("will get in FAANG but as a entry lvl job with package of 25-30lpa");
        }


        // NESTED IF ELSE

        int gotJobAge = 22 ;
        int switchJobAge = 23;

        if(gotJobAge >= 22){
            System.out.println( "got a job after passing from college");
            if( gotJobAge <= 22){
                System.out.println("studied for Gate but didn't even qualify ");
            }else{
                System.out.println("Didn't stop working hard yet and will work and study consistently");
            }
        }else{
            System.out.println("did not get a job");
        }
        if(switchJobAge == 23){
            System.out.println("switching in FAANG and MAANG company and practiced and solved DSA everyday");
        }else{
            System.out.println("got into IIT for Mtech by Qualifying Gate");
        }


        //  TERNARY OPERATOR

        int dsaStreak = 9 ;

        String status = (dsaStreak >= 150 )  ?  "will make it to Faang" : " Irregular practice everyday and maintain consistency";
        System.out.println(status);


        //  SWITCH STATEMENT

        System.out.println("Enter today's day: ");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();


        switch (day) {
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            default :
                System.out.println("Sunday");
        }








    }
}
