package homework3;

import java.util.Scanner;

public class exercise8_21 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of cities: ");
		int nums = input.nextInt();
		System.out.print("Enter the coordinates of the cities: ");
		double[][] coor = new double[nums][2];
		for (int i = 0; i < nums; i++)
			for (int j = 0; j < 2; j++)
				coor[i][j] = input.nextDouble();
		double min = totalDistance(coor, 0);
		int index = 0;
		for (int i = 0; i < coor.length; i++) {
			double total = totalDistance(coor, i);
			if (min > total) {
				min = total;
				index = i;
			}
		}
		System.out.println("The central city is at (" + coor[index][0] + ", " + coor[index][1] + ")");
		System.out.printf("The total distance to all other cities is %4.2f", min);
}

public static double totalDistance(double[][] coor, int i) {
	double totalDistance = 0;
	for (int j = 0; j < coor.length; j++)
		totalDistance += distance(coor[i], coor[j]); // 二维数据是一位数组的数组！！！！
	return totalDistance;
}

public static double distance(double[] c1, double[] c2) {
	return Math.sqrt((c1[0] - c2[0]) * (c1[0] - c2[0]) + (c1[1] - c2[1]) * (c1[1] - c2[1]));
 }
}
