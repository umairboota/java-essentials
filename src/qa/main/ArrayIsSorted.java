package qa.main;

public class ArrayIsSorted {

    public static boolean checkArrayIsSorted(int[] arr){


        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] > arr[i+1]){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr ={4,6,7,7,8};

        if (!checkArrayIsSorted(arr)){
            System.out.println("array is not sorted");
        }

        else {
            System.out.println("array is sorted");
        }
    }


}
