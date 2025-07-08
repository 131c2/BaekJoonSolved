import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int i, j;
        
        int[] arr = new int[30];
        
        for(i = 0; i < 30 ; i ++){
            arr[i] = i + 1;
        }
        
        while(sc.hasNextInt()){
            int n = sc.nextInt();
            for(i = 0 ; i < 30 ; i ++){
                if(n == arr[i]){
                    arr[i] = 0;
                }
            }
        }
        
        int min = 31;
        int min2 = 31;
        
        for(i = 0 ; i < 30 ; i ++){
            if(min > arr[i] && arr[i] != 0) {
                min = arr[i];
            }
        }
        
        for(i = 0 ; i < 30 ; i ++){
            if(arr[i] != min && min2 > arr[i] && arr[i] != 0){
                min2 = arr[i];
            }
        }
        System.out.println(min);
        System.out.println(min2);
    }
}