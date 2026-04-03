package Interview;

import java.util.Scanner;

public class PrimeNo {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean result = IsPrime(num);
        System.out.println(result);

    }
    public static boolean IsPrime(int num){
        if(num <= 1){
            return false;
        }
        for(int i = 2; i <= num/2; i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
}
