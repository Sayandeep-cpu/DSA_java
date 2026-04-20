public class method {
    //declaration/ definition
    static void print2Table(){
        for(int i = 1; i<= 10; i++){
            int ans = 2*i;
            System.out.println("->" + ans);
        }
    }

     static int  printSum(int x, int y ){
        //PARAMETER ASSIGNED
         int add = x + y;
         return add;
    }
    static int  printSum(int x, int y, int z ){
        //PARAMETER ASSIGNED
        int add = x + y + z;
        return add;
    }
/*
    static void print2Sum(){
        // NO PARAMETER ASSIGNED
        int a =5;
        int b = 3;
        System.out.println(a+b);
    }
*/


    static void solve(int num){
        System.out.println("inside solve: " + num);
        num = num *10;
        System.out.println("inside solve : " + num);
    }



    static void main() {

        int num =5;

        System.out.println("inside main :" + num);
        solve(num);
        System.out.println("inside main : " + num);

        int ans1 = printSum(15,28);
        int ans2= printSum(4,6,9);
        //System.out.println("ans1 is " + ans1);
        //System.out.println("ans2 is " + ans2);

        //System.out.println("hi myself sayandeep");
        // function call
        //print2Table();
        //int result = printSum( 23,  91); // storing the result
        //System.out.println(result);
        //print2Sum();
        //System.out.println("done");

    }
}
