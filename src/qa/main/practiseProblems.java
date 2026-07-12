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
            arr[arr.length-1-i] = temp;
        }

        System.out.println(Arrays.toString(arr));


    }

    public static void main(String[] args) {
        practiseProblems obj = new practiseProblems();
        System.out.println(obj.smallElement());

        obj.reverseArray();
    }


}
