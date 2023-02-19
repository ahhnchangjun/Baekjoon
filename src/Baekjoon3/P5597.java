package Baekjoon3;


import java.util.Scanner;

public class P5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean ary[] = new boolean[31];

        for (int i = 0; i < 28; i++) {
            int students = sc.nextInt();
            ary[students] = true;
        }

        for (int j = 1; j < ary.length; j++) {
            if (!ary[j]) {
                System.out.println(j);
            }


        }
    }
}

