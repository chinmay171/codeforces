package CodeForces.Atcoder.abc277;

import java.util.*;
import java.io.*;

public class b {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();

            String[] strArr = new String[n];
            for(int i = 0; i < n; ++i){
                strArr[i] = sc.next();
            }

            HashSet<String> set = new HashSet<>();

            for(int i = 0; i < strArr.length; ++i){
                String currStr = strArr[i];
                if( currStr.charAt(0) != 'H' && currStr.charAt(0) != 'D' &&
                    currStr.charAt(0) != 'C' && currStr.charAt(0) != 'S'){
                        System.out.println("No");
                        return;
                }
                if(currStr.charAt(1) != 'A' && currStr.charAt(1) != '2' &&
                   currStr.charAt(1) != '3' && currStr.charAt(1) != '4' && 
                   currStr.charAt(1) != '5' && currStr.charAt(1) != '6' &&
                   currStr.charAt(1) != '7' && currStr.charAt(1) != '8' &&
                   currStr.charAt(1) != '9' && currStr.charAt(1) != 'T' &&
                   currStr.charAt(1) != 'J' && currStr.charAt(1) != 'Q' &&
                   currStr.charAt(1) != 'K'){
                        System.out.println("No");
                        return;
                }
                if(set.contains(currStr) == true){
                    System.out.println("No");
                        return;
                }
                set.add(currStr);
            }

            System.out.println("Yes");

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