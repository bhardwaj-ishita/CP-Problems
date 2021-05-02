package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class PerfectlyImperfectArray {
	
	static class Fastreader {
        BufferedReader br;
        StringTokenizer st;

        public Fastreader() {
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

        double nextDouble() {
            return Double.parseDouble(next());
        }
        
        float nextFloat() {
            return Float.parseFloat(next());
        }

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
		Fastreader fs = new Fastreader();
		int t = fs.nextInt();
		while(t-- > 0) {
			int n = fs.nextInt();
			int[] a = new int[n];
			for(int x = 0; x < n; x++) {
				a[x] = fs.nextInt();
			}
			
			//get non empty subsequences
			// number of subsequences
			
			int opsize = (int)Math.pow(2, n);
			
			int count = 0;
			for (int y = 1; y < opsize; y++) {
				int product = 1;
	            for (int j = 0; j < n; j++) {
	                if (BigInteger.valueOf(y).testBit(j))
	                	product = product*a[j];
	            }
	            
	            System.out.println(product);
	            float root = (float) Math.sqrt(product);
	            System.out.println(root);
	            if(root%1 != 0.00) {System.out.println("break"); break;}
	            else if(root%1 == 0.00) {count++; System.out.println("up");}
	        }
			
			if(count < (opsize - 1)) {
				System.out.println("YES");
			}
			else if(count == (opsize - 1)) {
				System.out.println("NO");
				
			}  
		}
	}
}
gg
//2
//3
//1 5 4 YES
//2
//100 10000 NO

