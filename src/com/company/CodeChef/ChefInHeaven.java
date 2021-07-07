package com.company.CodeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ChefInHeaven {

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
        	int l = fs.nextInt();
        	String s = fs.nextLine();
        	
        	char[] c = s.toCharArray();
        	
        	float good = 0;
        	for(int i = 0; i < l; i++) {
        		if(c[i] == '1')
        			good += 1;
        	}
        	

        	float half = ((float)l)/2;
        	boolean line = false;
        	int ans = Float.compare(good, half);
        	
        	if(ans == 0 || ans == 1) {
        		System.out.println("YES");
        	}	
        	else if(ans == -1){
        		float num = 0;
        		for(int i = 0; i < l; i++) {
            		if(c[i] == '1')
            			num++;
            		float year = (float)(i+1)/2;
            		if(num >= year) {
            			System.out.println("YES");
            			line = true;
            			break;
            		}
            		
            	}
        		if(!line)
        			System.out.println("NO");
        	}	
        }
    }

}

/*
 *
 3
2
10
3
001
4
0100
 */
