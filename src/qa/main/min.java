package qa.main;

public class min {

	public static int min(int[] arr) {

//    	find the minimum value in the array

		int res = arr[0];

		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] < res) {
				res = arr[i + 1];
			}
		}

		return res;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 4, 6, 8, 96, 0, -5 };

		System.out.println(min(arr));

	}

}
