package qa.main;

public class EvenOdds {
    
    void evenOdd(int[] arr){

        int countEven=0, countOdd=0;


        for (int i = 0; i < arr.length; i++) {

            if (arr[i]%2 == 0){
                countEven++;

            }
            else {
                coundOdd++;
            }
            
        }

        System.out.println("Total Even Numbers: " + countEven);
        System.out.println("Total Odd Numbers: " + countOdd);
        
        
    }

    public static void main(String[] args) {

        EvenOdds obj = new EvenOdds();

        int[] arr={2,3,4,5,6,7,8,9};
        obj.evenOdd(arr);


    }


}
