package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class TMTDocument {

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
            String st = "";
            try {
                st = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return st;
        }
    }

    public static void main(String[] args) {
        Fastreader fs = new Fastreader();
        int t = fs.nextInt();
        for(int i = 0; i < t; i++) {
            int n = fs.nextInt();
        	String s = fs.nextLine();
            char[] c = s.toCharArray();
            
            int countM = 0;
            int countT = 0;
            ArrayList<Integer> tm = new ArrayList<Integer>();
            for(int j = 0; j < n; j++) {
            	if(c[j] == 'M') {
            		countM++;
            	}
            	else
            		countT++;
            }
            tm.add(countM);
            tm.add(countT);
            
            
            
            
            countM = 0;
            countT = 0;
            boolean flag = false;
            for(int x = 0; x < n; x++) {
            	if(c[x] == 'M') countM++;
            	if(flag == false && c[x] == 'T') {
            			countT++;
            			if(countT == tm.get(0)) 
            				flag = true;
            	}
            	else if(c[x] == 'T') {
            			countT--;
            			countM--;
            	}
            	if(countM < 0 || countT < 0)
            		break;
            }
            
            
            
            
            if(c[0] == 'M' || c[n-1] == 'M' || 2*tm.get(0) != tm.get(1)) {
            	System.out.println("NO");
            }
            else if(2*tm.get(0) == tm.get(1) && c[0] == 'T' || c[n-1] == 'T') {
            	if(countT == 0 && countM == 0) {
            		System.out.println("YES");
            	}
            	else if(countT < 0 || countT > 0 || countM > 0 || countM < 0) {
            		System.out.println("NO");
            	}
            }
            
        }
    }
}

f
/*
5
3
TMT
3
MTT
6
TMTMTT
6
TMTTTT
6
TTMMTT
 */
