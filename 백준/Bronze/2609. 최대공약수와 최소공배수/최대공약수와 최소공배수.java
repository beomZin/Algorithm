import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int temp = 0;

        if (M < N) {
            temp = M;
            M = N;
            N = temp;
        }

        for(int i = N; i > 0; i--) {
            if(N % i == 0 && M % i == 0) {
                System.out.println(i);
                break;
            }
        }

        for(int i = M; i <= N*M; i++) {
            if(i % N == 0 && i % M == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}