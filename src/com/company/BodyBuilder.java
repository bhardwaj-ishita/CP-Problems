package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BodyBuilder {

	static class FastReader {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader()
        {
            br = new BufferedReader(
                new InputStreamReader(System.in));
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt() { return Integer.parseInt(next()); }
 
        long nextLong() { return Long.parseLong(next()); }
        
        float nextFloat() { return Float.parseFloat(next()); }
 
        double nextDouble() { return Double.parseDouble(next()); }
 
        String nextLine()
        {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

	public static void main(String[] args) {
		FastReader fs = new FastReader();
		int t = fs.nextInt();
		while(t-- > 0) {
			int n = fs.nextInt();
			int r = fs.nextInt();
			long[] a = new long[n];
			for(int i = 0; i < n; i++) {
				a[i] = fs.nextLong();
			}
			int[] b = new int[n];
			for(int j = 0; j < n; j++) {
				b[j] = fs.nextInt();
			}
			
			
			long max = 0;
			long x = 0;
			for(int z = 0; z < n - 1; z++) {
				x = x + b[z];
				max = Math.max(x,max);
				long diff = a[z + 1] - a[z];
				x = x - (diff*r);
				if(x < 0) x = 0;
			}
			
			x = x + b[n - 1];
			max = Math.max(x, max);
			
			System.out.println(max);
			
		}

	}

}

//3
//1 2
//10
//10
//2 2
//10 11
//10 10
//3 1
//1 2 3
//1 2 3