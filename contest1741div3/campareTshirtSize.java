<<<<<<< HEAD
package contest1741div3;

import java.util.*;
import java.io.*;
 
public class campareTshirtSize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
        while(t-- > 0){
            
            String size1 = sc.next();
            String size2 = sc.next();
 
            char ch1 = size1.charAt(size1.length()-1);
            char ch2 = size2.charAt(size2.length()-1); 
            if(ch1 == ch2){
                if(ch1 ==  'L'){
                    if(size1.length() > size2.length()){
                        System.out.println(">");
                        continue;
                    }else if(size1.length() < size2.length()){
                        System.out.println("<");
                        continue;
                    }else{
                        System.out.println("=");
                        continue;
                    }
                }if(ch1 == 'S'){
                    if(size1.length() > size2.length()){
                        System.out.println("<");
                        continue;
                    }else if(size1.length() < size2.length()){
                        System.out.println(">");
                        continue;
                    }else{
                        System.out.println("=");
                        continue;
                    }
                }if(ch1 == 'M'){
                    System.out.println("=");
                        continue;
                }
            }
 
            if(ch1 == 'L'){
                System.out.println(">");
                continue;
            }
            if(ch2 == 'L'){
                System.out.println("<");
                continue;
            }
            if(ch1 == 'M'){
                System.out.println(">");
                continue;
            }
            if(ch2 == 'M'){
                System.out.println("<");
                continue;
            }
        }
 
        sc.close();
    }
}
=======
package contest1741div3;

import java.util.*;
import java.io.*;
 
public class campareTshirtSize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
        while(t-- > 0){
            
            String size1 = sc.next();
            String size2 = sc.next();
 
            char ch1 = size1.charAt(size1.length()-1);
            char ch2 = size2.charAt(size2.length()-1); 
            if(ch1 == ch2){
                if(ch1 ==  'L'){
                    if(size1.length() > size2.length()){
                        System.out.println(">");
                        continue;
                    }else if(size1.length() < size2.length()){
                        System.out.println("<");
                        continue;
                    }else{
                        System.out.println("=");
                        continue;
                    }
                }if(ch1 == 'S'){
                    if(size1.length() > size2.length()){
                        System.out.println("<");
                        continue;
                    }else if(size1.length() < size2.length()){
                        System.out.println(">");
                        continue;
                    }else{
                        System.out.println("=");
                        continue;
                    }
                }if(ch1 == 'M'){
                    System.out.println("=");
                        continue;
                }
            }
 
            if(ch1 == 'L'){
                System.out.println(">");
                continue;
            }
            if(ch2 == 'L'){
                System.out.println("<");
                continue;
            }
            if(ch1 == 'M'){
                System.out.println(">");
                continue;
            }
            if(ch2 == 'M'){
                System.out.println("<");
                continue;
            }
        }
 
        sc.close();
    }
}
>>>>>>> 669e88164cebb7c329155a7d613749a30cd4ac29
