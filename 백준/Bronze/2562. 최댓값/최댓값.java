import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[9];

        for(int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        int max = nums[0];
        int arr = 1;

        for(int i=0; i< nums.length; i++) {
            if(nums[i] > max) {
                max = nums[i];
                arr = i + 1;
            }
        }

        System.out.println(max);
        System.out.println(arr);
    }
}