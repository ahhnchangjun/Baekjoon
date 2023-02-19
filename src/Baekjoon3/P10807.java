package Baekjoon3;
import java.io.*;
import java.nio.Buffer;
import java.util.Scanner;
import java.util.StringTokenizer;

public class P10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int N = Integer.parseInt(br.readLine());
        int [] numbers  = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i<N ; i++){
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        int sug = Integer.parseInt(br.readLine());
        int count = 0;
        for(int j = 0; j < N; j++){
            if(numbers[j] ==sug){
                count++;
            }

        }
        System.out.println(count);
        br.close();


    }
}
