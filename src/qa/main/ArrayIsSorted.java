package qa.main;

public class ArrayIsSorted {

	public static boolean checkArrayIsSorted(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				return false;
			}
		}

		return true;
	}

//    sort the array

	public void sortArray(int[] arra) {

//		int[] arra = { 5, 7, 9, 2, 25, 6 };

		for (int i = 0; i < arra.length - 1; i++) {
			for (int j = 0; j < arra.length - i - 1; j++) {
				if (arra[j] > arra[j + 1]) {
					int temp = arra[j];
					arra[j] = arra[j + 1];
					arra[j + 1] = temp;
				}
			}
		}

		System.out.println("Sorted Array:");
		for (int i : arra) {
			System.out.print(i + " ");
		}

	}

	public static void main(String[] args) {
		int[] arr = { 4, 6, 7, 7, 8 };

		if (!checkArrayIsSorted(arr)) {
			System.out.println("array is not sorted");
		}

		else {
			System.out.println("array is sorted");
		}

		ArrayIsSorted obj = new ArrayIsSorted();
		
	

		obj.sortArray(arr);

	}

}
