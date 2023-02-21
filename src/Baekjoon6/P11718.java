package Baekjoon6;

import java.util.Scanner;

public class P11718 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){

            String typing = sc.nextLine();

            if(typing.length()>100 || typing.isEmpty()){
                break;
            }
            else{
                System.out.println(typing);
            }
        }
    }

}
