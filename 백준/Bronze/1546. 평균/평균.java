import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int max = 0;
        for (int score : arr) {
            if (max < score) {
                max = score;
            }
        }

        float sum = 0.0f;
        for (float score : arr) {
            sum += score / max * 100.0;
        }

        System.out.println(sum / arr.length);
    }
}