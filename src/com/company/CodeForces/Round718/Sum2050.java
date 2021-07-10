package com.company.CodeForces.Round718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sum2050 {
	
	static class FastReader {
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
    }

    public static void main(String[] args) {
        FastReader fs = new FastReader();
        int t = fs.nextInt();
        while (t-- > 0) {
            long n = fs.nextLong();

            System.out.println(sum2050(n));
        }
    }

    public static int sum2050(long n) {
        if(n < 2050) return -1;
        int count = 0;
        int i;
        for (i = 14; i >= 0; ) {
            long power = 2050 * (long) Math.pow(10, i);
            if (n - power < 0) i--;
            else {
                n = n - power;
                count++;
            }
        }
        if(n < 2050 && n > 0 ) return -1;
        return count;
    }
}

