package myJavaPackage.oopConcept.polymorphism;

public class MethodOverloading {
/*
Method Overloading happens when two or more methods in the same class
 have the same name but different parameter lists
 */
    public void add(int a){
        System.out.println(a+1);
    }


    public void add(int a, int b){
        System.out.println(a+b);
    }

    public void add(int a, int b, int c){
        System.out.println(a+b+c);
    }




    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        obj.add(10);
        obj.add(10, 20);
        obj.add(10,20, 30);
        //obj.add2(10, 20);
    }


}
