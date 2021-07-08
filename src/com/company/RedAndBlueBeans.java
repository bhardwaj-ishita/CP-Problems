package com.company;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RedAndBlueBeans {

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
            int r = fs.nextInt();
            int b = fs.nextInt();
            int d = fs.nextInt();

            int ri = 1;
            int bi = 1;
            while(r>0 || b>0) {
                if(r>=b) {
                    b -= bi;
                    r -= (bi+d);

                }
                else if(r<b) {
                    r -= ri;
                    while(b>=0 )
                    if(b <= (ri+d))
                        b -= (ri+d);
                }
            }
        }
    }
}
