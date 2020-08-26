package util;

public class ArrayUtil {

	public static void main(String[] args) {
		ArrayUtil util = new ArrayUtil();
		System.out.println(Logging.ArrayToString(util.sort(new int[] {1,2,4,7,8,9,1234,52,7})));
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
		// TODO implement shuffle
		return null;
	}

}
