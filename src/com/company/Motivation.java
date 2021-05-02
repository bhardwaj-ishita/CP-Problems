package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Motivation {

	static class Fastreader {
        BufferedReader br;
        StringTokenizer st;

        public Fastreader() {
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

    }

    public static void main(String[] args) throws java.lang.Exception {

        Fastreader fs = new Fastreader();
        int t = fs.nextInt();
        for(int i = 0; i < t; i++) {
            int n = fs.nextInt();
            int x = fs.nextInt();
            int ans = Integer.MIN_VALUE;
            for(int j = 0; j < n; j++) {
                int s = fs.nextInt();
                int r = fs.nextInt();
                
                if(s <= x) {
                	ans = Math.max(ans,r);
                }
            }
            System.out.println(ans);
        }

    }
}
