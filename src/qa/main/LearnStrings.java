package qa.main;

import java.util.Scanner;

public class LearnStrings {

//    Learning the Strings

//    Declaration

    public void Strings(){
        String name = "Tony Stark";

        String userName;

        Scanner sc = new Scanner(System.in);
        userName = sc.nextLine();

        System.out.println("Your Name is: " + userName);
    }

    public void LearnConcatenate(){
//        Concatenate

        String firstName = "Tony";
        String secondName = "Stark";

        String fullName = firstName + " " + secondName;

        System.out.println(fullName);

//        length()
        System.out.println(fullName.length());


//        charAt()
        System.out.println(firstName.charAt(2));

        for (int i = 0; i < fullName.length(); i++) {

            System.out.println(fullName.charAt(i));

        }
    }

//    Compare two Strings

//    working

//    1: s1 > s2 --> +ve value
//    2: s1 == s2 --> 0
//    3: s1<s2 --> -ve value

    public void ComparisonStrings(){

        String s1 = "This is a cat";
        String s2 = "This is a dog";

        if (s1.compareTo(s2) == 0)
            System.out.println("Strings are Equal");
         else
            System.out.println("Strings are not Equal");
    }


    public static void main(String[] args) {

        LearnStrings jooba = new LearnStrings();

//        jooba.Strings();
//        jooba.LearnConcatenate();

        jooba.ComparisonStrings();

    }

}
