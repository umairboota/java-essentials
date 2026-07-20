package qa.main;

import java.util.Arrays;

public class practiseProblems {
    int[] arr = {2, 4, 8, 0, 4, -4, 3};


    public int smallElement() {
        int small = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < small) {
                small = arr[i];
            }
        }
        return small;
    }

    public void reverseArray() {

        int temp = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(arr));


    }

    public int[] reverseTheArray() {

        int temp = arr[0];

        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;

        }

        return arr;

    }

    public int findSecondLargeNumber() {

        int large = arr[1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > large) {
                large = arr[i];
            }
        }
        int secondLarge = arr[1];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondLarge && arr[i] != large) {
                secondLarge = arr[i];
            }
        }
        return secondLarge;

    }

    public int findOddNumbers() {
        int countOdds = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                countOdds++;
            }
        }
        return countOdds;
    }

    int[] arr2 = {2, 5, 9, 6, 3, 5};

    public int findDuplicates(){

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 1; j < i; j++) {
                if (arr2[i] == arr2[j]){
                    return arr2[i];
                }

            }

        }


    }

    public static void main(String[] args) {
        practiseProblems obj = new practiseProblems();
        System.out.println(obj.smallElement());

        obj.reverseArray();
        int secondLarge = obj.findSecondLargeNumber();

        System.out.println(secondLarge + " is second large");
        System.out.println(obj.findOddNumbers());

        int[] arr = obj.reverseTheArray();

        System.out.println(Arrays.toString(arr));

        int duplicate = obj.findDuplicates();

    }


}
