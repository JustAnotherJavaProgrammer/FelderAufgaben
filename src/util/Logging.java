package util;

public class Logging {
	public static String ArrayToString(int[] arr) {
		StringBuilder res = new StringBuilder("[ ");
		res.append(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			res.append(", ").append(arr[i]);
		}
		res.append(" ]");
		return res.toString();
	}
	
	public static String ArrayToString2D(int[][] arr) {
		StringBuilder res = new StringBuilder("[\n\t");
		res.append(ArrayToString(arr[0]));
		for (int i = 1; i < arr.length; i++) {
			res.append(",\n\t").append(ArrayToString(arr[i]));
		}
		res.append("\n]");
		return res.toString();
	}
}
