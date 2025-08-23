package myJavaPackage.oopConcept;

public class Inheritance2 extends Inheritance1{
    /* Parent-child class
    Parent class is called super class
    child class is called sub-class
     */

    String car = "Toyota";



    public static void main(String[] args) {
        Inheritance2 obj = new Inheritance2();
        System.out.println(obj.house);
        System.out.println(obj.car);
    }

}
