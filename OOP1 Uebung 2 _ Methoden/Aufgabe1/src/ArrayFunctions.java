import java.util.Arrays;

public class ArrayFunctions {
	public static void main(String[] args) {
		int[] standardArray = {1,2,3,4};
		print(standardArray);
		revert(standardArray);
		ascendinglySorted(standardArray);
		descendinglySorted(standardArray);
	}
	static int[] revert (int[] standardArray) {
		if (standardArray == null) {
			return null;
		}
		int[] revertedArray = new int[standardArray.length];

		for (int i = 0; i < standardArray.length; i++) {
			revertedArray[i] = standardArray[standardArray.length - i - 1];
		}
		return revertedArray;
	}
	static boolean ascendinglySorted (int[] standardArray) {
		boolean ascendinglySortedBool = true;
		if (standardArray == null) {
			return false;
		}
		for (int i =0; i < standardArray.length-1; i++) {
            if (standardArray[i] > standardArray[i + 1]) {
                ascendinglySortedBool = false;
                break;
            }
		}
		return ascendinglySortedBool;
	}
	static boolean descendinglySorted (int[] standardArray) {
		boolean descendinglySortedBool = true;
		if (standardArray == null) {
			return false;
		}
		for (int i =0; i < standardArray.length-1; i++) {
			if (standardArray[i] < standardArray[i+1]) {
				descendinglySortedBool = false;
				break;
			}
		}
		return descendinglySortedBool;
	}
	static void print (int[] standardArray) {
		System.out.println(Arrays.toString(standardArray));

	}
}
