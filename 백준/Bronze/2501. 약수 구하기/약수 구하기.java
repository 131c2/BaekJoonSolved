import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b, cnt, temp;
        a = sc.nextInt();
        b = sc.nextInt();
        temp = 1;
        cnt = 0;
        while(a >= temp){
            if(a % temp == 0){
                cnt ++;
                if(b == cnt){
                    System.out.println(temp);
                    return;
                }
            }
            temp ++;
        }
        
        System.out.println(0);
        
    }
}