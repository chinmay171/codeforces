package CodeForces.contest1741div3;

import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0;  i < n; ++i) a[i] = sc.nextInt();

            int max = a[0];
            int min = a[0];

            for(int i = 1; i < n; ++i){
                max = max | a[i];
                min = min & a[i];
            }

            System.out.println(max - min);

        }

        sc.close();
    }
}
