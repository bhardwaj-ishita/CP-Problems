package com.company.CodeForces.Round719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OrdinaryNumber {
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
    }

    public static void main(String[] args) {
        FastReader fs = new FastReader();
        int t = fs.nextInt();
        while (t-- > 0) {
            long n = fs.nextLong();
            System.out.println(answer(n));
        }
    }

    public static int answer(long n) {
        int count = 0;
        for(int i = 1; i < 10; i++) {
            long num = 0;
            for(int j = 0; j < 9; j++) {
                num = num + i*(long)(Math.pow(10,j));
                if(num > n) break;
                count++;
            }
        }
        return count;
    }
}
