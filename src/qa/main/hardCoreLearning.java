package qa.main;

import java.util.Arrays;

public class hardCoreLearning {


//    problems

    /*
    1. Largest/smallest element
    2. Second largest
    3. Reverse array
    4. Sum and average
    5. Count even/odd
    6. Remove duplicates
    7. Find duplicates
    8. Missing number
    9. Frequency of elements
    10. Common elements
    11. Merge arrays
    12. Rotate array
    13. Move zeros
    14. Binary search
    Two Sum
    Kadane's algorithm
     */


    int[] arr = {34, 78, 89, 23, 0, -1, 46, 3, 90};

    String[] arr2 = {"Muhammad", "Umair", "Ali"};


//    1. Find the largest element

    public void largetNumber() {

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (max < arr[i]) {
                max = arr[i];
            }

        }
        System.out.println(max);

    }

//    1st problem - return the smallest number

    public int smallestNumberITheArray() {
        int small = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < small) {
                small = arr[i];
            }


        }

        return small;
    }


    // 3rd problem Second largest - Method 1
    public int secondLargestNumber() {
        int large = arr[0], secondlarge = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > large) {
                large = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondlarge && arr[i] != large) {
                secondlarge = arr[i];
            }

        }
        return secondlarge;

    }

    //    problem 3 - Method 2 - O(1)
    public int secondLargestTwo() {
        int large = arr[0], secondlarge = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > large) {
                secondlarge = large;
                large = arr[i];
            }

        }

        return secondlarge;
    }

// problem 4 - reverse an array

    public void reverseAnArray() {

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;

        }

        System.out.println(" Reversed Array: " + Arrays.toString(arr));


    }

    public void reverseAnStringArray() {

        StringBuilder reverse = new StringBuilder();

        for (int i = arr2.length; i > 0; i--) {
            reverse.append(arr2[i - 1]).append(" ");
        }

        String newReversed = Arrays.toString(reverse.toString().split(" "));
        System.out.println(newReversed);

    }

    public int[] reverseAnLearningArrayAndReturnTheArray() {

        for (int i = 0; i < arr.length / 2; i++) {
            int n = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = n;
        }

        return arr;

    }

    //    problem no 5
    public int sumOfAllTheElementsOfAnArray() {

        int sum = 0;

        for (int i = 0; i <arr.length; i++) {
            sum += arr[i];
        }

        return sum;

    }

    public float returnTheAvg(){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        return sum /arr.length;
    }

    public static void main(String[] args) {

//        problem 1 + 1
        hardCoreLearning hardCodedLearning = new hardCoreLearning();

        hardCodedLearning.largetNumber();
        int small = hardCodedLearning.smallestNumberITheArray();

        System.out.println("the smallest number is " + small);

//        problem 2
        int secondLarge = hardCodedLearning.secondLargestNumber();
        System.out.println("the second largest number is " + secondLarge);

        //        problem 2 - method 2
        int secondLargeTwo = hardCodedLearning.secondLargestTwo();
        System.out.println("the second largest number is " + secondLargeTwo);

//        problem 4
        hardCodedLearning.reverseAnArray();
        hardCodedLearning.reverseAnStringArray();
        int[] result = hardCodedLearning.reverseAnLearningArrayAndReturnTheArray();
        System.out.println("Reversed return: " + Arrays.toString(result));

//        problem - 5
        int sumOfArray = hardCodedLearning.sumOfAllTheElementsOfAnArray();
        System.out.println("sum of all the elements is: " + sumOfArray);

        float avgOfArray = hardCodedLearning.returnTheAvg();
        System.out.println("sum of all the elements is: " + avgOfArray);
    }

}
