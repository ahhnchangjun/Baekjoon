package Baekjoon3;

import java.util.Scanner;
public class P10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ary [] = new int[N];

        for(int i=0;i<N;i++){
            ary [i] = sc.nextInt();}

        int max= ary[0];
        int min= ary[0];
        for(int i=0; i < N; i++){
            if(ary[i]>max){
                max = ary[i];
            }


            if(ary[i]<min){
                min = ary[i];
            }
        }
        System.out.println(min+" "+max);
    }
}
