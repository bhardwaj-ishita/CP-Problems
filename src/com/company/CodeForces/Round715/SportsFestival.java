package com.company.CodeForces.Round715;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SportsFestival {

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
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

    public static long[][] dp;

    public static void main(String[] args) {
        FastReader fs = new FastReader();
        int n = fs.nextInt();
        int[] s = new int[n];
        for(int i = 0; i < n; i++) {
            s[i] = fs.nextInt();
        }
        Arrays.sort(s);
        dp = new long[n][n];

        //saved from TLE as we simplified to find the already calculated indexes
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }

        System.out.println(ans(0, n-1 ,s));
    }


    public static long ans(int start, int end, int[] s) {
        if(start == end) return 0;
        if(dp[start][end] != -1) return dp[start][end];

        return dp[start][end] = s[end]-s[start] +  Math.min(ans(start+1,end,s), ans(start,end-1,s));
    }
}
