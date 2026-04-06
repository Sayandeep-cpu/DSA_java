public class loops {
    static void main() {

        //   FOR LOOP
        /*
        for(int i = 1 ; i <=5; i++){
            System.out.println("value of i is : " + i);
        }

        for (int j = 1; j<=9 ; j++){
            System.out.println("hi myself sayandeep");
        }
        */

        for (int o = 1 ; o<=10; o+=2){
            System.out.println("hp omen"); // log 10 base 2
        }

        // NESTED LOOPS
/*
        for (int i = 1; i<=3; i++){     // OUTER LOOP
            for(int j = 1; j<=10 ; j+=3){   // INNER LOOP         log 20 base 3
                System.out.println("hahahahaha log(n) * log(n)");
            }
        }


        for (int a = 1; a <=3 ; a++){
            for (int s =1 ; s<=3; s++){
                System.out.println("a = " + a + " s = " + s);
            }
        }
*/

        // BREAK AND CONTINUE KEYWORD

        for (int i = 1; i<=5;i++){
            for(int j=1 ; j<3 ; j++){
                if(i == j){
                    break;
                }
                System.out.println(i);
            }
        }

        for (int z = 1; z<=5;z++){
            for(int x=1 ; x<3 ; x++){
                if(z == x){
                    continue;
                }
                System.out.println(" z = " + z + " x = " + x);
            }
        }

        //WHILE LOOP

        int d =1;   //initialization
        while(d<5){     // condition
            System.out.println(d);
            d++;    //updation
        }

        //NESTED WHILE LOOP

        int n =1 ;
        while(n<=3){

            int q =1;
            while(q<=2){
                System.out.println(" n = " + n + " q = " + q);
                q++;
            }
            n++ ;
        }


        // DO-WHILE LOOP

        int y =1;
        do{
            System.out.println(y);
            y++;
        }while( y<=5);


    }
}
