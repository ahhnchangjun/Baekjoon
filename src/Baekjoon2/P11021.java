package Baekjoon2;
import java.util.Scanner;
import java.io.*;
import java.util.StringTokenizer;

public class P11021 {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st;
//
//        int N = Integer.parseInt(br.readLine());
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 1; i <= N; i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println("Case #"+i+": "+ (A+B));
        }
    }
}
