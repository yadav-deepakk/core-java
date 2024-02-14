package algorithm;

import java.util.*;

public class Recursion1 {

	public static void multiplier(int num, int mul) {
		if (mul == 0)
			return;

		multiplier(num, mul - 1);
		System.out.println(num + "*" + mul + "=" + num * mul);
	}

	public static void reachDestination(int totalSum, String path, int currentSum) {
		if (currentSum > totalSum) {
			return;
		}
		if (currentSum == totalSum) {
			System.out.println(path);
			return;
		}
		reachDestination(totalSum, path + "1 ", currentSum + 1);
		reachDestination(totalSum, path + "2 ", currentSum + 2);
		reachDestination(totalSum, path + "3 ", currentSum + 3);
		reachDestination(totalSum, path + "4 ", currentSum + 4);
		reachDestination(totalSum, path + "5 ", currentSum + 5);
		reachDestination(totalSum, path + "6 ", currentSum + 6);
	}

	public static void reachEndMatrix(int row, int col, int currRow, int currCol, String path) {
		if (currRow >= row || currCol >= col)
			return;
		if (currRow == row - 1 && currCol == col - 1) {
			System.out.println(path);
			return;
		}
		reachEndMatrix(row, col, currRow, currCol + 1, path + "R ");
		reachEndMatrix(row, col, currRow + 1, currCol, path + "D ");
	}

	// print all sub sequences
	public static void printArraySubSequence(int index, int[] arr, ArrayList<Integer> tempArr) {
		if (index == arr.length) {
			if (tempArr.size() != 0)
				System.out.println(tempArr);
			return;
		}

		// do not include value
		printArraySubSequence(index + 1, arr, tempArr);

		// include value
		tempArr.add(arr[index]);
		printArraySubSequence(index + 1, arr, tempArr);

		tempArr.remove(tempArr.size() - 1);
	}

	// ============ permutations of a string ===============
	public static void permutationsOfArr(int[] arr, ArrayList<List<Integer>> ans, ArrayList<Integer> list,
			boolean[] freq) {

		if (list.size() == arr.length) {
			ans.add((List<Integer>) list.clone());
		}

		for (int i = 0; i < arr.length; i++) {
			if (!freq[i]) {
				freq[i] = true;
				list.add(arr[i]);
				permutationsOfArr(arr, ans, list, freq);
				freq[i] = false;
				list.remove(list.size() - 1);
			}
		}
	}

	// ================ Rat in a Maze ====================
	public static boolean solveMaze(int[][] maze, int r, int c, int[][] out) {

		if (r == maze.length - 1 && c == maze[0].length - 1 && maze[r][c] ==1) {
			out[r][c] = 1; 
			return true;
		}

		if (isValidCell(maze, r, c)) {
			out[r][c] = 1;

			// move right
			if (solveMaze(maze, r, c + 1, out)) {
				return true;
			}

			// move left
			if (solveMaze(maze, r, c - 1, out)) {
				return true;
			}

			// move up
			if (solveMaze(maze, r - 1, c, out)) {
				return true;
			}

			// move down
			if (solveMaze(maze, r + 1, c, out)) {
				return true;
			}
			
			out[r][c] = 0;
			return false; 
		}

		return false;
	}

	public static boolean isValidCell(int[][] maize, int r, int c) {
		if (r >= 0 || c >= 0 || r < maize.length || c < maize[0].length && maize[r][c] == 1)
			return true;
		return false;
	}

	// ============== Main Function =================
	public static void main(String[] args) {

		// multiplier(24,5);
		// reachDestination(9, "", 0);
		// reachEndMatrix(3, 3, 0, 0, new String());
//		printArraySubSequence(0, new int[] { 3, 2, 1 }, new ArrayList<Integer>());

//		int[] arr = { 1, 2, 3 };
//		boolean[] freq = new boolean[arr.length];
//		Arrays.fill(freq, false);
//		ArrayList<List<Integer>> ansList = new ArrayList<List<Integer>>();
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		permutationsOfArr(arr, ansList, list, freq);
//		for(List<Integer> l : ansList) {
//			System.out.println(l);
//		}

		int[][] maze = { { 1, 1, 1 }, { 0, 1, 0 }, { 0, 1, 1 } };
		int[][] out = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };
		solveMaze(maze, 0, 0, out);

	}

}
