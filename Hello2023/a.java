package CodeForces.Hello2023;

import java.util.Scanner;

// import javax.swing.text.StyledEditorKit.BoldAction;

public class a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            String str = sc.next();

            int countL = 0;
            // int countR = 0;
            for(int i = 0; i < n; ++i){
                if(str.charAt(i) == 'L'){
                    countL++;
                }
            }

            if(countL == 0 || countL == n){
                System.out.println("-1");
                continue;
            }

            for(int i = 0; i < n-1; ++i){
                if(str.charAt(i) == 'L' && str.charAt(i+1) == 'R'){
                    System.out.println(i+1);
                    break;
                }
                if(str.charAt(i) == 'R' && str.charAt(i+1) == 'L'){
                    System.out.println("0");
                    break;
                }
            }
        }

        sc.close();
    }
}
