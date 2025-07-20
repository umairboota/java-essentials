package qa.main;

public class SumOfAllElementsOfArray {

    public int sumOfAllElementsOfArray(int[] arr){

        int res=0;

        for (int i = 0; i < arr.length; i++) {
            res+=arr[i];

        }
        return res;
    }

    public static void main(String[] args) {

        int[] arr = {3,3,4,5,6,7,8};

        SumOfAllElementsOfArray obj = new SumOfAllElementsOfArray();

        System.out.println(obj.sumOfAllElementsOfArray(arr));


    }


}
