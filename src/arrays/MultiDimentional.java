package arrays;

public class MultiDimentional {
	public static void main(String[] arr) {
		int[][][] arr1 = { 
			{ {23, 5}, {25, 7}, {12,76} }, 
			{ {9, 45}, {12, 4}, {78, 54} }, 
			{ {87, 43}, {23, 48}, {14, 56} } 
		};
		for(int i=0;i<3;i++) 
			for(int j=0;j<3;j++) 
				for(int k=0;k<2;k++) 
					System.out.println("Array element at["+ i + "]" + "[" + j +"]" + "["+ k +"]: " + arr1[i][j][k]);
	}
}
