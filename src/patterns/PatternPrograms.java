package patterns;

public class PatternPrograms {

	// displays simple square
	public static void squarePattern(int n, char ch) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(ch + " ");
			}
			System.out.println();
		}
	}

	// displays X (two diagonals of a Square)
	public static void diagonals(int n, char ch) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j || i + j == n - 1) {
					System.out.print(ch + " ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.println();
		}
	}

	// right angled triangle - height is at left hand side
	public static void triangle1(int n, char ch) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j <= i) {
					System.out.print(ch + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	// right angled triangle - height is at right hand side
	public static void triangle2(int n, char ch) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i + j >= n - 1) {
					System.out.print(ch + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	// Equilateral triangle
	public static void triangle3(int n, char ch) {
		for (int i = 0; i < n; i++) {
			// print left half of triangle
			for (int j = 0; j < n; j++) {
				if (i + j >= n - 1) {
					System.out.print(ch + " ");
				} else {
					System.out.print("  ");
				}
			}

			// print right half of triangle
			for (int j = 0; j < n; j++) {
				if (j <= i - 1) {
					System.out.print(ch + " ");
				} else {
					System.out.print("  ");
				}
			}

			System.out.println();
		}
	}
	
	// works well for n=9,10,19 and 20
	public static void circle(int n, char ch) {

		int centerX = n / 2, centerY = n / 2; // values for center(a,b)

		// formula: (x-a)^2 + (y-b)^2 = r^2
		for (int i = 0; i < n + 1; i++) {
			for (int j = 0; j < n + 1; j++) {
				if ((j - centerX) * (j - centerX) + (i - centerX) * (i - centerY) == (n * n) / 4) {
					System.out.print(ch + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	public static void letterD(int n, char ch) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n / 2 + 1; j++) {
				if (j == 0 || (i == 0 || i == n - 1) && j < n / 2 || j == n / 2 && i != 0 && i != n - 1) {
					System.out.print(ch + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	public static void letterE(int n, char ch) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n / 2; j++) {
				if (j == 0 || i == 0 || i == (n - 1) / 2 || i == n - 1) {
					System.out.print(ch + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	public static void letterP(int n, char ch) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n / 2; j++) {
				if ((i == 0 || i == (n - 1) / 2) && j < n / 2 - 1 || j == 0
						|| j == n / 2 - 1 && i > 0 && i < n / 2 - 1) {
					System.out.print(ch + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	public static void letterA(int n, char ch) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n / 2; j++) {
				if (i == 0 && j > 0 && j < n / 2 - 1 || j == 0 && i > 0 || j == n / 2 - 1 && i > 0 || i == n / 2) {
					System.out.print(ch + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	public static void letterK(int n, char ch) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == 0 || i-j == n/2 || i+j == n/2) {
					System.out.print(ch + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}



	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		// System.out.print("Enter an integer number : ");
		// int n = sc.nextInt();
		// sc.close();
		int n = 10;

		// squarePattern(n, '*');
		// diagonals(n, '*');
		// triangle1(n, '#');
		// triangle2(n, '#');
		// triangle3(n, '#');

		// letterD(n, 'D');
		// letterE(n, 'E');
		// letterP(n, 'P');
		// letterA(n, 'A');
		// letterK(n, 'K');
		
		circle(n, '#');

	}

}
