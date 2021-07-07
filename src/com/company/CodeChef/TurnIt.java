package com.company.CodeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TurnIt {
	
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
        int tc = fs.nextInt();
        for(int i = 0; i < tc; i++) {
            int u = fs.nextInt();
            int v = fs.nextInt();
            int a = fs.nextInt();
            int s = fs.nextInt();

            int comp = (int) Math.sqrt(Math.pow(u, 2)-(2*a*s));
            if(v >= comp)
                System.out.println("Yes");
            else if(u <= v)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
