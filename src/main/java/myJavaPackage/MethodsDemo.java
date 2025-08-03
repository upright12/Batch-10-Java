package myJavaPackage;

public class MethodsDemo {
    // There are two types of methods 1. main method 2. Custom method
    // There is a method signature and method body


    public void communication(){
        System.out.println("We can communicate with others using iphone");
    }



    public void record(){
        communication();
        System.out.println("We can record an event");
    }


    public void click(){
        System.out.println("We can take a picture of the nature of ourselvse");
    }



    public static void main(String[] args) {

        MethodsDemo obj = new MethodsDemo();// intstantiate the class.
//        obj.click();
//        obj.communication();
       obj.record();

    }



}
