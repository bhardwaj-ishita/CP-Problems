package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
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

        }
    }
}

/*

4
6
3 5 1 4 6 6
3
1 2 3
4
1 3 3 4
6
1 6 3 4 5 6


5 5
216105383 392690692 362897261 612031267 602760551
759978194 267931523 529243295 19554306 778219287
865598246 977120415 461226537 926158211 572066673
319609167 180364290 397130077 509455924 480532143
790302117 304254206 234044016 565109010 82221982

82995689 94477907 346748376 693689771 772083165
797696126 979924049 134869989 588224792 638115936
690869657 718625577 890304503 230636789 273469380
438244869 566422275 911636455 3342722 403053630
643043631 657040895 758239246 867556103 149017940

5 5
216105383 392690692 362897261 612031267 602760551
759978194 267931523 529243295 19554306 778219287
865598246 977120415 461226537 926158211 572066673
319609167 180364290 397130077 509455924 480532143
790302117 304254206 234044016 565109010 82221982

216105383 362897261 392690692 602760551 612031267
778219287 19554306 267931523 529243295 759978194
926158211 977120415 461226537 572066673 865598246
480532143 509455924 180364290 319609167 397130077
304254206 565109010 790302117 82221982 234044016
 */
