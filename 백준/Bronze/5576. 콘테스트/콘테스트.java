import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] W = new int[10];
        int[] K = new int[10];
        int sumW = 0;
        int sumK = 0;

        for(int i = 0; i < W.length; i++) {
            W[i] = sc.nextInt();
        }

        for(int i = 0; i < K.length; i++) {
            K[i] = sc.nextInt();
        }

        for(int i = 0; i < W.length; i++) {
            for(int j = i + 1; j < W.length; j++) {
                if(W[j] > W[i]) {
                    int temp = W[j];
                    W[j] = W[i];
                    W[i] = temp;
                }
            }
        }

        for(int i = 0; i < K.length; i++) {
            for(int j = i + 1; j < K.length; j++) {
                if(K[j] > K[i]) {
                    int temp = K[j];
                    K[j] = K[i];
                    K[i] = temp;
                }
            }
        }

        for(int i = 0; i < 3; i++) {
            sumW += W[i];
        }

        for(int i = 0; i < 3; i++) {
            sumK += K[i];
        }

        System.out.println(sumW + " " + sumK);
    }
}