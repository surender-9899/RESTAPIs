package Interview;

import java.util.Scanner;

public class CountDigits {

    static void main() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(count(num));

    }
    public static int count(int num){
        int result = 0;
        while(num > 0){
            int temp = num % 10;
            result++;
            num = num/10;
        }
        return result;
    }
}
