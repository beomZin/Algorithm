import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        int avg = 0;

        for(int i = 0; i < 5; i++) {
            int N = sc.nextInt();

            list.add(N);
        }

        Collections.sort(list);

        for(int i = 0; i < list.size(); i++) {
            sum += list.get(i);

            avg = sum/list.size();
        }
        System.out.println(avg);
        System.out.println(list.get(2));
    }
}