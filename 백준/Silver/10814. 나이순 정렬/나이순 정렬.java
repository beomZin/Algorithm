import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    static class member {
        int no;
        int age;
        String name;

        public member(int no, int age, String name) {
            this.no = no;
            this.age = age;
            this.name = name;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        ArrayList<member> mem = new ArrayList<member>();

        for(int i = 0; i < N; i++) {
            int age = sc.nextInt();
            String name = sc.next();

            mem.add(new member(i, age, name));
        }

        Collections.sort(mem, new Comparator<member>() {
            @Override
            public int compare(member o1, member o2) {
                if(o1.age == o2.age) {
                    return Integer.compare(o1.no, o2.no);
                }

                return Integer.compare(o1.age, o2.age);
            }
        });

        for(member result : mem) {
            System.out.println(result.age + " " + result.name);
        }
    }
}