package qa.main;

public class patterns {

//    first

    /*

    *
    **
    ***
    ****
    *****

    */

    public void firstPattern(int val){

        for (int i = 1; i <= val; i++) {

            for (int j = 0; j < i; j++) {

                System.out.print("*");
            }
            System.out.println(" ");

        }

    }



    /* Second Pattern

     *****
     ****
     ***
     **
     *


  */

    public void secondPattern(int val){

        for (int i = 0; i <= val; i++) {
            for (int j = val; j >= i; j--) {
                System.out.print("*");
            }

            System.out.println(" ");
        }


    }

    /*

-------------------------THIRD PATTERN-----------------

     *****
      ****
       ***
        **
         *

**/

public void thirdPattern(int val){

    for (int i = 0; i <= val; i++) {

        for (int j = i; j <= val; j++) {
            System.out.print("*");

        }

        System.out.println(" ");

    }



}


    public static void main(String[] args) {

        patterns obj = new patterns();
        int val = 5;
        obj.firstPattern(val);
        System.out.println("--------------------------- ");
        obj.secondPattern(val);

        System.out.println("--------------------------- ");
        obj.thirdPattern(val);

    }
}
