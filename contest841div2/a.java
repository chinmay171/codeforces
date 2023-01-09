import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; ++i) arr[i] = sc.nextInt();

            long p = 1;
            for(int i = 0; i < n; ++i) p *= (long)arr[i];

            p += (long)(n-1);

            System.out.println(p*2022);
        }

        sc.close();
    }
}
