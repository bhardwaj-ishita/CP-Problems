package com.company.CodeForces.Round716;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Product1ModuloN {

    static class FastReader{
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
    }

    public static void main(String[] args) {
        FastReader fs = new FastReader();
        int n = fs.nextInt();

        //co prime numbers
        //and then modulo n
        //if ans 1 good, else if ans p then remove p
        List<Integer> list = new ArrayList<>();
        list.add(1);

        int i = 1;
        long product = 1;
        while(i < n) {
            if(gcd(i,n)!=0) {
                list.add(i);
                product *= i;
            }
            i++;
        }

        if(product%n==1) {
            System.out.println(list.size());
            for (Integer integer : list) System.out.print(integer + " ");
        }
        else {
            while(product(list)%n!=1) {
                Integer index = (int)(product(list)%n);
                list.remove(index);
            }
            System.out.println(list.size());
            for (Integer integer : list) System.out.print(integer + " ");
        }

    }

    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static long product(List<Integer> list) {
        int i = 0;
        long product = 1;
        while(i < list.size()) {
            product *= list.get(i);
            i++;
        }
        return product;
    }
}
