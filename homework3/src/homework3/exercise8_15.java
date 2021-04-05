package homework3;

import java.util.Scanner;

public class exercise8_15 {
	public static void main(String[] args) {
		System.out.print("Enter five points: ");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		double[][] points = new double[5][2];
		for(int i=0;i<5;i++)
			for(int j=0;j<2;j++)
				points[i][j]=input.nextDouble();
		if(onTheSameLine(points[0][0], points[0][1], points[1][0], points[1][1], points[2][0], points[2][1])
				&& onTheSameLine(points[0][0], points[0][1], points[1][0], points[1][1], points[3][0], points[3][1])
				&& onTheSameLine(points[0][0], points[0][1], points[1][0], points[1][1], points[4][0], points[4][1]))
			System.out.print("The five points are on the same line");
		else
			System.out.print("The five points are not on the same line");
}
public static boolean onTheSameLine(double x0,double y0,double x1,double y1,double x2,double y2){
return (x1-x0)*(y2-y0)-(x2-x0)*(y1-y0)==0;
 }
}
