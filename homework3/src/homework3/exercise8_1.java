package homework3;

import java.util.Scanner;

public class exercise8_1 {
	    public static void main(String[] args)
	            throws Exception
	    {
	        @SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
	        double[][] test = new double[3][4];
	        System.out.printf("Enter a 3-by-4 matrix by row:");
	        for(int i=0;i<3;i++)
	            for(int j=0;j<4;j++)
	                test[i][j]=input.nextDouble();
	        for(int i=0;i<4;i++)
	            System.out.printf("Sum of the elements at column %d is %.1f\n",i,sumColumn(test,i));
	    }
	    public static double sumColumn(double[][] m,int columnIndex){
	        int rows = m.length;
	        double sum = 0.0;
	        for(int i=0;i<rows;i++){
	            sum+=m[i][columnIndex];
	        }
	        return sum;
	    }
	}


