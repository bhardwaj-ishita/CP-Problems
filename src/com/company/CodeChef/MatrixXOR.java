package com.company.CodeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MatrixXOR {
	
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
	
	//So here the question is not about the logic but the time limit
	//for 10^7 operations it takes almost 1 sec and we need to solve almost 10^12 operations
	//hence we need to find a logic on how to solve min to min operations to solve the problem

	public static void main(String[] args) {
		FastReader fs = new FastReader();
		int t = fs.nextInt();
		while(t-- > 0) {
			int n = fs.nextInt();
			int m = fs.nextInt();
			int k = fs.nextInt();
			
			int xor = 0;
			if(n%2 == 0) {
				for(int i = 1; i <= n; i++) {
					if(i%2 != 0) {
						xor = xor ^ (i + 1 + k);
					}
					else if(i%2 == 0) {
						xor = xor ^ (i + m + k);
					}
				}
			}
			else if(n%2 != 0) {
				for(int i = 1; i <= n - 1; i++) {
					if(i%2 != 0) {
						xor = xor ^ (i + 1 + k);
					}
					else if(i%2 == 0) {
						xor = xor ^ (i + m + k);
					}
					
				}
				
				for(int j = 1; j <= m; j++) {
					xor = xor ^ (n + j + k);
				}
			}
			
			System.out.println(xor);
			
		}

	}

}
