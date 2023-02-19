package Baekjoon3;
import java.util.Scanner;

public class P10871  {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int numbers = sc.nextInt();
        int ary [] = new int [N];

        for(int i = 0; i < N ; i++){
            ary[i] = sc.nextInt();}
        for(int i = 0; i < N; i++) {
            if(ary[i]<numbers) {
                System.out.print(ary[i]+" ");
            }

        }


//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        int N = Integer.parseInt(st.nextToken());
//        int numbers = Integer.parseInt(br.readLine());
//
//        int ary[] = new int[N];
//
//        for(int i=0;i<N;i++){
//            ary [i] = Integer.parseInt(st.nextToken());
//        }
//
//        for(int i = 0; i < N ; i++){
//            if(numbers<ary[i]){
//                System.out.println(ary[i]);
//            }
        }

    }

