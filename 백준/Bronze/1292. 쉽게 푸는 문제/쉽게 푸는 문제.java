import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int start = sc.nextInt();
       int end = sc.nextInt();

       int[] arr = new int[end];
       int cnt = 0;
       int chk = 1;

       for(int i = 0; i < end; i++) {
           arr[i] = chk;
           cnt++;

           if(cnt == chk){
               chk++;
               cnt = 0;
           }
       }
       
        System.out.println(GetSum(arr, start, end));
    }

    public static int GetSum(int[] a, int b, int c) {
        int sum = 0;

        for(int i = b -1; i < c; i++) {
            sum += a[i];
        }
        
        return sum;
    }
}