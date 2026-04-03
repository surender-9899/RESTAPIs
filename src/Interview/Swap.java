package Interview;

import java.util.Scanner;

public class Swap {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.printf("num1:%d",num1);
        System.out.printf("num2:%d",num2);
        System.out.println();

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.printf("num1:%d",num1);
        System.out.printf("num2:%d",num2);

    }

}
