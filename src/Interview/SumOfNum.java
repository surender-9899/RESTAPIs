package Interview;

import java.util.Scanner;

public class SumOfNum {
    static void main() {
        Scanner sc =new Scanner(System.in);
        int num =sc.nextInt();
        System.out.println(sum(num));
    }
    public static int sum(int num){
        int result = (num * (num+1)/2);
        return result;
    }
}
