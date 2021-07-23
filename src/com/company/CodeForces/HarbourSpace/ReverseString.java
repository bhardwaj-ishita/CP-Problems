package com.company.CodeForces.HarbourSpace;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class ReverseString {
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
            Stack<Character> stack = new Stack<>();

            int i = 0;
            boolean ans = false;
            while (i < s.length()) {
                if(s.charAt(i) == q.charAt(0)) {
                    ans = true;
                    break;
                }
                i++;
            }

            if(!ans) System.out.println("NO");
            else System.out.println(answer(s,q,stack, i, 0));
        }
    }

    public static String answer(String s, String q, Stack<Character> stack, int i, int j) {
        boolean bool = false;
        while(j < q.length() && i > 0) {
            System.out.println("i: " + i + " j: " + j);
            if(i >= s.length()) {
                stack.pop();
                if(!stack.isEmpty()  && stack.peek() != q.charAt(j)) return "NO";
                bool = true;
                i-=2;
            }
            if(!bool && s.charAt(i) == q.charAt(j)) stack.push(s.charAt(i));
            else if(bool && s.charAt(i) != q.charAt(j)) return "NO";
            else if(bool && s.charAt(i) == q.charAt(j)) stack.push(s.charAt(i));
            else {
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
