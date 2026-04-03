package Interview;

import java.util.Scanner;

public class ArmstrongNo {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(IsArmstrong(num));
    }
    public static boolean IsArmstrong(int num){
        int result = num;
        int sum = 0;

        while(num > 0){
            int temp = num % 10;
            sum = sum + (temp * temp * temp);
            num = num/10;
        }
        if(sum == result){
            return true;
        }
        return false;
    }
}
