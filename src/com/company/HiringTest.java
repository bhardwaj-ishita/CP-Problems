package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HiringTest {

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
        	int n  = fs.nextInt();
        	int m  = fs.nextInt();
        	int x  = fs.nextInt();
        	int y  = fs.nextInt();
        	String[] s = new String[n];
        	for(int i = 0; i < n; i++) {
        		s[i] = fs.nextLine();
        	}
        	
    		for(int q = 0; q < n; q++) {
    			int countF = 0;
            	int countP = 0;
            	char[] c = s[q].toCharArray();
    			for(int r = 0; r < m; r++) {
        			if(c[r] == 'F')
        				countF++;
        			else if(c[r] == 'P')
        				countP++;
        		}
    			
        		
        		if(countF >= x)
        			System.out.print(1);
        		else if(countF == (x-1) && countP >= y)
        			System.out.print(1);
        		else 
        			System.out.print(0);
    		}
        	
			System.out.println();
        	
        }
    }

}

/*
3
4 5
3 2
FUFFP
PFPFU
UPFFU
PPPFP
3 4
1 3
PUPP
UUUU
UFUU
1 3
2 2
PPP
*/