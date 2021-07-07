package com.company.CodeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CollegeLife5 {
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
        int t = fs.nextInt();
        for(int z = 0; z < t; z++) {
            int n = fs.nextInt();
            int m = fs.nextInt();
            int[] f = new int[n];
            int[] c = new int[m];
            for(int p = 0; p < n; p++) {
                f[p] = fs.nextInt();
            }
            for(int q = 0; q < m; q++) {
                c[q] = fs.nextInt();
            }

            Arrays.sort(f);
            Arrays.sort(c);

            int count = 0;
            int i = 0;
            int j = 0;
            boolean tv = false; // false -> football, true -> cricket


            while (i < n  && j < m) {
                if(f[i] < c[j] && !tv) {
                    i++;
                }
                else if(f[i] < c[j] && tv) {
                    count++;
                    tv = false;
                    i++;
                }
                else if(f[i] > c[j] && !tv) {
                    count++;
                    tv = true;
                    j++;
                }
                else if(f[i] > c[j] && tv) {
                    j++;
                }
            }

            if(i < n && tv) {
                count++;
            } else if(j < m && !tv) {
                count++;
            }

            System.out.println(count);
        }
    }

}


/*
3
2 2
1 3
2 4

3 1
100 200 300
1

1 2
1
100 200

 */