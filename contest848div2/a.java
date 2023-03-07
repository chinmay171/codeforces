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

    public static void solve() throws Exception {
        int n = in.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; ++i) arr[i] = in.nextInt();

        long lessThanZero = 0;
        long sum = 0;
        for(int i = 0; i < n; ++i){
            sum += arr[i];
            if(arr[i] == -1) lessThanZero++;
        }
        
        if(lessThanZero == 0){
            out.println(sum - 4);
        }else if(lessThanZero == 1){
            out.println(sum);
        }else{
            boolean yes = false;
            for(int i = 0; i < n-1; ++i){
                if(arr[i] == -1 && arr[i+1] == -1){
                    yes = true;
                }
            }
            if(yes == true){
                out.println(sum + 4);
            }else{
                out.println(sum);
            }
        }
    }
}