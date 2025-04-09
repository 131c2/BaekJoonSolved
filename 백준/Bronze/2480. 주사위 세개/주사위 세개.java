import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b, c, res;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        res = 0;
        if(a == b && b == c){
            res = 10000 + a * 1000;
        } else if(a != b && b != c && a != c){
            int max = Math.max(a,Math.max(b,c));
            res = max * 100;
        } else {
            if(a == b){
                res = 1000 + a * 100;
            } else if(b == c){
                res = 1000 + b * 100;
            } else {
                res = 1000 + a * 100;
            }
        }
        System.out.println(res);
    }
}