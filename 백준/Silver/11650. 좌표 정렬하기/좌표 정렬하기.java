import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    static class spot {
        int x;
        int y;

        public spot(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        ArrayList<spot> s = new ArrayList<spot>();

        for(int i = 0; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            s.add(new spot(a, b));
        }

        Collections.sort(s, new Comparator<spot>() {
            @Override
            public int compare(spot o1, spot o2) {
                if(o1.x == o2.x) {
                    return Integer.compare(o1.y, o2.y);
                }

                return Integer.compare(o1.x, o2.x);
            }
        });

        for(spot result : s) {
            System.out.println(result.x + " " + result.y);
        }

    }
}