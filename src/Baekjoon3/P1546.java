package Baekjoon3;

import java.util.Scanner;

public class P1546 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int scores [] = new int[N];
      int max = 0;
      double sum = 0.0;
      for(int i=0;i<scores.length;i++){
          scores[i] = sc.nextInt();
          if(max < scores[i]){
              max = scores[i];}

      }
      for(int i = 0; i<scores.length;i++){
          sum += scores[i];
      }

        System.out.println(((sum / max)*100)/scores.length);
    }
}
