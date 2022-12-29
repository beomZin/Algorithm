import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i < N; i++) {
            int n = sc.nextInt();

            arr.add(n);
        }

        Collections.sort(arr);

        for(int i : arr) {
            System.out.println(i);
        }

    }
}