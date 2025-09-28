package qa.main;

public class Arrays {

    int[] arr = {47, 39, 56, 28, 54, 13, 0, 99};


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


//    find the sum of even and count numbers in array
//    sum
    public int sumOfEvenNumbers(){

        int sum = 0;

        for (int i: arr) {

            if (i % 2 == 0){
                sum += i;
            }
        }

        return sum;
    }

//    count
    public int countOfEvenNumbers(){

        int counter = 0;

        for (int i: arr) {

            if (i % 2 == 0){
                counter++;
            }
        }

        return counter;
    }


//---------------------------------------------------------------------





    public static void main(String[] args) {

        Arrays test = new Arrays();

       int LargestNumber = test.largestElementInArray();

        System.out.println("Largest Number: " + LargestNumber);

        int smallestElement = test.smallestElementInArray();

        System.out.println("Smallest Number: " + smallestElement);


        int sumOfEvenNumbers = test.sumOfEvenNumbers();

        System.out.println("sum of array elements: " + sumOfEvenNumbers);

        int countOfEvenNumbers = test.countOfEvenNumbers();

        System.out.println("count of even numbers in array elements: " + countOfEvenNumbers);

    }

}
