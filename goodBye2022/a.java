package CodeForces.goodBye2022;

import java.util.Collections;
// import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[] arrN = new int[n];
            int[] arrM = new int[m];

            for(int i = 0; i < n; ++i) arrN[i] = sc.nextInt();
            for(int i = 0; i < m; ++i) arrM[i] = sc.nextInt();

            PriorityQueue<Integer> asc = new PriorityQueue<>();
            // PriorityQueue<Long> desc = new PriorityQueue<>(Collections.reverseOrder());

            for(int i = 0; i < n; ++i){
                asc.offer(arrN[i]);
            }
            for(int i = 0; i < m; ++i){
                asc.poll();
                asc.offer(arrM[i]);
            }
            
            long sum = 0;
            while(!asc.isEmpty()){
                sum += asc.peek();
                asc.poll();
            }

            System.out.println(sum);
        }

        sc.close();
    }
}
