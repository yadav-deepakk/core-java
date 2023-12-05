package arrays;

public class Arrays2D {

	public static void main(String[] args) {
		int [][] arr1 = {
			{23, 65, 16, 35},
			{56, 87, 34, 96},
			{27, 85, 37, 84}
		};
		
		for (int i=0;i<3;i++) 
			for (int j=0;j<4;j++)
				System.out.println("Array element at ["+ i + "]"+"["+ j + "]: " + arr1[i][j]);
		
	}

}
