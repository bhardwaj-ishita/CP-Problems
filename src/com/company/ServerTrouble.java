package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ServerTrouble {

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

        double nextDouble() {
            return Double.parseDouble(next());
        }
    }

    public static void main(String[] args) {
        Fastreader fs = new Fastreader();
        int t = fs.nextInt();
        for(int i = 0; i < t; i++) {
            int n = fs.nextInt();
            int k = fs.nextInt();

            double d;
            double x;

            if((n % k) != 0) {
                d = Math.ceil((double)n/k);
                x = n % k;
            } else {
                d = n/k;
                x = k;
            }
            System.out.println((int)d + " " + (int)x);


//            if(n == k) {
//                d = 1;
//                x = n;
//                System.out.println(d + " " + x);
//            }
//            else if(k == n/2) {
//                d = 2;
//                x = k;
//                System.out.println(d + " " + x);
//            }
//            else if(k > n/2) {
//                d = 2;
//                x = (n - k);
//                System.out.println(d + " " + x);
//            }
//            else if( k < n/2) {
//                if((n % k) != 0) {
//                    d = (int) Math.ceil(n/k);
//                }
//                else {
//                    d = n/k;
//                }
//                x = (int) (n/d);
//                System.out.println(d + " " + x);
//            }
        }
    }
}

/*
3
6 3
2 3

10 6
2 4

10 4
3 2
 */