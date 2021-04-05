package homework3;

import java.util.Scanner;

public class exercise8_2 {
	    public static void main(String[] args)
	            throws Exception
	    {
	        @SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
	        double[][] test = new double[4][4];
	        System.out.println("Enter a 4-by-4 matrix row by row:");
	        for(int i=0;i<4;i++)
	            for(int j=0;j<4;j++)
	                test[i][j]=input.nextDouble();
	        System.out.println("Sum of the elements in the major diagonal is "+sumMajorDiagonal(test));
	    }
	    public static double sumMajorDiagonal(double[][] m){
	        int len = m.length;
	        double sum = 0.0;
	        for(int i=0;i<len;i++)
	            sum+=m[i][i];
	        return sum;
	    }
	}


