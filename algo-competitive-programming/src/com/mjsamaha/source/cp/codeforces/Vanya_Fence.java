package com.mjsamaha.source.cp.codeforces;




import java.io.*;
import java.util.*;

public class Vanya_Fence {

	/**
	 * Constants
	 */
	static final int MOD = 1_000_000_007;
	static final int INF = Integer.MAX_VALUE / 2;
	static final long LINF = Long.MAX_VALUE / 2;

	public static void main(String[] args) throws Exception {

		solve();
		flush();
	}

	/**
	 * Main
	 */
	static void solve() throws Exception {
		// n and h
		
		int n = nextInt(); // num of person
		int h = nextInt(); // height of fence
		
		int[] nums = readIntArray(n); // nums // iterate through list, if [i] is <= h add 1, if not add 2 to valid
		
		int valid = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] <= h) { // I had < h - before
				valid += 1;
			} else {
				valid += 2;
			}
		}
		
		// time: O(n) - reads n integers
		// space: O(n) - constant space
		
		out(valid);
		

	}

	static void out(Object o) {
		sb.append(o).append('\n');
	}

	static void yes() {
		sb.append("YES\n");
	}

	static void no() {
		sb.append("NO\n");
	}

	static void flush() throws IOException {
		bw.write(sb.toString());
		bw.flush();
	}

	static int[] readIntArray(int n) throws IOException {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = nextInt();
		return a;
	}

	static long[] readLongArray(int n) throws IOException {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = nextLong();
		return a;
	}

	static int[][] readIntGrid(int r, int c) throws IOException {
		int[][] g = new int[r][c];
		for (int i = 0; i < r; i++)
			g[i] = readIntArray(c);
		return g;
	}

	static long[][] readLongGrid(int r, int c) throws IOException {
		long[][] g = new long[r][c];
		for (int i = 0; i < r; i++)
			g[i] = readLongArray(c);
		return g;
	}

	static long gcd(long a, long b) {
		return b == 0 ? a : gcd(b, a % b);
	}

	static long lcm(long a, long b) {
		return a / gcd(a, b) * b;
	}

	static boolean isPrime(long n) {
		if (n < 2)
			return false;
		for (long i = 2; i * i <= n; i++)
			if (n % i == 0)
				return false;
		return true;
	}

	static long pow(long base, long exp, long mod) {
		long result = 1;
		base %= mod;
		for (; exp > 0; exp >>= 1) {
			if ((exp & 1) == 1)
				result = result * base % mod;
			base = base * base % mod;
		}
		return result;
	}

	/**
	 * FAST INPUT - Don't modify
	 */
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static StringTokenizer st;
	public static StringBuilder sb = new StringBuilder();

	static String next() throws IOException {
		while (st == null || !st.hasMoreElements())
			st = new StringTokenizer(br.readLine());
		return st.nextToken();
	}

	static int nextInt() throws IOException {
		return Integer.parseInt(next());
	}

	static long nextLong() throws IOException {
		return Long.parseLong(next());
	}

	static double nextDouble() throws IOException {
		return Double.parseDouble(next());
	}

	static String nextLine() throws IOException {
		return br.readLine();
	}
}