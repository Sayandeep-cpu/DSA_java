import java.util.Scanner;

public class array {
    static void main() {

        // add and multiply
        int arr [][]= {{1,2,3},{32,43,21}};

        // finding max value
        int maxVal = arr[0][0];
        for(int i = 0; i< arr.length ; i++){
            for(int j = 0; j< arr[i].length; j++){
                if(arr[i][j] > maxVal){
                    maxVal = arr[i][j];
                }
            }
        }
        System.out.println(maxVal);
        //finding Min value

        int minVal = arr[0][0];
        for(int i= 0;i< arr.length;i++){
            for(int j =0;j<arr[i].length;j++){
                if(arr[i][j] < minVal){
                    minVal = arr[i][j];
                }
            }
        }
        System.out.println(minVal);


/*
        int ans = 1;
        for(int i = 0 ;i<arr.length;i++){
            for(int j = 0; j<arr[i].length;j++){
                int mul = arr[i][j];
                ans = ans * mul;
            }
        }
        System.out.println(ans);

/*
/*
        int sum = 0 ;
        for(int i = 0 ; i < arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                int val = arr[i][j];
                sum = sum + val;
            }
        }
        System.out.println(sum);
*/





/*
        int arr [][] = new int[2][4];

        Scanner sc  = new Scanner(System.in);

        for(int i =0; i<= arr.length-1; i++){
            for(int j = 0; j<=arr[i].length-1;j++){
                System.out.println("enter the value of row : " + i + "enter the value of col : " + j);
                arr[i][j] = sc.nextInt();
            }
        }

        for(int rowIndex = 0; rowIndex<= arr.length-1;rowIndex++){
            for(int colIndex= 0; colIndex<arr[rowIndex].length-1; colIndex++){
                System.out.print(arr[rowIndex][colIndex] + " ");
            }
            System.out.println();
        }
*/



/*
        //declaration
        int [][] arr;
        //allocation
        arr = new int [3][4];
        //init
        int[][] brr = { {11,25},
                        {21,34,12,321},
                        {53,24,31,65,63,78},
                        {45,59} ,
                        {6,7}
        };
        //System.out.println(brr[3][1]);

        int rowLength = brr.length;
        //int colLength = brr[0].length;

        for(int rowIndex = 0;rowIndex <= rowLength-1; rowIndex ++){
            int colLength = brr[rowIndex].length;
            for(int colIndex= 0; colIndex <= colLength-1; colIndex ++){
                System.out.print(brr[rowIndex][colIndex] + " ");
            }
            System.out.println();
        }
*/
/*
        // TRAVERSAL
        for(int rowIndex = 0; rowIndex <= brr.length-1; rowIndex++){
            for(int colIndex = 0; colIndex <= brr[rowIndex].length-1; colIndex ++){
                System.out.print(brr[rowIndex][colIndex] + " ");
            }
            System.out.println();
        }
*/




/*
                            1D - ARRAY


        // finding max and min value in an array
        int arr [] = {39,23,45,11,31};
        int n = arr.length;
        int maxVal = arr[0];
        int minVal = arr[0];

        //compare maxVal to array's every element
        for(int i = 0; i<= n-1;i++){
            if(arr[i]> maxVal){
                //update the maxVal
                maxVal = arr[i];
            }
        }
        System.out.println(maxVal);
        //compare minVal to array's every element
        for(int i = 0;i<=n-1;i++){
            if(arr[i] < minVal){
                minVal = arr[i];
            }
        }
        System.out.println(minVal);
*/

/*
      //  int arr [] = {1,2,3,4,5,6,7,8,9};

        int ans = 1;
        int n = arr.length ;

        for(int i = 0 ; i<=n-1; i++){
            int mul = arr[i];
            ans = ans * mul;
        }
        System.out.println(ans);
*/


/*
        int n = arr.length;
        int sum= 0;
        for(int i =0;i<=n-1;i++){
            int value = arr[i];
            sum = sum +value;
        }
        System.out.println(sum);
*/


/*
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        int n = arr.length;
        //input
        for(int i = 0; i<=n-1;i++){
            System.out.println(" provide input of all the index one after one: " + i);
            arr[i]= sc.nextInt();
        }
        //print
        for(int val : arr){
            System.out.println("printing index value " + val);
        }
*/

/*
        //declaration
        int arr[];
        //allocation
        arr = new int [10];
        //initialize
        int array[] = {96,97,98};


//      FOR EACH LOOP
        int n = array.length;
        for(int val : array){
            System.out.println(val);
        }
*/

/*
        int n = array.length;
        for(int index= 0 ; index<= n ; index++ ){
            System.out.println(array[index]);
        }
*/
    //    System.out.println("value at 0th index: " + array[0]);
    //    System.out.println("value at 1st index: " + array[1]);
    //    System.out.println("value at 2nd index: " + array[2]);





    }
}
