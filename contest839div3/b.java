package CodeForces.contest839div3;

import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();

        while(t-- > 0){

            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println();
            int c = sc.nextInt();
            int d = sc.nextInt();

            int minVal = Math.min(Math.min(a, b), Math.min(c, d));
            int maxVal = Math.max(Math.max(a, b), Math.max(c, d));
            
            if(minVal == a && maxVal == d){
                System.out.println("YES");
            }else if(minVal == b && maxVal == c){
                System.out.println("YES");
            }else if(minVal == c && maxVal == b){
                System.out.println("YES");
            }else if(minVal == d && maxVal == a){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

        }

        sc.close();
    }
}
