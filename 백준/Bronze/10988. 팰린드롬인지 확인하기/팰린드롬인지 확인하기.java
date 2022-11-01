import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int lng = str.length();
        String[] arr = new String[lng];
        int cnt = 0;
        int chk = 0;

        for(int i = 0; i < arr.length; i++) {
            arr[i] = str.substring(i, i + 1);
        }

        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals(arr[(lng - 1) - i])) {
                cnt++;
            }
        }

        if(cnt == lng) {
            chk = 1;
        }

        System.out.println(chk);
        
    }
}