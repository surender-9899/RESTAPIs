package Interview;

import java.util.Scanner;

public class LargestAndSmallestDigitInNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Smallest is: "+ smallest(num));
        System.out.println("Largest is: " + largest(num));
    }
    public static int largest(int num){
        int lar = 0;
        while(num > 0){
            int temp = num % 10;
            if( temp > lar){
                lar = temp;
            }
            num = num/10;
        }
        return lar;
    }
    public static int smallest(int num){
        int small = 9;
        while(num > 0){
            int temp = num % 10;
            if( temp < small){
                small = temp;
            }
            num = num/10;
        }
        return small;
    }
}
