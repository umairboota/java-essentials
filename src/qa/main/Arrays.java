package qa.main;

public class Arrays {

    int[] arr = {4, 9, 56, 8, 4, 3, 0, 99};


    public int largestElementInArray(){



        int largest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]){
                largest = arr[i];
            }
        }

        return largest;

        }


//        is smallest


    public int smallestElementInArray(){

        int smallest = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (smallest > arr[i]){
                smallest = arr[i];
            }

        }

        return smallest;

    }


    public static void main(String[] args) {

        Arrays test = new Arrays();

       int LargestNumber = test.largestElementInArray();

        System.out.println("Largest Number: " + LargestNumber);

        int smallestElement = test.smallestElementInArray();

        System.out.println("Smallest Number: " + smallestElement);




    }

}
