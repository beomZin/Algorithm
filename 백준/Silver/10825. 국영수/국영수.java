import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    static class score {
        String name;
        int kor;
        int eng;
        int mat;

        public score(String name, int kor, int eng, int mat) {
            this.name = name;
            this.kor = kor;
            this.eng = eng;
            this.mat = mat;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        ArrayList<score> list = new ArrayList<score>();

        for(int i = 0; i < N; i++) {
            String name = sc.next();
            int kor = sc.nextInt();
            int eng = sc.nextInt();
            int mat = sc.nextInt();

            list.add(new score(name, kor, eng, mat));
        }

        Collections.sort(list, new Comparator<score>() {
            @Override
            public int compare(score o1, score o2) {
                if(o1.kor == o2.kor) {
                    if(o1.eng == o2.eng) {
                        if(o1.mat == o2.mat) {
                            return o1.name.compareTo(o2.name);
                        }

                        return -Integer.compare(o1.mat, o2.mat);
                    }

                    return Integer.compare(o1.eng, o2.eng);
                }

                return -Integer.compare(o1.kor, o2.kor);
            }
        });

        for(score result : list) {
            System.out.println(result.name);
        }
    }
}