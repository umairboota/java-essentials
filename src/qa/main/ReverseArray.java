package qa.main;

public class ReverseArray {

    void reveerseArray(){

        int[] arr= {4, 5, 5, 9, 23, 66, 56};
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if(arr[i] % 2  == 0){
                count++;


            }
        }

        System.out.println(count);






    }


    public static void main(String[] args) {

    }



}
