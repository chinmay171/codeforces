import java.util.*;
import java.io.*;

public class a {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while(t-- > 0){
                int n = sc.nextInt();
                int[] arr = new int[n];
                for(int i = 0; i < n; ++i) arr[i] = sc.nextInt();

                // int ans = 0;
                ArrayList<Integer> evenArr = new ArrayList<>();
                ArrayList<Integer> oddArr = new ArrayList<>();

                for(int i = 0; i < n; ++i){
                    if(arr[i] % 2 == 0){
                        evenArr.add(arr[i]);
                    }else{
                        oddArr.add(arr[i]);
                    }
                }
                int oddSum = 0;
                for(Integer i : oddArr){
                    oddSum += i;
                }
                if(oddSum %2 == 0){
                    System.out.println("0");
                    // break;
                    continue;
                }
                int ans = Integer.MAX_VALUE;
                for(Integer i : oddArr){
                    int count = 0;
                    while(i % 2 != 0){
                        count++;
                        i = i/2;
                    }
                    ans = Math.min(ans, count);
                    if(evenArr.size() > 0){
                        int ans2=Integer.MAX_VALUE;
                        for (int j = 0; j <evenArr.size() ;j++) {
                            int num = evenArr.get(i);
                            count = 0;
                            while ((num & 1) != 1) {
                                count++;
                                num = num / 2;
                            }
                            ans2=Math.min(ans2,count);
                        }
                        ans=Math.min(ans,ans2);
                        System.out.println(ans);
                    }else{
                        System.out.println(ans);
                    }
                }
                // int count = 0;
                // for(Integer i : oddArr){
                //     while(i%2 != 0){
                //         i = i / 2;
                //         count++;
                //     }
                // }
                // ans = Math.min(ans, count);
                // count = 0;

                // if(evenArr.size() == 0) {
                //     System.out.println(ans);
                //     continue;
                // }
                // for(Integer i : evenArr){
                //     while(i%2 != 1){
                //         i = i / 2;
                //         count++;
                //     }
                // }
                // ans = Math.min(ans, count);
                // System.out.println(ans);
            }   

            sc.close();
        }

        // public static boolean isGood(int[] arr){

        // }

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