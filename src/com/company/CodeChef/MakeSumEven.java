package com.company.CodeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MakeSumEven {
	
	
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
    	Fastreader fs = new Fastreader();
        int testCases = fs.nextInt();
        for (int i = 0; i < testCases; i++) {
            int n = fs.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = fs.nextInt();
            }

            //int p = max(0, Math.ceil(a[j]) - 1);

            int sum = 0;
            for(int z = 0; z < n; z++) {
                sum = sum + a[z];
            }


            if (sum % 2 != 0) {
                int count1 = 0;
                int count2 = 0;
                int j = 0;
                while (j < n) {
                    if (a[j] % 2 == 0) {
                        count1 = j;
                    }
                    if(a[j] == 2) {
                        count2++;
                        break;
                    }
                    j++;
                }

                if (count1 == 0) {
                    System.out.println(-1);
                }
                else if(count2 != 0) {
                    System.out.println(1);
                }
                else {
                    System.out.println(-1);
                }
            }
            else {
                System.out.println(0);
            }
        }
    }
}
