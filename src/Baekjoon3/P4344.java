package Baekjoon3;
import java.util.Scanner;

public class P4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 0; i < N; i++){
            int A = sc.nextInt();
            int ary[] = new int[A];
            double sum = 0.0;

            for(int j = 0; j < A; j++){
                ary[j] = sc.nextInt();
                sum += ary[j];
            }

            double avg = (sum / A);

            double count = 0.0;

            for(int l = 0; l < A; l++){

                if(avg<ary[l]){
                    count++;
                }
            }
            double result = (double) count / (double) A * 100;
            System.out.printf("%.3f%%\n",(double)(count/ary.length)*100);


//            System.out.println(Math.round(result*1000)/1000.0+"%");
        }
    }
}
