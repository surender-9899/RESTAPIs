package Interview;

import java.util.Scanner;

public class Factorial {
    static void main() {
        Scanner sc = new Scanner(System.in);
        long num =sc.nextLong();
        System.out.println(Fact(num));

    }
    public static long Fact(long num){
        long result = 1;
        for(long i = num; i > 0; i--){
            result = result * i;
        }
        return result;
    }
}
