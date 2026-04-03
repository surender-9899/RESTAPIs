package Interview;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(rev(num));

    }
    public static int rev(int num){
        int reversed = 0;
        while(num > 0){
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }
        return reversed;
    }
}
