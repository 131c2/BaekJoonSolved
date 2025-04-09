import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int h, m;
        h = sc.nextInt();
        m = sc.nextInt();
        m = m - 45;
        if (m < 0) {
            h--;
            m = m + 60;
        }
        if (h < 0) {
            h = h + 24;
        }
        System.out.println(h + " " + m);
    }
}