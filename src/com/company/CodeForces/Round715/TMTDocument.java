package com.company.CodeForces.Round715;

import com.company.Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class TMTDocument {

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
	            catch (IOException e) {
	                e.printStackTrace();
                }
            }
	        return st.nextToken();
         }

         int nextInt() {
	        return Integer.parseInt(next());
         }

         String nextLine() {
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
		while(t-- > 0) {
			int n = fs.nextInt();
			String s = fs.nextLine();
			System.out.println(TMT(n,s));
		}
	}

	public static String TMT(int n, String s) {
		List<Integer> t = new ArrayList<>(n*2/3);
		List<Integer> m = new ArrayList<>(n/3);

		int i = 0;
		while(i < n) {
			if(s.charAt(i) == 'T') t.add(i);
			else if(s.charAt(i) == 'M') m.add(i);
			//if(m.size() > t.size()) return "NO";
			i++;
		}

		if(t.size() != m.size()*2) return "NO";
		else {
			for(int j = 0; j < m.size(); j++) {
				if(m.get(j) < t.get(j) || m.get(j) > t.get(j + m.size())) return "NO";
			}
		}
		return "YES";
	}
}

//f
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
