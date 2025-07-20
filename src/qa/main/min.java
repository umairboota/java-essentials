package qa.main;

public class min {

    public static int min(){

        int[] arr = {1,4,6,8,96,0,-5};
        int res=arr[0];

        for (int i = 1; i < arr.length; i++) {

            if(arr[i] < res){
                res = arr[i];

            }

        }

        return res;

    }

    public static void main(String[] args) {

        System.out.println(min());

    }


}
