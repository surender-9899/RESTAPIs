package Pattern;

import java.util.Scanner;

public class StarPattern {
    static void main() {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the value of num: ");
        int num = Sc.nextInt();

        for(int  i= 1; i <= num; i++){
            for(int j = 1; j <= num; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("--------------------------------------------------------");

        for(int  i= 1; i <= num; i++){
            for(int j = 1; j <= num; j++){
                if(i == 1 || i == num || j == 1 || j == num){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

        System.out.println("--------------------------------------------------------");

        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------------------");

        for(int i = 1; i <= num; i++){
            for(int j = 1 ; j<= num - i + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("--------------------------------------------------------");


        for(int  i = 1; i <= num; i++){
            for(int j = 1; j <= num - i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("--------------------------------------------------------");

        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= i-1; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= num-i + 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("--------------------------------------------------------");

        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= num - i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= 2*i - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = num; i >= 1; i--){
            for(int j = 1; j <= num - i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= 2*i - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("--------------------------------------------------------");

        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= num-i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }


        System.out.println("--------------------------------------------------------");
        for(int i = num; i >= 1; i--){
            for(int j = 1; j <= num - i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
