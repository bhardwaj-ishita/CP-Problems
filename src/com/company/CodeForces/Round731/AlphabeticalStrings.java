package com.company.CodeForces.Round731;//DIV3

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AlphabeticalStrings {
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
            String str = "";
            System.out.println(ans(s,str));
        }
    }

    public static int size = 97;
    public static String ans(String s, String str) {
        if(str.isEmpty()) size = 97;
        if(str.equals(s)) return "YES";
        if(str.length() > s.length()) return "NO";
        String append = str + (char)size;
        String prepend = ((char)size) + str;
        size++;
        if(s.contains(append)) {
            str = append;
            //System.out.println("append: " + str);
            return ans(s, append);
        }
        else if(s.contains(prepend)){
            str = prepend;
            //System.out.println("prepend: " + str);
            return ans(s, prepend);
        }
        return "NO";
    }
}
