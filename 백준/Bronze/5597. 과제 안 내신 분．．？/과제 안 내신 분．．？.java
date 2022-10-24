import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int[] arr = new int[30];
       int[] num = new int[28];

       for(int i = 1; i <= arr.length; i++) {
           arr[i - 1] = i;
       }

       for(int i = 0; i < num.length; i++) {
           num[i] = sc.nextInt();
       }

       for(int i = 0; i < arr.length; i++) {
           for(int j = 0; j < num.length; j++) {
               if(arr[i] == num[j]) {
                  arr[i] = -1;
               }
           }
       }

       for(int i = 0; i < arr.length; i++) {
           if(arr[i] != -1) {
               System.out.println(arr[i]);
           }
       }
    }
}