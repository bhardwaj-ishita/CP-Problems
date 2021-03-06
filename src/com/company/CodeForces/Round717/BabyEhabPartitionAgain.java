package com.company.CodeForces.Round717;

import com.company.Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * based on a very famous question
 * subset sum equal partition
 * it is a variant of knapsack problem
 */
public class BabyEhabPartitionAgain {

	static class FastReader {
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
        int n = fs.nextInt();
        long[] a = new long[n];
        long sum = 0;
        for(int i = 0; i < n; i++) {
            a[i] = fs.nextLong();
            sum += a[i];
        }

        boolean bool = knapsack(n,a);

        if(!bool) System.out.println(0);
        else {
            for(int j = 0; j < n; j++) {
                if(a[j]%2 == 1) {
                    System.out.println(1);
                    System.out.println(j);
                }
                else
                    a[j]/=2;
            }
        }
    }

    public static boolean knapsack(int n, long[] a){

        return true;
    }

}
