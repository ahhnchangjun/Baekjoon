package Baekjoon1;
import java.util.Scanner;//8393

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int count = 0;
        for(int N = 1 ; N <=i ; N++)
        {
            count += N;

        }
        System.out.println(count);
    }
}
