package com.company.CodeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ChefOnIsland {

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
        	int x = fs.nextInt();
        	int y = fs.nextInt();
        	int xr = fs.nextInt();
        	int yr = fs.nextInt();
        	int d = fs.nextInt();
        	
        	if(y >= yr && x >= xr) {
        		int food = Math.floorDiv(x, xr);
            	int water= Math.floorDiv(y, yr);
            	
            	boolean ans = (Math.min(food, water) >= d) ? true:false;
            	
            	if(ans) System.out.println("Yes");
            	else if(!ans) System.out.println("No");
        	}
        	else
        		System.out.println("No");
        	
        	
        }
    }

}

//3
//4 2 1 1 1
//4 2 1 3 1
//4 2 4 2 2
