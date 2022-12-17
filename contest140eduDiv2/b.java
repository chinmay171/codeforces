package contest140eduDiv2;

import java.util.Arrays;
import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long[] arr = new long[n];
            for(int i = 0; i < n; ++i) arr[i] = sc.nextInt();
            Arrays.sort(arr);
            long max = arr[0];
            for(int i = 1; i < n; ++i){
                while(max < arr[i]){
                    max++;
                    arr[i]--;
                }
            }

            System.out.println(max);
        }

        sc.close();
    }
}
