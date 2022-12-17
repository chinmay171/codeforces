<<<<<<< HEAD
import java.util.*;
import java.io.*;

public class A_soft_drinking {
        public static void main(String[] args) throws IOException {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int k = sc.nextInt();
            int l = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int p = sc.nextInt();

            int nc = sc.nextInt();
            int np = sc.nextInt();

            int maxShot = (k * l) / nc;
            int maxLime = (c * d);
            int maxSalt = (p / np);

            int shortage = Math.min(maxShot, Math.min(maxLime, maxSalt));

            int ans = shortage / n;

            if(ans < 1){
                System.out.println(0);
            }else{
                System.out.println(ans);
            }
            sc.close();
        }
}
=======
import java.util.*;
import java.io.*;

public class A_soft_drinking {
        public static void main(String[] args) throws IOException {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int k = sc.nextInt();
            int l = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int p = sc.nextInt();

            int nc = sc.nextInt();
            int np = sc.nextInt();

            int maxShot = (k * l) / nc;
            int maxLime = (c * d);
            int maxSalt = (p / np);

            int shortage = Math.min(maxShot, Math.min(maxLime, maxSalt));

            int ans = shortage / n;

            if(ans < 1){
                System.out.println(0);
            }else{
                System.out.println(ans);
            }
            sc.close();
        }
}
>>>>>>> 669e88164cebb7c329155a7d613749a30cd4ac29
