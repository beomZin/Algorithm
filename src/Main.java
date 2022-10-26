import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int sum = 0;
        int[][] arr = new int[100][100];

        for(int i = 0; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            for(int j = a; j < a + 10; j++) {
                for(int k = b; k < b + 10; k++) {
                    arr[j][k] = 1;
                }
            }
        }

        for(int i = 0; i < 100; i++) {
            for(int j = 0; j < 100; j++) {
                if(arr[i][j] == 1) {
                    sum++;
                }
            }
        }

        System.out.println(sum);
    }

}