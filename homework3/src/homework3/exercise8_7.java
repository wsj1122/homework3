package homework3;

import java.util.Scanner;

public class exercise8_7 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of points: ");
		int num = input.nextInt();
		System.out.println("Enter " + num + " points: ");
		double[][] points = getArray(num);
		int p1 = 0;
		int p2 = 1;
		double shortDistance = distance(points[p1][0], points[p1][1], points[p1][2], points[p2][0], points[p2][1],
				points[p2][2]);
		for (int i = 0; i < points.length; i++) {
			for (int j = i + 1; j < points.length; j++) {
				double distance = distance(points[i][0], points[i][1], points[i][2], points[j][0], points[j][1],
						points[j][2]);
				if (shortDistance > distance) {
					p1 = i;
					p2 = j;
					shortDistance = distance;
				}
			}
		}
		System.out.println("Two recent point (" + points[p1][0] + ", " + points[p1][1] + ", " + points[p1][2] + ")and("
				+ points[p2][0] + ", " + points[p2][1] + ", " + points[p2][2] + ")");
		System.out.println("The distance is " + shortDistance);
}

public static double[][] getArray(int n) {
	@SuppressWarnings("resource")
	Scanner input = new Scanner(System.in);
	double[][] points = new double[n][3];
	for (int i = 0; i < points.length; i++)
		for (int j = 0; j < 3; j++)
			points[i][j] = input.nextDouble();
	return points;
 }

public static double distance(double x1, double y1, double z1, double x2, double y2, double z2) {
	return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2) + (z1 - z2) * (z1 - z2));
 }
}
