package com.company.CodeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PossibleVictory {

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
    }

    public static void main(String[] args) {
        Fastreader fs = new Fastreader();
        int R = fs.nextInt();
        int O = fs.nextInt();
        int C = fs.nextInt();

        int cond = R - (C + ((20 - O) * 36));
        if(cond >= 0)
            System.out.println("No");
        else
            System.out.println("Yes");

    }
}
