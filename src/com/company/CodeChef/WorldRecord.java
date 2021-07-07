package com.company.CodeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class WorldRecord {

	
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
        
        float nextFloat() {
            return Float.parseFloat(next());
        }
        
        double nextDouble() {
            return Double.parseDouble(next());
        }

    }
	
	public static void main(String[] args) throws java.lang.Exception {
		Fastreader fs = new Fastreader();
		int t = fs.nextInt();
		for(int i = 0; i < t; i++) {
			float k1 = fs.nextFloat();
			float k2 = fs.nextFloat();
			float k3 = fs.nextFloat();
			double v = fs.nextDouble();
			
			float vf = (float) (k1*k2*k3*v);
			float tf = 100/vf;
			float roundedTime = (float) (Math.round(tf * 100.0) / 100.0);
			
			float record = 9.58f;
			if(roundedTime < record) {
				System.out.println("Yes");
			}
			else
				System.out.println("No");
		}
	}
}
