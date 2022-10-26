import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int C = sc.nextInt();

       for(int i = 0; i < C; i++) {
           int N = sc.nextInt();
           int sum = 0;
           double avg = 0;
           double std = 0;

           int[] arr = new int[N];

           for(int j = 0; j < N; j++) {
               arr[j] = sc.nextInt();

               sum += arr[j];
           }

           avg = (sum/N);

           int cnt = 0;

           for(int k = 0; k < arr.length; k++) {
               if(arr[k] > avg) {
                   cnt++;
               }
           }

           std = ((double)cnt/(double)N) * 100;

           System.out.printf("%.3f%%\n",std);
       }

    }

}