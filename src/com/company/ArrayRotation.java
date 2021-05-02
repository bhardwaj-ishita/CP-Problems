package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class ArrayRotation {
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
	
//	static ArrayList<Integer> rotation(ArrayList<Integer> arr, int x) {
//    	if(x >= 0) {
//    		int[] store = new int[x];
//    		int z = 0;
//    		while(z < x) {
//    			store[z] = arr.get(arr.size() - 1 - z );
//    			z++;
//    		}
//        	for(int i = arr.size(),j = 0; i - x > -x && j < x; i--) {
//        		if((i - x) >= 0) {
//        			arr.set(i,arr.get(i - x)); 
//        		}
//        		else if((i-x) < 0) {
//        			arr.set(i,store[j]);
//        			j++;
//        		}
//        	}
//    	}
//    	else if(x < 0) {
//    		int X = Math.abs(x);
//    		int[] store = new int[X];
//    		int z = 0;
//    		while(z < X) {
//    			store[z] = arr.get(z);
//    			z++;
//    		}
//        	for(int i = 0,j = 0; i + x > (arr.size() - 1 + x) && j < x; i++) {
//        		if((i + X) < arr.size()) {
//        			arr.set(0,arr.get(i + x)); 
//        		}
//        		else if((i+X) >= arr.size()) {
//        			arr.set(arr.get(i),store[j]);
//        			j++;
//        		}
//        	}
//    	}
//    	
//    	return arr;
//    }

    public static void main(String[] args) {
        Fastreader fs = new Fastreader();
        int t = fs.nextInt();
        while(t-- > 0) {
        	int n = fs.nextInt();
        	ArrayList<Integer> arr = new ArrayList<Integer>();
        	for(int i = 0; i < n; i++) {
        		arr.add(fs.nextInt());
        	}
        	int q = fs.nextInt();
        	int[] x = new int[q];
        	for(int j = 0; j < q; j++) {
        		x[j] = fs.nextInt();
        	}
        	
        	
        	ArrayList<Integer> ARR = new ArrayList<Integer>();
        	for(int z = 0; z < q; z++) {
        		ARR.addAll(arr);
        		if(x[z] >= 0) {
        			Collections.rotate(arr, x[z]);
        		}
        		else if(x[z] < 0) {
        			Collections.rotate(arr, Math.abs(x[z]));
        		}
        		ARR.addAll(arr);
        	}
        	
        	long sum = 0;
        	for(int z = 0; z < ARR.size(); z++) {
        		sum = sum + ARR.get(z);
        	}
        	
        	System.out.println(sum);

        }
    }
    
s
}
