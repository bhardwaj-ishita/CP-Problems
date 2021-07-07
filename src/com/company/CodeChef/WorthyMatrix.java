package com.company.CodeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class WorthyMatrix {

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
		for(int x = 0; x < t; x++) {
			int n = fs.nextInt();
			int m = fs.nextInt();
			int k = fs.nextInt();
			int[][] a = new int[n][m]; 
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < m; j++) {
					a[i][j] = fs.nextInt();
				}
			}
			
			int[] I = new int[m];
			for(int i = 0; i < m; i++) {
				int j = 0;
				for(; j < n; j++) {
					if(a[j][i] >= k) {
						I[i] = j;
						break;
					}
				}
				if(j == n) I[i] = n;
			}
			
			int ans = 0;
			int fin = 0;
			for(int z = m - 1; z >= 0; z--) {
				for(int y = 0; y < n; y++) {
					ans = n - I[z] - y;
					if(ans < 0) {
						fin = fin + 0;
					} 
					else if(ans >= 0){
						fin = fin + ans;
					}
				}
			}
			
			for(int r = 0; r < m; r++) {
				int p = I[r];
				int avg = (a[p][r] + a[p-1][r] + a[p][r + 1] + a[p - 1][r + 1])/4;
				if(avg < k) {
					fin--;
				}
			}
			
			System.out.println(fin);
			
		}
	}
}
//f