import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        int N = sc.nextInt();
        int k = sc.nextInt();

        for(int i = 0; i < N; i++) {
            int x = sc.nextInt();

            list.add(x);
        }

        Collections.sort(list, Collections.reverseOrder());

        System.out.println(list.get(k-1));
    }
}