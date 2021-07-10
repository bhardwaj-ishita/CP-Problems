package com.company.CodeForces.Round731;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ShortestPathsWithObstacles {
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
        while(t-->0) {
            String space = fs.nextLine();
            int xai = fs.nextInt();
            int xaj = fs.nextInt();
            int xbi = fs.nextInt();
            int xbj = fs.nextInt();
            int xfi = fs.nextInt();
            int xfj = fs.nextInt();

            System.out.println(path(xai,xaj,xbi,xbj,xfi,xfj));
        }
    }

    public static int path(int xai, int xaj, int xbi, int xbj, int xfi, int xfj) {
        if(xfi==xai && xfi==xbi && (xfj<xbj && xfj>xaj || xfj>xbj && xfj<xaj)) return (xaj>xbj?xaj-xbj:xbj-xaj) + (xai>xbi?xai-xbi:xbi-xai) + 2;
        if(xfj==xaj && xfj==xbj && (xfi<xbi && xfi>xai || xfi>xbi && xfi<xai)) return (xaj>xbj?xaj-xbj:xbj-xaj) + (xai>xbi?xai-xbi:xbi-xai) + 2;
        return (xaj>xbj?xaj-xbj:xbj-xaj) + (xai>xbi?xai-xbi:xbi-xai);
    }
}
