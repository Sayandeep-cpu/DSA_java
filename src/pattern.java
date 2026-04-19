public class pattern {

    static void main() {


/*      SQUARE PATTERN

         int n = 4;
        for (int row = 1; row <=n ; row ++){
        // outer loop printing the row
            for(int col = 1 ; col <= n; col ++){
            // inner loop printing coloumn of each row
                System.out.print("*");
            }
            System.out.println();
        }
*/

/*      SOLID RECTANGULAR PATTERN
        int n = 3;
        for(int row = 1; row <= n ; row ++){
            for(int col = 1 ; col <= 5; col++){
                System.out.print("*");
            }
            System.out.println();
        }
*/

/*      SOLID RIGHT ANGLED TRIANGLE
        int n = 5;
        for (int row = 1 ; row <=n ; row ++ ){
            for(int col = 1 ; col <= row ; col ++){
                System.out.print("*");
            }
            System.out.println();
        }
*/

/*      SOLID RHOMBUS
        int n = 5;
        for(int row = 1 ; row <= n ; row ++){
        // foe each row we will first print spaces and the stars
            // spaces
            for(int col = 1; col <= n-row; col++){
                System.out.print(" ");
            }
            //stars
            for(int col =1; col <=n; col++){
                System.out.print("*");
            }
            System.out.println();
        }
*/

/*      INVERTED RIGHT ANGLED TRIANGLE
        int n = 5;

        for(int row = 1; row <= n ; row ++){
            for(int col =1 ; col <= n - row + 1; col ++){
                System.out.print("*");
            }
            System.out.println();
        }
*/

/*       SOLID PYRAMID
        int n = 5;

        for(int row = 1 ; row <= n ; row ++){
            //printing spaces 1st part
            for(int col =1 ; col<= n - row ; col ++){
                System.out.print("   ");
            }
            for(int col=1; col <= 2*row-1; col ++){
                System.out.print(" * ");
            }
            System.out.println();
        }
*/

/*      INVERTED PYRAMID
        int n= 5;

        for(int row = 1 ; row <= n; row ++){
            for(int col = 1 ; col <= row-1; col++){
                System.out.print(" ");
            }
            for( int col = 1 ; col <= 2*n-2*row-1; col ++){
                System.out.print("*");
            }
            System.out.println();
        }
*/

/*      HOLO RECTANGLE
        int n= 4;
        for(int row = 1 ; row <= n; row ++){
            // for each row printing 6 columns
            for( int col = 1; col <= 6 ; col ++){
                if( row ==1 || row ==n){
                    System.out.print("* ");
                }
                else {
                    // middle rows
                    if (col == 1 || col ==6) {
                        System.out.print("* ");
                    } else {
                        // middle columns
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
*/

/*      HOLLOw RIGHT ANGLED TRIANGLE
        int n = 10 ;

        for (int row = 1; row <= n; row ++){

            if(row ==1 || row == 2 || row == n){
                for(int col =1 ; col <= row ; col ++){
                    System.out.print("* ");
                }
            }else{
                System.out.print("* ");
                for(int col =1; col <= (row-2); col ++ ){
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            // move to next row
            System.out.println();
        }
*/

/* HOLLOw PYRAMID
        int n= 5;

        for(int row = 1; row <= n; row ++){
            // for each row variable coloumn present
            //part 1 printing spaces
            for (int col =1 ;col <= n-row; col ++){
                System.out.print("  ");
            }
            // part 2
            if(row ==1 || row == n ){
                for(int col = 1 ; col<= (2*row-1); col ++){
                    System.out.print("* ");
                }
            }else{
                // middle rows
                // 1* print
                System.out.print("* ");
                // then 2rows - 3
                for(int col =1 ; col<= 2*row-3; col++){
                    System.out.print("  ");
                }
                // then 1*
                System.out.print("* ");


            }
        // move to next line
            System.out.println();
        }
*/

//      SYMMETRIC PYRAMID
/*
        int n = 4;
        //part 1 = solid pyramid
        for(int row = 1; row <= n; row ++){
            // for each row variable column given
            // spaces
            for(int col = 1; col <= n- row ; col ++){
                System.out.print("  ");
            }
            // stars
            for(int col =1 ; col <= 2*row-1; col ++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //part 2 =inverted solid pyramid
        for(int row = 1; row <=n ;row ++){
            if(row == 1){
                continue;
            }
            //for each row variable column
            //spaces
            for(int col =1; col<= row-1; col++){
                System.out.print("  ");
            }
            //stars
            for(int col =1; col <= 2*n-2*row+1; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

*/

/*
// HOLLOw DIAMOND
        int n = 4;

        for(int row =1; row<=n ; row ++){
            //part1
            for(int col =1; col<= n-row; col ++){
                System.out.print("  ");
            }
            //part2
            if(row ==1 ){
                for(int col =1; col<= 2*row-1;col++){
                    System.out.print("* ");
                }
            }
            else{
                //middle row
                //1*
                System.out.print("* ");
                //2r-3 space
                for(int col=1; col<=2*row-3; col++){
                    System.out.print("  ");
                }
                //1*
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int row =1; row<=n-1;row++){
            //for each row variable column
            // spaces
            //part1
            for(int col =1; col<= row; col ++){
                System.out.print("  ");
            }
            //part2
            //stars
            if(row == n-1){
                System.out.print("* ");
            }
            else {
                System.out.print("* ");
                for (int col = 1; col <= 2 * (n - row) - 3; col++) {
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();
        }
*/

// NUMERICAL PATTERNS

/*
        int n =5;

        for(int row =1;row<=n; row++){
            for(int col=1;col<=row;col++){
                System.out.print(col);
            }
            System.out.println();
        }
*/

/*
        int n = 5;
        int count =1;

        for(int row =1; row<=n;row++){
            for(int col=1;col<= row;col++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
*/

/*
        int n =5;

        for(int row =1; row <= n; row++){
            for(int col= 1; col<= row ;col ++){
                int a = col;
                int b = ( 'A' - 1);
                int ans = a + b;
                char finalAns = (char)ans;
                System.out.print(finalAns + " ");
            }
            System.out.println();
        }
*/

/*
        int n =5 ;

        for(int row =1; row <= n; row ++){
            for(int col =1;col<= row;col++){
                int a = n-col;
                int b = 'A';
                int ans = a + b;
                char finalAns = (char)ans;
                System.out.print(finalAns + " ");
            }
            System.out.println();
        }
*/

/*
        int n =4;

        for(int row =1; row <= n;row ++){

            //spaces
            for(int col =1;col<= n-row; col++){
                System.out.print("  ");
            }
            //printing numbers
            for(int col =1; col <=row ; col++){
                System.out.print(col + " ");
            }
            //number
            int rowValue = row;
            int decRowVal = row -1;
            for(int col =1; col<= row -1 ; col ++){
                System.out.print(decRowVal  +" ");
                decRowVal --;
            }
            System.out.println();
        }
*/

/*
        int n = 4;
        for(int row =1; row<= n; row ++){
            //part 1
            //spaces
            for(int col =1;col<= n-row; col ++){
                System.out.print("  ");
            }
            //part2
            //numbering
            for(int col =1;col<= 2*row-1;col++){
                System.out.print(row + " ");
            }
            System.out.println();
        }
*/

/*
        int n =4;

        for(int row = 1; row <= n ; row ++){

            //part 1
            // spaces
            for(int col =1; col <= n-row ; col ++){
                System.out.print("  ");
            }
            //part 2
            // char printing 'A'-1
            for(int col= 1; col<=row;col++){
                int a = col;
                int b = 'A'-1;
                int ans = a+b;
                char finalAns = (char)ans;
                System.out.print(finalAns+ " ");
            }
            //part 3  'A' - 2
            char toPrint = (char)(row + 'A' - 2);
            for(int col =1; col<=row-1;col ++){
                System.out.print(toPrint+ " ");
                toPrint --;

            }
            System.out.println();
        }
*/


    }
}
