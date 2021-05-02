package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ChocolateMonger {
	
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
			int x = fs.nextInt();
			long[] a = new long[n];
			for(int i = 0; i < n; i++) {
				a[i] = fs.nextLong();
			}
			
			Arrays.sort(a);
			
			int count = 1;
			ArrayList<Integer> ans = new ArrayList<Integer>();
			for(int j = 0; j < n - 1; j++) {
				if(a[j] == a[j+1]) {
					count++;
				}
				else if(a[j] != a[j+1]) {
					ans.add(count);
					count = 1;
				}
			}
			ans.add(count);
			
			
			int total = 0;
			for(int p = 0; p < ans.size(); p++) {
				total = total + ans.get(p);
			}
			
			int left = total - ans.size();
			
			if(left >= x) {
				System.out.println(ans.size());
			}
			else if(left < x) {
				int want = x - left;
				int answer = ans.size() - want;
				System.out.println(answer);
			}
			
		}

	}

}

//3
//2 1
//1 2
//4 2
//1 1 1 1
//5 3
//50 50 50 100 100