package qa.main;

public class maxElementInAnArray {
    void maxElement(){


        int[] arr = {5, 8, 9, 25, 78, 63, 1};
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {

                max = arr[i];

            }

        }

        System.out.println(max);

    }


    public static void main(String[] args) {
        maxElementInAnArray obj = new maxElementInAnArray();
        obj.maxElement();

    }

}