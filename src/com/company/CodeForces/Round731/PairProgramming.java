package com.company.CodeForces.Round731;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class PairProgramming {
    public static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while(st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch(IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        float nextFloat() {
            return Float.parseFloat(next());
        }

        String nextLine()
        {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) {
        FastReader fs = new FastReader();
        int t = fs.nextInt();
        while (t-- > 0) {
            String space = fs.nextLine();
            int k = fs.nextInt();
            int n = fs.nextInt();
            int m = fs.nextInt();
            int[] a = new int[n];
            int[] b = new int[m];
            for(int i = 0; i < n; i++) {
                a[i] = fs.nextInt();
            }
            for(int i = 0; i < m; i++) {
                b[i] = fs.nextInt();
            }
            int[] ans = new int[n + m];
            if(ans(k,n,m,a,b,ans) == -1) System.out.println(-1);
            else {
                for(int i: ans) System.out.print(i + " ");
                System.out.println();
            }
        }
    }

    public static int ans(int k, int n, int m, int[] a, int[] b, int[] ans) {
        List<Integer> list = new ArrayList<>();
        int i,j;
        for(i = 0,j=0; i < n || j<m;) {
            if(i<n && a[i] == 0) {
                list.add(a[i]);
                //System.out.println("list: " + list);
                k += 1;
                i++;
            }
            else if(j < m && b[j] == 0) {
                list.add(b[j]);
                //System.out.println("list: " + list);
                k += 1;
                j++;
            }
            else if(i<n && a[i] > 0 && a[i] <= k) {
                list.add(a[i]);
                //System.out.println("list: " + list);
                i++;
            }
            else if(j<m && b[j] > 0 && b[j] <= k) {
                list.add(b[j]);
                //System.out.println("list: " + list);
                j++;
            }
            else if((i>=n && b[j] > k )||  (j >= m && a[i] > k ) || (i < n && j < m && b[j] > k && a[i] > k)) {
                return -1;
            }
            //System.out.println("K: " + k);
        }
        for(int x = 0; x < list.size(); x++) {
            ans[x] = list.get(x);
        }
        return 0;
    }
}

/*
5

3 2 2
2 0
0 5

4 3 2
2 0 5
0 6

0 2 2
1 0
2 3

5 4 4
6 0 8 0
0 7 0 9

5 4 1
8 7 8 0
0

2 0 0 5
0 2 0 6 5
-1
0 6 0 7 0 8 0 9
-1
 */
