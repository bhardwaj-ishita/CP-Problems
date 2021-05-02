package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class InconstantOrdering {
	
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
			int[] l = new int[n];
			for(int z = 0; z < n; z++) {
				l[z] = fs.nextInt();
			}
			
			int size = 1;
			for(int y = 0; y < n; y++) {
				size = size + l[y];
			}
			
			System.out.println(size);
			
			char[] str = new char[size];
			str[0] = 'A';
			char ascii = 65;
			for(int i = 1, j=0; i < size && j < n-1;j++) {
				if(l[j] < l[j+1] && j%2 == 0) {
					int store = l[j];
					for(int m = l[j]; m >1;m--) {
						//odd increasing
						ascii+=1;
						str[i] = ascii;
						i++;
					}
					ascii+=((l[j+1]-store) + 1);
					System.out.println(ascii);
					str[i] = ascii;
					System.out.println("inc");
				}
				else if(l[j] >= l[j+1] && j%2 != 0) {
					for(int r = l[j]; r >0;r--) {
						//even decreasing
						ascii-=1;
						str[i] = ascii;
						i++;
					}
					System.out.println("dec");
				}
				else if(j%2 == 0) {
					for(int m = l[j]; m >0;m--) {
						//odd increasing
						ascii+=1;
						str[i] = ascii;
						i++;
					}
					System.out.println("inc");
				}
			}
			
			
			
			String string = new String(str);
			
			System.out.println("Case #" + x + ": " + string);
		}
	}
}
fb
//char asii = 65;
//for(char i = 0; i < 2; i++) {
//	System.out.println(asii++);
//}


//3
//2
//2 3
//2
//5 1
//1
//2

