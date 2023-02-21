package Baekjoon6;

import java.util.Scanner;

public class P2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i = 0; i < N; i++){
            int n = sc.nextInt();
            String word = sc.next(); //nextLine()을 쓰면 오류 why ? => 공백까지 읽어버리기 때문 next로 받아야 한다.
            //detail -> nextLine()은 엔터값 입력을 받을 때 까지 기준으로 한 줄을 읽어버림
            //          next()은 공백을 기준으로 하나의 문자열만 읽어온다.

            for(int j = 0; j < word.length(); j++){
                for(int l = 0; l < n; l++){
                    System.out.print(word.charAt(j));
                }

            }
            System.out.println();





        }
    }
}
