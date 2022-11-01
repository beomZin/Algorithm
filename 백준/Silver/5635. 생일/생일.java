import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    static class birth {
        String name;
        int d;
        int m;
        int y;

        public birth(String name, int d, int m, int y) {
            this.name = name;
            this.d = d;
            this.m = m;
            this.y = y;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        ArrayList<birth> list = new ArrayList<birth>();

        for(int i = 0; i < N; i++) {
            String name = sc.next();
            int dd = sc.nextInt();
            int mm = sc.nextInt();
            int yy = sc.nextInt();

            list.add(new birth(name, dd, mm, yy));
        }

        Collections.sort(list, new Comparator<birth>() {
            @Override
            public int compare(birth o1, birth o2) {
                if(o1.y == o2.y) {
                    if(o1.m == o2.m) {
                        return Integer.compare(o1.d, o2.d);
                    }

                    return Integer.compare(o1.m, o2.m);
                }

                return Integer.compare(o1.y, o2.y);
            }
        });

        System.out.println(list.get(N - 1).name);
        System.out.println(list.get(0).name);

    }
}