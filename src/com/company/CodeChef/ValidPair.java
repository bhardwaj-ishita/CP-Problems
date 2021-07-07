package com.company.CodeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ValidPair {

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

    }
	
	public static void main(String[] args) {
		
		Fastreader fs = new Fastreader();
		
		int a = fs.nextInt();
		int b = fs.nextInt();
		int c = fs.nextInt();
		
		if(a == b || a == c || b == c) {
			System.out.println("Yes");
		} else 
			System.out.println("No");

	}

}
