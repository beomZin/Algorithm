import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[3];
        int[] start = new int[3];
        int[] end = new int[3];
        int cnt = 0;
        int sum = 0;


        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < start.length; i++) {
            start[i] = sc.nextInt();
            end[i] = sc.nextInt();
        }

        for(int i = 0; i < 100; i++) {

            for(int j = 0; j < start.length; j++) {
                if(start[j] == i) {
                    cnt++;
                } else if(end[j] == i) {
                    cnt--;
                }
            }

            if(cnt == 1) {
                sum += arr[0]*cnt;
            } else if(cnt == 2) {
                sum += arr[1]*cnt;
            } else if(cnt == 3) {
                sum += arr[2]*cnt;
            }

        }

        System.out.println(sum);

    }
}