package util;

public class ArrayUtil {

	public static void main(String[] args) {
		ArrayUtil util = new ArrayUtil();
		int[] testArr = new int[] {1,2,4,7,8,9,1234,52,7};
		System.out.println(Logging.ArrayToString(util.sort(testArr)));
		System.out.println(Logging.ArrayToString(util.shuffle(testArr)));
	}

	public int max(int[] arr) {
		int max = arr[0];
		for (int i : arr) {
			if (i > max)
				max = i;
		}
		return max;
	}

	public int min(int[] arr) {
		int min = arr[0];
		for (int i : arr) {
			if (i < min)
				min = i;
		}
		return min;
	}

	public int sum(int[] arr) {
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		return sum;
	}

	public double mean(int[] arr) {
		return ((double) sum(arr)) / arr.length;
	}
	
	private int minIndex(int[] arr) {
		int value = arr[0];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] < value) {
				value = arr[i];
				index = i;
			}
		}
		return index;
	}
	
	public int[] sort(int[] arr) {
		arr = arr.clone();
		int[] sorted = new int[arr.length];
		for (int i = 0; i < sorted.length; i++) {
			int index = minIndex(arr);
			sorted[i] = arr[index];
			arr[index] = max(arr);
		}
		return sorted;
	}
	
	public int[] zufallListe() {
		return shuffle(new int[] {1,2,3,4,5,6});
	}
	
	public int[] shuffle(int[] arr) {
		int[] shuffled = new int[arr.length];
		boolean[] taken = new boolean[arr.length];
		for (int i = 0; i < shuffled.length; i++) {
			int rnd = (int) (Math.random()*arr.length);
			while(taken[rnd]) {
				rnd = (int) (Math.random()*arr.length);
			}
			shuffled[i] = arr[rnd];
			taken[rnd] = true;
		}
		return shuffled;
	}
	
	// Alternative solution to exercise 5
	public int[] bogosort(int[] arr) {
		// TODO implement
	}

}
