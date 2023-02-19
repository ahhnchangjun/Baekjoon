package Baekjoon1;
import java.util.Scanner;//10951

public class Sum3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextInt()){ //무한루프 일 때 언제 입력이 끝나는지 알기위해 입력이 있을 때만 받는다
            int A = sc.nextInt();
            int B = sc.nextInt();

            System.out.println(A+B);
        }
        sc.close();
    }
}
