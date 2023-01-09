import java.util.*;

public class a {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            String str = sc.next();

            boolean flag = false;

            String res = "";
            for(int i = 0; i < n; ++i){
                char ch = str.charAt(i);

                if(ch == '0'){
                    res = res + "+";
                }
                if(ch == '1' && flag == false){
                    flag = true;
                    res = res + "+";
                }else if(ch == '1' && flag == true){
                    flag = false;
                    res = res + "-";
                }
            }

            res = res.substring(1, res.length());
            System.out.println(res);
        }

        sc.close();
    }
}
