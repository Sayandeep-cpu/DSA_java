import java.util.Scanner;

public class takingInput {
    static void main() {

        Scanner sc  = new Scanner(System.in );
        // it creates a scanner class to take inputs as objects from user
        System.out.println("Enter the value for first number ");
        int firstNum = sc.nextInt();
        System.out.println("Enter the value for second Number :");
        int secondNum = sc.nextInt();
        int ans = firstNum + secondNum ;
        System.out.println(" the total ans is :" + ans);


        double value = sc.nextDouble();
        System.out.println("the double value" + value);

        sc.close();

    }
}
