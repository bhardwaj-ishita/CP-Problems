package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class AverageHeights {
	
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
			
			int store = 0;
			int b = n-1;
			int i = 0;
			for(; i < n && i < b;) {
				if(a[i]%2 == 0) {
					store = a[b];
					a[b] = a[i];
					a[i] = store;
					b--;
				}
				else if(a[i] %2 != 0) {
					i++;
				}
			}
			
			if(i < (n-b)) {
				List<int[]> list = Arrays.asList(a);
				Collections.reverse(list);
				list.toArray();
			}
			
			for(int x: a) System.out.print(x+ " ");
			
			
		}
	}
}

/*
 * 
4
3
1 1 2
3
1 1 1
8
10 9 13 15 3 16 9 13
2
18 9


10 9 13 15 3 16 9 13
13 9 13 15 3 9 16 10 
 * 
 */
