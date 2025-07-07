import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n, m, k;
        n = sc.nextInt(); //전체 카드 갯수
        m = sc.nextInt(); //앞 o 개수
        k = sc.nextInt(); //뒤 o 개수
        
        System.out.println(Math.min(m, k) + Math.min(n - m, n - k));
        
    }
}

// m과 k 중 최소값 + n - m 과 n - k 중 최소값