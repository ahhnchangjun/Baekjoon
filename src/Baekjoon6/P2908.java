package Baekjoon6;

import java.util.Scanner;

public class P2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); int B = sc.nextInt();
        int max = 0;
        if(flip(A)>flip(B)){
            System.out.println(flip(A));
        }
        else{
            System.out.println(flip(B));
        }

    }
    public static int flip(int num){
        int result = 0;
        while(num!=0){
            result = result*10 + num%10;
            num = num/10;
        }
        return result;
    }

}

