import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] arr = new String[50];
        int[] A = new int[50];
        int sum = 0;

        A[0] = 10;
        String str = sc.nextLine();


        for(int i = 0; i < str.length(); i++) {
            arr[i] = str.substring(i, i + 1);
        }

        for(int i = 1; i < str.length(); i++) {
            if(arr[i].equals(arr[i - 1])) {
                A[i] = 5;
            } else {
                A[i] = 10;
            }
        }

        for(int i = 0; i < str.length(); i++) {
            sum += A[i];
        }

        System.out.println(sum);
    }
}