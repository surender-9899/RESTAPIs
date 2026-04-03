package Interview;

import java.util.Scanner;

public class palindrome {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(IsPalindrome(num));

    }
    public static boolean IsPalindrome(int num){
        int reversed = 0;
        int number = num;
        while(num > 0){
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }
        if(number == reversed){
            return true;
        }
        return false;
    }
}
