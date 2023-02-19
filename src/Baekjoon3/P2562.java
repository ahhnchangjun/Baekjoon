package Baekjoon3;
import java.util.Scanner;
public class P2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ary[] =new int[9];
        for(int i = 0; i<9;i++){
            ary[i] = sc.nextInt();
        }
        int max = ary[0];
        int count = 1;
        for(int i=1 ; i<9;i++){
            if(max<ary[i]){
                max = ary[i];
                count = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(count);

    }
}
