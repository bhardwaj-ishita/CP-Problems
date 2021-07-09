package com.company.CodeForces.Round716;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * multiplication of all co-prime numbers of n is also co-prime.
 *
 */
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

        long nextLong() {
            return Long.parseLong(next());
        }
    }

    public static void main(String[] args) {
        FastReader fs = new FastReader();
        long n = fs.nextLong();

        //co prime numbers
        //and then modulo n
        //if ans 1 good, else if ans p then remove p
        List<Long> list = new ArrayList<>();

        long i = 1;
        long product = 1;
        while(i < n) {
            if(gcd(n,i)==1) {
                list.add(i);
                product *= i;
                product %= n;
                //System.out.println("product: " + product);
            }
            i++;
        }

        if(product > 1) {
            list.remove(product);
        }
        System.out.println(list.size());
        for (Long integer : list) System.out.print(integer + " ");

    }

    public static long gcd(long a, long b) {
        if(b==0) return a;
        return gcd(b,a%b);
    }
}
