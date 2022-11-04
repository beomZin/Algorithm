import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), ",");

        int[] A = new int[N];


        for(int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < K; i++) {
            int[] B = new int[A.length - 1];

            for(int j = 0; j < A.length - 1; j++) {
                B[j] = A[j + 1] - A[j];
            }

            A = B;
        }

        for(int i = 0; i < A.length; i++) {
            System.out.print(A[i]);
            if(i != A.length - 1) {
                System.out.print(",");
            }
        }

    }
}