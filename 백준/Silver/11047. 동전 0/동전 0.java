import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        int cnt = 0;
        for(int i = arr.length - 1; i >= 0; i--) {
            if(arr[i] <= k) {
                cnt += k / arr[i];
                k %= arr[i];
            }
        }
        
        System.out.print(cnt);
    }
}