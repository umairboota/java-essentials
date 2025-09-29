package qa.main;

public class patterns {

//    first

    /*
    * *
    * **
    * ***
    * ****
    * *****
    */

    public void firstPattern(int val){

        for (int i = 1; i <= val; i++) {

            for (int j = 0; j < i; j++) {

                System.out.print("*");

            }

            System.out.println(" ");

        }

    }



    public static void main(String[] args) {

        patterns obj = new patterns();
        int val = 5;
        obj.firstPattern(val);

    }
}
