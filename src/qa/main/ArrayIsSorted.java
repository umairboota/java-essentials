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
	
	public void sortInsertionArray(int[] arr) {


//        print before soting
        System.out.println("Before sorting the aaray");
        for (int i:arr){
            System.out.print(i + " ");

        }

//        soring algo
/*






*/






    }

//    bubble sort the array
    /*

    Bubble sort is based on the idea of repeatedly comparing pairs of adjacent
    elements and then swapping their positions if they exist in the wrong order.

    Complexity:
    The complexity of bubble sort is O(x^2)
     in both worst and average cases, because the entire array needs to be
     iterated for every element.



    * */
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
//        bubble soting
//		obj.sortArray(arr);
		
// insertion sorting
		obj.sortInsertionArray(arr);

	}

}
