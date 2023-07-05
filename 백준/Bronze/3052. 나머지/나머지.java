import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> set = new TreeSet<>();

        for(int i = 0; i < 10; i++) {
            set.add(sc.nextInt() % 42);
        }

        System.out.println(set.size());
    }
}