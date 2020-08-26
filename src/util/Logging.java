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
}
