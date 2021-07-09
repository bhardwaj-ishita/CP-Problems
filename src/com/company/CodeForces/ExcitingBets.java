package com.company.CodeForces;

import com.company.Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ExcitingBets {
    public static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
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
        FastReader fs = new FastReader();
        int t = fs.nextInt();
        while (t-- > 0) {
            long a = fs.nextLong();
            long b = fs.nextLong();

            if(a == b) {
                System.out.println(0 + " " + 0);
            }
            else if(Math.abs(b-a) == 1) {
                System.out.println(1 + " " + 0);
            }
            else if(a != b) {
                long gcd = a > b ? a - b : b - a;
                long i = 0;
                if(Math.abs(a-b) > a && Math.abs(a-b) > b) {
                    i = (a < b ? a : b);
                    gcd = a > b ? a : b;
                }
                else {
                    while(a % gcd != 0){
                        a += 1;
                        i++;
                    }
                }
                System.out.println(gcd + " " + i);

            }
        }
    }
}
