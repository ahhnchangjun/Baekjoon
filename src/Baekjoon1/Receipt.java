package Baekjoon1;//25304
import java.util.Scanner;
public class Receipt {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int i = sc.nextInt();
        int count = 0;
        for (int N = 0; N < i ; N++ ){
            int A = sc.nextInt();
            int B = sc.nextInt();
            count += (A*B);
        }
        if(total == count){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
