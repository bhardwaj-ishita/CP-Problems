package com.company.CodeForces.Round717;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * if XOR of the array is ZERO, then it means there will definately 2 elements left who are same as x^x = 0
 * if not zero, then we'll try to see if we can make the finalXOR term appear more than 2 times in the array.
 *      if the finalXOR == 5 and we see that there are at least three 5s (5 5 5) then we can make it
 *      WE JUST NEED AT LEAST 2 ELEMENTS IN THE ARRAY LEFT AND THOSE SHOULD BE EQUAL
 */
public class AGAGA_XOOORRR {

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
