package Baekjoon6;

import java.util.Scanner;

public class P9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i = 0; i < N; i++) {
            String word = sc.next();
            char first = word.charAt(0);
            int lastIndex = word.length()-1;
            char last = word.charAt(lastIndex);
            System.out.println(first+""+last);
        }
        sc.close();
    }
}
