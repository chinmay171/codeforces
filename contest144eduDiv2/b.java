import java.util.*;
import java.io.*;

class Main {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(
                new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
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
                if (st.hasMoreTokens()) {
                    str = st.nextToken("\n");
                } else {
                    str = br.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    static class FastWriter {
        private final BufferedWriter bw;

        public FastWriter() {
            this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        public void print(Object object) throws IOException {
            bw.append("" + object);
        }

        public void println(Object object) throws IOException {
            print(object);
            bw.append("\n");
        }

        public void close() throws IOException {
            bw.close();
        }
    }

    static FastReader in;
    static FastWriter out;
    static {
        if (System.getProperty("ONLINE_JUDGE") == null) {
            try {
                System.setOut(new PrintStream(
                    new FileOutputStream("output.txt")));
                System.setIn(new FileInputStream("input.txt"));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        try {
            in= new FastReader();
            out= new FastWriter();
            int testCases = in.nextInt();
            while (testCases-- > 0) {
                solve();
            }
            out.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
    // static class Pair {
    //     int x, y;

    //     Pair(int first, int second) {
    //         this.x = first;
    //         this.y = second;
    //     }

    //     Pair() {
    //     }
    // }

    public static long gcd(long a, long b){
        if(b == 0) return a;
        return gcd(b, a%b);
    }

    // public static void reverse(String s){
    //     int i = 0;
    //     int j = s.length()-1;

    //     while(i <= j){
    //         char temp = s.charAt(i);
    //         s.charAt(i) = s.charAt(j);
    //         s.charAt(j) = temp;
    //     }
    // }

    // public static boolean minorT(String a, String b, String t){
    //     if(t.length() == 1){
    //         if(a.charAt(0) == b.charAt(0) == t.charAt(0)){

    //         }
    //     }
    // }

    public static void solve() throws Exception {
        String a = in.next();
        String b = in.next();

        if(a.equals(b) == true){
            out.println("YES");
            out.println(a);
            return;
        }

        if(a.charAt(0) == b.charAt(0)){
            out.println("YES");
            out.println(a.charAt(0) + "*");
            return;
        }else if(a.charAt(a.length()-1) == b.charAt(b.length()-1)){
            out.println("YES");
            out.println("*" + a.charAt(a.length()-1));
            return;
        }else{
            for(int i = 0; i < a.length()-1; ++i){
                for(int j = 0; j < b.length()-1; ++j){
                    if(a.charAt(i) == b.charAt(j) && a.charAt(i+1) == b.charAt(j+1)){
                        out.println("YES");
                        out.println("*" + a.charAt(i) + a.charAt(i+1) + "*");
                        return;
                    }
                }
            }
            out.println("NO");
        }

        // String t = "";

        // boolean isCommon = false;
        // for(int  i = 0; i < a.length(); ++i){
        //     for(int j = 0;  j < b.length(); ++j){
        //         while(i < a.length() && j < b.length() && a.charAt(i) == b.charAt(j)){
        //             t = t + a.charAt(i);
        //             isCommon = true;
        //             i++;
        //             j++;
        //         }
        //         if(isCommon == true){
        //             if(t.length() == 1){
        //                 if(i == 1 && j == 1){
        //                     out.println("YES");
        //                     out.println(t + "*");
        //                 }else if(i == a.length() && j == b.length()){
        //                     out.println("YES");
        //                     out.println("*" + t);
        //                 }else{
        //                     out.println("NO");
        //                 }
        //             }else{
        //                 out.println("YES");
        //                 out.println("*" + t + "*");
        //             }
        //             return;
        //         }
        //     }
        // }
        // out.println("NO");
    }
}