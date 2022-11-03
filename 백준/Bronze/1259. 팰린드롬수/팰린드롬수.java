import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true) {
            String str = sc.next();
            if(str.equals("0")) {
                break;
            }

            int lng = str.length();
            int cnt = 0;

            String[] arr = new String[lng];


            for(int i = 0; i < arr.length; i++) {
                arr[i] = str.substring(i, i + 1);
            }

            for(int i = 0; i < arr.length; i++) {
                if(arr[i].equals(arr[(lng - 1) - i])) {
                    cnt++;
                }
            }

            if(lng == cnt) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }

        }

        }
    }