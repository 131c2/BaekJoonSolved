/*
    x >= 모든 자연수 y의 약수의 합  => g(x)
    g(N) => N보다 작은 자연수들의 약수의 합?
    N  g(N)
    1   1
    2   4?
    10  87
    2 1
    2 1 1
    10 5      2 1        18
    9       3   1        13
    8     4   2 1        15
    7           1        8
    6       3 2 1        12
    5           1        6
    4         2 1        7
    3           1        4
    2           1        3
    1                    1

i   출현횟수
              10   1             10 * i
1     10      n  / i    => sum += (n/i)
              10   2             5 *  i
2     5
              10   3             3  * i    
3     3        
4     2
5     2
6     1
7     1
8     1
9     1
10    1


*/
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n, i;
        long sum = 0;
        n = sc.nextInt();
        
        for(i = 1 ; i <= n ; i ++){
            sum += (long) (i * (n / i));
        }
        System.out.println(sum);
    }
}
