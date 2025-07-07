import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N, i, ans;
        N = sc.nextInt();
        ans = 1;
        for(i = 0 ; i < N ; i ++){
            ans = ans * 2;
        }
        System.out.println(ans);
    }
}