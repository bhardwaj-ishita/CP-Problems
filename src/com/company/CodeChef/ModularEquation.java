package com.company.CodeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ModularEquation {
	
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
    
    public static int addIt(int num) {
    	if(num == 0)
        	return 0;
        if(num == 1)
            return 1;
        return num + addIt(num-1);
    }

    public static void main(String[] args) {
        Fastreader fs = new Fastreader();
        int t = fs.nextInt();
        while(t-- > 0) {
            int n = fs.nextInt();
            int m = fs.nextInt();
            
            int j = n;
            int count = 0;
            while(j > 1) {
                if(m%j == 0)
                    count++;
                j--;
            }

            if(count == 0)
            	System.out.println(n-1);
            else if (count != 0) {
            	int ans = addIt(count - 1);
                ans = ans + (n-1);
                System.out.println(ans);
            }
            
        }
    }

}

/*
 * 3
3 5
3 6
3 10
 */
