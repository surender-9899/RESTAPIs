package Interview;


import java.util.Scanner;

public class SumOfDigits {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(Sum(num));
    }
    public static int Sum(int num){
        int sum = 0;
        while(num > 0){
            int temp = num % 10;
            sum += temp;
            num = num/10;
        }
        return sum;
    }
}
