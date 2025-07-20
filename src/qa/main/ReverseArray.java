package qa.main;

public class ReverseArray {

    public static void reverseArray(int[] arr) {


        int i = 0, j = arr.length - 1;

        while (i < j) {

            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;

            i++;
            j--;

        }




    }


    public static void main(String[] args) {

        int[] ar = {0, 1, 2, 3, 4, 5};


        reverseArray(ar);
        for (int i = 0; i < ar.length; i++) {

            System.out.println(ar[i]);

        }

    }


}

