package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NobelPrize {
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

    public static void main(String[] args) {
        Fastreader fs = new Fastreader();
        int t = fs.nextInt();
        for(int i = 0; i < t; i++) {
            int n = fs.nextInt();
            int m = fs.nextInt();
            int[] a = new int[n];
            for(int j = 0; j < n; j++) {
                a[j] = fs.nextInt();
            }

            Arrays.sort(a);
            int count = 1;
            for(int x = 0; x < n - 1; x++) {
                if(a[x] + 1 == a[x + 1]) {
                    count++;
                }
            }

            if(count == m)
                System.out.println("No");
            else if(count < m)
                System.out.println("Yes");
        }
    }
}
