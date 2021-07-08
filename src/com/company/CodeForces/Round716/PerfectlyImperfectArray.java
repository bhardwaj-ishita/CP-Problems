package com.company.CodeForces.Round716;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * a2∗b2∗...=(a∗b∗...)2
 */
public class PerfectlyImperfectArray {
	
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
		while(t-- > 0) {
			int n = fs.nextInt();
			int[] a = new int[n];
			for(int x = 0; x < n; x++) {
				a[x] = fs.nextInt();
			}

            System.out.println(ans(n,a));
		}
	}

    public static String ans(int n, int[] a) {
        for(int i = 0; i < n; i++) {
            int check = (int)Math.sqrt(a[i]);
            if(check*check!=a[i]) return "YES";
        }
        return "NO";
    }
}
