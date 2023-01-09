import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[m];
            for(int i = 0; i < m; ++i) arr[i] = sc.nextInt();

            int max = Integer.MIN_VALUE;
            for(int a : arr){
                max = Math.max(a, max);
            }

            if(max > ((n+k-1)/k)){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }

        sc.close();
    }
}
