    package Baekjoon6;
    import java.util.Scanner;
    public class P11720 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int N = sc.nextInt();
            String str = sc.next();

            sc.close();

            int sum = 0;

            for(int i = 0; i < N; i++){
                sum += str.charAt(i)-'0';
            }
            System.out.println(sum);
        }
    }
