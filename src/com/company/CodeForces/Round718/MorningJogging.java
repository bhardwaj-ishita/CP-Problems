package com.company.CodeForces.Round718;//DIV1+DIV2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class MorningJogging {
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
            int n = fs.nextInt();
            int m = fs.nextInt();
            long[][] b = new long[n][m];
            List<Integer> arrays = new ArrayList<>();
            int index = 0;
            long min = Long.MAX_VALUE;
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) {
                    b[i][j] = fs.nextLong();
                    min = Math.min(min,b[i][j]);
                    if(min==b[i][j]) index = j;

                }
                arrays.add(index);
            }

            int z = 0;
            for(int i = 0; i < n && z < m; i++) {
                swap(arrays.get(i),0+z,b, i);
                z++;
            }

            for(long[] x: b){
                for(long y: x) {
                    System.out.print(y + " ");
                }
                System.out.println();
            }
        }
    }

    public static void swap(int a,int b, long[][] c, int i) {
        long temp = c[i][a];
        c[i][a] = c[i][b];
        c[i][b] = temp;
    }
}
