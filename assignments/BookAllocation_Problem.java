package assignments;

import java.util.*;

public class BookAllocation_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int j = 1; j <= t; j++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] pages = new int[n];
			for (int i = 0; i < pages.length; i++) {
				pages[i] = sc.nextInt();
			}
			System.out.println(BookAllocation(pages, m));
		}

	}

	public static int BookAllocation(int[] pages, int students) {
		int ans = 0;
		int lo = pages[0];
		int hi = 0;
		for (int i = 0; i < pages.length; i++) {
			hi = hi + pages[i];
		}
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (isitpossible(pages, mid, students) == true) {
				ans = mid;
				hi = mid - 1;
			} else {
				lo = mid + 1;
			}
		}
		return ans;
	}

	public static boolean isitpossible(int[] pages, int pans, int students) {
		int page = 0;
		int st = 1;
		for (int i = 0; i < pages.length;) {
			if (page + pages[i] <= pans) {
				page += pages[i];
				i++;
			} else {
				page = 0;
				st++;
			}
			if (st > students) {
				return false;
			}
		}

		return true;
	}

}
