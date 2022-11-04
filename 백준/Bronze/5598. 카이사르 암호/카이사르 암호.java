import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int lng = str.length();
        int[] arr = new int[lng];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = str.charAt(i);

            if(arr[i] < 68) {
                arr[i] += 23;
            } else {
                arr[i] -= 3;
            }
        }

        for(int i : arr) {
            System.out.print((char) i);
        }

    }
}