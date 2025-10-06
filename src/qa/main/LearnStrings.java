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


    public static void main(String[] args) {

        LearnStrings jooba = new LearnStrings();

//        jooba.Strings();
        jooba.LearnConcatenate();




    }

}
