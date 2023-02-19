package Baekjoon1;
import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(A*(int)(B%10));
        System.out.println(A*(int)((B%100)*0.1));
        System.out.println();
    }
}
