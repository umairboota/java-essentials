package qa.main;


//class
public class mainClass {

//    attributes
    int i;

//    user defined Functions/Method
    public void method(){
        i=5;
    }
//    .


//    main method
    public static void main(String[] arg){

//        Object Intialization of mainClass
        mainClass obj = new mainClass();

//        call a function
        obj.method();
//        print
        System.out.println(obj.i);



    }}
