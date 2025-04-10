import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b, min;
        a = sc.nextInt();
        b = sc.nextInt();
        
        min = Math.min(a, b);
        
        while (min >= 1){
            if(a % min == 0 && b % min == 0){
                break;
            } else {
                min -= 1;
            }
        }
        System.out.println(min);
        System.out.println(a * b / min);
    }
}