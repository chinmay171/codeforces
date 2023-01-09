package CodeForces.contest839div3;

import java.util.Scanner;

public class c {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){

            int k = sc.nextInt();
            int n = sc.nextInt();

            int h = 1;
            System.out.print(h + " ");
            for(int i = 1; i < k; ++i){
                if(n-h-i+1 >= k-1){
                    h+= i;
                }else{
                    h++;
                }
                System.out.print(h + " ");
            }
            System.out.println();
        }
    }
    
}
