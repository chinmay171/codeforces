package contest1742div4;

import java.util.*;
import java.io.*;

public class B_increasing {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();
            while(t-- > 0){
                int n = sc.nextInt();
                int[] arr = new int[n];
                for(int i = 0; i < n; ++i) arr[i] = sc.nextInt();

                // if(n == 1){
                //     System.out.println("YES");
                //     continue;
                // }

                Arrays.sort(arr);

                boolean flag = false;
                for(int i = 0; i < n -1; ++i){
                    if(arr[i] == arr[i + 1]){
                        System.out.println("NO");
                        flag = true;
                        break;
                    }
                }
                if(flag == false)
               System.out.println("YES");
            }

            sc.close();
        }

        public static String bin(long n,long i) {
            StringBuilder list = new StringBuilder();
            list.append(0);
            while(n > 0) {
                list.append(n % i);
                n = n / i;
            }
            return new String(list);
        }
        static int[] sort(int[] arr,int n) {
            List<Integer> list = new ArrayList<>();
            for(int i = 0;i < n;i++)
                list.add(arr[i]);
            Collections.sort(list);
            for(int i = 0;i < n;i++)
                arr[i] = list.get(i);
            return arr;
        }
        static int gcd(int a, int b) {
            if (b == 0)
                return a;
            return gcd(b, a % b);
        }
        static int isPrime(int n) {
            if(n < 2)
                return 0;
            if(n < 4)
                return 1;
            if((n % 2) == 0 || (n % 3) == 0)
                return 0;
            for(int i = 5; (i * i) <= n; i += 6)
                if((n % i) == 0 || (n % (i + 2)) == 0)
                    return 0;
            return 1;
        }
        static class Reader {
            BufferedReader br;
            StringTokenizer st;
            public Reader() {
                br = new BufferedReader(new InputStreamReader(System.in));
            }
            String next() {
                while (st == null || !st.hasMoreElements()) {
                    try {
                        st = new StringTokenizer(br.readLine());
                    }
                    catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                return st.nextToken();
            }
            int nextInt() {
                return Integer.parseInt(next());
            }
            long nextLong() {
                return Long.parseLong(next());
            }
            double nextDouble() {
                return Double.parseDouble(next());
            }
            String nextLine() {
                String str = "";
                try {
                    if (st.hasMoreTokens())
                        str = st.nextToken("\n");
                    else
                        str = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return str;
            }
    }
}