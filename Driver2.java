package CodeForces;

import java.io.*;
import java.util.*;
import static java.lang.Math.*;
import static java.util.Map.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.System.*;
public class Driver2
{
    public void tq() throws Exception
    {
        sb=new StringBuilder(2000000);
        st=new StringTokenizer(bq.readLine());
        int tq=1;
        o:
        while(tq-->0)
        {
            





        }
        p(sb);
    }
    long mod=1000000007l;
    int max=Integer.MAX_VALUE,min=Integer.MIN_VALUE;long maxl=Long.MAX_VALUE,minl=Long.MIN_VALUE;
    BufferedReader bq = new BufferedReader(new InputStreamReader(in));StringTokenizer st;StringBuilder sb;
    public static void main(String[] a)throws Exception{new Driver2().tq();}
    int di[][]={{-1,0},{1,0},{0,-1},{0,1}};
    int de[][]={{-1,0},{1,0},{0,-1},{0,1},{-1,-1},{1,1},{-1,1},{1,-1}};
    void f1(int ar[],int v){fill(ar,v);}
    void f2(int ar[][],int v){for(int a[]:ar)fill(a,v);}
    void f3(int ar[][][],int v){for(int a[][]:ar)for(int b[]:a)fill(b,v);}
    void f1(long ar[],long v){fill(ar,v);}
    void f2(long ar[][],long v){for(long a[]:ar)fill(a,v);}
    void f3(long ar[][][],long v){for(long a[][]:ar)for(long b[]:a)fill(b,v);}
    void f(){out.flush();}
    int p(int i,int p[]){return p[i]<0?i:(p[i]=p(p[i],p));}
    boolean c(int x,int y,int n,int m){return x>=0&&x<n&&y>=0&&y<m;}
    int[] so(int ar[])
    {
        Integer r[] = new Integer[ar.length];
        for (int x = 0; x < ar.length; x++) r[x] = ar[x];
        sort(r);
        for (int x = 0; x < ar.length; x++) ar[x] = r[x];
        return ar;
    }
    long[] so(long ar[])
    {
        Long r[] = new Long[ar.length];
        for (int x = 0; x < ar.length; x++) r[x] = ar[x];
        sort(r);
        for (int x = 0; x < ar.length; x++) ar[x] = r[x];
        return ar;
    }
    char[] so(char ar[])
    {
        Character r[] = new Character[ar.length];
        for (int x = 0; x < ar.length; x++) r[x] = ar[x];
        sort(r);
        for (int x = 0; x < ar.length; x++) ar[x] = r[x];
        return ar;
    }
    void p(Object p) {out.print(p);}void pl(Object p) {out.println(p);}void pl() {out.println();}
    void s(String s) {sb.append(s);}
    void s(int s) {sb.append(s);}
    void s(long s) {sb.append(s);}
    void s(char s) {sb.append(s);}
    void s(double s) {sb.append(s);}
    void ss() {sb.append(' ');}
    void sl(String s) {s(s);sb.append("\n");}
    void sl(int s) {s(s);sb.append("\n");}
    void sl(long s) {s(s);sb.append("\n");}
    void sl(char s) {s(s);sb.append("\n");}
    void sl(double s) {s(s);sb.append("\n");}
    void sl() {sb.append("\n");}
    int l(int v) {return 31 - Integer.numberOfLeadingZeros(v);}
    long l(long v) {return 63 - Long.numberOfLeadingZeros(v);}
    int sq(int a)
    {
        int i=1;
        int j=44721;
        int b=0;
        while(i<=j)
        {
            int m=(i+j)/2;
            int mm=m*m;
            if(mm<=a)
            {
                b=m;
                i=m+1;
            }
            else j=m-1;
        }
        return b;
    }
    int sq(long a)
    {
        long i=1l;
        long j=1000000000l;
        int b=0;
        while(i<=j)
        {
            long m=(i+j)/2;
            long mm=m*m;
            if(mm<=a)
            {
                b=(int)m;
                i=m+1;
            }
            else j=m-1;
        }
        return b;
    }
    int gcd(int a, int b)
    {
        while (b > 0)
        {
            int c = a % b;
            a = b;
            b = c;
        }
        return a;
    }
    long gcd(long a, long b)
    {
        while (b > 0l)
        {
            long c = a % b;
            a = b;
            b = c;
        }
        return a;
    }
    boolean p(String s, int i, int j)
    {
        while (i < j) if (s.charAt(i++) != s.charAt(j--)) return false;
        return true;
    }
    boolean[] si(int n)
    {
        boolean bo[] = new boolean[n + 1];
        bo[0] = bo[1] = true;
        for (int x = 4; x <= n; x += 2) bo[x] = true;
        for (int x = 3; x * x <= n; x += 2)
        {
            if (!bo[x])
            {
                int vv = (x << 1);
                for (int y = x * x; y <= n; y += vv) bo[y] = true;
            }
        }
        return bo;
    }
    long mul(long a, long b, long m)
    {
        long r = 1l;
        a %= m;
        while (b > 0)
        {
            if ((b & 1) == 1) r = (r * a) % m;
            b >>= 1;
            a = (a * a) % m;
        }
        return r;
    }
    int i() throws IOException
    {
        if (!st.hasMoreTokens()) st = new StringTokenizer(bq.readLine());
        return Integer.parseInt(st.nextToken());
    }
    long l() throws IOException
    {
        if (!st.hasMoreTokens()) st = new StringTokenizer(bq.readLine());
        return Long.parseLong(st.nextToken());
    }
    String s() throws IOException
    {
        if (!st.hasMoreTokens()) st = new StringTokenizer(bq.readLine());
        return st.nextToken();
    }
    double d() throws IOException
    {
        if (!st.hasMoreTokens()) st = new StringTokenizer(bq.readLine());
        return Double.parseDouble(st.nextToken());
    }
    void s(int a[])
    {
        for (int e : a){sb.append(e);sb.append(' ');}
        sb.append("\n");
    }
    void s(long a[])
    {
        for (long e : a){sb.append(e);sb.append(' ');}
        sb.append("\n");
    }
    void s(char a[])
    {
        for (char e : a){sb.append(e);sb.append(' ');}
        sb.append("\n");
    }
    void s(int ar[][]) {for (int a[] : ar) s(a);}
    void s(long ar[][]) {for (long a[] : ar) s(a);}
    void s(char ar[][]) {for (char a[] : ar) s(a);}
    int[] ari(int n) throws IOException
    {
        int ar[] = new int[n];
        if (!st.hasMoreTokens()) st = new StringTokenizer(bq.readLine());
        for (int x = 0; x < n; x++) ar[x] = Integer.parseInt(st.nextToken());
        return ar;
    }
    long[] arl(int n) throws IOException
    {
        long ar[] = new long[n];
        if (!st.hasMoreTokens()) st = new StringTokenizer(bq.readLine());
        for (int x = 0; x < n; x++) ar[x] = Long.parseLong(st.nextToken());
        return ar;
    }
    char[] arc(int n) throws IOException
    {
        char ar[] = new char[n];
        if (!st.hasMoreTokens()) st = new StringTokenizer(bq.readLine());
        for (int x = 0; x < n; x++) ar[x] = st.nextToken().charAt(0);
        return ar;
    }
    double[] ard(int n) throws IOException
    {
        double ar[] = new double[n];
        if (!st.hasMoreTokens()) st = new StringTokenizer(bq.readLine());
        for (int x = 0; x < n; x++) ar[x] = Double.parseDouble(st.nextToken());
        return ar;
    }
    String[] ars(int n) throws IOException
    {
        String ar[] = new String[n];
        if (!st.hasMoreTokens()) st = new StringTokenizer(bq.readLine());
        for (int x = 0; x < n; x++) ar[x] = st.nextToken();
        return ar;
    }
    int[][] ari(int n, int m) throws IOException
    {
        int ar[][] = new int[n][m];
        for (int x = 0; x < n; x++)ar[x]=ari(m);
        return ar;
    }
    long[][] arl(int n, int m) throws IOException
    {
        long ar[][] = new long[n][m];
        for (int x = 0; x < n; x++)ar[x]=arl(m);
        return ar;
    }
    char[][] arc(int n, int m) throws IOException
    {
        char ar[][] = new char[n][m];
        for (int x = 0; x < n; x++)ar[x]=arc(m);
        return ar;
    }
    double[][] ard(int n, int m) throws IOException
    {
        double ar[][] = new double[n][m];
        for (int x = 0; x < n; x++)ar[x]=ard(m);
        return ar;
    }
    void p(int ar[])
    {
        sb = new StringBuilder(11 * ar.length);
        for (int a : ar) {sb.append(a);sb.append(' ');}
        out.println(sb);
    }
    void p(long ar[])
    {
        StringBuilder sb = new StringBuilder(20 * ar.length);
        for (long a : ar){sb.append(a);sb.append(' ');}
        out.println(sb);
    }
    void p(double ar[])
    {
        StringBuilder sb = new StringBuilder(22 * ar.length);
        for (double a : ar){sb.append(a);sb.append(' ');}
        out.println(sb);
    }
    void p(char ar[])
    {
        StringBuilder sb = new StringBuilder(2 * ar.length);
        for (char aa : ar){sb.append(aa);sb.append(' ');}
        out.println(sb);
    }
    void p(String ar[])
    {
        int c = 0;
        for (String s : ar) c += s.length() + 1;
        StringBuilder sb = new StringBuilder(c);
        for (String a : ar){sb.append(a);sb.append(' ');}
        out.println(sb);
    }
    void p(int ar[][])
    {
        StringBuilder sb = new StringBuilder(11 * ar.length * ar[0].length);
        for (int a[] : ar)
        {
            for (int aa : a){sb.append(aa);sb.append(' ');}
            sb.append("\n");
        }
        p(sb);
    }
    void p(long ar[][])
    {
        StringBuilder sb = new StringBuilder(20 * ar.length * ar[0].length);
        for (long a[] : ar)
        {
            for (long aa : a){sb.append(aa);sb.append(' ');}
            sb.append("\n");
        }
        p(sb);
    }
    void p(double ar[][])
    {
        StringBuilder sb = new StringBuilder(22 * ar.length * ar[0].length);
        for (double a[] : ar)
        {
            for (double aa : a){sb.append(aa);sb.append(' ');}
            sb.append("\n");
        }
        p(sb);
    }
    void p(char ar[][])
    {
        StringBuilder sb = new StringBuilder(2 * ar.length * ar[0].length);
        for (char a[] : ar)
        {
            for (char aa : a){sb.append(aa);sb.append(' ');}
            sb.append("\n");
        }
        p(sb);
    }
    void pl(Object... ar) {for (Object e : ar) p(e + " ");pl();}
}
