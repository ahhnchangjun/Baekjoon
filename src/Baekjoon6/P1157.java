package Baekjoon6;

import java.util.Scanner;

public class P1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []ary = new int [26];
        String word = sc.next();

        for(int i = 0; i<word.length(); i++){
            if(65<=word.charAt(i) && 90>=word.charAt(i)){
                ary[word.charAt(i)-'A']++;
            }
            else{
                ary[word.charAt(i)-'a']++;
            }

        }
        int max = -1;
        char ch = '?';
        for(int i = 0; i<26;i++){
            if(ary[i]>max){
                max = ary[i];
                ch = (char) (i+65);
            }
            else if(ary[i]==max){
                ch ='?';
            }
        }
        System.out.println(ch);
    }
}
