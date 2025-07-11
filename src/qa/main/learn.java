package qa.main;

import java.util.Scanner;

public class learn {

    Scanner sc = new Scanner(System.in);

//      print

//        System.out.println("Hello Wolf");


    //        Scan input
//        int x;
//        Scanner a = new Scanner(System.in);
//        x = a.nextInt();
//
//        System.out.println(x);

//        add two numbers
public void addTwoNumbers() {
        int x,y;

        System.out.println("Print an integer: ");
        x = sc.nextInt();
        System.out.println("Print an integer: ");
        y = sc.nextInt();

        int result = x+y;

        System.out.println("Sum of Two numbers:" + result);

        sc.close();

    }


// Celsius⇄Fahrenheit Converter

public void CelsiusFahrenheitConverter(int x){

    int temp;

//    Choose conversion (C ->  F)

//    temp = x * 9/5 +32;
//    System.out.println(temp);


//    Choose conversion (C/F): C

    temp = (x-32) * 5/9;

    System.out.println(temp);




}



//📝 Problem#3 – Simple Interest Calculator
public void interstCalculator(){

    double principalAmount = 0;
    double interestRate = 0;

    double time = 0;

    double SI;

    System.out.println("Enter principal");
    principalAmount = sc.nextDouble();

    System.out.println("Enter annual interest rate (%):");
    interestRate = sc.nextDouble();

    System.out.println("Enter time (years):");
    time = sc.nextDouble();

    SI = (principalAmount * interestRate * time) / 100;

    System.out.println("Simple Interest = " + SI);










}





}