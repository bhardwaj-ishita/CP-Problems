package com.company.CodeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GuessNumber {

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
		while (t-- > 0) {
			for(int i = 1; i <= 1000000; i++) {
				int guess = i*i;
				System.out.println(guess);
				int sys = fs.nextInt();
				if(sys == 1)
					break;
				else if(sys == 0)
					continue;
				else if(sys == -1) {
					System.out.println("Wrong Answer");
					break;
				}
			}
		}
	}
}
