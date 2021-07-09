package com.company.CodeForces.Round717;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * lexicographically small:
 * trying to have ascending order.
 * starting elements as small as possible
 */
public class TitForTat {

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
    }

    public static void main(String[] args) {
        FastReader fs = new FastReader();
        int t = fs.nextInt();
        while (t-- > 0) {
            int n = fs.nextInt();
            int k = fs.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++) {
                a[i] = fs.nextInt();
            }

            int j = 0;
            while(k>0 && j < n) {
                if(a[j] != 0) {
                    a[j] -= 1;
                    a[n-1] += 1;
                    k--;
                }
                else j++;

            }

            for(int x: a) System.out.print(x + " ");
            System.out.println();
        }
    }
}
