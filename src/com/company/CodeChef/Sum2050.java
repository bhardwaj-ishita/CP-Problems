package com.company.CodeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Sum2050 {
	
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
	
	public static long countDigit(long n)
    {
        if (n == 0)
            return 0;
        return 1 + countDigit(n / 10);
    }

    public static void main(String[] args) {
        Fastreader fs = new Fastreader();
        int t = fs.nextInt();
        while(t-- > 0){
        	long n = fs.nextLong();
        	
        	long digits = countDigit(n);
        	
        	long k = digits - 4;
        	
        	long diff = n;
        	int count = 0;
        	long store = 0;
        	
        	if(digits < 4 && n%2050 != 0) {
        		System.out.println(-1);
        	}
        	else if(digits >= 4 && n%2050 == 0) {
        		while(k >= 0) {
        			store = diff;
            		diff = (long) (store - (2050*(Math.pow(10, k))));
            		count++;
            		if(diff < 0) {
            			diff = store;
            			k--;
            			count--;
            		}
            		else if(diff == 0) {
            			break;
            		}
            	}
            	
            	if(diff == 0) {
            		System.out.println(count);
            	}
            	else
            		System.out.println(-1);
        	}
        	else
        		System.out.println(-1);

        }
    }
//kjhk
}
