package Arrays;

import java.util.*;

public class Arr {

    static void main() {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int[] arr2 = {1,2,3,4,5};

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println(Arrays.toString(arr2));

        for(int n: arr2){
            System.out.print(n + " ");
        }
    }
}
