package Interview;

import java.util.Scanner;

public class GreaterIn3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if(num1 >= num2 && num1 >= num3){
            System.out.printf("%d num1 is greater",num1);
        }

        else if(num2 >= num1 && num2 >= num3){
            System.out.printf("%d num2 is greater",num2);
        }
        else{
            System.out.printf("%d num3 is greater",num3);

        }
    }


}
