package Baekjoon3;

import java.util.Scanner;

public class P8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < N ; i++){
            int scores = 0;
            int sum = 0;

            String mark = sc.nextLine();
            char [] sep = new char[mark.length()];

            for(int j = 0; j<mark.length();j++){
                sep[j] = mark.charAt(j);

                if(sep[j] =='O'){
                    scores = scores +1;
                }else{
                    scores = 0;
                }
                sum = sum + scores;
            }
            System.out.println(sum);
        }sc.close();

    }
}
