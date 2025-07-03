import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N,res;
        N = sc.nextInt();
        res = 1;
        
        if(N == 0){
            System.out.println(1);
        } else {
            while (N >= 1){
            res = N * res;
            N = N - 1;
            }
            System.out.println(res);
        }
    }
}