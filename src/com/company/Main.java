package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
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
            int n = fs.nextInt();
            long[] a = new long[n];
            int x = 0;
            for(int i = 0; i < n; i++) {
                a[i] = fs.nextLong();
                x ^= a[i];
            }

            if(x==0) System.out.println("YES");
            else {
                int count = 0;
                int k = 0;
                for(int j = 0; j < n; j++) {
                    k ^= a[j];
                    if(k == x) {
                        count++;
                        k = 0;
                    }
                }
                if(count >= 2) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}

/*
4
8 5
1 2
4 4
3 9

 */
