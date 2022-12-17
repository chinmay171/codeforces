<<<<<<< HEAD
package contest1743div2;

import java.util.*;

public class A_password2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; ++i) arr[i] = sc.nextInt();

            int count = 10 - arr.length;
            // if(count == 2){
            //     System.out.println("6");
            // }else{
                int ans = (3*(10-n)*(10-n-1));
                System.out.println(ans);
            // }
        }

        sc.close();
    }
=======
package contest1743div2;

import java.util.*;

public class A_password2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; ++i) arr[i] = sc.nextInt();

            int count = 10 - arr.length;
            // if(count == 2){
            //     System.out.println("6");
            // }else{
                int ans = (3*(10-n)*(10-n-1));
                System.out.println(ans);
            // }
        }

        sc.close();
    }
>>>>>>> 669e88164cebb7c329155a7d613749a30cd4ac29
}