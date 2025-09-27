package qa.main;

public class Arrays {


    public int islargestElementInArray(){


        int[] arr = {4, 9, 56, 8, 4, 3, 0};

        int largest = arr[0];

        for (int i = 0; i < arr.length-1; i++) {
            if (largest < arr[i]){
                largest = arr[i];
            }
        }

        return largest;

        }


    public static void main(String[] args) {

        Arrays test = new Arrays();

       int LargestNumber = test.islargestElementInArray();

        System.out.println("Largest Number: " + LargestNumber);





    }

}
