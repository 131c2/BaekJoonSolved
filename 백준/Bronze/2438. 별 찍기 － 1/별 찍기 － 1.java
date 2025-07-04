import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int i, j, N;
        
        N = sc.nextInt();
        
        for(i = 1 ; i <= N ; i ++){
            for(j = 0 ; j < i ; j ++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}