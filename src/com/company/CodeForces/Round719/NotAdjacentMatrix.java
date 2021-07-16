package com.company.CodeForces.Round719;

import com.company.Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NotAdjacentMatrix {
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
    }

    public static void main(String[] args) {
        FastReader fs = new FastReader();
        int t = fs.nextInt();
        while (t-- > 0) {
            int n = fs.nextInt();

            if(n == 1) System.out.println(1);
            else if(n==2) System.out.println(-1);
            else {
                int[][] ans = new int[n][n];
                answer(n, ans);
                for(int[] i : ans) {
                    for(int j: i) {
                        System.out.print(j + " ");
                    }
                    System.out.println();
                }
            }
        }
    }

    public static void answer(int n, int[][] ans) {
        int num = 1;
        for(int i = 0; i < n;i++) {
            for(int j = 0; j < n;j++) {
                if((i+j)%2==0) {
                    ans[i][j] = num;
                    num++;
                }
            }
        }
        for(int i = 0; i < n;i++) {
            for(int j = 0; j < n;j++) {
                if((i+j)%2!=0) {
                    ans[i][j] = num;
                    num++;
                }
            }
        }
    }
}
