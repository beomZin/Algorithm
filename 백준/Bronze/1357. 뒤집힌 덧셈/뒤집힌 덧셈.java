import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String X = sc.next();
        String Y = sc.next();

        int lngX = X.length();
        int lngY = Y.length();

        String[] arrX = new String[lngX];
        String[] arrY = new String[lngY];

        String revX = "";
        String revY = "";

        int sum = 0;

        for(int i = 0; i < arrX.length; i++) {
            arrX[(lngX - 1) -  i] = X.substring(i, i + 1);
        }

        for(int i = 0; i < arrY.length; i++) {
            arrY[(lngY - 1) -  i] = Y.substring(i, i + 1);
        }

        for(int i = 0; i < arrX.length; i++) {
            revX += arrX[i];
        }
        for(int i = 0; i < arrY.length; i++) {
            revY += arrY[i];
        }

        sum = Integer.parseInt(revX) + Integer.parseInt(revY);

        String str = Integer.toString(sum);

        int lng = str.length();
        String[] arr = new String[lng];
        String rev = "";

        for(int i = 0; i < arr.length; i++) {
            arr[(lng - 1) - i] = str.substring(i, i + 1);
        }

        for(int i = 0; i < arr.length; i++) {
            rev += arr[i];
        }

        System.out.println(Integer.parseInt(rev));

    }
}