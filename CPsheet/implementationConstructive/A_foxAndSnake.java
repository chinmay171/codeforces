import java.util.*;
import java.io.*;

public class A_foxAndSnake {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            int n = sc.nextInt();
            int m = sc.nextInt();

            boolean counter = true; 
            for(int i = 0; i < n; ++i){
                if(i % 2 == 0){
                    for(int j = 0; j < m; ++j){
                        System.out.print("#");
                    }
                }else{
                    if(counter == true){
                        for(int j = 0; j < m-1; ++j){
                            System.out.print(".");
                        }
                        System.out.print("#");
                        counter = false;
                    }else{
                        System.out.print("#");
                        for(int j = 1; j < m; ++j){
                            System.out.print(".");
                        }
                        counter = true;
                    }
                }
                System.out.println();
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
//  //********************* Custom Pair Class *********************
// class Pair implements Comparable<Pair> {
//     int a,b;
//     public Pair(int a,int b) {
//         this.a = a;
//         this.b = b;
//     }
//     @Override
//     public int compareTo(Pair other) {
// //        if(this.b == other.b)
// //            return Integer.compare(this.a,other.a);
//         return Integer.compare(other.b,this.b);
//     }
// }
//        //   ****************** Segment Tree ******************
// public class SegmentTreeNode {
//     public SegmentTreeNode left;
//     public SegmentTreeNode right;
//     public int Start;
//     public int End;
//     public int Sum;
//     public SegmentTreeNode(int start, int end) {
//         Start = start;
//         End = end;
//         Sum = 0;
//     }
// }
// public SegmentTreeNode buildTree(int start, int end) {
//     if(start > end)
//         return null;
//     SegmentTreeNode node = new SegmentTreeNode(start, end);
//     if(start == end)
//         return node;
//     int mid = start + (end - start) / 2;
//     node.left = buildTree(start, mid);
//     node.right = buildTree(mid + 1, end);
//     return node;
// }
// public void update(SegmentTreeNode node, int index) {
//     if(node == null)
//         return;
//     if(node.Start == index && node.End == index) {
//         node.Sum += 1;
//         return;
//     }
//     int mid = node.Start + (node.End - node.Start) / 2;
//     if(index <= mid)
//         update(node.left, index);
//     else
//         update(node.right, index);
//     node.Sum = node.left.Sum + node.right.Sum;
// }
// public int SumRange(SegmentTreeNode root, int start, int end) {
//     if(root == null || start > end)
//         return 0;
//     if(root.Start == start && root.End == end)
//         return root.Sum;
//     int mid = root.Start + (root.End - root.Start) / 2;
//     if(end <= mid)
//         return SumRange(root.left, start, end);
//     else if(start > mid)
//         return SumRange(root.right, start, end);
//     return SumRange(root.left, start, mid) + SumRange(root.right, mid + 1, end);
// }
// }
