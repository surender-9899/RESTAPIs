package Interview;

import java.util.Scanner;

public class OddEven {
    public static void main() {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
         if(n%2 == 0){
            System.out.println("even");
        }
        else{
            System.out.println("Odd");
        }

//        int result = (n%2 == 0) ? 1 : 0;
//        System.out.println(result);
    }
}
