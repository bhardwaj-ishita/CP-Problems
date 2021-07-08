package com.company.CodeForces.Round715;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/**
 * QuickSort
 */
public class AverageHeights {

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
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
		int t = fs.nextInt();
		while(t-- > 0) {
			int n = fs.nextInt();
			int[] a = new int[n];
			for(int i = 0; i < n; i++) {
				a[i] = fs.nextInt();
			}

			int i = 0;
			int j = n-1;
			while(i < j) {
				if(a[i]%2!=0) swap(i,j--,a);
				else i++;
			}

			for(int x: a)System.out.print(x + " ");
		}
	}

	public static void swap(int i, int j, int[] a) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}

/*
 * 
4
3
1 1 2
3
1 1 1
8
10 9 13 15 3 16 9 13
2
18 9


10 9 13 15 3 16 9 13
13 9 13 15 3 9 16 10 
 * 
 */
