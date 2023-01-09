import java.util.Scanner;

public class b {
    static int modInverse(int A, int M)
    {
 
        for (int X = 1; X < M; X++)
            if (((A % M) * (X % M)) % M == 1)
                return X;
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int mod = 1000000007;
        while(t-- > 0){
            int n = sc.nextInt();

            long ans = n * (n+1) % mod * (2*n + 1) % mod * modInverse(6, mod-2) % mod;
            n--;
            ans += n*(n+1)% mod * (n+2)%mod * modInverse(3, mod - 2) % mod;
            // ans %= mod;
            System.out.println(ans*2022 % mod);
        }
        sc.close();
    }
}
