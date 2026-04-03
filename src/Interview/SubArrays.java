package Interview;

import java.util.Scanner;

public class SubArrays {
    static void main() {
        Scanner sc = new Scanner(System.in);
        //int[] arr = new int[5];
        int[] arr = {1,2,3};
        int count = 0;

        for(int i = 0; i < arr.length; i++){

            for(int j = i ; j < arr.length; j++){

                int sum = 0;

                for(int k = i; k <= j; k++){

                    System.out.print(arr[k] + " ");
                    //sum += arr[k];
                }

//                if(sum >= 5){
//                    count ++;
//                }
//System.out.println();
            }
        }
        //System.out.println("count " + count);


//        for(int i = 0; i < arr.length; i++){
//            int sum = 0;
//            for(int j = i; j < arr.length; j++){
//                sum += arr[j];
//            }
//            if(sum >= 5){
//                count ++;
//            }
//        }
//        System.out.println(count);
    }

    
}
