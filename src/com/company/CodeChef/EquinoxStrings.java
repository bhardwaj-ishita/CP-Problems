package com.company.CodeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EquinoxStrings {

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
        	long a = fs.nextLong();
        	long b = fs.nextLong();
        	String[] s = new String[n];
        	for(int x = 0; x < n; x++) {
        		s[x] = fs.nextLine();
        	}
        	
        	int i = 0;
        	long sarthak = 0;
        	long anuradha = 0;
        	while(i < n) {
        		char[] c = s[i].toCharArray();
        		boolean ans = (c[0] == 'E'||c[0] == 'Q'||c[0] == 'U'||c[0] == 'I'||c[0] == 'N'||c[0] == 'O'||c[0] == 'X')? true:false;
        		if(ans)
        			sarthak += a;
        		else if(!ans)
        			anuradha += b;
        		i++;
        	}
        	
        	if(sarthak > anuradha)
        		System.out.println("SARTHAK");
        	else if(anuradha > sarthak)
        		System.out.println("ANURADHA");
        	else if(anuradha == sarthak)
        		System.out.println("DRAW");
        	
        }
    }

}
