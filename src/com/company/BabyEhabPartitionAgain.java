package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BabyEhabPartitionAgain {

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
    	int n = fs.nextInt();
    	int[] arr = new int[n];
    	for(int i = 0; i < n; i++) {
    		arr[i] = fs.nextInt();
    	}
    	
    	Arrays.sort(arr);
    	
    	int x = 0;
    	int y = n - 1;
    	int sum1 = 0;
    	int sum2 = 0;
    	for(; x < n && y >=0 && x < y;x += 2, y -= 2) {
    		sum1 = sum1 + arr[x];
    		sum2 = sum2 + arr[y];
    	}
    	
    	int diff = sum1 - sum2;
    	
    	if(diff == 0) {
    		System.out.println(1 + " " + 1);
    	}
    	else if(diff != 0) {
    		System.out.println(0);
    	}
    }
    
    
    public static void switchNum(int x, int y, int[] arr) {
    	int store = arr[x];
		arr[x] = arr[y];
		arr[y] = store;
    }
    df
}
