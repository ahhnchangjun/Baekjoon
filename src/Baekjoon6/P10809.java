package Baekjoon6;

import java.util.Scanner;

public class P10809 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int [] ary = new int [26];
        for(int i = 0 ;i < 26 ; i ++){
            ary[i] = -1;
        }
        for(int i = 0; i<s.length();i++){
            if(ary[s.charAt(i)-97] == -1) ary[s.charAt(i)-97]=i;
        }

        for(int i = 0; i<ary.length;i++){
        System.out.print(ary[i]+" ");}

    }
}
