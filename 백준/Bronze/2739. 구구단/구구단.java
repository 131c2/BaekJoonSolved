import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int i, N;
        
        N = sc.nextInt();
        
        for(i = 1 ; i <= 9 ; i ++){
            System.out.println(N + " * " + i + " = " + N * i);
        }
    }
}