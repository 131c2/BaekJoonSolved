import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int W, H;
        W = sc.nextInt();
        H = sc.nextInt();
        
        System.out.printf("%.1f",(double)(W*H)/2);        
    }
}