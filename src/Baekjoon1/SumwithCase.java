package Baekjoon1;
import java.util.Scanner;//11022

public class SumwithCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        for(int N = 1; N <= i ; N++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println("Case #"+N+": "+A+" + "+B+" = " + (A+B));
        }
    }
}
