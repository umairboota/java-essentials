package qa.main;

import java.util.Arrays;

public class hardCoreLearning {


//    problems

    /*
    Largest/smallest element
    Second largest
    Reverse array
    Sum and average
    Count even/odd
    Remove duplicates
    Find duplicates
    Missing number
    Frequency of elements
    Common elements
    Merge arrays
    Rotate array
    Move zeros
    Binary search
    Two Sum
    Kadane's algorithm
     */


    int[] arr = {34, 78, 89, 23, 0, -1, 46, 3, 90};


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

//    2nd problem - return the smallest number

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

    public static void main(String[] args) {

//        problem 1 + 2
        hardCoreLearning hardCodedLearning = new hardCoreLearning();

        hardCodedLearning.largetNumber();
        int small = hardCodedLearning.smallestNumberITheArray();

        System.out.println("the smallest number is " + small);

//        problem 3
        int secondLarge = hardCodedLearning.secondLargestNumber();
        System.out.println("the second largest number is " + secondLarge);

        //        problem 3 - method 2
        int secondLargeTwo = hardCodedLearning.secondLargestTwo();
        System.out.println("the second largest number is " + secondLargeTwo);


    }
}
