package com.company.CodeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StrongLanguage {
	
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
		for(int i = 0; i < t; i++) {
			int n = fs.nextInt();
			int k = fs.nextInt();
			String s = fs.nextLine();
			
			char[] c = s.toCharArray();
			int x;
			int count = 0;
			for(int j = 0; j < n; j++) {
				x = j;
				if(c[j] == '*') {
					while (x < n && c[x] == '*') {
						count++;
						x++;
					}
				}
				if(count >= k) {
					System.out.println("Yes");
					break;
				}
				else if (count < k){
					count = 0;
					j = x;
				}
				
			}
			
			if(count < k) {
				System.out.println("No");
			}
			
		}
	}
}
