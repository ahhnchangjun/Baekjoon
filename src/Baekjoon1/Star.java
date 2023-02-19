package Baekjoon1;
import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String count = "*";
        int N = sc.nextInt();
        for(int i = 0; i <= N; i++){
            for(int j = N; j < N-1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
        }
    }
}
