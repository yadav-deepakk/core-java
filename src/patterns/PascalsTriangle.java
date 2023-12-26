package patterns;

import java.util.*;

public class PascalsTriangle {

	public static int factorial(int num, int[] dp) {
		if (num == 1 || num == 0)
			return 1;

		if (dp[num] != -1)
			return dp[num];

		dp[num] = num * factorial(num - 1, dp);

		return dp[num];
	}

	// works well until n = 14, after that integer overflow happens. 
	public static List<List<Integer>> pascalsTriangleUsingFactorial(int numRows) {

		ArrayList pt = new ArrayList();

		int[] dp = new int[numRows + 1];
		Arrays.fill(dp, -1);

		for (int n = 0; n < numRows; n++) {
			ArrayList arrList = new ArrayList();
			for (int r = 0; r <= n; r++) {
				// causes integer overflow, so we will get ambiguous results after n = 14, 
				// 
				int term = factorial(n, dp) / (factorial(n - r, dp) * factorial(r, dp));
				arrList.add(term);
			}
			pt.add(arrList);
		}

		return pt;

	}
	
	public static List<List<Integer>> pascalsTriangle(int numRows) {
		ArrayList pt = new ArrayList();
		
		ArrayList arr1 = new ArrayList();
		ArrayList arr2 = new ArrayList();
		arr1.add(1); 
		arr2.add(1); 
		arr2.add(1); 
		
		pt.add(arr1);
		
		if(numRows == 1) {
			return pt; 
		}
		
		pt.add(arr2); 

		ArrayList prev = arr2;
		
		for(int i=2; i<numRows; i++) {
			// System.out.println("i=" + i);
			// System.out.println(prev);
			ArrayList curr = new ArrayList(); 
			for(int j=0; j<=i; j++) {
				if(j==0 || j==i) {
					curr.add(1); 
				}else {
					int term = (int)prev.get(j) + (int) prev.get(j-1);
					curr.add(term); 
				}
			}
			prev = curr;
			pt.add(curr); 
		}
		
		
		int indx = 0;
		for(Object o : pt) {
			System.out.println("n=" + (indx++) + " " + o);
		}
				
		return pt; 
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int number = sc.nextInt();

		System.out.println();

		pascalsTriangle(number);

		sc.close();

	}

}
