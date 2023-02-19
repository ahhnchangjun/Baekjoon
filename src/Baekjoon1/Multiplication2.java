package Baekjoon1;
import java.util.Scanner;//10950
public class Multiplication2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        for(int N = 0 ; N<i ; N++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(A+B);
        }
    }
}
