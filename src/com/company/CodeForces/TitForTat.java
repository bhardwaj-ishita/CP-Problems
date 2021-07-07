package com.company.CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TitForTat {

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
        	int k = fs.nextInt();
        	int[] arr = new int[n];
        	for(int i = 0; i < n; i++) {
        		arr[i] = fs.nextInt();
        	}
        	
        	for(int j = 0; j < n; j++) {
        		while(arr[j] != 0 && k != 0) {
        			arr[j] -= 1;
        			arr[n-1] += 1;
        			k--;
        		}
        	}
        	
        	for(int x: arr) System.out.print(x + " ");
        	System.out.println();
        	
        }
    }

}
