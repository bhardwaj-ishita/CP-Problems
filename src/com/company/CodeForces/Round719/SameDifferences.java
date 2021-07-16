package com.company.CodeForces.Round719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;


/**
 * a[j] - a[i] = j - i
 * can be also written as (a[j] - j = a[i] - i)
 * we need to find such pairs
 */
public class SameDifferences {

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
            HashMap<Long,Integer> map = new HashMap<>();
            for(int i = 0; i < n; i++) {
                a[i] = fs.nextLong();
                map.put(a[i]-i, map.getOrDefault(a[i]-i,0)+1);
            }

            long ans = 0;
            for(long i: map.keySet()) {
                long count = map.get(i);
                if(count>1) ans += summation(count-1);
            }
            System.out.println(ans);
        }
    }

    public static long summation(long count) {
        if(count == 0) return 0;
        return count + summation(count-1);
    }
}
