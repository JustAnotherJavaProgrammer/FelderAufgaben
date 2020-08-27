package util;

public class ArrayUtil2D {
	public static void main(String[] args) {
		ArrayUtil2D util = new ArrayUtil2D();
		int[][] testArr = util.gameField(5, 5);
		System.out.println(Logging.ArrayToString2D(testArr));
		System.out.println(util.countHits(testArr));
	}
	
	int[][] gameField(int zeilen, int spalten) {
		int[][] result = new int[zeilen][spalten];
		for(int x = 0; x<result.length; x++) {
			for(int y = 0; y<result[x].length; y++) {
				result[x][y] = (int) (Math.random()*2);
			}
		}
		return result;
	}
	
	int countHits(int[][] arr) {
		int counter = 0;
		for(int[] line : arr) {
			for(int value : line) {
				if(value == 1)
					counter++;
			}
		}
		return counter;
	}
}
