import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int A, N, X, i;
        
        N = sc.nextInt();
        X = sc.nextInt();
        
        for(i = 0 ; i < N ; i ++){
            A = sc.nextInt();
            if(A < X){
                System.out.print(A + " ");
            }
        }
    }
}