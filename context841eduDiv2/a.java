package context841eduDiv2;

import java.util.Arrays;
import java.util.Scanner;

public class a {

    public static boolean checkEqual(int[] arr1, int[] arr2){
        for(int i = 0; i < arr1.length; ++i){
            if(arr1[i] != arr2[i]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; ++i) arr[i] = sc.nextInt();

            int[] Tarr = new int[n];
            for(int i = 0; i < n; ++i) Tarr[i] = arr[i];
            int[] T = new int[n];
            Arrays.sort(Tarr);

            boolean smallTaken = false;
            int i = 0;
            int j = n-1;
            int k = 0;
            while(i <= j){
                if(smallTaken == false){
                    T[k] = Tarr[i];
                    i++;
                    smallTaken = true;
                }else{
                    T[k] = Tarr[j];
                    j--;
                    smallTaken = false;
                }
                k++;
            }

            if(checkEqual(T, arr) == true && checkEqual(arr, Tarr) == false){
                // for(int x = 0; x < n; ++x) System.out.print(T[x] + " ");
                // System.out.println();
                // for(int x = 0; x < n; ++x) System.out.print(arr[x] + " ");
                // System.out.println();
                // System.out.println(T == arr);
                System.out.println("NO");
            }else{
                System.out.println("YES");
                for(int x = 0; x < n; ++x) System.out.print(T[x] + " ");
                System.out.println();
            }
        }
        sc.close();
    }
}
