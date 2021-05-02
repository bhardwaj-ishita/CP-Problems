package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class ChefAndDice {

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
		for(int i = 0; i < t; i++) {
			long n = fs.nextLong();
			long ans = -1;
			int r = (int) (n % 4);
			
			if(n < 4) {
				if(n == 1)
					System.out.println(20);
				else if(n == 2)
					System.out.println(36);
				else if (n == 3)
					System.out.println(51);				
			}
			else {
				if(r == 0) {
					ans = 60 + (n-4)*11;
				}
				else if(r == 1) {
					if(n >= 5)
						ans = (4 - r)*15 + r*20 + r*11 + (n-5)*11;
					else
						ans = (4 - r)*15 + r*20 + r*11;
				}
				else if(r == 2) {
					if(n >= 6)
						ans = (4 - r)*15 + r*18 + r*11 + (n-6)*11;
					else
						ans = (4 - r)*15 + r*18 + r*11;
				}
				else if(r == 3) {
					if(n >= 7)
						ans = (4 - r)*15 + r*17 + r*11 + (n-7)*11;
					else
						ans = (4 - r)*15 + r*17 + r*11 ;
				}
				System.out.println(ans);
				//ans = (2nd layer from top that don't have any dice above it)*15 + (1st layer on the top)*pips + (2nd layer from top that have dice above it)*11 + (rest layers of 4)*11;    
			}
			
		}
	}
}
