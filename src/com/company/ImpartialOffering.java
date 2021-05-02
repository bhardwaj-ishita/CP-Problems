package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ImpartialOffering {
	
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
		for(int x = 1; x <= t; x++) {
			int n = fs.nextInt();
			int[] s = new int[n];
			for(int z = 0; z < n; z++) {
				s[z] = fs.nextInt();
			}
			
			Arrays.sort(s);
			
			ArrayList<Integer> cs = new ArrayList<Integer>();
			int count = 1;
			for(int p = 1; p < n; p++) {
				if(s[p] == s[p-1]) {
					count++;
				}
				else if(s[p] > s[p-1]) {
					cs.add(count);
					count = 1;
					
				}
			}
			cs.add(count);
			
			int sum = 0;
			for(int i = 0; i < cs.size(); i++) {
				sum = sum + ((i+1)*cs.get(i));
			}
			
			System.out.println("Case #" + x + ": " + sum);
		}

	}

}


/*
3
4
10 20 10 25
5
7 7 7 7 7
2
100 1

 */
