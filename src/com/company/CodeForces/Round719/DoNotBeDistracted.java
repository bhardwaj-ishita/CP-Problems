package com.company.CodeForces.Round719;//DIV3

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class DoNotBeDistracted {
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
            int n = fs.nextInt();
            String s = fs.nextLine();
            System.out.println(answer(s));
        }
    }
    public static String answer(String s) {
        Set<Character> set = new HashSet<>();
        for(int i = 1; i < s.length(); i++) {
            if(set.contains(s.charAt(i))) return "NO";
            if(s.charAt(i) != s.charAt(i-1)) {
                set.add(s.charAt(i-1));
            }
        }
        return "YES";
    }
}
