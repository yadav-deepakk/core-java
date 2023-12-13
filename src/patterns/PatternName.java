package patterns;

public class PatternName {

	public static void deepak(int N, char ch) {

		for (int i = 0; i < N; i++) {

			// D
			for (int j = 0; j <= N / 2; j++) {
				if (j == 0 || (i == 0 || i == N - 1) && j < N / 2 || j == N / 2 && i > 0 && i < N - 1) {
					System.out.print(ch + " ");
				} else {
					System.out.print("  ");
				}
			}

			System.out.print("  ");

			// 2 times E
			int count = 2;
			while (--count >= 0) {
				for (int j = 0; j < N / 2; j++) {
					if (j == 0 || i == 0 || i == N - 1 || i == N / 2) {
						System.out.print(ch + " ");
					} else {
						System.out.print("  ");
					}
				}
				System.out.print("  ");
			}

			// P
			for (int j = 0; j <= N / 2; j++) {
				if (j == 0 || j == N / 2 - 1 && i > 0 && i < N / 2 || (i == 0 || i == N / 2) && j < N / 2 - 1) {
					System.out.print(ch + " ");
				} else {
					System.out.print("  ");
				}
			}

			// A
			for (int j = 0; j <= N / 2; j++) {
				if ((j == 0 || j == N / 2 - 1) && i > 0 || (i == 0 && j > 0 || i == N / 2) && j < N / 2 - 1) {
					System.out.print(ch + " ");
				} else {
					System.out.print("  ");
				}
			}

			// K
			for (int j = 0; j < N; j++) {
				if (j == 0 || i + j == N / 2 || i - j == N / 2) {
					System.out.print(ch + " ");
				} else {
					System.out.print("  ");
				}
			}

			System.out.println();
		}

	}

	public static void main(String[] args) {
		int n = 10;
		deepak(10, '#');

	}

}
