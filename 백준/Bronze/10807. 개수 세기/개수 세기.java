import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N, i;
        
        N = sc.nextInt();
        
        int[] arr = new int[N];
        
        for(i = 0 ; i < N ; i ++){
            arr[i] = sc.nextInt();
        }
        
        int v = sc.nextInt();
        int cnt = 0;
        
        for(i = 0 ; i < N ; i ++){
            if(arr[i] == v){
                cnt ++;
            }
        }
        System.out.println(cnt);
    }
}