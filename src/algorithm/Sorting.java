package algorithm;

public class Sorting {

	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 4, 6, 1, 3, 33, 53, 23, 34 };
		System.out.print("ARRAY: \n");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.print("\n\n");

		bubbleSort(arr); // O(n^2)

		System.out.print("ARRAY AFTER SORTNG: \n");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
