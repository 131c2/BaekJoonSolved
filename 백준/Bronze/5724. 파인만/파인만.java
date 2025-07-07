import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n;
        
        int cnt, i;
        while((n = sc.nextInt()) != 0){
            cnt = 0;
            for(i = 0 ; i < n ; i ++){
            cnt += (n - i) * (n - i);
            }
            System.out.println(cnt);
        }
    }
}