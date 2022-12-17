package contest140eduDiv2;

import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            System.out.println();
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            // System.out.println();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            // System.out.println();
            int x3 = sc.nextInt();
            int y3 = sc.nextInt();

            int count = 0;
            if(x1 == x2){
                count++;
            }
            if(x2 == x3){
                count++;
            }
            if(x3 == x1){
                count++;
            }
            if(y1 == y2){
                count++;
            }
            if(y2 == y3){
                count++;
            }
            if(y3 == y1){
                count++;
            }

            if(count < 2){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            sc.close();
        }
    }
}
