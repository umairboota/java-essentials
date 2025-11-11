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
        System.out.println("Before sorting the aray");
        for (int i:arr){
            System.out.print(i + " ");
        }


//        soring algo
/*
Insertion sort is based on the idea that one element from the input elements is
consumed in each iteration to find its correct position i.e, the position to which
it belongs in a sorted array.

It iterates the input elements by growing the sorted array at each iteration.
It compares the current element with the largest value in the sorted array.
If the current element is greater, then it leaves the element in its place and moves on to the next element else it
finds its correct position in the sorted array and moves it to that position.
This is done by shifting all the elements, which are larger than the current element,
in the sorted array to one position ahead.

Time Complexity:
                O(n^2)

*/


//        for (int i = 0; i < arr.length-1; i++) {
//
//            for (int j = 0; j < arr.length-1-i; j++) {
//
//                if (arr[j]>arr[i+1]){
//                    int temp = arr;
//                }
//
//
//            }
//
//        }

        for( int i = 0 ;i < arr.length ; i++ ) {
    /*storing current element whose left side is checked for its
             correct position .*/

            int temp = arr[ i ];
            int j = i;

       /* check whether the adjacent element in left side is greater or
            less than the current element. */

            while(  j > 0  && temp < arr[ j -1]) {

                // moving the left side element to one position forward.
                arr[ j ] = arr[ j-1];
                j= j - 1;

            }
            // moving current element to its  correct position.
            arr[ j ] = temp;
        }


/* just a cheeky commit*/
        System.out.println(" ");
        System.out.println(" After soting the array");
        System.out.println(" ");

        for(int i : arr){
            System.out.print(i + " ");
        }

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


            System.out.println("test");
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
