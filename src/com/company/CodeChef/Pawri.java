package com.company.CodeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pawri {
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
            String st = "";
            try {
                st = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return st;
        }
    }

    public static void main(String[] args) {
        Fastreader fs = new Fastreader();
        int t = fs.nextInt();
        for(int i = 0; i < t; i++) {
            String s = fs.nextLine();
            char[] c = s.toCharArray();
            if(c.length < 5) {
                String ans = new String(c);
                System.out.println(ans);
            } else {
                for(int j = 0; j < c.length - 4; j++) {
                    if(c[j] == 'p' && c[j+1] == 'a' && c[j+2] == 'r' && c[j+3] == 't' && c[j+4] == 'y') {
                        c[j+2] = 'w';
                        c[j+3] = 'r';
                        c[j+4] = 'i';
                    }
                }
                String ans = new String(c);
                System.out.println(ans);
            }

        }
    }
}

/*
part
partypartiparty
yemaihuyemericarhaiauryahapartyhorahihai
 */