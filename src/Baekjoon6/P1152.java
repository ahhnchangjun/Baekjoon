package Baekjoon6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class P1152 {
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        String word = sc.nextLine();
//        sc.close();
//
//        StringTokenizer st = new StringTokenizer(word, " ");
//        System.out.println(st.countTokens());
//        Scanner sc = new Scanner(System.in);
//        String word = sc.nextLine();
//        int count = 0;
//        for(int i = 0; i<word.length();i++){
//            if(word.charAt(i) ==' '){
//                count++;
//            }
//        }
//        System.out.println(count);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        System.out.println(st.countTokens());

    }
}
