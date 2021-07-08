package com.company.CodeForces.Round715;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BinaryLiterature {

    public static class FastReader {
        StringTokenizer st;
        BufferedReader br;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while(st == null || !st.hasMoreElements()) {
                try{
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

        String nextLine() {
            String str = "";
            try{
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
        while(t-->0) {
            int n = fs.nextInt();
            String a = fs.nextLine();
            String b = fs.nextLine();
            String c = fs.nextLine();

            int i = 0, j = 0, k = 0;

            StringBuilder ans = new StringBuilder();
            char ch;

            int size = 0;
            while(i < 2*n && j < 2*n && k < 2*n) {
                //find the two values with same starting
                boolean bool; int val = 0;
                bool = (a.charAt(i) == '0'); val = bool ? 1:0;
                bool = (b.charAt(j) == '0'); val += bool ? 1:0;
                bool = (c.charAt(k) == '0'); val += bool ? 1:0;

                if(val >= 2) {
                    ans.append("0"); ch = '0';
                }
                else {
                    ans.append("1"); ch = '1';
                }

                if(a.charAt(i) == ch) i++;
                if(b.charAt(j) == ch) j++;
                if(c.charAt(k) == ch) k++;

                size++;
            }

            if(i != 2*n && (2*n - i) <= 3*n-size) ans.append(a.substring(i));
            else if(j != 2*n && (2*n - j) <= 3*n-size) ans.append(b.substring(j));
            else if(k != 2*n && (2*n - k) <= 3*n-size) ans.append(c.substring(k));

            System.out.println(ans);
        }
    }
}
