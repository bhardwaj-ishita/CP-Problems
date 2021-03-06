package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
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
            String s = fs.nextLine();
            String q = fs.nextLine();

            int i = 0;
            boolean ans = false;
            while (i < s.length()) {
                if(s.charAt(i) == q.charAt(0)) {
                    ans = true;
                    break;
                }
                i++;
            }

            if(q.length() > 2*s.length()) System.out.println("NO");
            else if(!ans) System.out.println("NO");
            else System.out.println(answer(s,q, i, 0));
        }
    }

    public static String answer(String s, String q, int i, int j) {
        boolean bool = false;
        while(j < q.length() && i > 0) {
            System.out.println("i: " + i + " j: " + j);
            if(i >= s.length()) {
                if(i > 2 && s.charAt(i-2)!=q.charAt(j)) return "NO";
                bool = true;
                i-=2;
            }

            if(bool && s.charAt(i) != q.charAt(j)) return "NO";
            else if(!bool && s.charAt(i) != q.charAt(j)){
                bool = true;
                i--;
                j--;
            }

            if(bool) i--;
            else i++;

            j++;
        }
        return "YES";
    }

}
/*
6
abcdef
cdedcb
aaa
aaaaa
aab
baaa
ab
b
abcdef
abcdef
ba
baa
 */