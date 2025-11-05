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

	
//	insertion sort
	
	public void sortInsertionArray(int[] arra) {}

//    bubble sort the array
	public void sortArray(int[] arr) {

        System.out.println("before sorting");

        for(int i:arr){
            System.out.print(i + " ");
        }

       // sorting algo


        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
//                check condition
                if (arr[i]>arr[i+1]){
//                    swaping
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }

            }

        }











        System.out.println(" ");

		System.out.println("Sorted Array:");
		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

	public static void main(String[] args) {
		int[] arr = { 77, 66, 55, 44, 33, 22};

//		if (!checkArrayIsSorted(arr)) {
//			System.out.println("array is not sorted");
//		}
//		else {
//			System.out.println("array is sorted");
//		}

		ArrayIsSorted obj = new ArrayIsSorted();
		
	

		obj.sortArray(arr);
		

//		obj.sortInsertionArray(arr);

		

	}

}
