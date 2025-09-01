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

	private static void quicksort(int[] arr, int left, int right) {
		if (left < right) {
			int pivotIndex = partition(arr, left, right);
			quicksort(arr, left, pivotIndex - 1);
			quicksort(arr, pivotIndex + 1, right);
		}
	}

	private static int partition(int[] arr, int left, int right) {
		int pivotValue = arr[right];
		int i = left - 1;
		for (int j = left; j < right; j++) {
			if (arr[j] < pivotValue) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i + 1];
		arr[i + 1] = arr[right];
		arr[right] = temp;
		return i + 1;
	}

	public static void main(String[] args) {
		int arr[] = { 4, 6, 1, 3, 33, 53, 23, 34 };
		System.out.print("ARRAY: \n");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.print("\n\n");

		// bubbleSort(arr); // O(n^2)
		quicksort(arr, 0, arr.length - 1); // O(n.logn)

		System.out.print("ARRAY AFTER SORTNG: \n");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
