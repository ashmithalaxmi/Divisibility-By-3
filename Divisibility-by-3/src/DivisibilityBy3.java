import java.util.Scanner;

public class DivisibilityBy3 {
    public static int isDivisible(int[] arr,int n){
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += arr[i];
        }
        if(sum%3==0)
            return 1;
        else
            return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println(isDivisible(arr, n));
    }
}
