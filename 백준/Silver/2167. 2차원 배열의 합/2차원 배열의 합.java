import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] arr = new int[N][M];

        for(int n = 0; n < N; n++) {
            for(int m = 0; m < M; m++) {
                arr[n][m] = sc.nextInt();
            }
        }

        int K = sc.nextInt();

        for(int i = 0; i < K; i++) {
            int sum = 0;

           int a = sc.nextInt() - 1;
           int b = sc.nextInt() - 1;
           int c = sc.nextInt() - 1;
           int d = sc.nextInt() - 1;

           for(int j = a; j <= c; j++) {
               for(int k = b; k <= d; k++) {
                   sum += arr[j][k];
               }
           }

           System.out.println(sum);
        }

    }
}