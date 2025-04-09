import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b, c, temp;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        a *= 60;
        temp = a + b + c;
        temp %= (60*24);
        b = temp % 60;
        a = temp / 60;
        System.out.println(a + " " + b);
    }
}