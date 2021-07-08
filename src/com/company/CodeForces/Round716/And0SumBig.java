package com.company.CodeForces.Round716;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * k == the number of bits
 * 2^k - 1 == the max numbers with bits k that can be used in the array
 * n == the size of the array i.e. the number of elements
 *
 * we need to show these things:-
 * 1) the sum of the numbers of the array should be the greatest
 *     (n-1)*(2^k - 1)  because the nth number would be 00000 to turn off all the bits
 *
 * 2) the AND of all the elements is ZERO: to make everything ZERO, we need to make every bit ZERO
 *      and to do that we need to turn off(or turn the bit into zero) by having a zero at every digit.
 *
 *      n | 0 0 0 0 0 0 0 0  |
 *      n | k k k k k k k k  |
 *      n | k k k k k k k k  |
 *      n | k k k k k k k k  V
 *
 *      we can change the position of the zeroes n times. And there are k zeroes. Hence n*n*n*n...k times
 *      this will give you the max number of arrays with max sum
 */
public class And0SumBig {

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
        while(t-->0) {
            int n = fs.nextInt();
            int k = fs.nextInt();

            int mod = (int) (1e9+7);
            long ans = 1;
            for(int i = 0; i < k; i++) {
                ans = (ans*n)%mod;
            }
            System.out.println(ans);
        }
    }
}
