package homework3;

import java.util.Scanner;

public class exercise8_16 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter row and column: ");
		int r = input.nextInt();
		int c = input.nextInt();
		int[][] m = new int[r][c];
			System.out.print("Enter the values: ");
		for (int i = 0; i < r; i++)
			for (int j = 0; j < c; j++)
				m[i][j] = input.nextInt();
		sort(m);
		}
		public static void sort(int[][] m) {
			int count = 0;
			while (count < m.length) {
		    	for (int i = 0; i < m.length - 1; i++) {
		        // 遍历m[i]数组中的值，判断m[i],m[i+1]是否交换位置
		        for (int j = 0; j < m[i].length; j++) {
		            if (m[i][j] > m[i + 1][j]) {
		                int temp[];
		                temp = m[i];
		                m[i] = m[i + 1];
		                m[i + 1] = temp;
		                j = 0;
		                break;
		            }
		            if (m[i][j] < m[i + 1][j]) {
		                break;
		            }
		            if (m[i][j] == m[i + 1][j]) {
		                continue;
		            }
		        }
		    }
		    count++;
		}
		// print
			System.out.print("sorted: ");
			for (int[] j : m) {
				System.out.print("(");
				for (int i = 0; i < j.length; i++) {
					System.out.printf(" %d ", j[i]);
				 }
			System.out.print(")   ");
		}
		// 4 2 1 7 4 5 1 2 1 1 4 1}
	}
}
