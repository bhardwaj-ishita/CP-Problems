package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import com.company.Main.Fastreader;

public class ThiefPolice {

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
        	int n = fs.nextInt();
        	int m = fs.nextInt();
        	int x = fs.nextInt();
        	int y = fs.nextInt();
        	int a = fs.nextInt();
        	int b = fs.nextInt();
        	
        	int[][] grid = new int[n][m];
        	grid[x][y] = 0;
        	grid[a][b] = 1;
        	boolean step = false;
        	boolean thief;
        	boolean police;
        	while(x<n && y < m && a < n && b < m) {
        		step = Math.min(a, b) == a? false:true; //false is down & true is right
        		if(!step) {x++;} else if(step) {y++;}
        		if()
        	}
        }
    }

}
